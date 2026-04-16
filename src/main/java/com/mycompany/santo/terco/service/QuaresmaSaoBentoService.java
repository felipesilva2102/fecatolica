package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSaoBentoService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso São Bento de Nursia, Pai do Monaquismo Ocidental e Patrono da Europa!
            Vos que fundaste o mosteiro de Monte Cassino e deixastes a Regra que formou
            muitos santos e civilizacoes inteiras a luz do Evangelho,
            intercedeis por esta quaresma e pelo pedido que vos apresento: (fazer o pedido).
            Pela Santa Medlha de São Bento, afastai o mal e conduzi-me ao bem.
            Pax! Não haja nada sobreposto ao amor de Cristo. Amém.""";

    private static final String SUPLICAS = """
            1. São Bento, Pai do Monaquismo Ocidental, rogai por nós!
            2. São Bento, Patriarca dos Monges do Ocidente, rogai por nós!
            3. São Bento, que abandonastes o mundo para buscar Deus, rogai por nós!
            4. São Bento, eremita de Subiaco, rogai por nós!
            5. São Bento, fundador de Monte Cassino, rogai por nós!
            6. São Bento, autor da Santa Regra Beneditina, rogai por nós!
            7. São Bento, que ensinas: Ora et Labora, rogai por nós!
            8. São Bento, que nada sobreponhas ao amor de Cristo, rogai por nós!
            9. São Bento, que rezastes sete vezes ao dia o Oficio Divino, rogai por nós!
            10. São Bento, modelo de hospitalidade crista, rogai por nós!
            11. São Bento, pai espiritual de inumeros monges santos, rogai por nós!
            12. São Bento, que sobrevivestes ao veneno pela graça de Deus, rogai por nós!
            13. São Bento, portador da Santa Medalha de poder sobre o mal, rogai por nós!
            14. São Bento, exorcista poderoso pelo nome de Jesus, rogai por nós!
            15. São Bento, patrono da Europa e da civilizacao ocidental, rogai por nós!
            16. São Bento, modelo de equilibrio entre oração e trabalho, rogai por nós!
            17. São Bento, que curaste doentes pela intercessão de Cristo, rogai por nós!
            18. São Bento, proteção contra envenenamentos e feiticarías, rogai por nós!
            19. São Bento, guardiao da vida interior e contemplativa, rogai por nós!
            20. São Bento, modelo de perseverança na vida espiritual, rogai por nós!
            21. São Bento, que morrestes em pe rezando, rogai por nós!
            22. São Bento, glorioso no Céu, rogai por nós!
            23. São Bento, intercessor dos que buscam estabilidade, rogai por nós!
            24. São Bento, protetor dos estudantes e intelectuais crisatos, rogai por nós!
            25. São Bento, padroeiro dos que enfrentam tentações graves, rogai por nós!
            26. São Bento, que afugentastes o diabo com a Regra de Cristo, rogai por nós!
            27. São Bento, guardiao das famílias e das comunidades, rogai por nós!
            28. São Bento, luz da contemplação em meio ao trabalho, rogai por nós!
            29. São Bento, mestre da vida interior para todos os estados, rogai por nós!
            30. São Bento, nosso padre e patrono potente, rogai por nós!
            
            (Rezar três vezes:)
            São Bento, que nada sobreponhamos ao amor de Cristo — Pax!""";

    private static final String ORACAO_FINAL = """
            O glorioso São Bento, Pai dos monges e Patrono da Europa,
            que com vossa Regra e vosso exemplo ensinastes a humanidade
            a unir oração e trabalho no servico a Deus,
            intercedei por mim que necessito de vossa proteção.
            Pela poderosa Medalha de São Bento, afastai o mal de mim e da minha família.
            E que nada em minha vida seja sobreposto ao amor de Cristo, nosso Senhor. Amém.""";

    private static final String JACULATORIA = "São Bento, que nada sobreponhamos ao amor de Cristo! Pax!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 6, 2);
        LocalDate dataFim = LocalDate.of(data.getYear(), 7, 11);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Bento (02/06 - 11/07).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Bento de Nursia");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
