package com.mycompany.santo.terco.service;

import com.mycompany.santo.terco.util.CalendarioLiturgicoUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuaresmaEspiritoSantoService {

    private static final String PREPARACAO_DIARIA = """
            • Faca o Sinal da Cruz.
            • Acenda uma vela vermelha (cor do Espirito Santo).
            • Permaneca em silencio por um instante pedindo a presenca do Espirito.""";

    private static final String VENI_CREATOR = """
            Vinde, Espirito Criador,
            Visitai as almas dos Vossos,
            Enchei de graca celestial
            Os coracoes que Vos criastes.

            Vos sois chamado o Consolador,
            Dom do Deus Altissimo,
            Fonte viva, fogo, caridade
            E uncao espiritual.

            Vos dais os sete sagrados dons,
            O dedo da mao de Deus,
            Prometido solenemente pelo Pai,
            Que enriqueceis as bocas com a Palavra.

            Acendei a luz nos sentidos,
            Derramai o amor nos coracoes,
            Fortalecei as fraquezas do corpo
            Com o vigor perene da Vossa graca.

            Afastai de nos o inimigo,
            Dai-nos sem demora a paz,
            Sendo Vos o nosso guia,
            Evitemos todo o mal.

            Por Vos conhecamos o Pai
            E tambem o Filho,
            E em Vos, Espirito de ambos,
            Creiamos em todo o tempo. Amem.""";

    private static final String ORACAO_AOS_SETE_DONS = """
            Vinde, Espirito de Sabedoria, e ensinai-nos a apreciar as coisas do Ceu.
            Vinde, Espirito de Entendimento, e iluminai a nossa mente.
            Vinde, Espirito de Conselho, e guiai-nos pelo caminho da santidade.
            Vinde, Espirito de Fortaleza, e dai-nos forca contra as tentacoes.
            Vinde, Espirito de Ciencia, e ensinai-nos a discernir o bem do mal.
            Vinde, Espirito de Piedade, e concedei-nos a devocao filial.
            Vinde, Espirito de Temor de Deus, e preservai-nos de todo pecado.
            Amem.""";

    private static final String SEQUENCIA = """
            Vinde, Espirito Santo, enchei os coracoes dos Vossos fieis
            e acendei neles o fogo do Vosso Amor.
            Enviai o Vosso Espirito e tudo sera criado,
            e renovareis a face da terra.

            Oremos: O Deus, que instruistes os coracoes dos Vossos fieis
            com a luz do Espirito Santo, concedei-nos que,
            pelo mesmo Espirito, apreciemos o que e reto
            e gozemos sempre das Suas consolacoes.
            Por Cristo, nosso Senhor. Amem.""";

    private static final String ORACAO_FINAL = """
            Espirito Santo, alma da minha alma, eu Vos adoro.
            Iluminai-me, guiai-me, fortalecei-me, consolai-me.
            Dizei-me o que devo fazer, dai-me as Vossas ordens.
            Prometo submeter-me a tudo o que desejais de mim
            e aceitar tudo o que permitirdes que me aconteca.
            Fazei-me apenas conhecer a Vossa vontade. Amem.
            (Cardeal Mercier)""";

    private static final String FRUTOS_ESPIRITO = """
            Os frutos do Espirito Santo sao: caridade, alegria, paz, paciencia,
            benignidade, bondade, longanimidade, mansidao, fe, modestia,
            continencia e castidade (Gl 5,22-23).""";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (1x)\n• Gloria ao Pai (7x, em honra dos 7 dons)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Genesis 1,2: O Espirito de Deus pairava sobre as aguas.",
            "Dia 2 - Isaias 11,2: Sobre Ele repousara o Espirito do Senhor.",
            "Dia 3 - Joel 3,1-2: Derramarei o Meu Espirito sobre toda criatura.",
            "Dia 4 - Ezequiel 36,26-27: Porei em vos um espirito novo.",
            "Dia 5 - Sabedoria 1,7: O Espirito do Senhor enche o universo.",
            "Dia 6 - Isaias 61,1: O Espirito do Senhor esta sobre mim.",
            "Dia 7 - Lucas 1,35: O Espirito Santo descera sobre ti.",
            "Dia 8 - Lucas 4,1: Jesus, cheio do Espirito Santo, voltou do Jordao.",
            "Dia 9 - Joao 3,5-8: Quem nao nascer da agua e do Espirito...",
            "Dia 10 - Joao 7,37-39: Rios de agua viva correrao do seu interior.",
            "Dia 11 - Joao 14,16-17: Eu rogarei ao Pai e Ele vos dara outro Consolador.",
            "Dia 12 - Joao 14,26: O Espirito Santo vos ensinara todas as coisas.",
            "Dia 13 - Joao 15,26: O Espirito da Verdade que procede do Pai.",
            "Dia 14 - Joao 16,7-8: Se Eu nao for, o Consolador nao vira.",
            "Dia 15 - Joao 16,13: O Espirito da Verdade vos guiara a toda verdade.",
            "Dia 16 - Atos 1,8: Recebereis a forca do Espirito Santo.",
            "Dia 17 - Atos 2,1-4: Todos ficaram cheios do Espirito Santo.",
            "Dia 18 - Atos 2,14-21: Sao Pedro, cheio do Espirito, pregou.",
            "Dia 19 - Atos 4,31: Todos ficaram cheios do Espirito Santo e anunciavam a Palavra.",
            "Dia 20 - Atos 8,14-17: Impuseram-lhes as maos e receberam o Espirito.",
            "Dia 21 - Atos 10,44-48: O Espirito Santo desceu sobre todos os que ouviam.",
            "Dia 22 - Romanos 5,5: O amor de Deus foi derramado pelo Espirito.",
            "Dia 23 - Romanos 8,9: Se alguem nao tem o Espirito de Cristo...",
            "Dia 24 - Romanos 8,14-16: Os que sao guiados pelo Espirito sao filhos de Deus.",
            "Dia 25 - Romanos 8,26-27: O Espirito intercede por nos com gemidos inefaveis.",
            "Dia 26 - 1Corintios 2,10-12: O Espirito sonda todas as coisas, ate as profundezas de Deus.",
            "Dia 27 - 1Corintios 3,16: Vos sois templo de Deus e o Espirito habita em vos.",
            "Dia 28 - 1Corintios 12,4-7: Ha diversidade de dons, mas o Espirito e o mesmo.",
            "Dia 29 - 1Corintios 12,13: Fomos todos batizados num so Espirito.",
            "Dia 30 - 2Corintios 3,17: Onde esta o Espirito do Senhor, ai ha liberdade.",
            "Dia 31 - Galatas 5,16-18: Caminhai no Espirito.",
            "Dia 32 - Galatas 5,22-23: O fruto do Espirito e caridade, alegria, paz...",
            "Dia 33 - Efesios 1,13-14: Fostes selados com o Espirito da Promessa.",
            "Dia 34 - Efesios 2,18: Por Ele temos acesso ao Pai num so Espirito.",
            "Dia 35 - Efesios 4,3-4: Ha um so Espirito, um so Corpo.",
            "Dia 36 - Efesios 4,30: Nao entristeçais o Espirito Santo de Deus.",
            "Dia 37 - Efesios 5,18-20: Enchei-vos do Espirito.",
            "Dia 38 - 1Tessalonicenses 5,19: Nao extingais o Espirito.",
            "Dia 39 - 2Timoteo 1,6-7: Deus nao nos deu espirito de timidez.",
            "Dia 40 - Apocalipse 22,17: O Espirito e a Esposa dizem: Vem!"
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate pentecostes = CalendarioLiturgicoUtils.pentecostes(data.getYear());
        LocalDate dataInicio = pentecostes.minusDays(39);
        LocalDate dataFim = pentecostes;

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma do Espirito Santo ("
                    + dataInicio.getDayOfMonth() + "/" + String.format("%02d", dataInicio.getMonthValue()) + " - "
                    + pentecostes.getDayOfMonth() + "/" + String.format("%02d", pentecostes.getMonthValue()) + ").");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma do Espirito Santo");
        }

        result.put("diaQuaresma", dia);
        result.put("preparacaoDiaria", PREPARACAO_DIARIA);
        result.put("veniCreator", VENI_CREATOR);
        result.put("oracaoAosSeteDons", ORACAO_AOS_SETE_DONS);
        result.put("sequencia", SEQUENCIA);
        result.put("leituraDoDia", getLeituraDoDia(dia));
        result.put("frutosEspirito", FRUTOS_ESPIRITO);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("oracoesFinais", ORACOES_FINAIS);
        return result;
    }

    private String getLeituraDoDia(int dia) {
        if (dia == -1) return "";
        if (dia >= 1 && dia <= LEITURAS.size()) return LEITURAS.get(dia - 1);
        return "Nao ha leitura definida para este dia.";
    }
}
