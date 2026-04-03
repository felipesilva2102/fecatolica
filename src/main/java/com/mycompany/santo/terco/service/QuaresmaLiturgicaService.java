package com.mycompany.santo.terco.service;

import com.mycompany.santo.terco.util.CalendarioLiturgicoUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaLiturgicaService {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = CalendarioLiturgicoUtils.quartaFeiraCinzas(data.getYear());
        LocalDate dataFim = CalendarioLiturgicoUtils.calcularPascoa(data.getYear()).minusDays(1);

        boolean dentroQuaresma = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int diaQuaresma = dentroQuaresma ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentroQuaresma);
        result.put("periodoFormatado", dataInicio.format(FORMATTER) + " ate " + dataFim.format(FORMATTER));

        if (!dentroQuaresma) {
            result.put("mensagemDia", "A data selecionada esta fora da Quaresma liturgica deste ano (" +
                    dataInicio.format(FORMATTER) + " ate " + dataFim.format(FORMATTER) + ").");
        } else {
            result.put("mensagemDia", "Dia " + diaQuaresma + " da Quaresma liturgica");
            result.put("temaDoDia", getTemaDoDia(diaQuaresma));
            result.put("praticasQuaresmais", getPraticasQuaresmais());
            result.put("oracaoQuaresmal", getOracaoQuaresmal());
            result.put("leituraSugerida", getLeituraSugerida());
        }
        return result;
    }

    private String getTemaDoDia(int dia) {
        if (dia <= 7) return "Conversao inicial: oracao e exame de consciencia.";
        if (dia <= 20) return "Perseveranca: jejum, caridade e reconciliacao.";
        if (dia <= 35) return "Purificacao do coracao: escuta da Palavra e vida sacramental.";
        return "Preparacao imediata para a Semana Santa e a Pascoa.";
    }

    private String getPraticasQuaresmais() {
        return """
               \u2022 Oracao diaria com a Palavra de Deus
               \u2022 Jejum e abstinencia conforme a disciplina da Igreja
               \u2022 Confissao e participacao na Eucaristia
               \u2022 Caridade concreta aos mais necessitados
               \u2022 Penitencia e conversao de vida""";
    }

    private String getOracaoQuaresmal() {
        return """
               Senhor Jesus Cristo,
               neste tempo santo da Quaresma,
               dai-me um coracao humilde e convertido.
               Fortalecei-me na oracao, no jejum e na caridade,
               para que eu celebre com fe viva
               o misterio da vossa Pascoa.
               Amem.""";
    }

    private String getLeituraSugerida() {
        return "Sugestao de leitura: Mateus 6, 1-18 (oracao, jejum e esmola no segredo do coracao).";
    }
}
