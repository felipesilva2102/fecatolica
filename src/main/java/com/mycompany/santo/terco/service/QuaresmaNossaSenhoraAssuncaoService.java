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
            O Virgem Soberana, assumida em corpo e alma ao Céu glorioso!
            Vos que sois a primicias da ressurreição de todos nos,
            apresentamos hoje este pedido confiante:
            (fazer o pedido em silêncio).
            Sois a certeza de nossa esperança: o que Deus fez em vos
            também fará em nós no último dia. Rogai por nós. Amém.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora da Assunção, Rainha assumida ao Céu, rogai por nós!
            2. Nossa Senhora da Assunção, acabamento da obra redentora, rogai por nós!
            3. Nossa Senhora da Assunção, primicias da ressurreição dos corpos, rogai por nós!
            4. Nossa Senhora da Assunção, glória de Israel e da Igreja, rogai por nós!
            5. Nossa Senhora da Assunção, sinal esperancoso para todos os fiéis, rogai por nós!
            6. Nossa Senhora da Assunção, exaltada acima dos anjos, rogai por nós!
            7. Nossa Senhora da Assunção, Rainha do Céu e da terra, rogai por nós!
            8. Nossa Senhora da Assunção, coroada de estrelas pelo Altissimo, rogai por nós!
            9. Nossa Senhora da Assunção, ao lado do trono de Deus Trino, rogai por nós!
            10. Nossa Senhora da Assunção, mediatriz das graças divinas, rogai por nós!
            11. Nossa Senhora da Assunção, que intercedeis pelos pecadores, rogai por nós!
            12. Nossa Senhora da Assunção, mãe de misericórdia para com todos, rogai por nós!
            13. Nossa Senhora da Assunção, esperança de nossa propria glorificacao, rogai por nós!
            14. Nossa Senhora da Assunção, que abristes as portas do Céu a Maria, rogai por nós!
            15. Nossa Senhora da Assunção, alegria da Santíssima Trindade, rogai por nós!
            16. Nossa Senhora da Assunção, padroeira do Brasil e de muitas nacoes, rogai por nós!
            17. Nossa Senhora da Assunção, que nos ensinais a esperar a vida eterna, rogai por nós!
            18. Nossa Senhora da Assunção, que levais ao Filho nossas orações, rogai por nós!
            19. Nossa Senhora da Assunção, estrela de esperança na morte, rogai por nós!
            20. Nossa Senhora da Assunção, que nos leveis tambem ao Céu, rogai por nós!
            
            (Concluir em oração: "Maria, nossa esperança de ressurreição, rogai por nós.")""";

    private static final String ORACAO_FINAL = """
            Ó Virgem Santíssima, assumida gloriosamente ao Céu,
            sede para nós sinal de esperança certa.
            Assim como fostes elevada em corpo e alma a glória eterna,
            assim tambem confessamos que um dia serao glorificados
            os corpos de todos os que em Cristo durmem.
            Ensinai-nos a viver nesta esperança, a não temer a morte,
            e a preparar com santos meritos nossa eterna bern-aventuranca. Amém.""";

    private static final String JACULATORIA = "Maria da Assunção, Rainha do Céu, rogai pelos que confiam em vos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 7, 7);
        LocalDate dataFim = LocalDate.of(data.getYear(), 8, 15);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de N. Sra. da Assunção (07/07 - 15/08).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora da Assunção");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
