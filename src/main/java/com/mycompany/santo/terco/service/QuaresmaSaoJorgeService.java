package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de São Jorge
 * Período: 15 de março a 23 de abril (40 dias, encerrando na festa do santo)
 */
@Service
public class QuaresmaSaoJorgeService {

    private static final String ORACAO_PREPARATORIA = """
            O glorioso Sao Jorge, cavaleiro de Cristo e vencedor do dragao do pecado!
            Com fe e confianca, apresento-me diante de vos
            para implorar vossa intercession poderosa.
            Peço-vos que presenteis ao Senhor este meu pedido: (fazer o pedido).
            Assim como vencestes o dragao pela forca da Cruz,
            ajudai-me a vencer os dragoes do vicio, do medo e do pecado. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Jorge, nobre cavalheiro de Cristo, rogai por nos!
            2. Sao Jorge, martir da fe sob Diocleciano, rogai por nos!
            3. Sao Jorge, vencedor do dragon simbolo do mal, rogai por nos!
            4. Sao Jorge, protetor dos fracos e oprimidos, rogai por nos!
            5. Sao Jorge, padrao da Inglaterra e Portugal, rogai por nos!
            6. Sao Jorge, defensor das criancas e das familias, rogai por nos!
            7. Sao Jorge, campeao da verdade contra a mentira, rogai por nos!
            8. Sao Jorge, intercessor nos combates da vida, rogai por nos!
            9. Sao Jorge, fortaleza dos que combatem o bem combate, rogai por nos!
            10. Sao Jorge, terror das potestades das trevas, rogai por nos!
            11. Sao Jorge, gloria dos soldados e policiais, rogai por nos!
            12. Sao Jorge, coragem dos martires e confessores, rogai por nos!
            13. Sao Jorge, esperanca dos cristãos perseguidos, rogai por nos!
            14. Sao Jorge, amigo dos pobres e dos cativos, rogai por nos!
            15. Sao Jorge, modelo de heroismo crista, rogai por nos!
            16. Sao Jorge, intercessor nos julgamentos injustos, rogai por nos!
            17. Sao Jorge, padroeiro do Rio de Janeiro e do Brasil, rogai por nos!
            18. Sao Jorge, escudo em todas as nossas batalhas, rogai por nos!
            19. Sao Jorge, companheio fiel nas provacoes, rogai por nos!
            20. Sao Jorge, glorioso no Ceu eterno, rogai por nos!
            
            (Rezar um Pai-Nosso e uma Ave-Maria pela protecao nas batalhas espirituais.)""";

    private static final String ORACAO_FINAL = """
            Invicto Sao Jorge, que nunca te dobraste ante os perseguidores
            e prefiriste a morte à apostasia,
            obtende-nos a graca da coragem crista.
            Que lutemos o bom combate da fe com a armadura de Deus,
            e que ao terminar nossa carreira, recebamos a coroa da vitoria eterna. Amem.""";

    private static final String JACULATORIA = "Sao Jorge, cavaleiro de Cristo, protegei-nos em todas as batalhas!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 3, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 4, 23);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Jorge (15/03 - 23/04).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Jorge");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
