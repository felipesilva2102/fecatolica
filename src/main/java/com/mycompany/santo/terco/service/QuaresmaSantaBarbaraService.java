package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de Santa Bárbara
 * Período: 26 de outubro a 4 de dezembro (40 dias, encerrando na festa da santa)
 */
@Service
public class QuaresmaSantaBarbaraService {

    private static final String ORACAO_PREPARATORIA = """
            O valorosa Santa Barbara, virgem e martir de Nicomedia!
            Voce que foi trancada numa torre pelo proprio pai
            e preferiu a morte e a apostasia do nome de Cristo,
            apresento a vos com fe este meu pedido:
            (fazer o pedido em silencio).
            Sede para nos intercessora poderosa, e alcancai de Deus
            a graca de permanecermos fieis ate o fim da vida. Amem.""";

    private static final String SUPLICAS = """
            1. Santa Barbara, virgem corajosa de Nicomedia, rogai por nos!
            2. Santa Barbara, que vos convertestes contemplando as obras de Deus, rogai por nos!
            3. Santa Barbara, que pedistes uma janela a mais na torre para honrar a Trindade, rogai por nos!
            4. Santa Barbara, filha fiel a Cristo mesmo contra o pai pagao, rogai por nos!
            5. Santa Barbara, que sofrestes torturas hediondas sem negar a fe, rogai por nos!
            6. Santa Barbara, que fostes decapitada pelas proprias maos de vosso pai, rogai por nos!
            7. Santa Barbara, martir gloriosamente coroada no Ceu, rogai por nos!
            8. Santa Barbara, padroeira dos artilheiros e soldados, rogai por nos!
            9. Santa Barbara, proteccao contra tempestades e raios, rogai por nos!
            10. Santa Barbara, auxílio em hora de morte subita, rogai por nos!
            11. Santa Barbara, intercessora dos mineiros e bombeiros, rogai por nos!
            12. Santa Barbara, proteccao dos que trabalham com explosivos, rogai por nos!
            13. Santa Barbara, socorro nos terremotos e calamidades, rogai por nos!
            14. Santa Barbara, que nos protegeis das armadilhas do inimigo, rogai por nos!
            15. Santa Barbara, padroeira da morte santa e assistida, rogai por nos!
            16. Santa Barbara, exemplo de fidelidade crista em tribulacao, rogai por nos!
            17. Santa Barbara, que veneramos com a torre de tres janelas, rogai por nos!
            18. Santa Barbara, invocada nas tormentas da alma e do corpo, rogai por nos!
            19. Santa Barbara, poderosa intercessora junto ao trono de Cristo, rogai por nos!
            20. Santa Barbara, virgem gloriosa entre as mais, rogai por nos!
            
            (Concluir em oracao: "Santa Barbara, sede nosso amparo nas tempestades.")""";

    private static final String ORACAO_FINAL = """
            O Santa Barbara, voce que foi amada por Deus e odiada pelo mundo,
            rogai por todos os que sofrem perseguicao por causa de sua fe.
            Intercedei especialmente pelos que afrontam a morte subita,
            para que nenhum cristao morra sem os sacramentos.
            Protegei-nos das tempestades do corpo e das tempestades da alma,
            e conduzi-nos com seguranca ao porto da salvacao eterna. Amem.""";

    private static final String JACULATORIA = "Santa Barbara, virgem e martir, protegei-nos das tempestades!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 10, 26);
        LocalDate dataFim = LocalDate.of(data.getYear(), 12, 4);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Santa Barbara (26/10 - 04/12).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santa Barbara");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
