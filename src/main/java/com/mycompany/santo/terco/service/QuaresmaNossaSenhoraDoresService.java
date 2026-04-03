package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraDoresService {

    private static final String ORACAO_PREPARATORIA = """
            O Maria Dolorosa, Mae das Dores e Maede misericordia!
            Vos que permanecestes ao pe da Cruz de vossso Filho e unistes vossas dores
            ao sacrificio redentor de Jesus por amor a nos,
            intercedeis nesta Quaresma pelas minhas dores e necessidades: (fazer o pedido).
            Por cada das sete espadas que traspassaram vossa alma,
            obtende-me a graca de oferecer meu sofrimento unido ao de vosso Filho. Amem.""";

    private static final String SUPLICAS = """
            1. Maria Dolorosa, pela 1a Dor: a profecia de Simeao, rogai por nos!
            2. Maria Dolorosa, pela 2a Dor: a fuga para o Egito, rogai por nos!
            3. Maria Dolorosa, pela 3a Dor: Jesus perdido por tres dias, rogai por nos!
            4. Maria Dolorosa, pela 4a Dor: Maria encontra Jesus na Via Sacra, rogai por nos!
            5. Maria Dolorosa, pela 5a Dor: Maria ao pe da Cruz por tres horas, rogai por nos!
            6. Maria Dolorosa, pela 6a Dor: Maria recebe o corpo de Jesus descido da Cruz, rogai por nos!
            7. Maria Dolorosa, pela 7a Dor: a sepultura de Jesus, rogai por nos!
            8. Mae das Dores, que sofrestes o que nenhuma mae ja sofreu, rogai por nos!
            9. Mae das Dores, que oferecestes vossas lagrimas pela nossa salvacao, rogai por nos!
            10. Mae das Dores, que suportastes o silencio do Sabado Santo, rogai por nos!
            11. Mae das Dores, esperanca na ressurreicao quando tudo parecia morto, rogai por nos!
            12. Mae das Dores, que conhecestes o limite da dor humana, rogai por nos!
            13. Mae das Dores, conforto dos que sofrem injustamente, rogai por nos!
            14. Mae das Dores, auxilio dos que acompanham filhos doentes, rogai por nos!
            15. Mae das Dores, suporte das familias que perderam um ente querido, rogai por nos!
            16. Mae das Dores, esperanca dos que choram sem consol, rogai por nos!
            17. Mae das Dores, amparo dos que sofrem depressao e abandono, rogai por nos!
            18. Mae das Dores, estrela nos momentos de escuridao, rogai por nos!
            19. Mae das Dores, que soubeste encontrar sentido no sofrimento, rogai por nos!
            20. Mae das Dores, modelo de fortaleza e fe na tribulacao, rogai por nos!
            21. Mae das Dores, que jamais perdestes a confianca em Deus, rogai por nos!
            22. Mae das Dores, que intercedeis pelos moribundos e agonizantes, rogai por nos!
            23. Mae das Dores, protecao especial na hora da morte, rogai por nos!
            24. Mae das Dores, que recebeis os mortos no Ceu com amor maternal, rogai por nos!
            25. Mae das Dores, consolo dos que trabalham com doentes terminais, rogai por nos!
            26. Mae das Dores, que ajudais a transformar dor em oferta de love, rogai por nos!
            27. Mae das Dores, cuja dor foi maior que qualquer dor humana, rogai por nos!
            28. Mae das Dores, unida a nos em cada sofrimento, rogai por nos!
            29. Mae das Dores, que apresentas nossas lagrimas ao Pai Eterno, rogai por nos!
            30. Mae das Dores, nossa mae e intercessora nas horas de prova, rogai por nos!
            
            (Rezar tres vezes:)
            Mae das Dores, pela espada que traspassou vossa alma, salvai-nos!""";

    private static final String ORACAO_FINAL = """
            O Maria, Mae das Dores e da misericordia,
            que na escola da Cruz aprendestes o amor mais perfeito,
            ensinai-nos a unir nossas dores ao sofrimento redentor de vosso Filho,
            para que nenhuma lagrima nossa seja perdida,
            mas toda transformada em graca para nos e para os outros.
            Sede-nos presentes especialmente na hora da nossa morte,
            e recebei-nos nos vossos bracos maternais. Amem.""";

    private static final String JACULATORIA = "Mae das Dores, pelas sete espadas de vossa dor, salvai-nos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 7);
        LocalDate dataFim = LocalDate.of(data.getYear(), 9, 15);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de N. Sra. das Dores (07/08 - 15/09).");
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
