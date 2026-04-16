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
            Ó valorosa Santa Bárbara, virgem e mártir de Nicomédia!
            Você que foi trancada numa torre pelo próprio pai
            e preferiu a morte à apostasia do nome de Cristo,
            apresento a vós com fé este meu pedido:
            (fazer o pedido em silêncio).
            Sede para nós intercessora poderosa, e alcançai de Deus
            a graça de permanecermos fiéis até o fim da vida. Amém.""";

    private static final String SUPLICAS = """
            1. Santa Bárbara, virgem corajosa de Nicomédia, rogai por nós!
            2. Santa Bárbara, que vos convertestes contemplando as obras de Deus, rogai por nós!
            3. Santa Bárbara, que pedistes uma janela a mais na torre para honrar a Trindade, rogai por nós!
            4. Santa Bárbara, filha fiel a Cristo mesmo contra o pai pagão, rogai por nós!
            5. Santa Bárbara, que sofrestes torturas hediondas sem negar a fé, rogai por nós!
            6. Santa Bárbara, que fostes decapitada pelas próprias mãos de vosso pai, rogai por nós!
            7. Santa Bárbara, mártir gloriosamente coroada no Céu, rogai por nós!
            8. Santa Bárbara, padroeira dos artilheiros e soldados, rogai por nós!
            9. Santa Bárbara, proteção contra tempestades e raios, rogai por nós!
            10. Santa Bárbara, auxílio em hora de morte súbita, rogai por nós!
            11. Santa Bárbara, intercessora dos mineiros e bombeiros, rogai por nós!
            12. Santa Bárbara, proteção dos que trabalham com explosivos, rogai por nós!
            13. Santa Bárbara, socorro nos terremotos e calamidades, rogai por nós!
            14. Santa Bárbara, que nos protegeis das armadilhas do inimigo, rogai por nós!
            15. Santa Bárbara, padroeira da morte santa e assistida, rogai por nós!
            16. Santa Bárbara, exemplo de fidelidade cristã em tribulação, rogai por nós!
            17. Santa Bárbara, que veneramos com a torre de três janelas, rogai por nós!
            18. Santa Bárbara, invocada nas tormentas da alma e do corpo, rogai por nós!
            19. Santa Bárbara, poderosa intercessora junto ao trono de Cristo, rogai por nós!
            20. Santa Bárbara, virgem gloriosa entre as mais, rogai por nós!
            
            (Concluir em oração: "Santa Bárbara, sede nosso amparo nas tempestades.")""";

    private static final String ORACAO_FINAL = """
            Ó Santa Bárbara, você que foi amada por Deus e odiada pelo mundo,
            rogai por todos os que sofrem perseguição por causa de sua fé.
            Intercedei especialmente pelos que afrontam a morte súbita,
            para que nenhum cristão morra sem os sacramentos.
            Protegei-nos das tempestades do corpo e das tempestades da alma,
            e conduzi-nos com segurança ao porto da salvação eterna. Amém.""";

    private static final String JACULATORIA = "Santa Bárbara, virgem e mártir, protegei-nos das tempestades!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 10, 26);
        LocalDate dataFim = LocalDate.of(data.getYear(), 12, 4);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de Santa Bárbara (26/10 - 04/12).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santa Bárbara");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
