package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaSagradoCoracaoService {

    private static final String ORACAO_PREPARATORIA = """
            O Coracao Santissimo de Jesus, fonte de toda consolacao e misericordia,
            eis-me prostrado diante de Vos para oferecer-Vos o meu coracao.
            Nesta Quaresma do Sagrado Coracao, desejo reparar as ofensas que os homens Vos fizeram
            e confiando em vosso amor infinito, venho pedir-Vos: (fazer o pedido).
            Jesus, mansinho e humilde de coracao, fazei o meu coracao semelhante ao Vosso. Amem.""";

    private static final String SUPLICAS = """
            1. Coracao de Jesus, filho do Pai Eterno, tende misericordia de nos!
            2. Coracao de Jesus, formado pelo Espirito Santo no seio da Virgem Mae, tende misericordia de nos!
            3. Coracao de Jesus, unido substancialmente ao Verbo de Deus, tende misericordia de nos!
            4. Coracao de Jesus, de infinita majestade, tende misericordia de nos!
            5. Coracao de Jesus, templo santo de Deus, tende misericordia de nos!
            6. Coracao de Jesus, tabernaculo do Altissimo, tende misericordia de nos!
            7. Coracao de Jesus, casa de Deus e porta do Ceu, tende misericordia de nos!
            8. Coracao de Jesus, ardente fornalha de caridade, tende misericordia de nos!
            9. Coracao de Jesus, abismo de justica e de amor, tende misericordia de nos!
            10. Coracao de Jesus, cheio de bondade e de amor, tende misericordia de nos!
            11. Coracao de Jesus, abismo de toda a virtude, tende misericordia de nos!
            12. Coracao de Jesus, digno de todo o louvor, tende misericordia de nos!
            13. Coracao de Jesus, rei e centro de todos os coracoes, tende misericordia de nos!
            14. Coracao de Jesus, em que estao todos os tesouros da sabedoria e da ciencia, tende misericordia de nos!
            15. Coracao de Jesus, em que reside toda a plenitude da divindade, tende misericordia de nos!
            16. Coracao de Jesus, em que o Pai muito Se compraz, tende misericordia de nos!
            17. Coracao de Jesus, de cuja plenitude nos tornamos todos participantes, tende misericordia de nos!
            18. Coracao de Jesus, desejo dos outeiros eternos, tende misericordia de nos!
            19. Coracao de Jesus, paciente e muito misericordioso, tende misericordia de nos!
            20. Coracao de Jesus, generoso para todos os que Vos invocam, tende misericordia de nos!
            21. Coracao de Jesus, fonte de vida e de santidade, tende misericordia de nos!
            22. Coracao de Jesus, propiciacao pelos nossos pecados, tende misericordia de nos!
            23. Coracao de Jesus, saciado de oprobrios, tende misericordia de nos!
            24. Coracao de Jesus, esmagado pelas nossas iniquidades, tende misericordia de nos!
            25. Coracao de Jesus, obediente ate a morte, tende misericordia de nos!
            26. Coracao de Jesus, traspassado por uma lanca, tende misericordia de nos!
            27. Coracao de Jesus, fonte de toda consolacao, tende misericordia de nos!
            28. Coracao de Jesus, nossa vida e nossa ressurreicao, tende misericordia de nos!
            29. Coracao de Jesus, nossa paz e nossa reconciliacao, tende misericordia de nos!
            30. Coracao de Jesus, vitima pelo pecado, tende misericordia de nos!
            31. Coracao de Jesus, salvacao dos que em Vos esperam, tende misericordia de nos!
            32. Coracao de Jesus, esperanca dos que em Vos morrem, tende misericordia de nos!
            33. Coracao de Jesus, delicia de todos os Santos, tende misericordia de nos!
            
            (Repetir tres vezes com fervor:)
            Jesus, manso e humilde de coracao, fazei o meu coracao semelhante ao Vosso!""";

    private static final String ORACAO_FINAL = """
            O dulcissimo Jesus, que dissestes: Aprendei de Mim, que sou manso e humilde de coracao,
            gravai no meu coracao as virtudes da mansidao e da humildade,
            para que gozando da paz que prometestes, possa chegar a vos.
            Sagrado Coracao de Jesus, confiamos em Vos! Amem.""";

    private static final String JACULATORIA = "Sagrado Coracao de Jesus, eu confio e me abandono em Vos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 27);
        LocalDate dataFim = LocalDate.of(data.getYear(), 6, 5);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma do Sagrado Coracao (27/04 - 05/06).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma do Sagrado Coracao de Jesus");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
