package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuaresmaSaoMiguelService {

    private static final String PREPARACAO_DIARIA = """
            • Tenha um cantinho de oração com a imagem de São Miguel (ou de um anjo).
            • Acenda uma vela em honra de São Miguel.
            • Faça o Sinal da Cruz e comece a oração.""";

    private static final String ORACAO_DIARIA_INICIAL = """
            São Miguel Arcanjo, defendei-nos no combate, sede nosso refúgio contra a maldade e as ciladas do demônio. Ordene-lhe Deus, instantemente o pedimos; e vós, príncipe da milícia celeste, pela virtude divina, precipitai no inferno a Satanás e aos outros espíritos malignos que andam pelo mundo para perder as almas. Amém.""";

    private static final String EXAME_CONSCIENCIA = "Momento de silêncio: pense em algo que fez de errado no dia e peça: Senhor Jesus, misericórdia, perdoai-me...";

    private static final String LEITURA_BIBLICA = "Recomenda-se a leitura de passagens bíblicas que tratam do combate espiritual, da proteção divina e da intercessão dos anjos, como os livros de Daniel e Apocalipse.";

        private static final String LADAINHA = """
            Senhor, tende piedade de nós.
            Jesus Cristo, tende piedade de nós.
            Senhor, tende piedade de nós.
            Jesus Cristo, ouvi-nos.
            Jesus Cristo, atendei-nos.
            Pai Celeste, que sois Deus, tende piedade de nós.
            Filho Redentor do mundo, que sois Deus, tende piedade de nós.
            Espírito Santo, que sois Deus, tende piedade de nós.
            Santíssima Trindade, que sois um só Deus, tende piedade de nós.
            Santa Maria, Rainha dos Anjos, rogai por nós.
            São Miguel, rogai por nós.
            São Miguel, cheio da graça de Deus, rogai por nós.
            São Miguel, perfeito adorador do Verbo Divino, rogai por nós.
            São Miguel, coroado de honra e de glória, rogai por nós.
            São Miguel, poderosíssimo Príncipe dos exércitos do Senhor, rogai por nós.
            São Miguel, porta-estandarte da Santíssima Trindade, rogai por nós.
            São Miguel, guardião do Paraíso, rogai por nós.
            São Miguel, guia e consolador do povo israelita, rogai por nós.
            São Miguel, esplendor e fortaleza da Igreja Militante, rogai por nós.
            São Miguel, honra e alegria da Igreja Triunfante, rogai por nós.
            São Miguel, luz dos Anjos, rogai por nós.
            São Miguel, baluarte dos cristãos, rogai por nós.
            São Miguel, força daqueles que combatem sob o estandarte da Cruz, rogai por nós.
            São Miguel, luz e confiança das almas no último momento da vida, rogai por nós.
            São Miguel, socorro muito certo, rogai por nós.
            São Miguel, nosso auxílio em todas as adversidades, rogai por nós.
            São Miguel, arauto da sentença eterna, rogai por nós.
            São Miguel, consolador das almas que estão no purgatório, rogai por nós.
            São Miguel, a quem o Senhor incumbiu de receber as almas depois da morte, rogai por nós.
            São Miguel, nosso Príncipe, rogai por nós.
            São Miguel, nosso advogado, rogai por nós.
            Cordeiro de Deus, que tirais o pecado do mundo, perdoai-nos, Senhor.
            Cordeiro de Deus, que tirais o pecado do mundo, ouvi-nos, Senhor.
            Cordeiro de Deus, que tirais o pecado do mundo, tende piedade de nós, Senhor.
            Rogai por nós, ó glorioso São Miguel,
            Príncipe da Igreja de Cristo,
            para que sejamos dignos de suas promessas.""";

    private static final String CONSAGRACAO = "Ó Príncipe nobilíssimo dos Anjos, valoroso guerreiro do Altíssimo, zeloso defensor da glória do Senhor, terror dos espíritos rebeldes, amor e delícia de todos os Anjos justos, meu diletíssimo Arcanjo São Miguel, desejando eu fazer parte do número dos vossos devotos e servos, a vós hoje me consagro, me dou e me ofereço e ponho-me a mim próprio, à minha família e a tudo o que me pertence, debaixo da vossa poderosíssima proteção.";

    private static final String ORACAO_FINAL = "Levanta-se Deus, pela intercessão da bem-aventurada Virgem Maria, São Miguel Arcanjo e todas as milícias celestes; sejam dispersos os seus inimigos e fujam de sua face todos os que o odeiam. Em nome do Pai, e do Filho e do Espírito Santo. Amém.";

    private static final String AUGUSTA_RAINHA = "Augusta Rainha dos céus, soberana mestra dos Anjos, Vós que, desde o princípio, recebestes de Deus o poder e a missão de esmagar a cabeça de Satanás, nós vo-lo pedimos humildemente, enviai vossas legiões celestes para que, sob vossas ordens, e por vosso poder, elas persigam os demônios, combatendo-os por toda a parte, reprimindo-lhes a insolência, e lançando-os no abismo. Quem é como Deus? Ó Mãe de bondade e ternura, Vós sereis sempre o nosso amor e a nossa esperança. Ó Mãe divina, enviai os Santos Anjos para nos defenderem, e repeli para longe de nós o cruel inimigo. Santos Anjos e Arcanjos, defendei-nos e guardai-nos. Amém.";

    private static final String OFERENDA_FINAL = "Senhor Jesus, por intercessão de São Miguel Arcanjo, eu Vos ofereço este dia da Quaresma pedindo: pela minha conversão, pela minha família, pela Igreja e pelo Santo Padre, o Papa. Guardai-nos na fé e defendei-nos de todo mal. Amém.";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (3x)\n• Ave-Maria (3x)\n• Glória ao Pai (3x)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Efésios 6, 10-11: Fortalecei-vos no Senhor e na força do seu poder.",
            "Dia 2 - Salmo 91, 1-2: Tu que habitas sob a proteção do Altíssimo.",
            "Dia 3 - 1 Pedro 5, 8-9: Sede sóbrios e vigilantes.",
            "Dia 4 - Tiago 4, 7: Submetei-vos, pois, a Deus; resisti ao diabo.",
            "Dia 5 - Salmo 27, 1: O Senhor é minha luz e minha salvação.",
            "Dia 6 - 2 Coríntios 10, 3-4: As armas da nossa milícia não são carnais.",
            "Dia 7 - Salmo 34, 7: O anjo do Senhor acampa ao redor dos que o temem.",
            "Dia 8 - Romanos 8, 31: Se Deus é por nós, quem será contra nós?",
            "Dia 9 - Apocalipse 12, 7-8: Houve então uma batalha no céu.",
            "Dia 10 - Deuteronômio 31, 6: Sede fortes e corajosos.",
            "Dia 11 - Salmo 23, 4: Ainda que eu atravesse o vale escuro.",
            "Dia 12 - Isaías 41, 10: Não temas, porque eu estou contigo.",
            "Dia 13 - Filipenses 4, 13: Tudo posso naquele que me fortalece.",
            "Dia 14 - Salmo 18, 2-3: Eu te amo, Senhor, minha força!",
            "Dia 15 - Hebreus 1, 14: Não são todos eles espíritos servidores?",
            "Dia 16 - Josué 1, 9: Sê forte e corajoso.",
            "Dia 17 - Mateus 18, 10: Os seus anjos veem a face de meu Pai.",
            "Dia 18 - Salmo 62, 2-3: Só em Deus a minha alma repousa.",
            "Dia 19 - 2 Tessalonicenses 3, 3: O Senhor é fiel; vos guardará do maligno.",
            "Dia 20 - João 16, 33: Coragem! Eu venci o mundo.",
            "Dia 21 - Apocalipse 19, 11: Vi o céu aberto.",
            "Dia 22 - Salmo 46, 2-3: Deus é nosso refúgio e nossa força.",
            "Dia 23 - Isaías 54, 17: Toda arma forjada contra ti não prosperará.",
            "Dia 24 - 1 João 4, 4: Maior é aquele que está em vós.",
            "Dia 25 - Salmo 121, 7-8: O Senhor te guardará de todo o mal.",
            "Dia 26 - Apocalipse 20, 1-2: Vi descer do céu um anjo.",
            "Dia 27 - Romanos 16, 20: O Deus da paz em breve esmagará Satanás.",
            "Dia 28 - Salmo 144, 1-2: Bendito seja o Senhor, meu rochedo.",
            "Dia 29 - Daniel 10, 12-13: Não temas, Daniel.",
            "Dia 30 - Mateus 4, 10-11: Retira-te, Satanas.",
            "Dia 31 - Salmo 125, 2: Assim como os montes cercam Jerusalém.",
            "Dia 32 - Zacarias 4, 6: Não por força, nem por violência.",
            "Dia 33 - Efésios 6, 17: Tomai a espada do Espírito.",
            "Dia 34 - Salmo 118, 105: Vossa palavra é lâmpada para meus pés.",
            "Dia 35 - Apocalipse 22, 12: Eis que venho em breve.",
            "Dia 36 - Isaías 40, 31: Os que esperam no Senhor renovam suas forças.",
            "Dia 37 - João 1, 5: A luz brilha nas trevas.",
            "Dia 38 - Salmo 37, 5: Confia ao Senhor o teu caminho.",
                "Dia 39 - Hebreus 12, 1-2: Corramos com perseverança.",
                "Dia 40 - Apocalipse 21, 3-4: Eis o tabernáculo de Deus com os homens."
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 9, 29);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? calcularDia(data, dataInicio) : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Miguel (15/08 - 29/09).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Miguel Arcanjo");
        }

        result.put("diaQuaresma", dia);
        result.put("preparacaoDiaria", PREPARACAO_DIARIA);
        result.put("oracaoDiariaInicial", ORACAO_DIARIA_INICIAL);
        result.put("exameConsciencia", EXAME_CONSCIENCIA);
        result.put("leituraBiblica", LEITURA_BIBLICA);
        result.put("leituraDoDia", getLeituraDoDia(dia));
        result.put("ladainhaSaoMiguel", LADAINHA);
        result.put("consagracaoSaoMiguel", CONSAGRACAO);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("oracaoAugustaRainha", AUGUSTA_RAINHA);
        result.put("oferendaFinal", OFERENDA_FINAL);
        result.put("oracoesFinais", ORACOES_FINAIS);
        return result;
    }

    private int calcularDia(LocalDate data, LocalDate dataInicio) {
        LocalDate primeiroDomingo = dataInicio;
        if (dataInicio.getDayOfWeek() != DayOfWeek.SUNDAY) {
            primeiroDomingo = dataInicio.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        }
        long domingos = 0;
        if (!primeiroDomingo.isAfter(data)) {
            domingos = ChronoUnit.WEEKS.between(primeiroDomingo, data) + 1;
        }
        return (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 - (int) domingos;
    }

    private String getLeituraDoDia(int dia) {
        if (dia == -1) return "";
        if (dia >= 1 && dia <= LEITURAS.size()) return LEITURAS.get(dia - 1);
        return "Não há leitura definida para este dia.";
    }
}
