package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSantaRitaService {

    private static final String ORACAO_PREPARATORIA = """
            Gloriosa Santa Rita de Cassia, advogada das causas impossiveis e desesperadas!
            Vos que recebestes do Senhor o poder de interceder pelas causas que a todos desampararam,
            eis-me diante de Vos com uma necessidade que parece impossivel: (fazer o pedido).
            Por vossas dores e feridas, por vossa vida de penitencia e amor a Deus,
            interpelosai por mim junto ao Pai Celestial. Amem.""";

    private static final String SUPLICAS = """
            1. Santa Rita, produto do amor e da oracao de vossos pais, rogai por nos!
            2. Santa Rita, que desejastes desde a infancia ser religiosa, rogai por nos!
            3. Santa Rita, que obedecestes e casastes por amor a Deus, rogai por nos!
            4. Santa Rita, esposa amorosa e paciente com marido dificil, rogai por nos!
            5. Santa Rita, que conversestes o marido pela oracno e paciencia, rogai por nos!
            6. Santa Rita, viuva que perdoou os assassinos de vosso esposo, rogai por nos!
            7. Santa Rita, que pedistes a Deus para sofrer com Cristo, rogai por nos!
            8. Santa Rita, que recebestes o espinho da coroa de Cristo na fronte, rogai por nos!
            9. Santa Rita, religiosa agostiniana de vida exemplar, rogai por nos!
            10. Santa Rita, mistica que vivia da Eucaristia, rogai por nos!
            11. Santa Rita, modelo de penitencia e mortificacao, rogai por nos!
            12. Santa Rita, padroeira das causas impossiveis e desesperadas, rogai por nos!
            13. Santa Rita, que durante 15 anos suportastes a ferida do espinho, rogai por nos!
            14. Santa Rita, que em vossa agonia pediates uma rosa do jardim, rogai por nos!
            15. Santa Rita, que a rosa floresceu no inverno para vos consolar, rogai por nos!
            16. Santa Rita, que morrestes em odor de santidade, rogai por nos!
            17. Santa Rita, que vosso corpo ficou incorrupto apos a morte, rogai por nos!
            18. Santa Rita, canonizada em 1900 pelo Papa Leao XIII, rogai por nos!
            19. Santa Rita, exemplo para pais, filhos, esposos e religiosos, rogai por nos!
            20. Santa Rita, intercessora dos casos sem saida, rogai por nos!
            21. Santa Rita, modelo de santidade no lar, rogai por nos!
            22. Santa Rita, que jamais perdestes a paz na tribulacao, rogai por nos!
            23. Santa Rita, que da vida retirastes santidade em toda situacao, rogai por nos!
            24. Santa Rita, defensora dos oprimidos e esquecidos, rogai por nos!
            25. Santa Rita, protecao dos casamentos em crise, rogai por nos!
            26. Santa Rita, amparo das viuvas e divorciadas, rogai por nos!
            27. Santa Rita, conforto dos que sofrem rejeicao, rogai por nos!
            28. Santa Rita, esperanca de cura para doengas incuraveis, rogai por nos!
            29. Santa Rita, amparo nas horas mais sombrias da vida, rogai por nos!
            30. Santa Rita, nossa mae e protetora, rogai por nos!
            
            (Repetir tres vezes com fé:)
            Santa Rita, advogada das causas impossiveis, rogai por nos!""";

    private static final String ORACAO_FINAL = """
            O gloriosa Santa Rita, padroeira dos impossiveis,
            que conhecestes o sofrimento da vida de casada, da viuvez e da vida religiosa,
            alcancai-nos do Senhor a graca que tanto necessitamos.
            Por vossas chagas e vossa vida de uniao com Cristo,
            apresentai nossas suplicas ao Pai Misericordioso. Amem.""";

    private static final String JACULATORIA = "Santa Rita, advogada dos casos impossiveis, rogai por nos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 13);
        LocalDate dataFim = LocalDate.of(data.getYear(), 5, 22);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Santa Rita (13/04 - 22/05).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santa Rita de Cassia");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
