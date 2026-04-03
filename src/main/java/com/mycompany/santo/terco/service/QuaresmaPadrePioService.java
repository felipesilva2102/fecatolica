package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaPadrePioService {

    private static final String ORACAO_PREPARATORIA = """
            Bem-aventurado Padre Pio de Pietrelcina, sacerdote e martir do confessionario!
            Vos que recebestes os sagrados estigmas de Cristo e os aceitastes com alegria por 50 anos,
            que passastes horas e dias no confessionario reconciliando pecadores com Deus,
            intercedei por mim nesta Quaresma e apresentai ao Senhor o meu pedido: (fazer o pedido).
            Por vossas chagas, pelas vossas lagrimas e pela vossa missa de horas, rogai por nos. Amem.""";

    private static final String SUPLICAS = """
            1. Padre Pio, sacerdote cheio do Espirito Santo, rogai por nos!
            2. Padre Pio, filho obediente a Igreja e ao Papa, rogai por nos!
            3. Padre Pio, que recebestes os estigmas de Cristo, rogai por nos!
            4. Padre Pio, que celebrastes a Missa com intensa devoção, rogai por nos!
            5. Padre Pio, apostolo do confessionario e da misericordia, rogai por nos!
            6. Padre Pio, que sofrer 5 horas na Missa em uniao com Cristo, rogai por nos!
            7. Padre Pio, que via as almas como Deus as ve, rogai por nos!
            8. Padre Pio, que fundaste o Hospital Casa Alivio do Sofrimento, rogai por nos!
            9. Padre Pio, que usastes os dons do Espirito com humildade, rogai por nos!
            10. Padre Pio, que sofrestes perseguicoes injustas com paciencia, rogai por nos!
            11. Padre Pio, que rezastes o Rosario com intensidade, rogai por nos!
            12. Padre Pio, filho devotissimo de Nossa Senhor, rogai por nos!
            13. Padre Pio, que atraistes multidoes ao Sacramento da Penitencia, rogai por nos!
            14. Padre Pio, que convertrais inumeros pecadores, rogai por nos!
            15. Padre Pio, que bilocalistas para socorrer os necessitados, rogai por nos!
            16. Padre Pio, que lia os coracoes no confessionario, rogai por nos!
            17. Padre Pio, modelo de vida eucaristica, rogai por nos!
            18. Padre Pio, sacerdote de oracao ininterrupta, rogai por nos!
            19. Padre Pio, que partiste ao Ceu chorando de amor a Deus, rogai por nos!
            20. Padre Pio, canonizado pelo Papa Joao Paulo II em 2002, rogai por nos!
            21. Padre Pio, protetor dos doentes e dos moribundos, rogai por nos!
            22. Padre Pio, intercessor nas situacoes aparentemente impossiveis, rogai por nos!
            23. Padre Pio, que nunca deixaste de rezar pelos fieis que te pediam, rogai por nos!
            24. Padre Pio, patrono dos grupos de oracao, rogai por nos!
            25. Padre Pio, patrono dos voluntarios da caridade, rogai por nos!
            26. Padre Pio, modelo de obediencia ao confessore, rogai por nos!
            27. Padre Pio, guia espiritual dos que te procuram, rogai por nos!
            28. Padre Pio, intercessor pelos sacerdotes em tentacao, rogai por nos!
            29. Padre Pio, amparo das familias em crise espiritual, rogai por nos!
            30. Padre Pio, nosso pai e intercessor poderoso no Ceu, rogai por nos!
            
            (Rezar com devocao tres vezes:)
            Padre Pio, dai-nos a graca de amar a Cruz como a amastes!""";

    private static final String ORACAO_FINAL = """
            O glorioso Padre Pio, sacerdote estigmatizado de Pietrelcina,
            que pela vossa vida de uniao com Cristo Cruficado
            merecestes a graca de participar de Suas chagas sagradas,
            apresentai ao Senhor o meu pedido e intercedei pela minha conversao.
            Que o vosso amor pelo Sacramento da Reconciliacao
            me inspire a buscar sempre o perdao de Deus com coracao contrito. Amem.""";

    private static final String JACULATORIA = "Padre Pio, prega, ama, sofre e se consola! Rogai por nos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 9, 23);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Padre Pio (15/08 - 23/09).");
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
