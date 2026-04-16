package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de Santo Antônio de Pádua
 * Período: 4 de maio a 13 de junho (40 dias, encerrando na festa do santo)
 */
@Service
public class QuaresmaSantoAntonioService {

    private static final String ORACAO_PREPARATORIA = """
            O glorioso Santo Antonio de Pádua, que fostes escolhido por Deus para ser
            vaso de predicacao e luz da Igreja,
            rogai a Jesus, que pela vossa intercessão poderosa,
            acenda em nós o amor a Deus e ao próximo.
            Apresento-vos os meus pedidos: (fazer o pedido em silêncio).
            Obtende-me esta graça, se for para o bem da minha alma. Amém.""";

    private static final String TREZE_INVOCACOES = """
            1. Santo Antonio, espelho de penitência, rogai por nós!
            2. Santo Antonio, modelo de humildade, rogai por nós!
            3. Santo Antonio, pai dos pobres, rogai por nós!
            4. Santo Antonio, defensor dos inocentes, rogai por nós!
            5. Santo Antonio, consolador dos aflitos, rogai por nós!
            6. Santo Antonio, guia dos errantes, rogai por nós!
            7. Santo Antonio, libertador dos cativos, rogai por nós!
            8. Santo Antonio, esperança dos desesperados, rogai por nós!
            9. Santo Antonio, luz dos cegos da alma, rogai por nós!
            10. Santo Antonio, restaurador dos bens perdidos, rogai por nós!
            11. Santo Antonio, proteção das famílias, rogai por nós!
            12. Santo Antonio, terror dos demonios, rogai por nós!
            13. Santo Antonio, intercessor junto a Maria, rogai por nós!

            (Repita as 13 invocações por 13 dias seguidos, em honra dos 13 milagres
             e dos 13 dias que antecedem a festa do santo, a 13 de junho.)""";

    private static final String ORACAO_PAO_DOS_POBRES = """
            Santo Antonio, pai dos pobres,
            que distribuistes com tanta generosidade o pao dos pobres,
            intercedei por todos aqueles que hoje sentem a fome
            — fome de pão, de justiça, de amor, de Deus.
            Que os nossos corações se abram em caridade.
            Que o pao dos pobres não falte a nenhuma mesa.
            Amém.""";

    private static final String ORACAO_PAX_ET_BONUM = """
            O bom Santo Antonio,
            que viveste em plena pobreza e alegria franciscana,
            ensinai-nos a dizer com São Francisco:
            Paz e Bem!
            Sejamos instrumentos de paz onde há ódio,
            de perdão onde há ofensa,
            de união onde há discórdia.
            Que o Espírito Santo nos encha da mesma alegria
            que encheu o vosso coração serafico. Amém.""";

    private static final String JACULATORIA = "Santo Antonio de Pádua, martelo dos hereges, rogai por nós!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 5, 4);
        LocalDate dataFim = LocalDate.of(data.getYear(), 6, 13);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

                if (!dentro) {
                        result.put("mensagemDia",
                                        "A data selecionada não está dentro da Quaresma de Santo Antônio (04/05 - 13/06).");
        } else {
                        result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santo Antônio");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("trezeInvocacoes", TREZE_INVOCACOES);
        result.put("oracaoPaoDoPobres", ORACAO_PAO_DOS_POBRES);
        result.put("oracaoPaxEtBonum", ORACAO_PAX_ET_BONUM);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
