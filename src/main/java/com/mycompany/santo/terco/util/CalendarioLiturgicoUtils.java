package com.mycompany.santo.terco.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Utilitário para cálculo do calendário litúrgico católico.
 * Usa o Algoritmo de Meeus (Computus) para calcular a Páscoa.
 */
public final class CalendarioLiturgicoUtils {

    private CalendarioLiturgicoUtils() {
    }

    /**
     * Calcula a data da Páscoa pelo Algoritmo de Meeus (Anonymous Gregorian).
     */
    public static LocalDate calcularPascoa(int ano) {
        int a = ano % 19;
        int b = ano / 100;
        int c = ano % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int mes = (h + l - 7 * m + 114) / 31;
        int dia = ((h + l - 7 * m + 114) % 31) + 1;
        return LocalDate.of(ano, mes, dia);
    }

    public static LocalDate quartaFeiraCinzas(int ano) {
        return calcularPascoa(ano).minusDays(46);
    }

    public static LocalDate domingoRamos(int ano) {
        return calcularPascoa(ano).minusDays(7);
    }

    public static LocalDate pentecostes(int ano) {
        return calcularPascoa(ano).plusDays(49);
    }

    public static LocalDate corpusChristi(int ano) {
        return calcularPascoa(ano).plusDays(60);
    }

    public static LocalDate primeiroAdventoAno(int ano) {
        LocalDate natal = LocalDate.of(ano, 12, 25);
        LocalDate domAntes = natal.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        return domAntes.minusWeeks(3);
    }

    /**
     * Retorna o tempo litúrgico para uma data.
     */
    public static String getTempoLiturgico(LocalDate data) {
        int ano = data.getYear();
        LocalDate pascoa = calcularPascoa(ano);
        LocalDate cinzas = quartaFeiraCinzas(ano);
        LocalDate pente = pentecostes(ano);
        LocalDate advento = primeiroAdventoAno(ano);

        LocalDate natal = LocalDate.of(ano, 12, 25);
        LocalDate epifania = LocalDate.of(ano, 1, 6);
        LocalDate batismoSenhor = epifania.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        if (batismoSenhor.equals(epifania)) {
            batismoSenhor = batismoSenhor.plusWeeks(1);
        }

        // Advento
        if (!data.isBefore(advento) && data.isBefore(natal)) {
            return "Advento";
        }
        // Natal (25/12 até fim do ano)
        if (!data.isBefore(natal)) {
            return "Natal";
        }
        // Natal (1/1 até Batismo do Senhor)
        if (!data.isBefore(LocalDate.of(ano, 1, 1)) && !data.isAfter(batismoSenhor)) {
            return "Natal";
        }
        // Quaresma
        if (!data.isBefore(cinzas) && data.isBefore(pascoa)) {
            if (!data.isBefore(domingoRamos(ano))) {
                return "Semana Santa";
            }
            return "Quaresma";
        }
        // Tempo Pascal
        if (!data.isBefore(pascoa) && !data.isAfter(pente)) {
            return "Tempo Pascal";
        }
        // Tempo Comum
        return "Tempo Comum";
    }

    /**
     * Retorna a cor litúrgica primária associada ao tempo litúrgico.
     */
    public static String getCorPrimariaHex(String tempoLiturgico) {
        return switch (tempoLiturgico) {
            case "Advento", "Quaresma" -> "#6f42c1";
            case "Natal", "Tempo Pascal" -> "#c9a227";
            case "Semana Santa" -> "#dc3545";
            case "Tempo Comum" -> "#28a745";
            default -> "#6c757d";
        };
    }

    public static String getCorSecundariaHex(String tempoLiturgico) {
        return switch (tempoLiturgico) {
            case "Advento", "Quaresma" -> "#4a2d7a";
            case "Natal", "Tempo Pascal" -> "#a07d1e";
            case "Semana Santa" -> "#a71d2a";
            case "Tempo Comum" -> "#1e7e34";
            default -> "#495057";
        };
    }

    public static String getCorTextoHex(String tempoLiturgico) {
        return switch (tempoLiturgico) {
            default -> "#ffffff";
        };
    }

    public static String getCorFundoHex(String tempoLiturgico) {
        return switch (tempoLiturgico) {
            case "Advento", "Quaresma" -> "#f5f0ff";
            case "Natal", "Tempo Pascal" -> "#fffef5";
            case "Semana Santa" -> "#fff5f5";
            case "Tempo Comum" -> "#f0fff0";
            default -> "#f8f9fa";
        };
    }
}
