package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de Nossa Senhora da Assunção
 * Período: 7 de julho a 15 de agosto (40 dias, encerrando na solenidade da Assuncao)
 */
@Service
public class QuaresmaNossaSenhoraAssuncaoService {

    private static final String ORACAO_PREPARATORIA = """
            O Virgem Soberana, assumida em corpo e alma ao Ceu glorioso!
            Vos que sois a primicias da ressurreicao de todos nos,
            apresentamos hoje este pedido confiante:
            (fazer o pedido em silencio).
            Sois a certeza de nossa esperanca: o que Deus fez em vos
            tambem fara em nos no ultimo dia. Rogai por nos. Amem.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora da Assuncao, Rainha assumida ao Ceu, rogai por nos!
            2. Nossa Senhora da Assuncao, acabamento da obra redentora, rogai por nos!
            3. Nossa Senhora da Assuncao, primicias da ressurreicao dos corpos, rogai por nos!
            4. Nossa Senhora da Assuncao, gloria de Israel e da Igreja, rogai por nos!
            5. Nossa Senhora da Assuncao, sinal esperancoso para todos os fieis, rogai por nos!
            6. Nossa Senhora da Assuncao, exaltada acima dos anjos, rogai por nos!
            7. Nossa Senhora da Assuncao, Rainha do Ceu e da terra, rogai por nos!
            8. Nossa Senhora da Assuncao, coroada de estrelas pelo Altissimo, rogai por nos!
            9. Nossa Senhora da Assuncao, ao lado do trono de Deus Trino, rogai por nos!
            10. Nossa Senhora da Assuncao, mediatriz das gracas divinas, rogai por nos!
            11. Nossa Senhora da Assuncao, que intercedeis pelos pecadores, rogai por nos!
            12. Nossa Senhora da Assuncao, mae de misericordia para com todos, rogai por nos!
            13. Nossa Senhora da Assuncao, esperanca de nossa propria glorificacao, rogai por nos!
            14. Nossa Senhora da Assuncao, que abristes as portas do Ceu a Maria, rogai por nos!
            15. Nossa Senhora da Assuncao, alegria da Santissima Trindade, rogai por nos!
            16. Nossa Senhora da Assuncao, padroeira do Brasil e de muitas nacoes, rogai por nos!
            17. Nossa Senhora da Assuncao, que nos ensinais a esperar a vida eterna, rogai por nos!
            18. Nossa Senhora da Assuncao, que levais ao Filho nossas orações, rogai por nos!
            19. Nossa Senhora da Assuncao, estrela de esperanca na morte, rogai por nos!
            20. Nossa Senhora da Assuncao, que nos leveis tambem ao Ceu, rogai por nos!
            
            (Concluir em oracao: "Maria, nossa esperanca de ressurreicao, rogai por nos.")""";

    private static final String ORACAO_FINAL = """
            O Virgem Santissima, assumida gloriosamente ao Ceu,
            sede para nos sinal de esperanca certa.
            Assim como fostes elevada em corpo e alma a gloria eterna,
            assim tambem confessamos que um dia serao glorificados
            os corpos de todos os que em Cristo durmem.
            Ensinai-nos a viver nesta esperanca, a nao temer a morte,
            e a preparar com santos meritos nossa eterna bern-aventuranca. Amem.""";

    private static final String JACULATORIA = "Maria da Assuncao, Rainha do Ceu, rogai pelos que confiam em vos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 7, 7);
        LocalDate dataFim = LocalDate.of(data.getYear(), 8, 15);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de N. Sra. da Assuncao (07/07 - 15/08).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora da Assuncao");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
