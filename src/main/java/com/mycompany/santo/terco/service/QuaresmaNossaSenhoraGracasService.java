package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraGracasService {

    private static final String ORACAO_PREPARATORIA = """
            O Maria, cheia de graca, coberta dos raios do sol eterno!
            As aparicoes de Nossa Senhora das Gracas a Santa Catarina Laboure em 1830
            nos revelaram a Medalha Milagrosa e a ternura do vosso coracao maternal.
            Nesta Quaresma das Gracas, desejo implorar a vossa intercissao pelo que necessito: (fazer o pedido).
            O Maria, concebida sem pecado, rogai por nos que recorremos a Vos! Amem.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora das Gracas, Rainha do Ceu, rogai por nos!
            2. Nossa Senhora das Gracas, Mae de Misericordia, rogai por nos!
            3. Nossa Senhora das Gracas, Medianeira de todas as gracas, rogai por nos!
            4. Nossa Senhora das Gracas, reveladora da Medalha Milagrosa, rogai por nos!
            5. Nossa Senhora das Gracas, aurora da nova evangelizacao, rogai por nos!
            6. Nossa Senhora das Gracas, Imaculada Conceicao, rogai por nos!
            7. Nossa Senhora das Gracas, Refugio dos pecadores, rogai por nos!
            8. Nossa Senhora das Gracas, Conforto dos aflitos, rogai por nos!
            9. Nossa Senhora das Gracas, Saude dos enfermos, rogai por nos!
            10. Nossa Senhora das Gracas, Auxilio dos cristaos, rogai por nos!
            11. Nossa Senhora das Gracas, Mae da Divina Providencia, rogai por nos!
            12. Nossa Senhora das Gracas, Estrela da manha, rogai por nos!
            13. Nossa Senhora das Gracas, Porta do Ceu, rogai por nos!
            14. Nossa Senhora das Gracas, Espelho de justica, rogai por nos!
            15. Nossa Senhora das Gracas, Torre de Davi, rogai por nos!
            16. Nossa Senhora das Gracas, Torre de marfim, rogai por nos!
            17. Nossa Senhora das Gracas, Arca da Alianca, rogai por nos!
            18. Nossa Senhora das Gracas, Causa da nossa alegria, rogai por nos!
            19. Nossa Senhora das Gracas, Vaso espiritual, rogai por nos!
            20. Nossa Senhora das Gracas, Vaso honoravel, rogai por nos!
            21. Nossa Senhora das Gracas, Rosa mistica, rogai por nos!
            22. Nossa Senhora das Gracas, distribuidora das gracas de Deus, rogai por nos!
            23. Nossa Senhora das Gracas, protetora dos que usam a Medalha Milagrosa, rogai por nos!
            24. Nossa Senhora das Gracas, Rainha dos Anjos, rogai por nos!
            25. Nossa Senhora das Gracas, Rainha dos Patriarcas, rogai por nos!
            26. Nossa Senhora das Gracas, Rainha dos Apostolos, rogai por nos!
            27. Nossa Senhora das Gracas, Rainha dos Martires, rogai por nos!
            28. Nossa Senhora das Gracas, Rainha de todos os Santos, rogai por nos!
            29. Nossa Senhora das Gracas, Mae da Igreja, rogai por nos!
            30. Nossa Senhora das Gracas, nosso socorro e esperanca, rogai por nos!
            
            (Repetir tres vezes:)
            O Maria, concebida sem pecado, rogai por nos que recorremos a Vos!""";

    private static final String ORACAO_FINAL = """
            Virgem Imaculada, Mae de misericordia e Mae de Deus,
            que aparecestes a Santa Catarina Laboure para mostrar ao mundo a Medalha Milagrosa,
            intercedei por mim e por todas as pessoas que confiam em vosso maternal auxilio.
            Obtende-nos do Senhor as gracas de que necessitatamos
            e conduzi-nos para vosso Filho Jesus. Amem.""";

    private static final String JACULATORIA = "O Maria, concebida sem pecado, rogai por nos que recorremos a Vos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 10, 19);
        LocalDate dataFim = LocalDate.of(data.getYear(), 11, 27);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de N. Sra. das Gracas (19/10 - 27/11).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora das Gracas");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
