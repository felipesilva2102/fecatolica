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
        result.put("periodoFormatado", dataInicio.format(FORMATTER) + " até " + dataFim.format(FORMATTER));

        if (!dentroQuaresma) {
            result.put("mensagemDia", "A data selecionada está fora da Quaresma litúrgica deste ano (" +
                    dataInicio.format(FORMATTER) + " até " + dataFim.format(FORMATTER) + ").");
        } else {
            result.put("mensagemDia", "Dia " + diaQuaresma + " da Quaresma litúrgica");
            result.put("temaDoDia", getTemaDoDia(diaQuaresma));
            result.put("praticasQuaresmais", getPraticasQuaresmais());
            result.put("oracaoQuaresmal", getOracaoQuaresmal());
            result.put("leituraSugerida", getLeituraSugerida());
        }
        return result;
    }

    private String getTemaDoDia(int dia) {
        if (dia <= 7) return "Conversão inicial: oração e exame de consciência.";
        if (dia <= 20) return "Perseverança: jejum, caridade e reconciliação.";
        if (dia <= 35) return "Purificação do coração: escuta da Palavra e vida sacramental.";
        return "Preparação imediata para a Semana Santa e a Páscoa.";
    }

    private String getPraticasQuaresmais() {
        return """
               \u2022 Oração diária com a Palavra de Deus
               \u2022 Jejum e abstinência conforme a disciplina da Igreja
               \u2022 Confissão e participação na Eucaristia
               \u2022 Caridade concreta aos mais necessitados
               \u2022 Penitência e conversão de vida""";
    }

    private String getOracaoQuaresmal() {
        return """
               Senhor Jesus Cristo,
               neste tempo santo da Quaresma,
               dai-me um coração humilde e convertido.
               Fortalecei-me na oração, no jejum e na caridade,
               para que eu celebre com fé viva
               o mistério da vossa Páscoa.
               Amém.""";
    }

    private String getLeituraSugerida() {
        return "Sugestão de leitura: Mateus 6, 1-18 (oração, jejum e esmola no segredo do coração).";
    }
}
