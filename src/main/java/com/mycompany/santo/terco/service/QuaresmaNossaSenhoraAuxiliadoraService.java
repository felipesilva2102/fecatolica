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
            O Maria Auxiliadora, Mãe dos cristãos e Auxílio dos fiéis!
            Com toda a confiança de filhos amados, viemos a vos trazer este pedido:
            (fazer o pedido em silêncio).
            Sois o recurso dos que sofrem, a esperança dos desesperados,
            o conforto dos aflitos. Com Dom Bosco exclamamos:
            "Maria Auxiliadora, rogai por nós!" Amém.""";

    private static final String SUPLICAS = """
            1. Nossa Senhora Auxiliadora, Mãe de Deus, rogai por nós!
            2. Nossa Senhora Auxiliadora, que ajudastes a Igreja nas perseguicoes, rogai por nós!
            3. Nossa Senhora Auxiliadora, que aparecestes a Dom Bosco, rogai por nós!
            4. Nossa Senhora Auxiliadora, Mãe e Mestra da juventude, rogai por nós!
            5. Nossa Senhora Auxiliadora, que acompanhastes os salesianos no mundo, rogai por nós!
            6. Nossa Senhora Auxiliadora, consolação dos tristes, rogai por nós!
            7. Nossa Senhora Auxiliadora, curacao dos enfermos, rogai por nós!
            8. Nossa Senhora Auxiliadora, amparo dos pobres, rogai por nós!
            9. Nossa Senhora Auxiliadora, proteção dos viajantes, rogai por nós!
            10. Nossa Senhora Auxiliadora, esperança dos desesperados, rogai por nós!
            11. Nossa Senhora Auxiliadora, auxílio dos cristãos na batalha espiritual, rogai por nós!
            12. Nossa Senhora Auxiliadora, que alcancas gratias de Deus para nós, rogai por nós!
            13. Nossa Senhora Auxiliadora, que apresentas nossas preces ao Filho Divino, rogai por nós!
            14. Nossa Senhora Auxiliadora, padroeira da obra salesiana, rogai por nós!
            15. Nossa Senhora Auxiliadora, que protegeste a Igreja em Lepanto, rogai por nós!
            16. Nossa Senhora Auxiliadora, que libertaste o Papa Pio VII, rogai por nós!
            17. Nossa Senhora Auxiliadora, Glória da Igreja Catol-ica, rogai por nós!
            18. Nossa Senhora Auxiliadora, modelo de dedicacao aos filhos, rogai por nós!
            19. Nossa Senhora Auxiliadora, que nos conduzes ao Sagrado Coração, rogai por nós!
            20. Nossa Senhora Auxiliadora, que nos prepara para o Céu, rogai por nós!
            
            (Concluir em oração: "Maria Auxiliadora, rogai sempre por nós!")""";

    private static final String ORACAO_FINAL = """
            O Maria Auxiliadora, sabemos que sem vos somos fracos,
            mas com vossa intercecao somos fortalecidos.
            Como Dom Bosco aprendeu a confiar plenamente em vos,
            assim também nós queremos colocar nossa vida em vossas mãos maternais.
            Auxiliai-nos em toda necessidade, guiai-nos para o vosso amado Filho Jesus,
            e apresentai ao Pai nossos pedidos com vosso poderoso amor materno. Amém.""";

    private static final String JACULATORIA = "Maria Auxiliadora, socorro dos cristãos, rogai por nós!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 4, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 5, 24);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de N. Sra. Auxiliadora (15/04 - 24/05).");
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
