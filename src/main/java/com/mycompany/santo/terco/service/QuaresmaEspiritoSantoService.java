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
            • Faça o Sinal da Cruz.
            • Acenda uma vela vermelha (cor do Espírito Santo).
            • Permaneça em silêncio por um instante pedindo a presença do Espírito.""";

    private static final String VENI_CREATOR = """
            Vinde, Espírito Criador,
            Visitai as almas dos Vossos,
            Enchei de graça celestial
            Os corações que Vos criastes.

            Vos sois chamado o Consolador,
            Dom do Deus Altíssimo,
            Fonte viva, fogo, caridade
            E unção espiritual.

            Vos dais os sete sagrados dons,
            O dedo da mão de Deus,
            Prometido solenemente pelo Pai,
            Que enriqueceis as bocas com a Palavra.

            Acendei a luz nos sentidos,
            Derramai o amor nos corações,
            Fortalecei as fraquezas do corpo
            Com o vigor perene da Vossa graça.

            Afastai de nós o inimigo,
            Dai-nos sem demora a paz,
            Sendo Vos o nosso guia,
            Evitemos todo o mal.

            Por Vós conheçamos o Pai
            E também o Filho,
            E em Vos, Espírito de ambos,
            Creiamos em todo o tempo. Amém.""";

    private static final String ORACAO_AOS_SETE_DONS = """
            Vinde, Espírito de Sabedoria, e ensinai-nos a apreciar as coisas do Céu.
            Vinde, Espírito de Entendimento, e iluminai a nossa mente.
            Vinde, Espírito de Conselho, e guiai-nos pelo caminho da santidade.
            Vinde, Espírito de Fortaleza, e dai-nos força contra as tentações.
            Vinde, Espírito de Ciência, e ensinai-nos a discernir o bem do mal.
            Vinde, Espírito de Piedade, e concedei-nos a devoção filial.
            Vinde, Espírito de Temor de Deus, e preservai-nos de todo pecado.
            Amém.""";

    private static final String SEQUENCIA = """
            Vinde, Espírito Santo, enchei os corações dos Vossos fiéis
            e acendei neles o fogo do Vosso Amor.
            Enviai o Vosso Espírito e tudo será criado,
            e renovareis a face da terra.

            Oremos: Ó Deus, que instruistes os corações dos Vossos fiéis
            com a luz do Espírito Santo, concedei-nos que,
            pelo mesmo Espírito, apreciemos o que é reto
            e gozemos sempre das Suas consolações.
            Por Cristo, nosso Senhor. Amém.""";

    private static final String ORACAO_FINAL = """
            Espírito Santo, alma da minha alma, eu Vos adoro.
            Iluminai-me, guiai-me, fortalecei-me, consolai-me.
            Dizei-me o que devo fazer, dai-me as Vossas ordens.
            Prometo submeter-me a tudo o que desejais de mim
            e aceitar tudo o que permitirdes que me aconteça.
            Fazei-me apenas conhecer a Vossa vontade. Amém.
            (Cardeal Mercier)""";

    private static final String FRUTOS_ESPIRITO = """
            Os frutos do Espírito Santo são: caridade, alegria, paz, paciência,
            benignidade, bondade, longanimidade, mansidão, fé, modéstia,
            continência e castidade (Gl 5,22-23).""";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (1x)\n• Glória ao Pai (7x, em honra dos 7 dons)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Gênesis 1,2: O Espírito de Deus pairava sobre as águas.",
            "Dia 2 - Isaías 11,2: Sobre Ele repousará o Espírito do Senhor.",
            "Dia 3 - Joel 3,1-2: Derramarei o Meu Espírito sobre toda criatura.",
            "Dia 4 - Ezequiel 36,26-27: Porei em vos um espírito novo.",
            "Dia 5 - Sabedoria 1,7: O Espírito do Senhor enche o universo.",
            "Dia 6 - Isaías 61,1: O Espírito do Senhor está sobre mim.",
            "Dia 7 - Lucas 1,35: O Espírito Santo descerá sobre ti.",
            "Dia 8 - Lucas 4,1: Jesus, cheio do Espírito Santo, voltou do Jordão.",
            "Dia 9 - João 3,5-8: Quem não nascer da água e do Espírito...",
            "Dia 10 - João 7,37-39: Rios de água viva correrão do seu interior.",
            "Dia 11 - João 14,16-17: Eu rogarei ao Pai e Ele vos dará outro Consolador.",
            "Dia 12 - João 14,26: O Espírito Santo vos ensinará todas as coisas.",
            "Dia 13 - João 15,26: O Espírito da Verdade que procede do Pai.",
            "Dia 14 - João 16,7-8: Se Eu não for, o Consolador não virá.",
            "Dia 15 - João 16,13: O Espírito da Verdade vos guiará a toda verdade.",
            "Dia 16 - Atos 1,8: Recebereis a força do Espírito Santo.",
            "Dia 17 - Atos 2,1-4: Todos ficaram cheios do Espírito Santo.",
            "Dia 18 - Atos 2,14-21: São Pedro, cheio do Espírito, pregou.",
            "Dia 19 - Atos 4,31: Todos ficaram cheios do Espírito Santo e anunciavam a Palavra.",
            "Dia 20 - Atos 8,14-17: Impuseram-lhes as mãos e receberam o Espírito.",
            "Dia 21 - Atos 10,44-48: O Espírito Santo desceu sobre todos os que ouviam.",
            "Dia 22 - Romanos 5,5: O amor de Deus foi derramado pelo Espírito.",
            "Dia 23 - Romanos 8,9: Se alguém não tem o Espírito de Cristo...",
            "Dia 24 - Romanos 8,14-16: Os que são guiados pelo Espírito são filhos de Deus.",
            "Dia 25 - Romanos 8,26-27: O Espírito intercede por nós com gemidos inefáveis.",
            "Dia 26 - 1Coríntios 2,10-12: O Espírito sonda todas as coisas, até as profundezas de Deus.",
            "Dia 27 - 1Coríntios 3,16: Vós sois templo de Deus e o Espírito habita em vós.",
            "Dia 28 - 1Coríntios 12,4-7: Há diversidade de dons, mas o Espírito é o mesmo.",
            "Dia 29 - 1Coríntios 12,13: Fomos todos batizados num só Espírito.",
            "Dia 30 - 2Coríntios 3,17: Onde está o Espírito do Senhor, aí há liberdade.",
            "Dia 31 - Gálatas 5,16-18: Caminhai no Espírito.",
            "Dia 32 - Gálatas 5,22-23: O fruto do Espírito é caridade, alegria, paz...",
            "Dia 33 - Efésios 1,13-14: Fostes selados com o Espírito da Promessa.",
            "Dia 34 - Efésios 2,18: Por Ele temos acesso ao Pai num só Espírito.",
            "Dia 35 - Efésios 4,3-4: Há um só Espírito, um só Corpo.",
            "Dia 36 - Efésios 4,30: Não entristeçais o Espírito Santo de Deus.",
            "Dia 37 - Efésios 5,18-20: Enchei-vos do Espírito.",
            "Dia 38 - 1Tessalonicenses 5,19: Não extingais o Espírito.",
            "Dia 39 - 2Timóteo 1,6-7: Deus não nos deu espírito de timidez.",
            "Dia 40 - Apocalipse 22,17: O Espírito e a Esposa dizem: Vem!"
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
                        result.put("mensagemDia", "A data selecionada não está dentro da Quaresma do Espírito Santo ("
                    + dataInicio.getDayOfMonth() + "/" + String.format("%02d", dataInicio.getMonthValue()) + " - "
                    + pentecostes.getDayOfMonth() + "/" + String.format("%02d", pentecostes.getMonthValue()) + ").");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma do Espírito Santo");
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
                return "Não há leitura definida para este dia.";
    }
}
