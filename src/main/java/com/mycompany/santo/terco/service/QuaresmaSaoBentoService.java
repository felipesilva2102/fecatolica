package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSaoBentoService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso Sao Bento de Nursia, Pai do Monaquismo Ocidental e Patrono da Europa!
            Vos que fundaste o mosteiro de Monte Cassino e deixastes a Regra que formou
            muitos santos e civilizacoes inteiras a luz do Evangelho,
            intercedeis por esta quaresma e pelo pedido que vos apresento: (fazer o pedido).
            Pela Santa Medlha de Sao Bento, afastai o mal e conduzi-me ao bem.
            Pax! Nao haja nada sobreposto ao amor de Cristo. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Bento, Pai do Monaquismo Ocidental, rogai por nos!
            2. Sao Bento, Patriarca dos Monges do Ocidente, rogai por nos!
            3. Sao Bento, que abandonastes o mundo para buscar Deus, rogai por nos!
            4. Sao Bento, eremita de Subiaco, rogai por nos!
            5. Sao Bento, fundador de Monte Cassino, rogai por nos!
            6. Sao Bento, autor da Santa Regra Beneditina, rogai por nos!
            7. Sao Bento, que ensinas: Ora et Labora, rogai por nos!
            8. Sao Bento, que nada sobreponhas ao amor de Cristo, rogai por nos!
            9. Sao Bento, que rezastes sete vezes ao dia o Oficio Divino, rogai por nos!
            10. Sao Bento, modelo de hospitalidade crista, rogai por nos!
            11. Sao Bento, pai espiritual de inumeros monges santos, rogai por nos!
            12. Sao Bento, que sobrevivestes ao veneno pela graca de Deus, rogai por nos!
            13. Sao Bento, portador da Santa Medalha de poder sobre o mal, rogai por nos!
            14. Sao Bento, exorcista poderoso pelo nome de Jesus, rogai por nos!
            15. Sao Bento, patrono da Europa e da civilizacao ocidental, rogai por nos!
            16. Sao Bento, modelo de equilibrio entre oracao e trabalho, rogai por nos!
            17. Sao Bento, que curaste doentes pela intercessao de Cristo, rogai por nos!
            18. Sao Bento, protecao contra envenenamentos e feiticarías, rogai por nos!
            19. Sao Bento, guardiao da vida interior e contemplativa, rogai por nos!
            20. Sao Bento, modelo de perseveranca na vida espiritual, rogai por nos!
            21. Sao Bento, que morrestes em pe rezando, rogai por nos!
            22. Sao Bento, glorioso no Ceu, rogai por nos!
            23. Sao Bento, intercessor dos que buscam estabilidade, rogai por nos!
            24. Sao Bento, protetor dos estudantes e intelectuais crisatos, rogai por nos!
            25. Sao Bento, padroeiro dos que enfrentam tentacoes graves, rogai por nos!
            26. Sao Bento, que afugentastes o diabo com a Regra de Cristo, rogai por nos!
            27. Sao Bento, guardiao das familias e das comunidades, rogai por nos!
            28. Sao Bento, luz da contemplacao em meio ao trabalho, rogai por nos!
            29. Sao Bento, mestre da vida interior para todos os estados, rogai por nos!
            30. Sao Bento, nosso padre e patrono potente, rogai por nos!
            
            (Rezar tres vezes:)
            Sao Bento, que nada sobreponhamos ao amor de Cristo — Pax!""";

    private static final String ORACAO_FINAL = """
            O glorioso Sao Bento, Pai dos monges e Patrono da Europa,
            que com vossa Regra e vosso exemplo ensinastes a humanidade
            a unir oracao e trabalho no servico a Deus,
            intercedei por mim que necessito de vossa protecao.
            Pela poderosa Medalha de Sao Bento, afastai o mal de mim e da minha familia.
            E que nada em minha vida seja sobreposto ao amor de Cristo, nosso Senhor. Amem.""";

    private static final String JACULATORIA = "Sao Bento, que nada sobreponhamos ao amor de Cristo! Pax!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 6, 2);
        LocalDate dataFim = LocalDate.of(data.getYear(), 7, 11);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Bento (02/06 - 11/07).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Bento de Nursia");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
