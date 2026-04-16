package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSagradoCoracaoService {

    private static final String ORACAO_PREPARATORIA = """
            O Coração Santíssimo de Jesus, fonte de toda consolação e misericórdia,
            eis-me prostrado diante de Vos para oferecer-Vos o meu coração.
            Nesta Quaresma do Sagrado Coração, desejo reparar as ofensas que os homens Vos fizeram
            e confiando em vosso amor infinito, venho pedir-Vos: (fazer o pedido).
            Jesus, mansinho e humilde de coração, fazei o meu coração semelhante ao Vosso. Amém.""";

    private static final String SUPLICAS = """
            1. Coração de Jesus, filho do Pai Eterno, tende misericórdia de nós!
            2. Coração de Jesus, formado pelo Espírito Santo no seio da Virgem Mãe, tende misericórdia de nós!
            3. Coração de Jesus, unido substancialmente ao Verbo de Deus, tende misericórdia de nós!
            4. Coração de Jesus, de infinita majestade, tende misericórdia de nós!
            5. Coração de Jesus, templo santo de Deus, tende misericórdia de nós!
            6. Coração de Jesus, tabernaculo do Altissimo, tende misericórdia de nós!
            7. Coração de Jesus, casa de Deus e porta do Céu, tende misericórdia de nós!
            8. Coração de Jesus, ardente fornalha de caridade, tende misericórdia de nós!
            9. Coração de Jesus, abismo de justiça e de amor, tende misericórdia de nós!
            10. Coração de Jesus, cheio de bondade e de amor, tende misericórdia de nós!
            11. Coração de Jesus, abismo de toda a virtude, tende misericórdia de nós!
            12. Coração de Jesus, digno de todo o louvor, tende misericórdia de nós!
            13. Coração de Jesus, rei e centro de todos os corações, tende misericórdia de nós!
            14. Coração de Jesus, em que estao todos os tesouros da sabedoria e da ciencia, tende misericórdia de nós!
            15. Coração de Jesus, em que reside toda a plenitude da divindade, tende misericórdia de nós!
            16. Coração de Jesus, em que o Pai muito Se compraz, tende misericórdia de nós!
            17. Coração de Jesus, de cuja plenitude nos tornamos todos participantes, tende misericórdia de nós!
            18. Coração de Jesus, desejo dos outeiros eternos, tende misericórdia de nós!
            19. Coração de Jesus, paciente e muito misericordioso, tende misericórdia de nós!
            20. Coração de Jesus, generoso para todos os que Vos invocam, tende misericórdia de nós!
            21. Coração de Jesus, fonte de vida e de santidade, tende misericórdia de nós!
            22. Coração de Jesus, propiciacao pelos nossos pecados, tende misericórdia de nós!
            23. Coração de Jesus, saciado de oprobrios, tende misericórdia de nós!
            24. Coração de Jesus, esmagado pelas nossas iniquidades, tende misericórdia de nós!
            25. Coração de Jesus, obediente até a morte, tende misericórdia de nós!
            26. Coração de Jesus, traspassado por uma lança, tende misericórdia de nós!
            27. Coração de Jesus, fonte de toda consolação, tende misericórdia de nós!
            28. Coração de Jesus, nossa vida e nossa ressurreição, tende misericórdia de nós!
            29. Coração de Jesus, nossa paz e nossa reconciliação, tende misericórdia de nós!
            30. Coração de Jesus, vitima pelo pecado, tende misericórdia de nós!
            31. Coração de Jesus, salvação dos que em Vos esperam, tende misericórdia de nós!
            32. Coração de Jesus, esperança dos que em Vos morrem, tende misericórdia de nós!
            33. Coração de Jesus, delícia de todos os Santos, tende misericórdia de nós!
            
            (Repetir três vezes com fervor:)
            Jesus, manso e humilde de coração, fazei o meu coração semelhante ao Vosso!""";

    private static final String ORACAO_FINAL = """
            O dulcissimo Jesus, que dissestes: Aprendei de Mim, que sou manso e humilde de coração,
            gravai no meu coração as virtudes da mansidão e da humildade,
            para que gozando da paz que prometestes, possa chegar a vos.
            Sagrado Coração de Jesus, confiamos em Vos! Amém.""";

    private static final String JACULATORIA = "Sagrado Coração de Jesus, eu confio e me abandono em Vos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 27);
        LocalDate dataFim = LocalDate.of(data.getYear(), 6, 5);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma do Sagrado Coração (27/04 - 05/06).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma do Sagrado Coração de Jesus");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
