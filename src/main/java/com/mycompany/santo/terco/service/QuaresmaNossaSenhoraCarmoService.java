package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuaresmaNossaSenhoraCarmoService {

    private static final String PREPARACAO_DIARIA = """
            • Faca o Sinal da Cruz.
            • Se possivel, vista ou segure o Escapulario de Nossa Senhora do Carmo.
            • Entre em silencio diante de Deus e peca a protecao de Maria do Carmo.""";

    private static final String ORACAO_ESCAPULARIO = """
            O Santissima Virgem do Monte Carmelo, que revestis com o sagrado Escapulario
            os vossos devotos, cobri-me com o manto da vossa protecao.
            Dai-me a graca de viver sempre em estado de graca,
            e de morrer piedosamente sob o vosso amparo maternal.
            Por Jesus Cristo, nosso Senhor. Amem.""";

    private static final String ORACAO_DIARIA = """
            O Maria, flor do Carmelo, videira florida, esplendor do Ceu,
            Virgem singular, Mae terna, que nao conheceis homem algum,
            dai os favores do Carmelo a todos os carmelitas e a todos os que vos invocam.
            Estrela do Mar, socorrei todos os filhos de Eva,
            concedei-nos a vossa protecao, o Senhora gentil.
            Amem.""";

    private static final String CONSAGRACAO = """
            Santissima Virgem Maria do Carmo, eu me consagro inteiramente a Vos.
            Recebei-me debaixo da vossa protecao e do vosso Escapulario.
            Prometo-Vos fidelidade e devocao enquanto eu viver.
            De Vos espero a graca da perseveranca final
            e a confianca de que me livrareis das penas do purgatorio.
            Amem.""";

    private static final String ORACAO_FINAL = """
            O Deus, que decorastes a Ordem do Carmo com o titulo especial
            da beatissima sempre Virgem Maria, Vossa Mae,
            concedei-nos, benignamente, que, protegidos pelo patrocinio daquela
            cuja memoria hoje celebramos com solenidade,
            mereçamos chegar as alegrias eternas.
            Por Cristo, nosso Senhor. Amem.""";

    private static final String JACULATORIA = "Nossa Senhora do Carmo, rogai por nos!";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (3x)\n• Gloria ao Pai (1x)\n• Salve Rainha";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - 1Reis 18,42-44: Elias no Monte Carmelo avistou a pequena nuvem.",
            "Dia 2 - Eclesiastico 24,17: Cresci como o cedro do Libano.",
            "Dia 3 - Cantico 2,1-2: Eu sou o lirio dos vales.",
            "Dia 4 - Isaias 35,1-2: O deserto florescera como o lirio.",
            "Dia 5 - Lucas 1,28: Ave, cheia de graca, o Senhor e contigo.",
            "Dia 6 - Lucas 1,46-55: A minha alma engrandece ao Senhor.",
            "Dia 7 - Joao 2,1-5: A Mae de Jesus disse: Fazei tudo o que Ele vos disser.",
            "Dia 8 - Joao 19,26-27: Eis ai a tua Mae.",
            "Dia 9 - Atos 1,14: Perseveravam na oracao com Maria.",
            "Dia 10 - Apocalipse 12,1: Uma Mulher vestida de sol.",
            "Dia 11 - Salmo 45,11-12: Ouve, filha, esquece teu povo.",
            "Dia 12 - Proverbios 31,10-31: A mulher forte, quem a encontrara?",
            "Dia 13 - Genesis 3,15: Porei inimizade entre ti e a Mulher.",
            "Dia 14 - Cantico 6,10: Quem e esta que surge como a aurora?",
            "Dia 15 - Isaias 7,14: Uma virgem conceberae dara a luz um filho.",
            "Dia 16 - Miquéias 5,2-3: Aquela que deve dar a luz, dara a luz.",
            "Dia 17 - Salmo 87,3: Coisas gloriosas se dizem de ti, cidade de Deus.",
            "Dia 18 - Eclesiastico 24,9: Antes dos seculos, desde o principio, Ele me criou.",
            "Dia 19 - Sabedoria 7,26: E o reflexo da luz eterna, o espelho da acao de Deus.",
            "Dia 20 - Lucas 2,19: Maria guardava todas estas coisas no seu coracao.",
            "Dia 21 - Lucas 2,35: Uma espada traspassara a tua alma.",
            "Dia 22 - Lucas 11,27-28: Felizes os que ouvem a Palavra de Deus.",
            "Dia 23 - Galatas 4,4-5: Nascido de Mulher para nos redimir.",
            "Dia 24 - Efesios 1,3-6: Ele nos elegeu antes da criacao do mundo.",
            "Dia 25 - Filipenses 2,5-8: Tende em vos os mesmos sentimentos de Cristo.",
            "Dia 26 - Colossenses 1,15-18: Ele e o primogenito de toda criatura.",
            "Dia 27 - Hebreus 2,14-17: Participou da nossa natureza.",
            "Dia 28 - 1Pedro 5,4: Quando aparecer o supremo Pastor, recebereis a coroa.",
            "Dia 29 - Cantico 4,7: Toda formosa es, amiga minha, mancha nenhuma ha em ti.",
            "Dia 30 - Cantico 8,6-7: Forte como a morte e o amor.",
            "Dia 31 - Salmo 121,1-2: Levanto os meus olhos para os montes.",
            "Dia 32 - Romanos 8,28: Tudo concorre para o bem dos que amam a Deus.",
            "Dia 33 - 2Corintios 4,16-18: A nossa leve tribulacao produz gloria eterna.",
            "Dia 34 - Salmo 91,1-4: Ele te cobrira com as suas penas.",
            "Dia 35 - Isaias 43,1-2: Nao temas, porque eu te resgatei.",
            "Dia 36 - Salmo 27,4: Uma coisa pedi ao Senhor: habitar na casa do Senhor.",
            "Dia 37 - Apocalipse 21,3-4: O proprio Deus estara com eles.",
            "Dia 38 - Salmo 23,1-4: O Senhor e meu pastor, nada me faltara.",
            "Dia 39 - Joao 14,1-3: Vou preparar-vos um lugar.",
            "Dia 40 - Apocalipse 7,9-12: Uma multidao imensa diante do trono."
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 6, 7);
        LocalDate dataFim = LocalDate.of(data.getYear(), 7, 16);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de N. Sra. do Carmo (07/06 - 16/07).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Nossa Senhora do Carmo");
        }

        result.put("diaQuaresma", dia);
        result.put("preparacaoDiaria", PREPARACAO_DIARIA);
        result.put("oracaoEscapulario", ORACAO_ESCAPULARIO);
        result.put("oracaoDiaria", ORACAO_DIARIA);
        result.put("leituraDoDia", getLeituraDoDia(dia));
        result.put("consagracao", CONSAGRACAO);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        result.put("oracoesFinais", ORACOES_FINAIS);
        return result;
    }

    private String getLeituraDoDia(int dia) {
        if (dia == -1) return "";
        if (dia >= 1 && dia <= LEITURAS.size()) return LEITURAS.get(dia - 1);
        return "Nao ha leitura definida para este dia.";
    }
}
