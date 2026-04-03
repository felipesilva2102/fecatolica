package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de Nossa Senhora Auxiliadora
 * Período: 15 de abril a 24 de maio (40 dias, encerrando na festa da Auxiliadora)
 */
@Service
public class QuaresmaNossaSenhoraAuxiliadoraService {

    private static final String ORACAO_PREPARATORIA = """
            O Maria Auxiliadora, Mae dos cristaos e Auxilio dos fieis!
            Com toda a confianca de filhos amados, viemos a vos trazer este pedido:
            (fazer o pedido em silencio).
            Sois o recurso dos que sofrem, a esperanca dos desesperados,
            o conforto dos aflitos. Com Dom Bosco exclamamos:
            "Maria Auxiliadora, rogai por nos!" Amem.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora Auxiliadora, Mae de Deus, rogai por nos!
            2. Nossa Senhora Auxiliadora, que ajudastes a Igreja nas perseguicoes, rogai por nos!
            3. Nossa Senhora Auxiliadora, que aparecestes a Dom Bosco, rogai por nos!
            4. Nossa Senhora Auxiliadora, Mae e Mestra da juventude, rogai por nos!
            5. Nossa Senhora Auxiliadora, que acompanhastes os salesianos no mundo, rogai por nos!
            6. Nossa Senhora Auxiliadora, consolacao dos tristes, rogai por nos!
            7. Nossa Senhora Auxiliadora, curacao dos enfermos, rogai por nos!
            8. Nossa Senhora Auxiliadora, amparo dos pobres, rogai por nos!
            9. Nossa Senhora Auxiliadora, protecao dos viajantes, rogai por nos!
            10. Nossa Senhora Auxiliadora, esperanca dos desesperados, rogai por nos!
            11. Nossa Senhora Auxiliadora, auxilio dos cristaos na batalha espiritual, rogai por nos!
            12. Nossa Senhora Auxiliadora, que alcancas gratias de Deus para nos, rogai por nos!
            13. Nossa Senhora Auxiliadora, que apresentas nossas preces ao Filho Divino, rogai por nos!
            14. Nossa Senhora Auxiliadora, padroeira da obra salesiana, rogai por nos!
            15. Nossa Senhora Auxiliadora, que protegeste a Igreja em Lepanto, rogai por nos!
            16. Nossa Senhora Auxiliadora, que libertaste o Papa Pio VII, rogai por nos!
            17. Nossa Senhora Auxiliadora, Gloria da Igreja Catol-ica, rogai por nos!
            18. Nossa Senhora Auxiliadora, modelo de dedicacao aos filhos, rogai por nos!
            19. Nossa Senhora Auxiliadora, que nos conduzes ao Sagrado Coracao, rogai por nos!
            20. Nossa Senhora Auxiliadora, que nos prepara para o Ceu, rogai por nos!
            
            (Concluir em oracao: "Maria Auxiliadora, rogai sempre por nos!")""";

    private static final String ORACAO_FINAL = """
            O Maria Auxiliadora, sabemos que sem vos somos fracos,
            mas com vossa intercecao somos fortalecidos.
            Como Dom Bosco aprendeu a confiar plenamente em vos,
            assim tambem nos queremos colocar nossa vida em vossas maos maternais.
            Auxiliai-nos em toda necessidade, guiai-nos para o vosso amado Filho Jesus,
            e apresentai ao Pai nossos pedidos com vosso poderoso amor materno. Amem.""";

    private static final String JACULATORIA = "Maria Auxiliadora, socorro dos cristaos, rogai por nos!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 5, 24);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de N. Sra. Auxiliadora (15/04 - 24/05).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora Auxiliadora");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
