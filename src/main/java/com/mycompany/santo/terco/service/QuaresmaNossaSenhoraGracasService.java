package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraGracasService {

    private static final String ORACAO_PREPARATORIA = """
            O Maria, cheia de graça, coberta dos raios do sol eterno!
            As aparicoes de Nossa Senhora das Graças a Santa Catarina Laboure em 1830
            nos revelaram a Medalha Milagrosa e a ternura do vosso coração maternal.
            Nesta Quaresma das Graças, desejo implorar a vossa intercissao pelo que necessito: (fazer o pedido).
            O Maria, concebida sem pecado, rogai por nós que recorremos a Vos! Amém.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora das Graças, Rainha do Céu, rogai por nós!
            2. Nossa Senhora das Graças, Mãe de Misericórdia, rogai por nós!
            3. Nossa Senhora das Graças, Medianeira de todas as graças, rogai por nós!
            4. Nossa Senhora das Graças, reveladora da Medalha Milagrosa, rogai por nós!
            5. Nossa Senhora das Graças, aurora da nova evangelizacao, rogai por nós!
            6. Nossa Senhora das Graças, Imaculada Conceição, rogai por nós!
            7. Nossa Senhora das Graças, Refúgio dos pecadores, rogai por nós!
            8. Nossa Senhora das Graças, Conforto dos aflitos, rogai por nós!
            9. Nossa Senhora das Graças, Saúde dos enfermos, rogai por nós!
            10. Nossa Senhora das Graças, Auxílio dos cristãos, rogai por nós!
            11. Nossa Senhora das Graças, Mãe da Divina Providencia, rogai por nós!
            12. Nossa Senhora das Graças, Estrela da manha, rogai por nós!
            13. Nossa Senhora das Graças, Porta do Céu, rogai por nós!
            14. Nossa Senhora das Graças, Espelho de justiça, rogai por nós!
            15. Nossa Senhora das Graças, Torre de Davi, rogai por nós!
            16. Nossa Senhora das Graças, Torre de marfim, rogai por nós!
            17. Nossa Senhora das Graças, Arca da Alianca, rogai por nós!
            18. Nossa Senhora das Graças, Causa da nossa alegria, rogai por nós!
            19. Nossa Senhora das Graças, Vaso espiritual, rogai por nós!
            20. Nossa Senhora das Graças, Vaso honoravel, rogai por nós!
            21. Nossa Senhora das Graças, Rosa mistica, rogai por nós!
            22. Nossa Senhora das Graças, distribuidora das graças de Deus, rogai por nós!
            23. Nossa Senhora das Graças, protetora dos que usam a Medalha Milagrosa, rogai por nós!
            24. Nossa Senhora das Graças, Rainha dos Anjos, rogai por nós!
            25. Nossa Senhora das Graças, Rainha dos Patriarcas, rogai por nós!
            26. Nossa Senhora das Graças, Rainha dos Apostolos, rogai por nós!
            27. Nossa Senhora das Graças, Rainha dos Martires, rogai por nós!
            28. Nossa Senhora das Graças, Rainha de todos os Santos, rogai por nós!
            29. Nossa Senhora das Graças, Mãe da Igreja, rogai por nós!
            30. Nossa Senhora das Graças, nosso socorro e esperança, rogai por nós!
            
            (Repetir três vezes:)
            O Maria, concebida sem pecado, rogai por nós que recorremos a Vos!""";

    private static final String ORACAO_FINAL = """
            Virgem Imaculada, Mãe de misericórdia e Mãe de Deus,
            que aparecestes a Santa Catarina Laboure para mostrar ao mundo a Medalha Milagrosa,
            intercedei por mim e por todas as pessoas que confiam em vosso maternal auxílio.
            Obtende-nos do Senhor as graças de que necessitamos
            e conduzi-nos para vosso Filho Jesus. Amém.""";

    private static final String JACULATORIA = "O Maria, concebida sem pecado, rogai por nós que recorremos a Vos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 10, 19);
        LocalDate dataFim = LocalDate.of(data.getYear(), 11, 27);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de N. Sra. das Graças (19/10 - 27/11).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora das Graças");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
