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
            • Tenha um cantinho de oracao com a imagem de Sao Miguel (ou de um anjo).
            • Acenda uma vela em honra de Sao Miguel.
            • Faca o Sinal da Cruz e comece a oracao.""";

    private static final String ORACAO_DIARIA_INICIAL = """
            Sao Miguel Arcanjo, defendei-nos no combate, sede nosso refugio contra a maldade e as ciladas do demonio. Ordene-lhe Deus, instantemente o pedimos; e vos, principe da milicia celeste, pela virtude divina, precipitai no inferno a Satanas e aos outros espiritos malignos que andam pelo mundo para perder as almas. Amem.""";

    private static final String EXAME_CONSCIENCIA = "Momento de silencio: pense em algo que fez de errado no dia e peca: Senhor Jesus, misericordia, perdoai-me...";

    private static final String LEITURA_BIBLICA = "Recomenda-se a leitura de passagens biblicas que tratam do combate espiritual, da protecao divina e da intercessao dos anjos, como os livros de Daniel e Apocalipse.";

    private static final String LADAINHA = "Senhor, tende piedade de nos.\nJesus Cristo, tende piedade de nos.\nSenhor, tende piedade de nos.\nJesus Cristo, ouvi-nos.\nJesus Cristo, atendei-nos.\nPai Celeste, que sois Deus, tende piedade de nos.\nFilho Redentor do mundo, que sois Deus, tende piedade de nos.\nEspirito Santo, que sois Deus, tende piedade de nos.\nSantissima Trindade, que sois um so Deus, tende piedade de nos.\nSanta Maria, Rainha dos Anjos, rogai por nos.\nSao Miguel, rogai por nos.\nSao Miguel, cheio da graca de Deus, rogai por nos.\nSao Miguel, perfeito adorador do Verbo Divino, rogai por nos.\nSao Miguel, coroado de honra e de gloria, rogai por nos.\nSao Miguel, poderossissimo Principe dos exercitos do Senhor, rogai por nos.\nSao Miguel, porta-estandarte da Santissima Trindade, rogai por nos.\nSao Miguel, guardiao do Paraiso, rogai por nos.\nSao Miguel, guia e consolador do povo israelita, rogai por nos.\nSao Miguel, esplendor e fortaleza da Igreja Militante, rogai por nos.\nSao Miguel, honra e alegria da Igreja Triunfante, rogai por nos.\nSao Miguel, luz dos Anjos, rogai por nos.\nSao Miguel, baluarte dos cristaos, rogai por nos.\nSao Miguel, forca daqueles que combatem sob o estandarte da Cruz, rogai por nos.\nSao Miguel, luz e confianca das almas no ultimo momento da vida, rogai por nos.\nSao Miguel, socorro muito certo, rogai por nos.\nSao Miguel, nosso auxilio em todas as adversidades, rogai por nos.\nSao Miguel, arauto da sentenca eterna, rogai por nos.\nSao Miguel, consolador das almas que estao no purgatorio, rogai por nos.\nSao Miguel, a quem o Senhor incumbiu de receber as almas depois da morte, rogai por nos.\nSao Miguel, nosso Principe, rogai por nos.\nSao Miguel, nosso advogado, rogai por nos.\nCordeiro de Deus, que tirais o pecado do mundo, perdoai-nos, Senhor.\nCordeiro de Deus, que tirais o pecado do mundo, ouvi-nos, Senhor.\nCordeiro de Deus, que tirais o pecado do mundo, tende piedade de nos, Senhor.\nRogai por nos, o glorioso Sao Miguel,\nPrincipe da Igreja de Cristo,\npara que sejamos dignos de suas promessas.";

    private static final String CONSAGRACAO = "O Principe nobilissimo dos Anjos, valoroso guerreiro do Altissimo, zeloso defensor da gloria do Senhor, terror dos espiritos rebeldes, amor e delicia de todos os Anjos justos, meu diletissimo Arcanjo Sao Miguel, desejando eu fazer parte do numero dos vossos devotos e servos, a vos hoje me consagro, me dou e me ofereco e ponho-me a mim proprio, a minha familia e tudo o que me pertence, debaixo da vossa poderossissima protecao.";

    private static final String ORACAO_FINAL = "Levanta-se Deus, pela intercessao da bem-aventurada Virgem Maria, Sao Miguel Arcanjo e todas as milicias celestes; sejam dispersos os seus inimigos e fujam de sua face todos os que o odeiam. Em nome do Pai, e do Filho e do Espirito Santo. Amem.";

    private static final String AUGUSTA_RAINHA = "Augusta Rainha dos ceus, soberana mestra dos Anjos, Vos que, desde o principio, recebestes de Deus o poder e a missao de esmagar a cabeca de Satanas, nos vo-lo pedimos humildemente, enviai vossas legioes celestes para que, sob vossas ordens, e por vosso poder, elas persigam os demonios, combatendo-os por toda a parte, reprimindo lhes a insolencia, e lancando-os no abismo. Quem e como Deus? O Mae de bondade e ternura, Vos sereis sempre o nosso amor e a nossa esperanca. O Mae divina, enviai os Santos Anjos para nos defenderem, e repeli para longe de nos o cruel inimigo. Santos Anjos e Arcanjos, defendei-nos e guardai-nos. Amem.";

    private static final String OFERENDA_FINAL = "Senhor Jesus, por intercessao de Sao Miguel Arcanjo, eu Vos ofereco este dia da Quaresma pedindo: pela minha conversao, pela minha familia, pela Igreja e pelo Santo Padre o Papa. Guardai-nos na fe e defendei-nos de todo mal. Amem.";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (3x)\n• Ave-Maria (3x)\n• Gloria ao Pai (3x)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Efesios 6, 10-11: Fortalecei-vos no Senhor e na forca do seu poder.",
            "Dia 2 - Salmo 91, 1-2: Tu que habitas sob a protecao do Altissimo.",
            "Dia 3 - 1 Pedro 5, 8-9: Sede sobrios e vigilantes.",
            "Dia 4 - Tiago 4, 7: Submetei-vos, pois, a Deus; resisti ao diabo.",
            "Dia 5 - Salmo 27, 1: O Senhor e minha luz e minha salvacao.",
            "Dia 6 - 2 Corintios 10, 3-4: As armas da nossa milicia nao sao carnais.",
            "Dia 7 - Salmo 34, 7: O anjo do Senhor acampa ao redor dos que o temem.",
            "Dia 8 - Romanos 8, 31: Se Deus e por nos, quem sera contra nos?",
            "Dia 9 - Apocalipse 12, 7-8: Houve entao uma batalha no ceu.",
            "Dia 10 - Deuteronomio 31, 6: Sede fortes e corajosos.",
            "Dia 11 - Salmo 23, 4: Ainda que eu atravesse o vale escuro.",
            "Dia 12 - Isaias 41, 10: Nao temas, porque eu estou contigo.",
            "Dia 13 - Filipenses 4, 13: Tudo posso naquele que me fortalece.",
            "Dia 14 - Salmo 18, 2-3: Eu te amo, Senhor, minha forca!",
            "Dia 15 - Hebreus 1, 14: Nao sao todos eles espiritos servidores?",
            "Dia 16 - Josue 1, 9: Se forte e corajoso.",
            "Dia 17 - Mateus 18, 10: Os seus anjos veem a face de meu Pai.",
            "Dia 18 - Salmo 62, 2-3: So em Deus a minha alma repousa.",
            "Dia 19 - 2 Tessalonicenses 3, 3: O Senhor e fiel; vos guardara do maligno.",
            "Dia 20 - Joao 16, 33: Coragem! Eu venci o mundo.",
            "Dia 21 - Apocalipse 19, 11: Vi o ceu aberto.",
            "Dia 22 - Salmo 46, 2-3: Deus e nosso refugio e nossa forca.",
            "Dia 23 - Isaias 54, 17: Toda arma forjada contra ti nao prosperara.",
            "Dia 24 - 1 Joao 4, 4: Maior e aquele que esta em vos.",
            "Dia 25 - Salmo 121, 7-8: O Senhor te guardara de todo o mal.",
            "Dia 26 - Apocalipse 20, 1-2: Vi descer do ceu um anjo.",
            "Dia 27 - Romanos 16, 20: O Deus da paz em breve esmagara Satanas.",
            "Dia 28 - Salmo 144, 1-2: Bendito seja o Senhor, meu rochedo.",
            "Dia 29 - Daniel 10, 12-13: Nao temas, Daniel.",
            "Dia 30 - Mateus 4, 10-11: Retira-te, Satanas.",
            "Dia 31 - Salmo 125, 2: Assim como os montes cercam Jerusalem.",
            "Dia 32 - Zacarias 4, 6: Nao por forca, nem por violencia.",
            "Dia 33 - Efesios 6, 17: Tomai a espada do Espirito.",
            "Dia 34 - Salmo 118, 105: Vossa palavra e lampada para meus pes.",
            "Dia 35 - Apocalipse 22, 12: Eis que venho em breve.",
            "Dia 36 - Isaias 40, 31: Os que esperam no Senhor renovam suas forcas.",
            "Dia 37 - Joao 1, 5: A luz brilha nas trevas.",
            "Dia 38 - Salmo 37, 5: Confia ao Senhor o teu caminho.",
            "Dia 39 - Hebreus 12, 1-2: Corramos com perseveranca.",
            "Dia 40 - Apocalipse 21, 3-4: Eis o tabernaculo de Deus com os homens."
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 9, 29);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? calcularDia(data, dataInicio) : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Sao Miguel (15/08 - 29/09).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Sao Miguel Arcanjo");
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
        return "Nao ha leitura definida para este dia.";
    }
}
