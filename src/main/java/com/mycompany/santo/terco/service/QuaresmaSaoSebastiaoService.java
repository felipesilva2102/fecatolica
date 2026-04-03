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
            Glorioso martir Sao Sebastiao, soldado de Cristo que com coragem
            confessastes a fe diante do imperador Diocleciano,
            prostrado diante de vos, peco a vossa poderosa intercessao.
            Apresento-vos esta graca que tanto necessito: (fazer o pedido em silencio).
            Sao Sebastiao, que sobrevivestes as flechas pela forca de Deus,
            alcancai-me a perseveranca na fe e a fortaleza nas provas. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Sebastiao, soldado intrépido da fe, rogai por nos!
            2. Sao Sebastiao, oficial romano de Cristo, rogai por nos!
            3. Sao Sebastiao, martir perfurado pelas flechas, rogai por nos!
            4. Sao Sebastiao, que sobreviveu as torturas, rogai por nos!
            5. Sao Sebastiao, curado pela martir Santa Irene, rogai por nos!
            6. Sao Sebastiao, que voltou a denunciar o perseguidor, rogai por nos!
            7. Sao Sebastiao, espelho de coragem crista, rogai por nos!
            8. Sao Sebastiao, padroeiro dos atletas, rogai por nos!
            9. Sao Sebastiao, intercessor nas epidemias e pestes, rogai por nos!
            10. Sao Sebastiao, protetor da cidade do Rio de Janeiro, rogai por nos!
            11. Sao Sebastiao, terror dos perseguidores da Igreja, rogai por nos!
            12. Sao Sebastiao, modelo de fidelidade a Cristo, rogai por nos!
            13. Sao Sebastiao, amigo dos soldados e policiais, rogai por nos!
            14. Sao Sebastiao, padrao dos que lutam pelo bem, rogai por nos!
            15. Sao Sebastiao, que morreste pela segunda vez de martir, rogai por nos!
            16. Sao Sebastiao, esperanca dos que sofrem perseguicao, rogai por nos!
            17. Sao Sebastiao, proteka-nos nas crises de saude, rogai por nos!
            18. Sao Sebastiao, intercessor poderoso junto a Deus, rogai por nos!
            19. Sao Sebastiao, glorioso no Ceu, rogai por nos!
            20. Sao Sebastiao, nosso padroeiro e protecao, rogai por nos!
            
            (Rezar um Pai-Nosso, uma Ave-Maria e uma Gloria ao terminar.)""";

    private static final String ORACAO_FINAL = """
            O invicto Sao Sebastiao, que nem as flechas dos perseguidores
            conseguiram dobrar a vossa fe, intercedei por nos nesta Quaresma.
            Que como voces preferistes a morte às honras pagas,
            nos tambem prefiramos a verdade de Cristo a qualquer comodidade mundana.
            Alcancai-nos a graca de sermos fieis ate o fim. Amem.""";

    private static final String JACULATORIA = "Sao Sebastiao, martir glorioso e protetor dos fieis, rogai por nos!";

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
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Sebastiao (12/12 - 20/01).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Sebastiao");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
