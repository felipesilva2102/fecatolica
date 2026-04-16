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
            O Maria, poderosa Rainha e cheissima de graça,
            ajoelho-me aos vossos pes com todo o afeto e confiança.
            Olhai para mim, vossa criatura, e apresento ao vosso Imaculado Coração
            este pedido: (fazer o pedido em silêncio).
            Nossa Senhora Aparecida, Rainha e Mãe do Brasil,
            que aparecestes nas aguas do Rio Paraiba para nos mostrar
            que nunca abandonais vossos filhos,
            intercedei por mim junto a Jesus, vosso Filho. Amém.""";

    private static final String TERCO_APARECIDA = """
            Em cada dezena, acrescente a jaculatoria:
            Nossa Senhora Aparecida, rogai por nós!

            Jaculatoria especial:
            'Nossa Senhora Aparecida, Rainha e Mãe do Brasil, guardai-nos sob o vosso manto sagrado!'""";

    private static final String LADAINHA_APARECIDA = """
            1. Nossa Senhora Aparecida, rogai por nós!
            2. Rainha e Padroeira do Brasil, rogai por nós!
            3. Virgem Imaculada encontrada nas aguas, rogai por nós!
            4. Mãe dos pobres e humildes, rogai por nós!
            5. Esperanca dos desesperados, rogai por nós!
            6. Consolo dos que sofrem, rogai por nós!
            7. Saúde dos enfermos, rogai por nós!
            8. Guia dos errantes, rogai por nós!
            9. Mãe das famílias brasileiras, rogai por nós!
            10. Padroeira dos pescadores, rogai por nós!
            11. Protetora das criancas, rogai por nós!
            12. Luz dos que estao nas trevas, rogai por nós!
            13. Forcas dos fracos, rogai por nós!
            14. Refgio nas tentações, rogai por nós!
            15. Porta do Céu para o Brasil, rogai por nós!""";

    private static final String ORACAO_CONSAGRACAO = """
            Mãe Nossa, Nossa Senhora Aparecida,
            neste momento de consagração, eu me entrego inteiramente a vós.
            Tome conta da minha vida, da minha família, do meu trabalho,
            da minha saúde e de tudo o que sou e tenho.
            Apresento ao vosso Imaculado Coração as minhas alegrias e sofrimentos,
            unindo-os ao Coração de Jesus, vosso Filho.
            Consagro-me a vos e peco que me conduzais com seguranca
            ao Paraiso prometido pelo vosso Filho.
            Nossa Senhora Aparecida, rogai por nós!
            Amém.""";

    private static final String ORACAO_FINAL = """
            Ave, Mãe Aparecida, cheia de graça, o Senhor e convosco!
            Bendita sois vos entre as mulheres e bendito e o fruto do vosso ventre, Jesus.
            Santa Maria, Mãe de Deus e Padroeira do Brasil,
            rogai por nós, pecadores, agora e na hora da nossa morte. Amém.

            (Jaculatoria): Nossa Senhora Aparecida, Rainha e Mãe do Brasil, rogai por nós!""";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 9, 2);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 12);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

                if (!dentro) {
                        result.put("mensagemDia",
                                        "A data selecionada não está dentro da Quaresma de N. Sra. Aparecida (02/09 - 12/10).");
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
