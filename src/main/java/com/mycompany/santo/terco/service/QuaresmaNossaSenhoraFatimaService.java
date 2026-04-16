package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraFatimaService {

    private static final String ORACAO_PREPARATORIA = """
            Ó Virgem de Fátima, que aparecestes a três pastorinhos em 1917
            e pedistes oração, penitência e consagração ao Vosso Imaculado Coração,
            eis-me diante de Vos nesta Quaresma de Fátima para atender ao vosso pedido.
            Ofereço minha oração, meu sofrimento e minha vida pela conversão dos pecadores.
            Acolhei também o pedido especial que vos apresento: (fazer o pedido).
            Coração Imaculado de Maria, rogai por nós! Amém.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora de Fátima, que apareceste em Portugal em 1917, rogai por nós!
            2. Nossa Senhora de Fátima, que pedistes oração e penitência, rogai por nós!
            3. Nossa Senhora de Fátima, que revelastes os três Segredos, rogai por nós!
            4. Nossa Senhora de Fátima, que mostraste o Inferno às crianças, rogai por nós!
            5. Nossa Senhora de Fátima, que pedistes a consagração da Rússia, rogai por nós!
            6. Nossa Senhora de Fátima, Rainha do Rosário, rogai por nós!
            7. Nossa Senhora de Fátima, que prometestes converter o mundo, rogai por nós!
            8. Nossa Senhora de Fátima, que realizastes o Milagre do Sol, rogai por nós!
            9. Nossa Senhora de Fátima, esperança de paz para o mundo, rogai por nós!
            10. Nossa Senhora de Fátima, que vos aparecestes três meses antes da Revolução Russa, rogai por nós!
            11. Nossa Senhora de Fátima, mãe da Lúcia, Jacinta e Francisco, rogai por nós!
            12. Nossa Senhora de Fátima, que apresentastes o Anjo da Paz às crianças, rogai por nós!
            13. Nossa Senhora de Fátima, protetora da Igreja nos tempos de tribulação, rogai por nós!
            14. Nossa Senhora de Fátima, Coração Imaculado cheio de amor, rogai por nós!
            15. Nossa Senhora de Fátima, que pedes nossa consagração ao Vosso Coração, rogai por nós!
            16. Nossa Senhora de Fátima, guardiã dos fiéis do Rosário, rogai por nós!
            17. Nossa Senhora de Fátima, reveladora do futuro da humanidade, rogai por nós!
            18. Nossa Senhora de Fátima, patrona de Portugal e da Europa, rogai por nós!
            19. Nossa Senhora de Fátima, que convertereis muitas almas pela penitência, rogai por nós!
            20. Nossa Senhora de Fátima, Mãe de misericórdia e intercessora universal, rogai por nós!
            21. Nossa Senhora de Fátima, que presidis ao terceiro milênio, rogai por nós!
            22. Nossa Senhora de Fátima, paz das nações em guerra, rogai por nós!
            23. Nossa Senhora de Fátima, esperança dos perseguidos pela fé, rogai por nós!
            24. Nossa Senhora de Fátima, protetora dos sacerdotes e bispos, rogai por nós!
            25. Nossa Senhora de Fátima, fonte de renovação da Igreja, rogai por nós!
            26. Nossa Senhora de Fátima, que pedes penitência para salvar almas, rogai por nós!
            27. Nossa Senhora de Fátima, que prometestes o triunfo do Vosso Imaculado Coração, rogai por nós!
            28. Nossa Senhora de Fátima, esperança dos que sofrem por Cristo, rogai por nós!
            29. Nossa Senhora de Fátima, que nossas vidas sejam consagradas ao Vosso Coração, rogai por nós!
            30. Nossa Senhora de Fátima, nossa Mãe e nossa Rainha, rogai por nós!
            
            (Rezar três vezes:)
            Coração Imaculado de Maria, rogai por nós que recorremos a Vos!""";

    private static final String ORACAO_FINAL = """
            Ó Nossa Senhora de Fátima, Rainha do Rosário,
            que descestes do Céu para chamar a humanidade a conversão,
            aceita esta Quaresma de oração e penitência que te oferecemos.
            Apresenta nossas intenções ao Coração de teu Filho Jesus
            e obtende-nos a conversão prometida de Portugal e do mundo.
            Coração Imaculado de Maria, sede o nosso refúgio e o caminho que nos conduz a Deus. Amém.""";

    private static final String JACULATORIA = "Coração Imaculado de Maria, rogai por nós que a Vos recorremos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 4);
        LocalDate dataFim = LocalDate.of(data.getYear(), 5, 13);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de N. Sra. de Fátima (04/04 - 13/05).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora de Fátima");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
