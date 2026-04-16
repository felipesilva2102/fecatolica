package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaPadrePioService {

    private static final String ORACAO_PREPARATORIA = """
            Bem-aventurado Padre Pio de Pietrelcina, sacerdote e mártir do confessionario!
            Vos que recebestes os sagrados estigmas de Cristo e os aceitastes com alegria por 50 anos,
            que passastes horas e dias no confessionario reconciliando pecadores com Deus,
            intercedei por mim nesta Quaresma e apresentai ao Senhor o meu pedido: (fazer o pedido).
            Por vossas chagas, pelas vossas lágrimas e pela vossa missa de horas, rogai por nós. Amém.""";

    private static final String SUPLICAS = """
            1. Padre Pio, sacerdote cheio do Espírito Santo, rogai por nós!
            2. Padre Pio, filho obediente a Igreja e ao Papa, rogai por nós!
            3. Padre Pio, que recebestes os estigmas de Cristo, rogai por nós!
            4. Padre Pio, que celebrastes a Missa com intensa devoção, rogai por nós!
            5. Padre Pio, apóstolo do confessionario e da misericórdia, rogai por nós!
            6. Padre Pio, que sofrer 5 horas na Missa em união com Cristo, rogai por nós!
            7. Padre Pio, que via as almas como Deus as ve, rogai por nós!
            8. Padre Pio, que fundaste o Hospital Casa Alivio do Sofrimento, rogai por nós!
            9. Padre Pio, que usastes os dons do Espírito com humildade, rogai por nós!
            10. Padre Pio, que sofrestes perseguicoes injustas com paciência, rogai por nós!
            11. Padre Pio, que rezastes o Rosário com intensidade, rogai por nós!
            12. Padre Pio, filho devotíssimo de Nossa Senhor, rogai por nós!
            13. Padre Pio, que atraistes multidões ao Sacramento da Penitência, rogai por nós!
            14. Padre Pio, que convertrais inumeros pecadores, rogai por nós!
            15. Padre Pio, que bilocalistas para socorrer os necessitados, rogai por nós!
            16. Padre Pio, que lia os corações no confessionario, rogai por nós!
            17. Padre Pio, modelo de vida eucaristica, rogai por nós!
            18. Padre Pio, sacerdote de oração ininterrupta, rogai por nós!
            19. Padre Pio, que partiste ao Céu chorando de amor a Deus, rogai por nós!
            20. Padre Pio, canonizado pelo Papa João Paulo II em 2002, rogai por nós!
            21. Padre Pio, protetor dos doentes e dos moribundos, rogai por nós!
            22. Padre Pio, intercessor nas situacoes aparentemente impossiveis, rogai por nós!
            23. Padre Pio, que nunca deixaste de rezar pelos fiéis que te pediam, rogai por nós!
            24. Padre Pio, patrono dos grupos de oração, rogai por nós!
            25. Padre Pio, patrono dos voluntarios da caridade, rogai por nós!
            26. Padre Pio, modelo de obediencia ao confessore, rogai por nós!
            27. Padre Pio, guia espiritual dos que te procuram, rogai por nós!
            28. Padre Pio, intercessor pelos sacerdotes em tentacao, rogai por nós!
            29. Padre Pio, amparo das famílias em crise espiritual, rogai por nós!
            30. Padre Pio, nosso pai e intercessor poderoso no Céu, rogai por nós!
            
            (Rezar com devoção três vezes:)
            Padre Pio, dai-nos a graça de amar a Cruz como a amastes!""";

    private static final String ORACAO_FINAL = """
            O glorioso Padre Pio, sacerdote estigmatizado de Pietrelcina,
            que pela vossa vida de união com Cristo Cruficado
            merecestes a graça de participar de Suas chagas sagradas,
            apresentai ao Senhor o meu pedido e intercedei pela minha conversão.
            Que o vosso amor pelo Sacramento da Reconciliação
            me inspire a buscar sempre o perdao de Deus com coração contrito. Amém.""";

    private static final String JACULATORIA = "Padre Pio, prega, ama, sofre e se consola! Rogai por nós!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 9, 23);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de Padre Pio (15/08 - 23/09).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Padre Pio de Pietrelcina");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
