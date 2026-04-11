package com.mycompany.santo.terco.scheduler;

import com.mycompany.santo.terco.DTO.LiturgiaDTO;
import com.mycompany.santo.terco.service.IntencoesPapaService;
import com.mycompany.santo.terco.service.JobStatusService;
import com.mycompany.santo.terco.service.LiturgiaService;
import com.mycompany.santo.terco.service.TempoLiturgicoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;

/**
 * Jobs agendados para manter os dados do sistema sempre atualizados.
 *
 * Horários (timezone do servidor):
 * - 00:01 → Intenções do Papa (invalida cache + recarrega)
 * - 00:05 → Liturgia do Dia (limpa cache + pré-carrega)
 * - 00:03 → Tempo Litúrgico (atualiza cores do período)
 * - A cada 30 min → Health check das APIs externas
 * - 1 de janeiro 00:10 → Renovação anual das intenções do Papa
 */
@Component
public class DailyUpdateScheduler {

    private static final Logger log = LoggerFactory.getLogger(DailyUpdateScheduler.class);

    private final IntencoesPapaService intencoesPapaService;
    private final LiturgiaService liturgiaService;
    private final TempoLiturgicoService tempoLiturgicoService;
    private final JobStatusService jobStatusService;

    public DailyUpdateScheduler(IntencoesPapaService intencoesPapaService,
                                LiturgiaService liturgiaService,
                                TempoLiturgicoService tempoLiturgicoService,
                                JobStatusService jobStatusService) {
        this.intencoesPapaService = intencoesPapaService;
        this.liturgiaService = liturgiaService;
        this.tempoLiturgicoService = tempoLiturgicoService;
        this.jobStatusService = jobStatusService;
    }

    // ────────────────────────────────────────────────────────────────────────
    // JOB 1: Intenções do Papa — diariamente à 00:01
    // Invalida o cache e força nova busca no site do Vaticano.
    // ────────────────────────────────────────────────────────────────────────
    @Scheduled(cron = "0 1 0 * * *")
    public void atualizarIntencoesPapa() {
        String jobName = "intencoes-papa-diario";
        log.info("[JOB] Iniciando atualização das Intenções do Papa...");
        try {
            intencoesPapaService.invalidarCache();
            Map<String, Object> resultado = intencoesPapaService.getIntencoesDoPapa();
            String status = String.valueOf(resultado.get("status"));
            boolean ok = "ok".equals(status);
            String detalhe = ok
                    ? "Ano " + resultado.get("ano") + " — " + ((java.util.List<?>) resultado.get("intencoes")).size() + " intenções carregadas"
                    : "Erro: " + resultado.get("erro");
            jobStatusService.registrar(jobName, ok, detalhe);
            log.info("[JOB] Intenções do Papa: {}", detalhe);
        } catch (Exception e) {
            log.error("[JOB] Falha ao atualizar Intenções do Papa", e);
            jobStatusService.registrar(jobName, false, "Exceção: " + e.getMessage());
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // JOB 2: Renovação anual — 1° de janeiro à 00:10
    // Força busca do novo ano no site do Vaticano.
    // ────────────────────────────────────────────────────────────────────────
    @Scheduled(cron = "0 10 0 1 1 *")
    public void renovacaoAnualIntencoes() {
        String jobName = "intencoes-papa-anual";
        log.info("[JOB] Renovação ANUAL das Intenções do Papa...");
        try {
            intencoesPapaService.invalidarCache();
            Map<String, Object> resultado = intencoesPapaService.getIntencoesDoPapa();
            String status = String.valueOf(resultado.get("status"));
            boolean ok = "ok".equals(status);
            String detalhe = ok
                    ? "Novo ano " + resultado.get("ano") + " carregado com sucesso"
                    : "Ainda não disponível para o novo ano: " + resultado.get("erro");
            jobStatusService.registrar(jobName, ok, detalhe);
            log.info("[JOB] Renovação anual: {}", detalhe);
        } catch (Exception e) {
            log.error("[JOB] Falha na renovação anual", e);
            jobStatusService.registrar(jobName, false, "Exceção: " + e.getMessage());
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // JOB 3: Liturgia do Dia — diariamente à 00:05
    // Limpa cache do dia anterior e pré-carrega a liturgia de hoje.
    // ────────────────────────────────────────────────────────────────────────
    @Scheduled(cron = "0 5 0 * * *")
    public void atualizarLiturgiaDoDia() {
        String jobName = "liturgia-diaria";
        log.info("[JOB] Pré-carregando Liturgia do Dia...");
        try {
            LiturgiaDTO dto = liturgiaService.preCarregarHoje();
            boolean ok = dto != null && dto.getLiturgia() != null
                    && !dto.getLiturgia().startsWith("Erro");
            String detalhe = ok
                    ? "Liturgia carregada: " + (dto.getLiturgia() != null ? dto.getLiturgia().substring(0, Math.min(80, dto.getLiturgia().length())) : "OK")
                    : "Falha: " + (dto != null ? dto.getLiturgia() : "null");
            jobStatusService.registrar(jobName, ok, detalhe);
            log.info("[JOB] Liturgia do Dia: {}", detalhe);
        } catch (Exception e) {
            log.error("[JOB] Falha ao pré-carregar Liturgia", e);
            jobStatusService.registrar(jobName, false, "Exceção: " + e.getMessage());
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // JOB 4: Tempo Litúrgico — diariamente à 00:03
    // Atualiza e loga o tempo litúrgico atual (cores do site mudam por período).
    // ────────────────────────────────────────────────────────────────────────
    @Scheduled(cron = "0 3 0 * * *")
    public void atualizarTempoLiturgico() {
        String jobName = "tempo-liturgico";
        log.info("[JOB] Verificando Tempo Litúrgico...");
        try {
            Map<String, String> tempo = tempoLiturgicoService.getTempoLiturgico();
            String nomeTempo = tempo.get("tempoLiturgico");
            jobStatusService.registrar(jobName, true, "Período atual: " + nomeTempo);
            log.info("[JOB] Tempo Litúrgico: {}", nomeTempo);
        } catch (Exception e) {
            log.error("[JOB] Falha ao verificar Tempo Litúrgico", e);
            jobStatusService.registrar(jobName, false, "Exceção: " + e.getMessage());
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // JOB 5: Health Check das APIs externas — a cada 30 minutos
    // Verifica se as APIs que o sistema consome estão respondendo.
    // ────────────────────────────────────────────────────────────────────────
    @Scheduled(fixedRate = 1800000) // 30 minutos
    public void healthCheckApisExternas() {
        String jobName = "health-check-apis";
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        StringBuilder sb = new StringBuilder();
        boolean todasOk = true;

        // 1. API de Liturgia
        todasOk &= verificarApi(client, "Liturgia", "https://liturgia.up.railway.app/v2/", sb);

        // 2. API do Vaticano (Intenções do Papa)
        todasOk &= verificarApi(client, "Vaticano", "https://www.popesprayer.va/wp-json/wp/v2/sjd_intention_year?per_page=1", sb);

        jobStatusService.registrar(jobName, todasOk, sb.toString().trim());
        if (!todasOk) {
            log.warn("[JOB] Health Check — APIs com problema: {}", sb);
        }
    }

    private boolean verificarApi(HttpClient client, String nome, String url, StringBuilder sb) {
        try {
            HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofSeconds(10))
                    .GET()
                    .build();
            HttpResponse<Void> resp = client.send(req, HttpResponse.BodyHandlers.discarding());
            int code = resp.statusCode();
            boolean ok = code >= 200 && code < 400;
            sb.append(nome).append(": ").append(ok ? "OK" : "HTTP " + code).append(" | ");
            return ok;
        } catch (Exception e) {
            sb.append(nome).append(": OFFLINE (").append(e.getMessage()).append(") | ");
            return false;
        }
    }
}
