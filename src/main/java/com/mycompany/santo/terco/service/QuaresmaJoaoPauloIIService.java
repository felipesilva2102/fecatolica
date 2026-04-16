package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaJoaoPauloIIService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso São João Paulo II, o Grande, pastor universal da Igreja!
            Vos que percorrestes o mundo inteiro proclamando: "Não tenhais medo, abri as portas a Cristo!",
            intercedeis por nós nesta Quaresma dedicada a vossa memoria,
            e apresentai ao Senhor o pedido que vos confio: (fazer o pedido).
            Por vosso exemplo de fé, coragem e devoção a Maria,
            rogai pelo povo cristao e pela Santa Igreja de Cristo. Amém.""";

    private static final String SUPLICAS = """
            1. São João Paulo II, que sofreste perdas desde jovem e encontraste Cristo, rogai por nós!
            2. São João Paulo II, sacerdote cheio do Espírito Santo, rogai por nós!
            3. São João Paulo II, bispo e cardeal de Cracovia, rogai por nós!
            4. São João Paulo II, papa eleito em 1978 com surpresa para o mundo, rogai por nós!
            5. São João Paulo II, que gritastes "Não tenhais medo!" a toda a humanidade, rogai por nós!
            6. São João Paulo II, que percorrestes 129 países e conhecestes mais pessoas que alguém, rogai por nós!
            7. São João Paulo II, apóstolo da Família e da Teologia do Corpo, rogai por nós!
            8. São João Paulo II, que proclamastes a Divina Misericórdia ao mundo, rogai por nós!
            9. São João Paulo II, que canonizastes Santa Faustina e instituistes a Festa da Misericórdia, rogai por nós!
            10. São João Paulo II, que sobrevivestes ao atentado e perdoastes o agressor, rogai por nós!
            11. São João Paulo II, apóstolo do ecumenismo e do diálogo inter-religioso, rogai por nós!
            12. São João Paulo II, que rezastes o Rosário como respiração diária, rogai por nós!
            13. São João Paulo II, filho devotíssimo de Nossa Senhora, rogai por nós!
            14. São João Paulo II, que consagrastes vosso pontificado ao Totus Tuus de Maria, rogai por nós!
            15. São João Paulo II, autor de encíclicas proféticas para o mundo moderno, rogai por nós!
            16. São João Paulo II, que carregastes com dignidade o sofrimento do Parkinson, rogai por nós!
            17. São João Paulo II, que morrestes orando e em paz aos 84 anos, rogai por nós!
            18. São João Paulo II, amado pelos jovens do mundo inteiro, rogai por nós!
            19. São João Paulo II, fundador das Jornadas Mundiais da Juventude, rogai por nós!
            20. São João Paulo II, canonizado em 2014 pelo Papa Francisco, rogai por nós!
            21. São João Paulo II, defensor da dignidade humana desde a concepção, rogai por nós!
            22. São João Paulo II, intercessor pela unidade dos cristãos, rogai por nós!
            23. São João Paulo II, que trabalhaste pela queda do comunismo, rogai por nós!
            24. São João Paulo II, protetor dos direitos dos trabalhadores, rogai por nós!
            25. São João Paulo II, guardião da verdade moral no mundo moderno, rogai por nós!
            26. São João Paulo II, que ensinou a dignidade da mulher e da maternidade, rogai por nós!
            27. São João Paulo II, mestre da oração e da contemplação, rogai por nós!
            28. São João Paulo II, que escrevestes poesias e peças de teatro, rogai por nós!
            29. São João Paulo II, glória da Igreja Católica do sec. XX, rogai por nós!
            30. São João Paulo II, nosso intercessor poderoso junto a Cristo, rogai por nós!
            
            (Rezar três vezes:)
            São João Paulo II, o Grande, rogai por nós e pela Santa Igreja!""";

    private static final String ORACAO_FINAL = """
            O glorioso São João Paulo II, papa e mártir do sec. XX,
            que destes tudo em servico a Igreja e ao mundo,
            intercedei pela Igreja de hoje nas suas tribulacoes,
            pelos jovens que buscam sentido para a vida,
            pelas famílias que enfrentam crises,
            e por todos os cristãos que querem abrir as portas a Cristo.
            Que vossa espiritualidade mariana, sua coragem e vossa fé
            continuem a frutificar em todos nós. Amém.""";

    private static final String JACULATORIA = "São João Paulo II, o Grande, não tenhamos medo de abrir as portas a Cristo!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 9, 13);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 22);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São João Paulo II (13/09 - 22/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São João Paulo II");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
