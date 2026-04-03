package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de São Cristóvão
 * Período: 16 de junho a 25 de julho (40 dias, encerrando na festa do santo)
 */
@Service
public class QuaresmaSaoCristovaoService {

    private static final String ORACAO_PREPARATORIA = """
            O glorioso Sao Cristovao, portador de Cristo atraves das aguas!
            Voce que carregou o menino Jesus em seus ombros,
            ensinai-nos a carregar Cristo em nossa vida cotidiana.
            Apresento-vos este meu pedido humildemente:
            (fazer o pedido em silencio).
            Sede para nos companheiro em nossas viagens, protector dos caminhos
            e intercessor junto ao Senhor de todos os peregrinos. Amem.""";

    private static final String SUPLICAS = """
            1. Sao Cristovao, Reprobo convertido pela forca da fe, rogai por nos!
            2. Sao Cristovao, batizado com o nome de portador de Cristo, rogai por nos!
            3. Sao Cristovao, que procurastes servir ao maior rei do mundo, rogai por nos!
            4. Sao Cristovao, portador de Cristo pelas aguas turbulentas, rogai por nos!
            5. Sao Cristovao, que sentistes o peso do mundo inteiro em vossos ombros, rogai por nos!
            6. Sao Cristovao, gigante de corpo e ainda maior de fe, rogai por nos!
            7. Sao Cristovao, que servistes a Deus com toda a vossa forca, rogai por nos!
            8. Sao Cristovao, que confessastes Cristo diante dos tiranos, rogai por nos!
            9. Sao Cristovao, martir pela verdade da fe, rogai por nos!
            10. Sao Cristovao, padroeiro dos motoristas e viajantes, rogai por nos!
            11. Sao Cristovao, protecao nas estradas e caminhos, rogai por nos!
            12. Sao Cristovao, guardiao dos peregrinos da fe, rogai por nos!
            13. Sao Cristovao, intercessor dos que partem em jornada, rogai por nos!
            14. Sao Cristovao, que guardais os que viajam noite e dia, rogai por nos!
            15. Sao Cristovao, protector de avioes, navios e trens, rogai por nos!
            16. Sao Cristovao, que nos preservais dos acidentes e perigos, rogai por nos!
            17. Sao Cristovao, exemplo de perseveranca espiritual, rogai por nos!
            18. Sao Cristovao, auxiliar dos missionarios em terras longes, rogai por nos!
            19. Sao Cristovao, padrao dos que viajam para buscar a Deus, rogai por nos!
            20. Sao Cristovao, glorioso na corte celestial, rogai por nos!
            
            (Concluir em oracao: "Sao Cristovao, sede nosso escudo em todas as jornadas.")""";

    private static final String ORACAO_FINAL = """
            O Sao Cristovao, tu que carregaste o proprio Cristo nos ombros,
            ajudai-nos a carregar a Cruz de cada dia com amor e perseveranca.
            Protegei todos os que viajam pelas estradas do mundo:
            os motoristas, os ciclistas, os pedestres, os pilotos.
            Afasta de nos os acidentes, os perigos e os imprevistos do caminho,
            e guia-nos todos ao destino eterno que e o Ceu. Amem.""";

    private static final String JACULATORIA = "Sao Cristovao, portador de Cristo, protegei nossas viagens!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 6, 16);
        LocalDate dataFim = LocalDate.of(data.getYear(), 7, 25);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Cristovao (16/06 - 25/07).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Cristovao");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
