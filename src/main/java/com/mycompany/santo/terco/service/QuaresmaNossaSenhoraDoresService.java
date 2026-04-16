package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraDoresService {

    private static final String ORACAO_PREPARATORIA = """
            O Maria Dolorosa, Mãe das Dores e Mãe de misericórdia!
            Vos que permanecestes ao pe da Cruz de vossso Filho e unistes vossas dores
            ao sacrificio redentor de Jesus por amor a nós,
            intercedeis nesta Quaresma pelas minhas dores e necessidades: (fazer o pedido).
            Por cada das sete espadas que traspassaram vossa alma,
            obtende-me a graça de oferecer meu sofrimento unido ao de vosso Filho. Amém.""";

    private static final String SUPLICAS = """
            1. Maria Dolorosa, pela 1a Dor: a profecia de Simeão, rogai por nós!
            2. Maria Dolorosa, pela 2a Dor: a fuga para o Egito, rogai por nós!
            3. Maria Dolorosa, pela 3a Dor: Jesus perdido por três dias, rogai por nós!
            4. Maria Dolorosa, pela 4a Dor: Maria encontra Jesus na Via Sacra, rogai por nós!
            5. Maria Dolorosa, pela 5a Dor: Maria ao pe da Cruz por três horas, rogai por nós!
            6. Maria Dolorosa, pela 6a Dor: Maria recebe o corpo de Jesus descido da Cruz, rogai por nós!
            7. Maria Dolorosa, pela 7a Dor: a sepultura de Jesus, rogai por nós!
            8. Mãe das Dores, que sofrestes o que nenhuma mãe ja sofreu, rogai por nós!
            9. Mãe das Dores, que oferecestes vossas lágrimas pela nossa salvação, rogai por nós!
            10. Mãe das Dores, que suportastes o silêncio do Sabado Santo, rogai por nós!
            11. Mãe das Dores, esperança na ressurreição quando tudo parecia morto, rogai por nós!
            12. Mãe das Dores, que conhecestes o limite da dor humana, rogai por nós!
            13. Mãe das Dores, conforto dos que sofrem injustamente, rogai por nós!
            14. Mãe das Dores, auxílio dos que acompanham filhos doentes, rogai por nós!
            15. Mãe das Dores, suporte das famílias que perderam um ente querido, rogai por nós!
            16. Mãe das Dores, esperança dos que choram sem consol, rogai por nós!
            17. Mãe das Dores, amparo dos que sofrem depressao e abandono, rogai por nós!
            18. Mãe das Dores, estrela nos momentos de escuridão, rogai por nós!
            19. Mãe das Dores, que soubeste encontrar sentido no sofrimento, rogai por nós!
            20. Mãe das Dores, modelo de fortaleza e fé na tribulação, rogai por nós!
            21. Mãe das Dores, que jamais perdestes a confiança em Deus, rogai por nós!
            22. Mãe das Dores, que intercedeis pelos moribundos e agonizantes, rogai por nós!
            23. Mãe das Dores, proteção especial na hora da morte, rogai por nós!
            24. Mãe das Dores, que recebeis os mortos no Céu com amor maternal, rogai por nós!
            25. Mãe das Dores, consolo dos que trabalham com doentes terminais, rogai por nós!
            26. Mãe das Dores, que ajudais a transformar dor em oferta de amor, rogai por nós!
            27. Mãe das Dores, cuja dor foi maior que qualquer dor humana, rogai por nós!
            28. Mãe das Dores, unida a nós em cada sofrimento, rogai por nós!
            29. Mãe das Dores, que apresentas nossas lágrimas ao Pai Eterno, rogai por nós!
            30. Mãe das Dores, nossa mãe e intercessora nas horas de prova, rogai por nós!
            
            (Rezar três vezes:)
            Mãe das Dores, pela espada que traspassou vossa alma, salvai-nos!""";

    private static final String ORACAO_FINAL = """
            O Maria, Mãe das Dores e da misericórdia,
            que na escola da Cruz aprendestes o amor mais perfeito,
            ensinai-nos a unir nossas dores ao sofrimento redentor de vosso Filho,
            para que nenhuma lagrima nossa seja perdida,
            mas toda transformada em graça para nós e para os outros.
            Sede-nos presentes especialmente na hora da nossa morte,
            e recebei-nos nos vossos braços maternais. Amém.""";

    private static final String JACULATORIA = "Mãe das Dores, pelas sete espadas de vossa dor, salvai-nos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 7);
        LocalDate dataFim = LocalDate.of(data.getYear(), 9, 15);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de N. Sra. das Dores (07/08 - 15/09).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora das Dores");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);

        return result;
    }
}
