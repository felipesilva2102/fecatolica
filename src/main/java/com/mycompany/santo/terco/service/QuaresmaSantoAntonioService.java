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
            O glorioso Santo Antonio de Padua, que fostes escolhido por Deus para ser
            vaso de predicacao e luz da Igreja,
            rogai a Jesus, que pela vossa intercessao poderosa,
            acenda em nos o amor a Deus e ao proximo.
            Apresento-vos os meus pedidos: (fazer o pedido em silencio).
            Obtende-me esta graca, se for para o bem da minha alma. Amem.""";

    private static final String TREZE_INVOCACOES = """
            1. Santo Antonio, espelho de penitencia, rogai por nos!
            2. Santo Antonio, modelo de humildade, rogai por nos!
            3. Santo Antonio, pai dos pobres, rogai por nos!
            4. Santo Antonio, defensor dos inocentes, rogai por nos!
            5. Santo Antonio, consolador dos aflitos, rogai por nos!
            6. Santo Antonio, guia dos errantes, rogai por nos!
            7. Santo Antonio, libertador dos cativos, rogai por nos!
            8. Santo Antonio, esperanca dos desesperados, rogai por nos!
            9. Santo Antonio, luz dos cegos da alma, rogai por nos!
            10. Santo Antonio, restaurador dos bens perdidos, rogai por nos!
            11. Santo Antonio, protecao das familias, rogai por nos!
            12. Santo Antonio, terror dos demonios, rogai por nos!
            13. Santo Antonio, intercessor junto a Maria, rogai por nos!

            (Repita as 13 invocacoes por 13 dias seguidos, em honra dos 13 milagres
             e dos 13 dias que antecedem a festa do santo, a 13 de junho.)""";

    private static final String ORACAO_PAO_DOS_POBRES = """
            Santo Antonio, pai dos pobres,
            que distribuistes com tanta generosidade o pao dos pobres,
            intercedei por todos aqueles que hoje sentem a fome
            — fome de pao, de justica, de amor, de Deus.
            Que os nossos coracao se abram em caridade.
            Que o pao dos pobres nao falte a nenhuma mesa.
            Amem.""";

    private static final String ORACAO_PAX_ET_BONUM = """
            O bom Santo Antonio,
            que viveste em plena pobreza e alegria franciscana,
            ensinai-nos a dizer com Sao Francisco:
            Paz e Bem!
            Sejamos instrumentos de paz onde ha odio,
            de perdao onde ha ofensa,
            de uniao onde ha discordia.
            Que o Espirito Santo nos encha da mesma alegria
            que encheu o vosso coracao serafico. Amem.""";

    private static final String JACULATORIA = "Santo Antonio de Padua, martelo dos hereges, rogai por nos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 5, 4);
        LocalDate dataFim = LocalDate.of(data.getYear(), 6, 13);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia",
                    "A data selecionada nao esta dentro da Quaresma de Santo Antonio (04/05 - 13/06).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santo Antonio");
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
