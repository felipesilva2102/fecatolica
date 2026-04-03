package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSaoJudasTadeuService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso Apostolo Sao Judas Tadeu, parente de Nosso Senhor Jesus Cristo!
            Vos que sois invocado em todo o mundo como patrono das causas desesperadas,
            aqui me prostro confiante, com um pedido que parece sem saida: (fazer o pedido).
            Por vossa fidelidade a Cristo ate o martirioe pela carta que escrevestes aos cristaos perseguidos,
            intercedei por mim junto ao Trono da Misericordia Divina. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Judas Tadeu, apostolo fiel de Nosso Senhor Jesus Cristo, rogai por nos!
            2. Sao Judas Tadeu, parente de Jesus pela carne, rogai por nos!
            3. Sao Judas Tadeu, que pregastes o Evangelho com coragem, rogai por nos!
            4. Sao Judas Tadeu, missionario na Persia e na Mesopotamia, rogai por nos!
            5. Sao Judas Tadeu, autor da Carta Catolica, rogai por nos!
            6. Sao Judas Tadeu, que confortastes os cristaos perseguidos, rogai por nos!
            7. Sao Judas Tadeu, martir glorioso da fe, rogai por nos!
            8. Sao Judas Tadeu, invocado nas causas dificeis e desesperadas, rogai por nos!
            9. Sao Judas Tadeu, poderoso intercessor junto a Deus, rogai por nos!
            10. Sao Judas Tadeu, socorro dos abandonados, rogai por nos!
            11. Sao Judas Tadeu, esperanca dos que nao tem esperanca, rogai por nos!
            12. Sao Judas Tadeu, que reconstruis o que parecen destruido, rogai por nos!
            13. Sao Judas Tadeu, amparo dos endividados e dos falidos, rogai por nos!
            14. Sao Judas Tadeu, protecao nas situacoes de urgencia, rogai por nos!
            15. Sao Judas Tadeu, guardiao dos que estao no fundo do poco, rogai por nos!
            16. Sao Judas Tadeu, que encontrastes saidas onde nao havia, rogai por nos!
            17. Sao Judas Tadeu, patrono dos impossibilidados por enfermidade, rogai por nos!
            18. Sao Judas Tadeu, patrono dos que perderam tudo, rogai por nos!
            19. Sao Judas Tadeu, esperanca das familias em crise, rogai por nos!
            20. Sao Judas Tadeu, protetor dos jovens em desespero, rogai por nos!
            21. Sao Judas Tadeu, auxilio em processos judiciais injustos, rogai por nos!
            22. Sao Judas Tadeu, amparo dos presos e encarcerados, rogai por nos!
            23. Sao Judas Tadeu, guardiao dos que sofrem discriminacao, rogai por nos!
            24. Sao Judas Tadeu, consolador dos coramentos partidos, rogai por nos!
            25. Sao Judas Tadeu, que nunca abandonas os que te invocam, rogai por nos!
            26. Sao Judas Tadeu, que alcancas o que parece humanamente impossivel, rogai por nos!
            27. Sao Judas Tadeu, nosso advogado no Ceu, rogai por nos!
            28. Sao Judas Tadeu, gloria do Colegio Apostolico, rogai por nos!
            29. Sao Judas Tadeu, testemunho vivo de que Cristo vence tudo, rogai por nos!
            30. Sao Judas Tadeu, nosso pai e intercessor poderoso, rogai por nos!
            
            (Repetir tres vezes com fé firme:)
            Sao Judas Tadeu, intercede por nos, pois somos teus filhos desesperados!""";

    private static final String ORACAO_FINAL = """
            O glorioso Sao Judas Tadeu, apostolo, martir e patrono das causas desesperadas!
            Venho a Vos com um pedido que parece sem saida humana.
            Confio plenamente na vossa intercessao junto a Jesus,
            de cujo sangue sois parente e testemunha.
            Apresentai ao Senhor a minha necessidade e alcancai-me a graca implorada.
            Prometo propagar vossa devocao e ser grato por toda a vida. Amem.""";

    private static final String JACULATORIA = "Sao Judas Tadeu, apostolo e martir, rogai por nos que a Vos recorremos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 9, 19);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 28);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Judas Tadeu (19/09 - 28/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Judas Tadeu");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
