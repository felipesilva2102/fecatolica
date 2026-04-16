package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSaoJudasTadeuService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso Apóstolo São Judas Tadeu, parente de Nosso Senhor Jesus Cristo!
            Vos que sois invocado em todo o mundo como patrono das causas desesperadas,
            aqui me prostro confiante, com um pedido que parece sem saída: (fazer o pedido).
            Por vossa fidelidade a Cristo até o martírio e pela carta que escrevestes aos cristãos perseguidos,
            intercedei por mim junto ao Trono da Misericórdia Divina. Amém.""";

    private static final String SUPLICAS = """
            1. São Judas Tadeu, apóstolo fiel de Nosso Senhor Jesus Cristo, rogai por nós!
            2. São Judas Tadeu, parente de Jesus pela carne, rogai por nós!
            3. São Judas Tadeu, que pregastes o Evangelho com coragem, rogai por nós!
            4. São Judas Tadeu, missionário na Pérsia e na Mesopotâmia, rogai por nós!
            5. São Judas Tadeu, autor da Carta Católica, rogai por nós!
            6. São Judas Tadeu, que confortastes os cristãos perseguidos, rogai por nós!
            7. São Judas Tadeu, mártir glorioso da fé, rogai por nós!
            8. São Judas Tadeu, invocado nas causas difíceis e desesperadas, rogai por nós!
            9. São Judas Tadeu, poderoso intercessor junto a Deus, rogai por nós!
            10. São Judas Tadeu, socorro dos abandonados, rogai por nós!
            11. São Judas Tadeu, esperança dos que não tem esperança, rogai por nós!
            12. São Judas Tadeu, que reconstruis o que parecen destruido, rogai por nós!
            13. São Judas Tadeu, amparo dos endividados e dos falidos, rogai por nós!
            14. São Judas Tadeu, proteção nas situações de urgência, rogai por nós!
            15. São Judas Tadeu, guardião dos que estão no fundo do poço, rogai por nós!
            16. São Judas Tadeu, que encontrastes saídas onde não havia, rogai por nós!
            17. São Judas Tadeu, patrono dos impossibilitados por enfermidade, rogai por nós!
            18. São Judas Tadeu, patrono dos que perderam tudo, rogai por nós!
            19. São Judas Tadeu, esperança das famílias em crise, rogai por nós!
            20. São Judas Tadeu, protetor dos jovens em desespero, rogai por nós!
            21. São Judas Tadeu, auxílio em processos judiciais injustos, rogai por nós!
            22. São Judas Tadeu, amparo dos presos e encarcerados, rogai por nós!
            23. São Judas Tadeu, guardião dos que sofrem discriminação, rogai por nós!
            24. São Judas Tadeu, consolador dos corações partidos, rogai por nós!
            25. São Judas Tadeu, que nunca abandonas os que te invocam, rogai por nós!
            26. São Judas Tadeu, que alcanças o que parece humanamente impossível, rogai por nós!
            27. São Judas Tadeu, nosso advogado no Céu, rogai por nós!
            28. São Judas Tadeu, glória do Colégio Apostólico, rogai por nós!
            29. São Judas Tadeu, testemunho vivo de que Cristo vence tudo, rogai por nós!
            30. São Judas Tadeu, nosso pai e intercessor poderoso, rogai por nós!
            
            (Repetir três vezes com fé firme:)
            São Judas Tadeu, intercedei por nós, pois somos teus filhos desesperados!""";

    private static final String ORACAO_FINAL = """
            Ó glorioso São Judas Tadeu, apóstolo, mártir e patrono das causas desesperadas!
            Venho a Vós com um pedido que parece sem saída humana.
            Confio plenamente na vossa intercessão junto a Jesus,
            de cujo sangue sois parente e testemunha.
            Apresentai ao Senhor a minha necessidade e alcançai-me a graça implorada.
            Prometo propagar vossa devoção e ser grato por toda a vida. Amém.""";

    private static final String JACULATORIA = "São Judas Tadeu, apóstolo e mártir, rogai por nós que a Vos recorremos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 9, 19);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 28);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Judas Tadeu (19/09 - 28/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Judas Tadeu");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
