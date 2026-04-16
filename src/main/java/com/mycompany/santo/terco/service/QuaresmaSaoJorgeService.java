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
            O glorioso São Jorge, cavaleiro de Cristo e vencedor do dragao do pecado!
            Com fé e confiança, apresento-me diante de vos
            para implorar vossa intercession poderosa.
            Peço-vos que presenteis ao Senhor este meu pedido: (fazer o pedido).
            Assim como vencestes o dragao pela força da Cruz,
            ajudai-me a vencer os dragoes do vicio, do medo e do pecado. Amém.""";

    private static final String SUPLICAS = """
            1. São Jorge, nobre cavalheiro de Cristo, rogai por nós!
            2. São Jorge, mártir da fé sob Diocleciano, rogai por nós!
            3. São Jorge, vencedor do dragon simbolo do mal, rogai por nós!
            4. São Jorge, protetor dos fracos e oprimidos, rogai por nós!
            5. São Jorge, padrao da Inglaterra e Portugal, rogai por nós!
            6. São Jorge, defensor das criancas e das famílias, rogai por nós!
            7. São Jorge, campeao da verdade contra a mentira, rogai por nós!
            8. São Jorge, intercessor nos combates da vida, rogai por nós!
            9. São Jorge, fortaleza dos que combatem o bem combate, rogai por nós!
            10. São Jorge, terror das potestades das trevas, rogai por nós!
            11. São Jorge, glória dos soldados e policiais, rogai por nós!
            12. São Jorge, coragem dos martires e confessores, rogai por nós!
            13. São Jorge, esperança dos cristãos perseguidos, rogai por nós!
            14. São Jorge, amigo dos pobres e dos cativos, rogai por nós!
            15. São Jorge, modelo de heroismo crista, rogai por nós!
            16. São Jorge, intercessor nos julgamentos injustos, rogai por nós!
            17. São Jorge, padroeiro do Rio de Janeiro e do Brasil, rogai por nós!
            18. São Jorge, escudo em todas as nossas batalhas, rogai por nós!
            19. São Jorge, companheio fiel nas provacoes, rogai por nós!
            20. São Jorge, glorioso no Céu eterno, rogai por nós!
            
            (Rezar um Pai-Nosso e uma Ave-Maria pela proteção nas batalhas espirituais.)""";

    private static final String ORACAO_FINAL = """
            Invicto São Jorge, que nunca te dobraste ante os perseguidores
            e prefiriste a morte à apostasia,
            obtende-nos a graça da coragem crista.
            Que lutemos o bom combate da fé com a armadura de Deus,
            e que ao terminar nossa carreira, recebamos a coroa da vitória eterna. Amém.""";

    private static final String JACULATORIA = "São Jorge, cavaleiro de Cristo, protegei-nos em todas as batalhas!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 3, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 4, 23);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Jorge (15/03 - 23/04).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Jorge");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
