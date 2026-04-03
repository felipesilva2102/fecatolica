package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraFatimaService {

    private static final String ORACAO_PREPARATORIA = """
            O Virgem de Fatima, que aparecestes a tres pastorinhos em 1917
            e pedistes oracao, penitencia e consagracao ao Vosso Imaculado Coracao,
            eis-me diante de Vos nesta Quaresma de Fatima para atender ao vosso pedido.
            Ofereco minha oracao, meu sofrimento e minha vida pela conversao dos pecadores.
            Acolhei tambem o pedido especial que vos apresento: (fazer o pedido).
            Coracao Imaculado de Maria, rogai por nos! Amem.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora de Fatima, que apareceste em Portugal em 1917, rogai por nos!
            2. Nossa Senhora de Fatima, que pedistes oracao e penitencia, rogai por nos!
            3. Nossa Senhora de Fatima, que revelastes os tres Segredos, rogai por nos!
            4. Nossa Senhora de Fatima, que mostraste o Inferno as criancas, rogai por nos!
            5. Nossa Senhora de Fatima, que pedistes a consagracao da Russia, rogai por nos!
            6. Nossa Senhora de Fatima, Rainha do Rosario, rogai por nos!
            7. Nossa Senhora de Fatima, que prometestes converter o mundo, rogai por nos!
            8. Nossa Senhora de Fatima, que realizastes o Milagre do Sol, rogai por nos!
            9. Nossa Senhora de Fatima, esperanca de paz para o mundo, rogai por nos!
            10. Nossa Senhora de Fatima, que vos aparecestes tres meses antes da Revolucao Russa, rogai por nos!
            11. Nossa Senhora de Fatima, mae da Lucia, Jacinta e Francisco, rogai por nos!
            12. Nossa Senhora de Fatima, que apresentastes o Angel da Paz as criancas, rogai por nos!
            13. Nossa Senhora de Fatima, protetora da Igreja nos tempos de tribulacao, rogai por nos!
            14. Nossa Senhora de Fatima, Coracao Imaculado cheio de amor, rogai por nos!
            15. Nossa Senhora de Fatima, que pedes nossa consagracao ao Vosso Coracao, rogai por nos!
            16. Nossa Senhora de Fatima, guardada dos fieis do Rosario, rogai por nos!
            17. Nossa Senhora de Fatima, reveladora do futuro da humanidade, rogai por nos!
            18. Nossa Senhora de Fatima, patrona de Portugal e da Europa, rogai por nos!
            19. Nossa Senhora de Fatima, que convertereis muitas almas pela penitencia, rogai por nos!
            20. Nossa Senhora de Fatima, Mae de misericordia e intercessora universal, rogai por nos!
            21. Nossa Senhora de Fatima, que presidis ao terceiro milenio, rogai por nos!
            22. Nossa Senhora de Fatima, paz das nacoes em guerra, rogai por nos!
            23. Nossa Senhora de Fatima, esperanca dos perseguidos pela fe, rogai por nos!
            24. Nossa Senhora de Fatima, protetora dos sacerdotes e bispos, rogai por nos!
            25. Nossa Senhora de Fatima, fonte de renovacao da Igreja, rogai por nos!
            26. Nossa Senhora de Fatima, que pedes penitencia para salvar almas, rogai por nos!
            27. Nossa Senhora de Fatima, que prometestes o triunfo do Vosso Imaculado Coracao, rogai por nos!
            28. Nossa Senhora de Fatima, esperanca dos que sofrem por Cristo, rogai por nos!
            29. Nossa Senhora de Fatima, que nossas vidas sejam consagradas ao Vosso Coracao, rogai por nos!
            30. Nossa Senhora de Fatima, nossa Mai e nossa Rainha, rogai por nos!
            
            (Rezar tres vezes:)
            Coracao Imaculado de Maria, rogai por nos que recorremos a Vos!""";

    private static final String ORACAO_FINAL = """
            O Nossa Senhora de Fatima, Rainha do Rosario,
            que descestes do Ceu para chamar a humanidade a conversao,
            aceita esta Quaresma de oracao e penitencia que te oferecemos.
            Apresenta nossas intencoes ao Coracao de teu Filho Jesus
            e obtende-nos a conversao prometida de portugal e do mundo.
            Coracao Imaculado de Maria, sede o nosso refugio e o caminho que nos conduz a Deus. Amem.""";

    private static final String JACULATORIA = "Coracao Imaculado de Maria, rogai por nos que a Vos recorremos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 4);
        LocalDate dataFim = LocalDate.of(data.getYear(), 5, 13);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de N. Sra. de Fatima (04/04 - 13/05).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora de Fatima");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
