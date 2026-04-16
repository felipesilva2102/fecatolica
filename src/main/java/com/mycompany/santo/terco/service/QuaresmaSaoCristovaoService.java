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
            Ó glorioso São Cristóvão, portador de Cristo através das águas!
            Você que carregou o Menino Jesus em seus ombros,
            ensinai-nos a carregar Cristo em nossa vida cotidiana.
            Apresento-vos este meu pedido humildemente:
            (fazer o pedido em silêncio).
            Sede para nós companheiro em nossas viagens, protetor dos caminhos
            e intercessor junto ao Senhor de todos os peregrinos. Amém.""";

    private static final String SUPLICAS = """
            1. São Cristóvão, réprobo convertido pela força da fé, rogai por nós!
            2. São Cristóvão, batizado com o nome de portador de Cristo, rogai por nós!
            3. São Cristóvão, que procurastes servir ao maior rei do mundo, rogai por nós!
            4. São Cristóvão, portador de Cristo pelas águas turbulentas, rogai por nós!
            5. São Cristóvão, que sentistes o peso do mundo inteiro em vossos ombros, rogai por nós!
            6. São Cristóvão, gigante de corpo e ainda maior de fé, rogai por nós!
            7. São Cristóvão, que servistes a Deus com toda a vossa força, rogai por nós!
            8. São Cristóvão, que confessastes Cristo diante dos tiranos, rogai por nós!
            9. São Cristóvão, mártir pela verdade da fé, rogai por nós!
            10. São Cristóvão, padroeiro dos motoristas e viajantes, rogai por nós!
            11. São Cristóvão, proteção nas estradas e caminhos, rogai por nós!
            12. São Cristóvão, guardião dos peregrinos da fé, rogai por nós!
            13. São Cristóvão, intercessor dos que partem em jornada, rogai por nós!
            14. São Cristóvão, que guardais os que viajam noite e dia, rogai por nós!
            15. São Cristóvão, protetor de aviões, navios e trens, rogai por nós!
            16. São Cristóvão, que nos preservais dos acidentes e perigos, rogai por nós!
            17. São Cristóvão, exemplo de perseverança espiritual, rogai por nós!
            18. São Cristóvão, auxiliar dos missionários em terras longínquas, rogai por nós!
            19. São Cristóvão, padrão dos que viajam para buscar a Deus, rogai por nós!
            20. São Cristóvão, glorioso na corte celestial, rogai por nós!
            
            (Concluir em oração: "São Cristóvão, sede nosso escudo em todas as jornadas.")""";

    private static final String ORACAO_FINAL = """
            Ó São Cristóvão, tu que carregaste o próprio Cristo nos ombros,
            ajudai-nos a carregar a Cruz de cada dia com amor e perseverança.
            Protegei todos os que viajam pelas estradas do mundo:
            os motoristas, os ciclistas, os pedestres, os pilotos.
            Afasta de nós os acidentes, os perigos e os imprevistos do caminho,
            e guia-nos todos ao destino eterno que é o Céu. Amém.""";

    private static final String JACULATORIA = "São Cristóvão, portador de Cristo, protegei nossas viagens!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 6, 16);
        LocalDate dataFim = LocalDate.of(data.getYear(), 7, 25);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Cristóvão (16/06 - 25/07).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Cristóvão");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
