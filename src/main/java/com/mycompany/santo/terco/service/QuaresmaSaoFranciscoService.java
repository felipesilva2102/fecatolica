package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuaresmaSaoFranciscoService {

    private static final String PREPARACAO_DIARIA = """
            • Faça o Sinal da Cruz.
            • Pratique um ato de desprendimento: doe algo, sirva alguem.
            • Entre em silêncio diante do Crucifixo.""";

    private static final String ORACAO_PAZ = """
            Senhor, fazei de mim um instrumento da Vossa paz.
            Onde houver ódio, que eu leve o amor.
            Onde houver ofensa, que eu leve o perdão.
            Onde houver discórdia, que eu leve a união.
            Onde houver duvida, que eu leve a fé.
            Onde houver erro, que eu leve a verdade.
            Onde houver desespero, que eu leve a esperança.
            Onde houver tristeza, que eu leve a alegria.
            Onde houver trevas, que eu leve a luz.

            O Mestre, fazei que eu procure mais
            consolar que ser consolado,
            compreender que ser compreendido,
            amar que ser amado.
            Pois e dando que se recebe,
            e perdoando que se e perdoado,
            e e morrendo que se vive para a vida eterna. Amém.""";

    private static final String CANTICO_CRIATURAS = """
            Altissimo, onipotente, bom Senhor,
            a Vos o louvor, a glória, a honra e toda bênção.
            Louvado sejais, meu Senhor, com todas as Vossas criaturas,
            especialmente o Irmao Sol, que nos da o dia e por ele nos iluminais.
            Louvado sejais, meu Senhor, pela Irma Lua e as Estrelas,
            que no céu formastes, claras e preciosas e belas.
            Louvado sejais, meu Senhor, pelo Irmao Vento,
            pelo ar e nuvens, pelo céu sereno e todo o tempo.
            Louvado sejais, meu Senhor, pela Irma Agua,
            tao util e humilde, preciosa e casta.
            Louvado sejais, meu Senhor, pelo Irmao Fogo,
            pelo qual iluminais a noite, e ele e belo e alegre, vigoroso e forte.
            Louvado sejais, meu Senhor, pela nossa Irma, a Mãe Terra,
            que nos sustenta e governa, e produz diversos frutos, flores e ervas.
            Louvado sejais, meu Senhor, pelos que perdoam por amor de Vos
            e suportam enfermidades e tribulacoes.
            Bem-aventurados os que sustentam em paz, porque por Vos, Altissimo, serao coroados.
            Louvado sejais, meu Senhor, pela nossa Irma, a Morte corporal,
            da qual nenhum homem vivente pode escapar.
            Louvai e bendizei ao meu Senhor, e dai-Lhe graças,
            e servi-O com grande humildade. Amém.""";

    private static final String ORACAO_CRUCIFIXO = """
            Altissimo e glorioso Deus,
            iluminai as trevas do meu coração
            e dai-me a fé reta, a esperança certa
            e a caridade perfeita,
            senso e conhecimento, Senhor,
            para que eu cumpra a Vossa santa e veridica vontade. Amém.
            (Oração de São Francisco diante do Crucifixo de São Damiao)""";

    private static final String BENCAO_FRANCISCO = """
            O Senhor te abencoe e te guarde.
            Mostre-te a Sua face e tenha misericórdia de ti.
            Volte para ti o Seu olhar e te de a paz.
            O Senhor te abencoe!
            (Bencao de São Francisco a Frei Leao)""";

    private static final String ORACAO_FINAL = """
            O glorioso São Francisco, que durante toda a vossa vida amastes a pobreza,
            a humildade e a simplicidade, obtende-nos a graça de seguir os passos de Cristo
            com a mesma alegria e desapego. Fazei que amemos a natureza como irma
            e que nos tornemos instrumentos da paz de Deus no mundo. Amém.""";

    private static final String JACULATORIA = "Meu Deus e meu Tudo!";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (3x)\n• Glória ao Pai (1x)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Mateus 19,21: Se queres ser perfeito, vai, vende tudo e segue-Me.",
            "Dia 2 - Mateus 5,3: Bem-aventurados os pobres de espírito.",
            "Dia 3 - Mateus 6,19-21: Não acumuleis tesouros na terra.",
            "Dia 4 - Mateus 10,7-10: De graça recebestes, de graça dai.",
            "Dia 5 - Marcos 8,34-35: Se alguem quer vir apos Mim, tome a sua cruz.",
            "Dia 6 - Lucas 6,20-23: Bem-aventurados os que agora tendes fome.",
            "Dia 7 - Lucas 9,57-62: As raposas tem tocas, mas o Filho do homem...",
            "Dia 8 - Lucas 10,1-9: Não leveis bolsa, nem saco, nem sandalias.",
            "Dia 9 - Lucas 12,22-31: Olhai os lirios do campo.",
            "Dia 10 - Lucas 14,33: Quem não renuncia a tudo não pode ser meu discipulo.",
            "Dia 11 - João 12,24-26: Se o grao de trigo não morrer...",
            "Dia 12 - João 13,12-17: Dei-vos o exemplo para que facais como Eu fiz.",
            "Dia 13 - Romanos 12,1-2: Oferecei os vossos corpos como sacrificio vivo.",
            "Dia 14 - 1Corintios 1,26-31: Deus escolheu o que e fraco.",
            "Dia 15 - 2Corintios 6,10: Como pobres, mas enriquecendo a muitos.",
            "Dia 16 - 2Corintios 8,9: Sendo rico, fez-se pobre por vos.",
            "Dia 17 - Gálatas 6,14: Quanto a mim, gloriar-me-ei na Cruz.",
            "Dia 18 - Filipenses 2,5-11: Humilhou-se, fazendo-se obediente até a morte.",
            "Dia 19 - Filipenses 3,7-11: Considero tudo como perda por causa de Cristo.",
            "Dia 20 - Colossenses 3,1-4: Buscai as coisas do alto.",
            "Dia 21 - 1Timoteo 6,6-10: A piedade com o contentamento e grande lucro.",
            "Dia 22 - Tiago 2,5: Deus escolheu os pobres para serem ricos na fé.",
            "Dia 23 - 1Pedro 4,10-11: Cada um coloque a servico dos outros o dom recebido.",
            "Dia 24 - 1Joao 3,16-18: Amemos com obras e de verdade.",
            "Dia 25 - Salmo 104,24: Quao numerosas são as Vossas obras, Senhor!",
            "Dia 26 - Salmo 8,4-10: Que e o homem para dele Vos lembrardes?",
            "Dia 27 - Salmo 19,2-5: Os ceus proclamam a glória de Deus.",
            "Dia 28 - Salmo 148: Louvai ao Senhor, sol e lua; louvai-O, astros de luz.",
            "Dia 29 - Eclesiastes 3,1-8: Para tudo há um tempo debaixo do céu.",
            "Dia 30 - Isaías 11,6-8: O lobo habitará com o cordeiro.",
            "Dia 31 - Isaías 58,6-9: O jejum que agrada a Deus.",
            "Dia 32 - Isaías 61,1-3: Enviou-me para anunciar a boa nova aos pobres.",
            "Dia 33 - Miquéias 6,8: O que o Senhor te pede: praticar a justiça.",
            "Dia 34 - Sofonias 3,12: Deixarei no meio de ti um povo pobre e humilde.",
            "Dia 35 - Mateus 5,9: Bem-aventurados os pacificadores.",
            "Dia 36 - Mateus 5,43-48: Amai os vossos inimigos.",
            "Dia 37 - Mateus 25,35-40: Tive fome e me destes de comer.",
            "Dia 38 - Lucas 4,18-19: Enviou-me para proclamar a libertacao aos cativos.",
            "Dia 39 - João 15,12-17: Ninguem tem maior amor do que aquele que da a vida.",
            "Dia 40 - Apocalipse 21,1-4: Vi um novo céu e uma nova terra."
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 26);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 4);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

                if (!dentro) {
                        result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de São Francisco (26/08 - 04/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de São Francisco de Assis");
        }

        result.put("diaQuaresma", dia);
        result.put("preparacaoDiaria", PREPARACAO_DIARIA);
        result.put("oracaoPaz", ORACAO_PAZ);
        result.put("canticoCriaturas", CANTICO_CRIATURAS);
        result.put("oracaoCrucifixo", ORACAO_CRUCIFIXO);
        result.put("leituraDoDia", getLeituraDoDia(dia));
        result.put("bencaoFrancisco", BENCAO_FRANCISCO);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        result.put("oracoesFinais", ORACOES_FINAIS);
        return result;
    }

    private String getLeituraDoDia(int dia) {
                if (dia == -1) return "";
                if (dia >= 1 && dia <= LEITURAS.size()) return LEITURAS.get(dia - 1);
                return "Não há leitura definida para este dia.";
    }
}
