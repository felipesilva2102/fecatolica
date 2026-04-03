package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de São João Batista
 * Período: 16 de maio a 24 de junho (40 dias, encerrando na festa do Natividade do Batista)
 */
@Service
public class QuaresmaSaoJoaoBatistaService {

    private static final String ORACAO_PREPARATORIA = """
            O glorioso Sao Joao Batista, voz que clamou no deserto
            e apontou o Cordeiro de Deus ao mundo!
            Em espírito de penitencia e conversao, apresento a vos este meu pedido:
            (fazer o pedido em silencio).
            Que como voces, tambem eu aprenda a diminuir para que Cristo cresca.
            Intercedei por mim diante do Pai Eterno. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Joao Batista, Precursor do Messias, rogai por nos!
            2. Sao Joao Batista, que saltastes de alegria no utero de Isabel, rogai por nos!
            3. Sao Joao Batista, santificado antes de nascer, rogai por nos!
            4. Sao Joao Batista, voz que clama no deserto, rogai por nos!
            5. Sao Joao Batista, profeta do Altissimo, rogai por nos!
            6. Sao Joao Batista, filho de Isabel e Zacarias, rogai por nos!
            7. Sao Joao Batista, primo virginal de Jesus, rogai por nos!
            8. Sao Joao Batista, batizador de Cristo no Jordao, rogai por nos!
            9. Sao Joao Batista, que apontastes o Cordeiro de Deus, rogai por nos!
            10. Sao Joao Batista, penitente do deserto, rogai por nos!
            11. Sao Joao Batista, mestre da conversao, rogai por nos!
            12. Sao Joao Batista, defensor da lei de Deus, rogai por nos!
            13. Sao Joao Batista, maior entre os nascidos de mulher, rogai por nos!
            14. Sao Joao Batista, modelo de humildade eucaristica, rogai por nos!
            15. Sao Joao Batista, martir por amor a verdade, rogai por nos!
            16. Sao Joao Batista, decapitado por Herodes Antipas, rogai por nos!
            17. Sao Joao Batista, padroeiro dos batizados, rogai por nos!
            18. Sao Joao Batista, inspirador dos eremitas e monges, rogai por nos!
            19. Sao Joao Batista, amigo do Espouso Celestial, rogai por nos!
            20. Sao Joao Batista, glorioso no Ceu eterno, rogai por nos!
            
            (Concluir em oracao: "Senhor, que eu diminua para que Cristo cresca.")""";

    private static final String ORACAO_FINAL = """
            Santo Joao Batista, que com tanta humildade disseste "Nao sou eu o Cristo,
            mas fui enviado diante d'Ele", ensinai-nos essa mesma humildade.
            Que em nossa vida, Cristo seja sempre o centro e nos apenas os servos.
            Que aprendamos a apontar Jesus ao mundo por nossas palavras e accoes.
            Intercede por nos junto ao Cordeiro de Deus que tu mesmo proclamaste. Amem.""";

    private static final String JACULATORIA = "Sao Joao Batista, voz do deserto, preparai nosso coracao para Christ!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 5, 16);
        LocalDate dataFim = LocalDate.of(data.getYear(), 6, 24);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Joao Batista (16/05 - 24/06).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Joao Batista");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
