package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaJoaoPauloIIService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso Sao Joao Paulo II, o Grande, pastor universal da Igreja!
            Vos que percorrestes o mundo inteiro proclamando: "Nao tenhais medo, abri as portas a Cristo!",
            intercedeis por nos nesta Quaresma dedicada a vossa memoria,
            e apresentai ao Senhor o pedido que vos confio: (fazer o pedido).
            Por vosso exemplo de fe, coragem e devocao a Maria,
            rogai pelo povo cristao e pela Santa Igreja de Cristo. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Joao Paulo II, que sofreste perdas desde jovem e encontraste Cristo, rogai por nos!
            2. Sao Joao Paulo II, sacerdote cheio do Espirito Santo, rogai por nos!
            3. Sao Joao Paulo II, bispo e cardeal de Cracovia, rogai por nos!
            4. Sao Joao Paulo II, papa eleito em 1978 com surpresa para o mundo, rogai por nos!
            5. Sao Joao Paulo II, que gritastes "Nao tenhais medo!" a toda a humanidade, rogai por nos!
            6. Sao Joao Paulo II, que percorrestes 129 paises e conhecestes mais pessoas que alguem, rogai por nos!
            7. Sao Joao Paulo II, apostolo da Familia e da Teologia do Corpo, rogai por nos!
            8. Sao Joao Paulo II, que proclamastes a Divina Misericordia ao mundo, rogai por nos!
            9. Sao Joao Paulo II, que canonizastes Santa Faustina e instituistes a Festa da Misericordia, rogai por nos!
            10. Sao Joao Paulo II, que sobrevivestes ao atentado e perdoastes o agressor, rogai por nos!
            11. Sao Joao Paulo II, apostolo do ecumenismo e do dialogo inter-religioso, rogai por nos!
            12. Sao Joao Paulo II, que rezastes o Rosario como respiracao diaria, rogai por nos!
            13. Sao Joao Paulo II, filho devotissimo de Nossa Senhora, rogai por nos!
            14. Sao Joao Paulo II, que consagrastes vosso pontificado ao Totus Tuus de Maria, rogai por nos!
            15. Sao Joao Paulo II, autor de encíclicas profeticas para o mundo moderno, rogai por nos!
            16. Sao Joao Paulo II, que carregastes com dignidade o sofrimento do Parkinson, rogai por nos!
            17. Sao Joao Paulo II, que morrestes orando e em paz aos 84 anos, rogai por nos!
            18. Sao Joao Paulo II, amado pelos jovens do mundo inteiro, rogai por nos!
            19. Sao Joao Paulo II, fundador das Jornadas Mundiais da Juventude, rogai por nos!
            20. Sao Joao Paulo II, canonizado em 2014 pelo Papa Francisco, rogai por nos!
            21. Sao Joao Paulo II, defensor da dignidade humana desde a concepcao, rogai por nos!
            22. Sao Joao Paulo II, intercessor pela unidade dos cristaos, rogai por nos!
            23. Sao Joao Paulo II, que trabalhaste pela queda do comunismo, rogai por nos!
            24. Sao Joao Paulo II, protetor dos direitos dos trabalhadores, rogai por nos!
            25. Sao Joao Paulo II, guardian da verdade moral no mundo moderno, rogai por nos!
            26. Sao Joao Paulo II, que ensinou a dignidade da mulher e da maternidade, rogai por nos!
            27. Sao Joao Paulo II, mestre da oracao e da contemplacao, rogai por nos!
            28. Sao Joao Paulo II, que escrevestes poesias e pecas de teatro, rogai por nos!
            29. Sao Joao Paulo II, gloria da Igreja Cat e´olica do sec. XX, rogai por nos!
            30. Sao Joao Paulo II, nosso intercessor poderoso junto a Cristo, rogai por nos!
            
            (Rezar tres vezes:)
            Sao Joao Paulo II, o Grande, rogai por nos e pela Santa Igreja!""";

    private static final String ORACAO_FINAL = """
            O glorioso Sao Joao Paulo II, papa e martir do sec. XX,
            que destes tudo em servico a Igreja e ao mundo,
            intercedei pela Igreja de hoje nas suas tribulacoes,
            pelos jovens que buscam sentido para a vida,
            pelas familias que enfrentam crises,
            e por todos os cristaos que querem abrir as portas a Cristo.
            Que vossa espiritualidade mariana, seu coragem e vossa fe
            continuem a frutificar em todos os nos. Amem.""";

    private static final String JACULATORIA = "Sao Joao Paulo II, o Grande, nao tenhamos medo de abrir as portas a Cristo!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 9, 13);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 22);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Joao Paulo II (13/09 - 22/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Joao Paulo II");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
