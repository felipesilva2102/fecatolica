package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de Nossa Senhora Aparecida
 * Período: 2 de setembro a 12 de outubro (41 dias, encerrando na festa da
 * padroeira do Brasil)
 */
@Service
public class QuaresmaNossaSenhoraAparecidaService {

    private static final String ORACAO_PREPARATORIA = """
            O Maria, poderosa Rainha e cheissima de graca,
            ajoelho-me aos vossos pes com todo o afeto e confianca.
            Olhai para mim, vossa criatura, e apresento ao vosso Imaculado Coracao
            este pedido: (fazer o pedido em silencio).
            Nossa Senhora Aparecida, Rainha e Mae do Brasil,
            que aparecestes nas aguas do Rio Paraiba para nos mostrar
            que nunca abandonais vossos filhos,
            intercedei por mim junto a Jesus, vosso Filho. Amem.""";

    private static final String TERCO_APARECIDA = """
            Em cada dezena, acrescente a jaculatoria:
            Nossa Senhora Aparecida, rogai por nos!

            Jaculatoria especial:
            'Nossa Senhora Aparecida, Rainha e Mae do Brasil, guardai-nos sob o vosso manto sagrado!'""";

    private static final String LADAINHA_APARECIDA = """
            1. Nossa Senhora Aparecida, rogai por nos!
            2. Rainha e Padroeira do Brasil, rogai por nos!
            3. Virgem Imaculada encontrada nas aguas, rogai por nos!
            4. Mae dos pobres e humildes, rogai por nos!
            5. Esperanca dos desesperados, rogai por nos!
            6. Consolo dos que sofrem, rogai por nos!
            7. Saude dos enfermos, rogai por nos!
            8. Guia dos errantes, rogai por nos!
            9. Mae das familias brasileiras, rogai por nos!
            10. Padroeira dos pescadores, rogai por nos!
            11. Protetora das criancas, rogai por nos!
            12. Luz dos que estao nas trevas, rogai por nos!
            13. Forcas dos fracos, rogai por nos!
            14. Refgio nas tentacoes, rogai por nos!
            15. Porta do Ceu para o Brasil, rogai por nos!""";

    private static final String ORACAO_CONSAGRACAO = """
            Mae Nossa, Nossa Senhora Aparecida,
            neste momento de consagracao, eu me entrego inteiramente a vos.
            Tome conta da minha vida, da minha familia, do meu trabalho,
            da minha saude e de tudo o que sou e tenho.
            Apresento ao vosso Imaculado Coracao as minhas alegrias e sofrimentos,
            unindo-os ao Coracao de Jesus, vosso Filho.
            Consagro-me a vos e peco que me conduzais com seguranca
            ao Paraiso prometido pelo vosso Filho.
            Nossa Senhora Aparecida, rogai por nos!
            Amem.""";

    private static final String ORACAO_FINAL = """
            Ave, Mae Aparecida, cheia de graca, o Senhor e convosco!
            Bendita sois vos entre as mulheres e bendito e o fruto do vosso ventre, Jesus.
            Santa Maria, Mae de Deus e Padroeira do Brasil,
            rogai por nos, pecadores, agora e na hora da nossa morte. Amem.

            (Jaculatoria): Nossa Senhora Aparecida, Rainha e Mae do Brasil, rogai por nos!""";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 9, 2);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 12);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia",
                    "A data selecionada nao esta dentro da Quaresma de N. Sra. Aparecida (02/09 - 12/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora Aparecida");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("tercoAparecida", TERCO_APARECIDA);
        result.put("ladainhaAparecida", LADAINHA_APARECIDA);
        result.put("oracaoConsagracao", ORACAO_CONSAGRACAO);
        result.put("oracaoFinal", ORACAO_FINAL);
        return result;
    }
}
