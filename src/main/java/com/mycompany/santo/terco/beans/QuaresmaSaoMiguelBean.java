/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class QuaresmaSaoMiguelBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDate dataInicio = LocalDate.of(LocalDate.now().getYear(), 8, 15); // 15 de agosto
    private LocalDate dataFim = LocalDate.of(LocalDate.now().getYear(), 9, 29);   // 29 de setembro
    private LocalDate dataSelecionada = LocalDate.now();

    private transient final String preparacaoDiaria = """
    • Tenha um cantinho de oração com a imagem de São Miguel (ou de um anjo).
    • Acenda uma vela em honra de São Miguel.
    • Faça o Sinal da Cruz e comece a oração.
    """;

    private transient final String oracaoDiariaInicial = """
                                                         S\u00e3o Miguel Arcanjo, defendei-nos no combate, sede nosso ref\u00fagio contra a maldade e as ciladas do dem\u00f4nio. Ordene-lhe Deus, instantemente o pedimos; e v\u00f3s, pr\u00edncipe da mil\u00edcia celeste, pela virtude divina, precipitai no inferno a Satan\u00e1s e aos outros esp\u00edritos malignos que andam pelo mundo para perder as almas. Am\u00e9m.""";

    private transient final String exameConsciencia = "Momento de silêncio: pense em algo que fez de errado no dia e peça: Senhor Jesus, misericórdia, perdoai-me...";

    private transient final String leituraBiblica = "Recomenda-se a leitura de passagens bíblicas que tratam do combate espiritual, da proteção divina e da intercessão dos anjos, como os livros de Daniel e Apocalipse. Porém, abaixo temos uma passagem para meditação";

    private transient final String ladainhaSaoMiguel = "Senhor, tende piedade de nós.\n"
            + "Jesus Cristo, tende piedade de nós.\n"
            + "Senhor, tende piedade de nós.\n"
            + "Jesus Cristo, ouvi-nos.\n"
            + "Jesus Cristo, atendei-nos.\n"
            + "Pai Celeste, que sois Deus, tende piedade de nós.\n"
            + "Filho Redentor do mundo, que sois Deus, tende piedade de nós.\n"
            + "\n"
            + "Espírito Santo, que sois Deus, tende piedade de nós.\n"
            + "Santíssima Trindade, que sois um só Deus, tende piedade de nós.\n"
            + "Santa Maria, Rainha dos Anjos, rogai por nós.\n"
            + "São Miguel, rogai por nós.\n"
            + "São Miguel, cheio da graça de Deus, rogai por nós.\n"
            + "São Miguel, perfeito adorador do Verbo Divino, rogai por nós.\n"
            + "São Miguel, coroado de honra e de glória, rogai por nós.\n"
            + "São Miguel, poderosíssimo Príncipe dos exércitos do Senhor, rogai por nós.\n"
            + "São Miguel, porta-estandarte da Santíssima Trindade, rogai por nós.\n"
            + "São Miguel, guardião do Paraíso, rogai por nós.\n"
            + "São Miguel, guia e consolador do povo israelita, rogai por nós.\n"
            + "São Miguel, esplendor e fortaleza da Igreja Militante, rogai por nós.\n"
            + "São Miguel, honra e alegria da Igreja Triunfante, rogai por nós.\n"
            + "São Miguel, luz dos Anjos, rogai por nós.\n"
            + "São Miguel, baluarte dos cristãos, rogai por nós.\n"
            + "São Miguel, força daqueles que combatem sob o estandarte da Cruz, rogai por nós.\n"
            + "São Miguel, luz e confiança das almas no último momento da vida, rogai por nós.\n"
            + "São Miguel, socorro muito certo, rogai por nós.\n"
            + "São Miguel, nosso auxílio em todas as adversidades, rogai por nós.\n"
            + "São Miguel, arauto da sentença eterna, rogai por nós.\n"
            + "São Miguel, consolador das almas que estão no purgatório, rogai por nós.\n"
            + "São Miguel, a quem o Senhor incumbiu de receber as almas depois da morte, rogai por nós.\n"
            + "São Miguel, nosso Príncipe, rogai por nós.\n"
            + "São Miguel, nosso advogado, rogai por nós.\n"
            + "Cordeiro de Deus, que tirais o pecado do mundo, perdoai-nos, Senhor.\n"
            + "Cordeiro de Deus, que tirais o pecado do mundo, ouvi-nos, Senhor.\n"
            + "Cordeiro de Deus, que tirais o pecado do mundo, tende piedade de nós, Senhor.\n"
            + "Rogai por nós, ó glorioso São Miguel,\n"
            + "Príncipe da Igreja de Cristo,\n"
            + "para que sejamos dignos de suas promessas.";

    private transient final String consagracaoSaoMiguel = "Ó Príncipe nobilíssimo dos Anjos, valoroso guerreiro do Altíssimo, zeloso defensor  da glória do Senhor, terror dos espíritos rebeldes, amor e delícia de todos os  Anjos justos, meu diletíssimo Arcanjo São Miguel, desejando eu fazer parte do  número dos vossos devotos e servos, a vós hoje me consagro, me dou e me  ofereço e ponho-me a mim próprio, a minha família e tudo o que me pertence,  debaixo da vossa poderosíssima proteção. \n" +
"É pequena a oferta do meu serviço, sendo como sou um miserável pecador, mas  vós engrandecereis o afeto do meu coração; recordai-vos que de hoje em diante  estou debaixo do vosso sustento e deveis assistir-me em toda a minha vida e  obter-me o perdão dos meus muitos e graves pecados, a graça de amar a Deus  de todo coração, ao meu querido Salvador Jesus Cristo e a minha Mãe Maria  Santíssima. \n" +
"Obtende-me aqueles auxílios que me são necessários para obter a coroa da  eterna glória. Defendei-me dos inimigos da alma, especialmente na hora da  morte. Vinde, ó príncipe gloriosíssimo, assistir-me na última luta e com a vossa  arma poderosa lançai para longe, precipitando nos abismos do inferno, aquele  anjo quebrador de promessas e soberbo que um dia prostrastes no combate no  Céu.\n" +
"São Miguel Arcanjo, defendei-nos no combate para que não pereçamos no  supremo juízo.";

    private transient final String oracaoFinal = """
                                                 Levanta-se Deus, pela intercess\u00e3o da bem-aventurada Virgem Maria, S\u00e3o Miguel Arcanjo e todas as mil\u00edcias celestes; sejam dispersos os seus inimigos e fujam de sua face todos os que o odeiam. Em nome do Pai, e do Filho e do Esp\u00edrito Santo. Am\u00e9m.""";

    private transient final String oracaoAugustaRainha = """
                                                         Augusta Rainha dos c\u00e9us, soberana mestra dos Anjos, V\u00f3s que, desde o princ\u00edpio, recebestes de Deus o poder e a miss\u00e3o de esmagar a cabe\u00e7a de Satan\u00e1s, n\u00f3s vo-lo pedimos humildemente, enviai vossas legi\u00f5es celestes para que, sob vossas ordens, e por vosso poder, elas persigam os dem\u00f4nios, combatendo-os por toda a parte, reprimindo lhes a insol\u00eancia, e lan\u00e7ando-os no abismo. Quem \u00e9 como Deus? \u00d3 M\u00e3e de bondade e ternura, V\u00f3s sereis sempre o nosso amor e a nossa esperan\u00e7a. \u00d3 M\u00e3e divina, enviai os Santos Anjos para nos defenderem, e repeli para longe de n\u00f3s o cruel inimigo. Santos Anjos e Arcanjos, defendei-nos e guardai-nos. Am\u00e9m.""";

    private transient final String oferendaFinal = """
                                                   Senhor Jesus, por intercess\u00e3o de S\u00e3o Miguel Arcanjo, eu Vos ofere\u00e7o este dia da Quaresma pedindo: pela minha convers\u00e3o, pela minha fam\u00edlia, pela Igreja e pelo Santo Padre o Papa. Guardai-nos na f\u00e9 e defendei-nos de todo mal. Am\u00e9m.""";

    private transient final String oracoesFinais = """
                                                   \u2022 Pai-Nosso (3x)
                                                   \u2022 Ave-Maria (3x)
                                                   \u2022 Gl\u00f3ria ao Pai (3x)""";

    public LocalDate getDataSelecionada() {
        return dataSelecionada;
    }

    public void setDataSelecionada(LocalDate dataSelecionada) {
        this.dataSelecionada = dataSelecionada;
    }

    // Retorna o dia da Quaresma com base na data
    public int getDiaQuaresma() {
        if (dataSelecionada.isBefore(dataInicio) || dataSelecionada.isAfter(dataFim)) {
            return -1; // fora do período
        }
        return (int) ChronoUnit.DAYS.between(dataInicio, dataSelecionada) + 1;
    }

    public String getLeituraDoDia() {
        int dia = getDiaQuaresma();
        if (dia == -1) {
            return "A data selecionada não está dentro da Quaresma de São Miguel (15/08 - 29/09).";
        }
        if (dia >= 1 && dia <= leituras.size()) {
            return leituras.get(dia - 1); // -1 porque a lista começa no índice 0
        }
        return "Não há leitura definida para este dia.";
    }

    public String getMensagemDia() {
        int dia = getDiaQuaresma();
        if (dia == -1) {
            return "A data selecionada não está dentro da Quaresma de São Miguel (15/08 - 29/09).";
        }
        return "Dia " + dia + " da Quaresma de São Miguel Arcanjo";
    }

    private final List<String> leituras = List.of(
            // Dias 1–10
            "Dia 1 - Efésios 6, 10-11: Fortalecei-vos no Senhor e na força do seu poder. Revesti-vos da armadura de Deus, para que possais resistir às ciladas do diabo.",
            "Dia 2 - Salmo 91, 1-2: Tu que habitas sob a proteção do Altíssimo e moras à sombra do Onipotente, dize ao Senhor: Sois meu refúgio e minha cidadela, meu Deus em quem confio.",
            "Dia 3 - 1 Pedro 5, 8-9: Sede sóbrios e vigilantes. O diabo, vosso adversário, anda ao redor como leão que ruge, procurando a quem devorar. Resistile firmes na fé.",
            "Dia 4 - Tiago 4, 7: Submetei-vos, pois, a Deus; resisti ao diabo, e ele fugirá de vós.",
            "Dia 5 - Salmo 27, 1: O Senhor é minha luz e minha salvação: a quem temerei? O Senhor é a fortaleza da minha vida: de quem me atemorizarei?",
            "Dia 6 - 2 Coríntios 10, 3-4: Pois, embora vivamos na carne, não militamos segundo a carne. Porque as armas da nossa milícia não são carnais, mas poderosas em Deus para destruir fortalezas.",
            "Dia 7 - Salmo 34, 7: O anjo do Senhor acampa ao redor dos que o temem e os salva.",
            "Dia 8 - Romanos 8, 31: Se Deus é por nós, quem será contra nós?",
            "Dia 9 - Apocalipse 12, 7-8: Houve então uma batalha no céu: Miguel e seus anjos lutaram contra o dragão. O dragão batalhou, e também os seus anjos, mas não prevaleceram.",
            "Dia 10 - Deuteronômio 31, 6: Sede fortes e corajosos, não temais nem vos apavoreis diante deles, porque o Senhor vosso Deus é quem vai convosco; não vos deixará nem vos abandonará.",
            // Dias 11–20
            "Dia 11 - Salmo 23, 4: Ainda que eu atravesse o vale escuro, nada temerei, pois estais comigo; vosso cajado e vosso bastão me dão segurança.",
            "Dia 12 - Isaías 41, 10: Não temas, porque eu estou contigo; não te assustes, porque eu sou o teu Deus. Eu te fortaleço, venho em teu auxílio, eu te sustento com minha destra vitoriosa.",
            "Dia 13 - Filipenses 4, 13: Tudo posso naquele que me fortalece.",
            "Dia 14 - Salmo 18, 2-3: Eu te amo, Senhor, minha força! O Senhor é minha rocha, minha fortaleza e meu libertador; meu Deus é meu rochedo em que me refugio.",
            "Dia 15 - Hebreus 1, 14: Não são todos eles espíritos servidores, enviados para serviço em favor dos que hão de herdar a salvação?",
            "Dia 16 - Josué 1, 9: Não te ordenei eu? Sê forte e corajoso. Não temas nem te assustes, porque o Senhor teu Deus está contigo por onde quer que vás.",
            "Dia 17 - Mateus 18, 10: Vede, não desprezeis nenhum destes pequeninos, porque eu vos digo que os seus anjos nos céus veem continuamente a face de meu Pai que está nos céus.",
            "Dia 18 - Salmo 62, 2-3: Só em Deus a minha alma repousa tranquila; dele me vem a salvação. Só ele é meu rochedo e minha salvação, minha cidadela: não vacilarei jamais.",
            "Dia 19 - 2 Tessalonicenses 3, 3: Mas o Senhor é fiel; ele vos confirmará e guardará do maligno.",
            "Dia 20 - João 16, 33: Disse-vos estas coisas para que tenhais paz em mim. No mundo haveis de ter aflições. Coragem! Eu venci o mundo.",
            // Dias 21–30
            "Dia 21 - Apocalipse 19, 11: Vi o céu aberto, e eis um cavalo branco; o seu cavaleiro chama-se Fiel e Verdadeiro, e julga e combate com justiça.",
            "Dia 22 - Salmo 46, 2-3: Deus é nosso refúgio e nossa força, socorro sempre presente na adversidade. Por isso, não temeremos ainda que a terra trema.",
            "Dia 23 - Isaías 54, 17: Toda arma forjada contra ti não prosperará; e toda língua que ousar contra ti no juízo, tu a condenarás.",
            "Dia 24 - 1 João 4, 4: Vós sois de Deus, filhinhos, e tendes vencido, porque maior é aquele que está em vós do que aquele que está no mundo.",
            "Dia 25 - Salmo 121, 7-8: O Senhor te guardará de todo o mal, ele guardará a tua alma. O Senhor guardará a tua saída e a tua entrada, desde agora e para sempre.",
            "Dia 26 - Apocalipse 20, 1-2: Vi descer do céu um anjo que tinha a chave do abismo e uma grande corrente na mão. Ele agarrou o dragão, a antiga serpente, que é o Diabo e Satanás, e o acorrentou por mil anos.",
            "Dia 27 - Romanos 16, 20: O Deus da paz em breve esmagará Satanás debaixo dos vossos pés. A graça de nosso Senhor Jesus esteja convosco.",
            "Dia 28 - Salmo 144, 1-2: Bendito seja o Senhor, meu rochedo, que adestrou minhas mãos para a luta e meus dedos para a batalha.",
            "Dia 29 - Daniel 10, 12-13: Não temas, Daniel, porque desde o primeiro dia em que aplicaste o coração a compreender e a humilhar-te diante de teu Deus, foram ouvidas as tuas palavras, e por causa delas é que eu vim.",
            "Dia 30 - Mateus 4, 10-11: Retira-te, Satanás, pois está escrito: ‘Adorarás o Senhor teu Deus e só a ele servirás’. Então o diabo o deixou, e os anjos se aproximaram para servi-lo.",
            // Dias 31–40
            "Dia 31 - Salmo 125, 2: Assim como os montes cercam Jerusalém, assim o Senhor protege o seu povo desde agora e para sempre.",
            "Dia 32 - Zacarias 4, 6: Não por força, nem por violência, mas pelo meu Espírito, diz o Senhor dos exércitos.",
            "Dia 33 - Efésios 6, 17: Tomai também o capacete da salvação e a espada do Espírito, que é a Palavra de Deus.",
            "Dia 34 - Salmo 118, 105: Vossa palavra é lâmpada para os meus pés e luz para o meu caminho.",
            "Dia 35 - Apocalipse 22, 12: Eis que venho em breve, e comigo está a recompensa que tenho para dar a cada um segundo as suas obras.",
            "Dia 36 - Isaías 40, 31: Mas os que esperam no Senhor renovam suas forças, sobem com asas como águias, correm e não se cansam, caminham e não se fatigam.",
            "Dia 37 - João 1, 5: A luz brilha nas trevas, e as trevas não a venceram.",
            "Dia 38 - Salmo 37, 5: Confia ao Senhor o teu caminho, espera nele, e ele agirá.",
            "Dia 39 - Hebreus 12, 1-2: Corramos com perseverança na corrida que nos é proposta, com os olhos fixos em Jesus, autor e consumador da fé.",
            "Dia 40 - Apocalipse 21, 3-4: Eis o tabernáculo de Deus com os homens. Ele habitará com eles, e eles serão o seu povo. E o próprio Deus estará com eles. Ele enxugará toda lágrima de seus olhos."
    );

}
