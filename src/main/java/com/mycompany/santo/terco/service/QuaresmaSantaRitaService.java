package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSantaRitaService {

    private static final String ORACAO_PREPARATORIA = """
            Gloriosa Santa Rita de Cássia, advogada das causas impossíveis e desesperadas!
            Vos que recebestes do Senhor o poder de interceder pelas causas que a todos desampararam,
            eis-me diante de Vos com uma necessidade que parece impossivel: (fazer o pedido).
            Por vossas dores e feridas, por vossa vida de penitência e amor a Deus,
            interpelosai por mim junto ao Pai Celestial. Amém.""";

    private static final String SUPLICAS = """
            1. Santa Rita, produto do amor e da oração de vossos pais, rogai por nós!
            2. Santa Rita, que desejastes desde a infância ser religiosa, rogai por nós!
            3. Santa Rita, que obedecestes e casastes por amor a Deus, rogai por nós!
            4. Santa Rita, esposa amorosa e paciente com marido dificil, rogai por nós!
            5. Santa Rita, que convertestes o marido pela oração e paciência, rogai por nós!
            6. Santa Rita, viúva que perdoou os assassinos de vosso esposo, rogai por nós!
            7. Santa Rita, que pedistes a Deus para sofrer com Cristo, rogai por nós!
            8. Santa Rita, que recebestes o espinho da coroa de Cristo na fronte, rogai por nós!
            9. Santa Rita, religiosa agostiniana de vida exemplar, rogai por nós!
            10. Santa Rita, mística que vivia da Eucaristia, rogai por nós!
            11. Santa Rita, modelo de penitência e mortificação, rogai por nós!
            12. Santa Rita, padroeira das causas impossíveis e desesperadas, rogai por nós!
            13. Santa Rita, que durante 15 anos suportastes a ferida do espinho, rogai por nós!
            14. Santa Rita, que em vossa agonia pedistes uma rosa do jardim, rogai por nós!
            15. Santa Rita, que a rosa floresceu no inverno para vos consolar, rogai por nós!
            16. Santa Rita, que morrestes em odor de santidade, rogai por nós!
            17. Santa Rita, que vosso corpo ficou incorrupto apos a morte, rogai por nós!
            18. Santa Rita, canonizada em 1900 pelo Papa Leao XIII, rogai por nós!
            19. Santa Rita, exemplo para pais, filhos, esposos e religiosos, rogai por nós!
            20. Santa Rita, intercessora dos casos sem saida, rogai por nós!
            21. Santa Rita, modelo de santidade no lar, rogai por nós!
            22. Santa Rita, que jamais perdestes a paz na tribulação, rogai por nós!
            23. Santa Rita, que da vida retirastes santidade em toda situacao, rogai por nós!
            24. Santa Rita, defensora dos oprimidos e esquecidos, rogai por nós!
            25. Santa Rita, proteção dos casamentos em crise, rogai por nós!
            26. Santa Rita, amparo das viuvas e divorciadas, rogai por nós!
            27. Santa Rita, conforto dos que sofrem rejeicao, rogai por nós!
            28. Santa Rita, esperança de cura para doengas incuraveis, rogai por nós!
            29. Santa Rita, amparo nas horas mais sombrias da vida, rogai por nós!
            30. Santa Rita, nossa mãe e protetora, rogai por nós!
            
            (Repetir três vezes com fé:)
            Santa Rita, advogada das causas impossiveis, rogai por nós!""";

    private static final String ORACAO_FINAL = """
            O gloriosa Santa Rita, padroeira dos impossiveis,
            que conhecestes o sofrimento da vida de casada, da viuvez e da vida religiosa,
            alcancai-nos do Senhor a graça que tanto necessitamos.
            Por vossas chagas e vossa vida de união com Cristo,
            apresentai nossas súplicas ao Pai Misericordioso. Amém.""";

    private static final String JACULATORIA = "Santa Rita, advogada dos casos impossiveis, rogai por nós!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 13);
        LocalDate dataFim = LocalDate.of(data.getYear(), 5, 22);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de Santa Rita (13/04 - 22/05).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santa Rita de Cássia");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
