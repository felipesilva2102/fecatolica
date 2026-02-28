package com.mycompany.santo.terco.util;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 * Bean para validação de dias de novenas pelo servidor.
 * Impede que o utilizador avance dias burlando a data local.
 */
@Named
@SessionScoped
@Getter
@Setter
public class ValidacaoDiaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Verifica se um dia específico de novena está liberado.
     *
     * @param dataInicioNovena data de início da novena
     * @param diaDesejado dia da novena (1 a 9)
     * @return true se o dia está liberado
     */
    public boolean isDiaLiberado(LocalDate dataInicioNovena, int diaDesejado) {
        if (dataInicioNovena == null || diaDesejado < 1 || diaDesejado > 9) {
            return false;
        }
        LocalDate hoje = LocalDate.now();
        long diasPassados = ChronoUnit.DAYS.between(dataInicioNovena, hoje);
        return diasPassados >= (diaDesejado - 1);
    }

    /**
     * Retorna o dia atual da novena baseado na data do servidor.
     *
     * @param dataInicioNovena data de início
     * @return dia atual (1-9), ou 0 se ainda não começou, ou 10 se já terminou
     */
    public int getDiaAtual(LocalDate dataInicioNovena) {
        if (dataInicioNovena == null) return 0;
        LocalDate hoje = LocalDate.now();
        long diasPassados = ChronoUnit.DAYS.between(dataInicioNovena, hoje);
        if (diasPassados < 0) return 0;
        if (diasPassados >= 9) return 10;
        return (int) diasPassados + 1;
    }
}
