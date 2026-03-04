package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSaoJoseService {

    private static final String ORACAO_PREPARATORIA = """
            Glorioso Sao Jose, esposo purissimo de Maria e pai adotivo de Jesus!
            Venho com confianca suplicar a vossa intercessao.
            Coloco em vossas maos esta graca que tanto necessito: (fazer o pedido).
            Amparai-me, o pai bondoso, e alcancai-me do Senhor tudo o que for para a salvacao da minha alma. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Jose, espelho de paciencia, rogai por nos!
            2. Sao Jose, amante da pobreza, rogai por nos!
            3. Sao Jose, modelo dos trabalhadores, rogai por nos!
            4. Sao Jose, honra da vida de familia, rogai por nos!
            5. Sao Jose, guarda das virgens, rogai por nos!
            6. Sao Jose, sustentaculo das familias, rogai por nos!
            7. Sao Jose, consolo dos infelizes, rogai por nos!
            8. Sao Jose, esperanca dos doentes, rogai por nos!
            9. Sao Jose, padroeiro dos moribundos, rogai por nos!
            10. Sao Jose, terror dos demonios, rogai por nos!
            11. Sao Jose, defensor da Santa Igreja, rogai por nos!
            12. Sao Jose, chefe da Sagrada Familia, rogai por nos!
            13. Sao Jose, luz dos patriarcas, rogai por nos!
            14. Sao Jose, esposo da Mae de Deus, rogai por nos!
            15. Sao Jose, protetor dos castos, rogai por nos!
            16. Sao Jose, modelo de obediencia, rogai por nos!
            17. Sao Jose, exemplo de humildade, rogai por nos!
            18. Sao Jose, justo entre os homens, rogai por nos!
            19. Sao Jose, forte nas provacoes, rogai por nos!
            20. Sao Jose, prudente nas decisoes, rogai por nos!
            21. Sao Jose, fidelissimo servo de Deus, rogai por nos!
            22. Sao Jose, guardiao do Redentor, rogai por nos!
            23. Sao Jose, pai adotivo de Jesus, rogai por nos!
            24. Sao Jose, patrono dos consagrados, rogai por nos!
            25. Sao Jose, amigo dos anjos, rogai por nos!
            26. Sao Jose, intercessor poderoso, rogai por nos!
            27. Sao Jose, nosso advogado, rogai por nos!
            28. Sao Jose, refugio das almas aflitas, rogai por nos!
            29. Sao Jose, guia seguro no caminho, rogai por nos!
            30. Sao Jose, nosso pai e protetor, rogai por nos!
            
            (Apos terminar as 30, repetir com firmeza tres vezes:)
            Sao Jose, providenciai! Sao Jose, providenciai! Sao Jose, providenciai!""";

    private static final String ORACAO_FINAL = """
            O glorioso Sao Jose, pai e protetor dos que vos invocam com confianca,
            nao desprezeis minhas suplicas e alcancai-me a graca que tanto desejo (repetir o pedido).
            Prometo propagar a vossa devocao e confiar sempre em vossa intercessao.
            Amem.""";

    private static final String JACULATORIA = "Sao Jose, meu pai e senhor, guardai minha alma e minha vida!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 2, 19);
        LocalDate dataFim = LocalDate.of(data.getYear(), 3, 19);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Jose (19/02 - 19/03).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Jose");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
