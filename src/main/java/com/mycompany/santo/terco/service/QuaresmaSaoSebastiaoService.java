package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de São Sebastião
 * Período: 12 de dezembro a 20 de janeiro (40 dias, encerrando na festa do santo)
 */
@Service
public class QuaresmaSaoSebastiaoService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso mártir São Sebastião, soldado de Cristo que com coragem
            confessastes a fé diante do imperador Diocleciano,
            prostrado diante de vós, peço a vossa poderosa intercessão.
            Apresento-vos esta graça que tanto necessito: (fazer o pedido em silêncio).
            São Sebastião, que sobrevivestes às flechas pela força de Deus,
            alcançai-me a perseverança na fé e a fortaleza nas provas. Amém.""";

    private static final String SUPLICAS = """
            1. São Sebastião, soldado intrépido da fé, rogai por nós!
            2. São Sebastião, oficial romano de Cristo, rogai por nós!
            3. São Sebastião, mártir perfurado pelas flechas, rogai por nós!
            4. São Sebastião, que sobreviveu às torturas, rogai por nós!
            5. São Sebastião, curado pela mártir Santa Irene, rogai por nós!
            6. São Sebastião, que voltou a denunciar o perseguidor, rogai por nós!
            7. São Sebastião, espelho de coragem cristã, rogai por nós!
            8. São Sebastião, padroeiro dos atletas, rogai por nós!
            9. São Sebastião, intercessor nas epidemias e pestes, rogai por nós!
            10. São Sebastião, protetor da cidade do Rio de Janeiro, rogai por nós!
            11. São Sebastião, terror dos perseguidores da Igreja, rogai por nós!
            12. São Sebastião, modelo de fidelidade a Cristo, rogai por nós!
            13. São Sebastião, amigo dos soldados e policiais, rogai por nós!
            14. São Sebastião, padrão dos que lutam pelo bem, rogai por nós!
            15. São Sebastião, que morreste pela segunda vez de mártir, rogai por nós!
            16. São Sebastião, esperança dos que sofrem perseguição, rogai por nós!
            17. São Sebastião, protegei-nos nas crises de saúde, rogai por nós!
            18. São Sebastião, intercessor poderoso junto a Deus, rogai por nós!
            19. São Sebastião, glorioso no Céu, rogai por nós!
            20. São Sebastião, nosso padroeiro e proteção, rogai por nós!
            
            (Rezar um Pai-Nosso, uma Ave-Maria e uma Glória ao terminar.)""";

    private static final String ORACAO_FINAL = """
            Ó invicto São Sebastião, que nem as flechas dos perseguidores
            conseguiram dobrar a vossa fé, intercedei por nós nesta Quaresma.
            Que, como vós preferistes a morte às honras pagãs,
            nós também prefiramos a verdade de Cristo a qualquer comodidade mundana.
            Alcançai-nos a graça de sermos fiéis até o fim. Amém.""";

    private static final String JACULATORIA = "São Sebastião, mártir glorioso e protetor dos fiéis, rogai por nós!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 12, 12);
        LocalDate dataFim = LocalDate.of(data.getYear() + 1, 1, 20);

        // Ajuste para datas em janeiro (usa dataInicio do ano anterior)
        if (data.getMonthValue() == 1 && data.getDayOfMonth() <= 20) {
            dataInicio = LocalDate.of(data.getYear() - 1, 12, 12);
            dataFim = LocalDate.of(data.getYear(), 1, 20);
        }

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Sebastião (12/12 - 20/01).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Sebastião");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
