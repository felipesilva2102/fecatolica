package com.mycompany.santo.terco.quaresma;

import com.mycompany.santo.terco.util.CalendarioLiturgicoUtils;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class QuaresmaLiturgicaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataSelecionada = LocalDate.now();

    public LocalDate getDataInicio() {
        return CalendarioLiturgicoUtils.quartaFeiraCinzas(dataSelecionada.getYear());
    }

    public LocalDate getDataFim() {
        return CalendarioLiturgicoUtils.calcularPascoa(dataSelecionada.getYear()).minusDays(1);
    }

    public boolean isDiaSelecionadoRenderizar() {
        return !dataSelecionada.isBefore(getDataInicio()) && !dataSelecionada.isAfter(getDataFim());
    }

    public int getDiaQuaresma() {
        if (!isDiaSelecionadoRenderizar()) {
            return -1;
        }
        return (int) ChronoUnit.DAYS.between(getDataInicio(), dataSelecionada) + 1;
    }

    public String getMensagemDia() {
        if (!isDiaSelecionadoRenderizar()) {
            return "A data selecionada está fora da Quaresma litúrgica deste ano (" + getPeriodoFormatado() + ").";
        }
        return "Dia " + getDiaQuaresma() + " da Quaresma litúrgica";
    }

    public String getPeriodoFormatado() {
        return getDataInicio().format(FORMATTER) + " até " + getDataFim().format(FORMATTER);
    }

    public String getTemaDoDia() {
        int dia = getDiaQuaresma();
        if (dia == -1) {
            return "Selecione uma data dentro da Quaresma para acompanhar o caminho espiritual.";
        }
        if (dia <= 7) {
            return "Conversão inicial: oração e exame de consciência.";
        }
        if (dia <= 20) {
            return "Perseverança: jejum, caridade e reconciliação.";
        }
        if (dia <= 35) {
            return "Purificação do coração: escuta da Palavra e vida sacramental.";
        }
        return "Preparação imediata para a Semana Santa e a Páscoa.";
    }

    public String getPraticasQuaresmais() {
        return "• Oração diária com a Palavra de Deus\n"
                + "• Jejum e abstinência conforme a disciplina da Igreja\n"
                + "• Confissão e participação na Eucaristia\n"
                + "• Caridade concreta aos mais necessitados\n"
                + "• Penitência e conversão de vida";
    }

    public String getOracaoQuaresmal() {
        return "Senhor Jesus Cristo,\n"
                + "neste tempo santo da Quaresma,\n"
                + "dai-me um coração humilde e convertido.\n"
                + "Fortalecei-me na oração, no jejum e na caridade,\n"
                + "para que eu celebre com fé viva\n"
                + "o mistério da vossa Páscoa.\n"
                + "Amém.";
    }

    public String getLeituraSugerida() {
        return "Sugestão de leitura: Mateus 6, 1-18 (oração, jejum e esmola no segredo do coração).";
    }
}
