package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSaoJoseService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso São José, esposo purissimo de Maria e pai adotivo de Jesus!
            Venho com confiança suplicar a vossa intercessão.
            Coloco em vossas mãos esta graça que tanto necessito: (fazer o pedido).
            Amparai-me, o pai bondoso, e alcancai-me do Senhor tudo o que for para a salvação da minha alma. Amém.""";

    private static final String SUPLICAS = """
            1. São José, espelho de paciência, rogai por nós!
            2. São José, amante da pobreza, rogai por nós!
            3. São José, modelo dos trabalhadores, rogai por nós!
            4. São José, honra da vida de família, rogai por nós!
            5. São José, guarda das virgens, rogai por nós!
            6. São José, sustentaculo das famílias, rogai por nós!
            7. São José, consolo dos infelizes, rogai por nós!
            8. São José, esperança dos doentes, rogai por nós!
            9. São José, padroeiro dos moribundos, rogai por nós!
            10. São José, terror dos demonios, rogai por nós!
            11. São José, defensor da Santa Igreja, rogai por nós!
            12. São José, chefe da Sagrada Família, rogai por nós!
            13. São José, luz dos patriarcas, rogai por nós!
            14. São José, esposo da Mãe de Deus, rogai por nós!
            15. São José, protetor dos castos, rogai por nós!
            16. São José, modelo de obediencia, rogai por nós!
            17. São José, exemplo de humildade, rogai por nós!
            18. São José, justo entre os homens, rogai por nós!
            19. São José, forte nas provacoes, rogai por nós!
            20. São José, prudente nas decisoes, rogai por nós!
            21. São José, fidelissimo servo de Deus, rogai por nós!
            22. São José, guardiao do Redentor, rogai por nós!
            23. São José, pai adotivo de Jesus, rogai por nós!
            24. São José, patrono dos consagrados, rogai por nós!
            25. São José, amigo dos anjos, rogai por nós!
            26. São José, intercessor poderoso, rogai por nós!
            27. São José, nosso advogado, rogai por nós!
            28. São José, refúgio das almas aflitas, rogai por nós!
            29. São José, guia seguro no caminho, rogai por nós!
            30. São José, nosso pai e protetor, rogai por nós!
            
            (Apos terminar as 30, repetir com firmeza três vezes:)
            São José, providenciai! São José, providenciai! São José, providenciai!""";

    private static final String ORACAO_FINAL = """
            O glorioso São José, pai e protetor dos que vos invocam com confiança,
            não desprezeis minhas súplicas e alcancai-me a graça que tanto desejo (repetir o pedido).
            Prometo propagar a vossa devoção e confiar sempre em vossa intercessão.
            Amém.""";

    private static final String JACULATORIA = "São José, meu pai e senhor, guardai minha alma e minha vida!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 2, 19);
        LocalDate dataFim = LocalDate.of(data.getYear(), 3, 19);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São José (19/02 - 19/03).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São José");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
