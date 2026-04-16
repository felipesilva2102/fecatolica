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
            O glorioso São João Batista, voz que clamou no deserto
            e apontou o Cordeiro de Deus ao mundo!
            Em espírito de penitência e conversão, apresento a vós este meu pedido:
            (fazer o pedido em silêncio).
            Que como vós, também eu aprenda a diminuir para que Cristo cresça.
            Intercedei por mim diante do Pai Eterno. Amém.""";

    private static final String SUPLICAS = """
            1. São João Batista, Precursor do Messias, rogai por nós!
            2. São João Batista, que saltastes de alegria no utero de Isabel, rogai por nós!
            3. São João Batista, santificado antes de nascer, rogai por nós!
            4. São João Batista, voz que clama no deserto, rogai por nós!
            5. São João Batista, profeta do Altissimo, rogai por nós!
            6. São João Batista, filho de Isabel e Zacarias, rogai por nós!
            7. São João Batista, primo virginal de Jesus, rogai por nós!
            8. São João Batista, batizador de Cristo no Jordao, rogai por nós!
            9. São João Batista, que apontastes o Cordeiro de Deus, rogai por nós!
            10. São João Batista, penitente do deserto, rogai por nós!
            11. São João Batista, mestre da conversão, rogai por nós!
            12. São João Batista, defensor da lei de Deus, rogai por nós!
            13. São João Batista, maior entre os nascidos de mulher, rogai por nós!
            14. São João Batista, modelo de humildade eucaristica, rogai por nós!
            15. São João Batista, mártir por amor a verdade, rogai por nós!
            16. São João Batista, decapitado por Herodes Antipas, rogai por nós!
            17. São João Batista, padroeiro dos batizados, rogai por nós!
            18. São João Batista, inspirador dos eremitas e monges, rogai por nós!
            19. São João Batista, amigo do Espouso Celestial, rogai por nós!
            20. São João Batista, glorioso no Céu eterno, rogai por nós!
            
            (Concluir em oração: "Senhor, que eu diminua para que Cristo cresca.")""";

    private static final String ORACAO_FINAL = """
            Santo João Batista, que com tanta humildade disseste "Não sou eu o Cristo,
            mas fui enviado diante d'Ele", ensinai-nos essa mesma humildade.
            Que em nossa vida, Cristo seja sempre o centro e nos apenas os servos.
            Que aprendamos a apontar Jesus ao mundo por nossas palavras e accoes.
            Intercede por nós junto ao Cordeiro de Deus que tu mesmo proclamaste. Amém.""";

    private static final String JACULATORIA = "São João Batista, voz do deserto, preparai nosso coração para Christ!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 5, 16);
        LocalDate dataFim = LocalDate.of(data.getYear(), 6, 24);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São João Batista (16/05 - 24/06).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São João Batista");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
