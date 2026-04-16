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
            • Faça o Sinal da Cruz.
            • Se possível, vista ou segure o Escapulário de Nossa Senhora do Carmo.
            • Entre em silêncio diante de Deus e peça a proteção de Maria do Carmo.""";

    private static final String ORACAO_ESCAPULARIO = """
            Ó Santíssima Virgem do Monte Carmelo, que revestis com o sagrado Escapulário
            os vossos devotos, cobri-me com o manto da vossa proteção.
            Dai-me a graça de viver sempre em estado de graça,
            e de morrer piedosamente sob o vosso amparo maternal.
            Por Jesus Cristo, nosso Senhor. Amém.""";

    private static final String ORACAO_DIARIA = """
            Ó Maria, flor do Carmelo, videira florida, esplendor do Céu,
            Virgem singular, Mãe terna, que não conheceis homem algum,
            dai os favores do Carmelo a todos os carmelitas e a todos os que vos invocam.
            Estrela do Mar, socorrei todos os filhos de Eva,
            concedei-nos a vossa proteção, ó Senhora gentil.
            Amém.""";

    private static final String CONSAGRACAO = """
            Santíssima Virgem Maria do Carmo, eu me consagro inteiramente a Vós.
            Recebei-me debaixo da vossa proteção e do vosso Escapulário.
            Prometo-Vos fidelidade e devoção enquanto eu viver.
            De Vós espero a graça da perseverança final
            e a confiança de que me livrareis das penas do purgatório.
            Amém.""";

    private static final String ORACAO_FINAL = """
            Ó Deus, que decorastes a Ordem do Carmo com o título especial
            da beatíssima sempre Virgem Maria, Vossa Mãe,
            concedei-nos, benignamente, que, protegidos pelo patrocínio daquela
            cuja memória hoje celebramos com solenidade,
            mereçamos chegar às alegrias eternas.
            Por Cristo, nosso Senhor. Amém.""";

    private static final String JACULATORIA = "Nossa Senhora do Carmo, rogai por nós!";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (3x)\n• Glória ao Pai (1x)\n• Salve Rainha";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - 1Reis 18,42-44: Elias no Monte Carmelo avistou a pequena nuvem.",
            "Dia 2 - Eclesiástico 24,17: Cresci como o cedro do Líbano.",
            "Dia 3 - Cântico 2,1-2: Eu sou o lírio dos vales.",
            "Dia 4 - Isaías 35,1-2: O deserto florescerá como o lírio.",
            "Dia 5 - Lucas 1,28: Ave, cheia de graça, o Senhor é contigo.",
            "Dia 6 - Lucas 1,46-55: A minha alma engrandece ao Senhor.",
            "Dia 7 - João 2,1-5: A Mãe de Jesus disse: Fazei tudo o que Ele vos disser.",
            "Dia 8 - João 19,26-27: Eis aí a tua Mãe.",
            "Dia 9 - Atos 1,14: Perseveravam na oração com Maria.",
            "Dia 10 - Apocalipse 12,1: Uma Mulher vestida de sol.",
            "Dia 11 - Salmo 45,11-12: Ouve, filha, esquece teu povo.",
            "Dia 12 - Provérbios 31,10-31: A mulher forte, quem a encontrará?",
            "Dia 13 - Gênesis 3,15: Porei inimizade entre ti e a Mulher.",
            "Dia 14 - Cântico 6,10: Quem é esta que surge como a aurora?",
            "Dia 15 - Isaías 7,14: Uma virgem conceberá e dará à luz um filho.",
            "Dia 16 - Miquéias 5,2-3: Aquela que deve dar à luz, dará à luz.",
            "Dia 17 - Salmo 87,3: Coisas gloriosas se dizem de ti, cidade de Deus.",
            "Dia 18 - Eclesiástico 24,9: Antes dos séculos, desde o princípio, Ele me criou.",
            "Dia 19 - Sabedoria 7,26: É o reflexo da luz eterna, o espelho da ação de Deus.",
            "Dia 20 - Lucas 2,19: Maria guardava todas estas coisas no seu coração.",
            "Dia 21 - Lucas 2,35: Uma espada traspassará a tua alma.",
            "Dia 22 - Lucas 11,27-28: Felizes os que ouvem a Palavra de Deus.",
            "Dia 23 - Gálatas 4,4-5: Nascido de Mulher para nos redimir.",
            "Dia 24 - Efésios 1,3-6: Ele nos elegeu antes da criação do mundo.",
            "Dia 25 - Filipenses 2,5-8: Tende em vós os mesmos sentimentos de Cristo.",
            "Dia 26 - Colossenses 1,15-18: Ele é o primogênito de toda criatura.",
            "Dia 27 - Hebreus 2,14-17: Participou da nossa natureza.",
            "Dia 28 - 1Pedro 5,4: Quando aparecer o supremo Pastor, recebereis a coroa.",
            "Dia 29 - Cântico 4,7: Toda formosa és, amiga minha, mancha nenhuma há em ti.",
            "Dia 30 - Cântico 8,6-7: Forte como a morte é o amor.",
            "Dia 31 - Salmo 121,1-2: Levanto os meus olhos para os montes.",
            "Dia 32 - Romanos 8,28: Tudo concorre para o bem dos que amam a Deus.",
            "Dia 33 - 2Coríntios 4,16-18: A nossa leve tribulação produz glória eterna.",
            "Dia 34 - Salmo 91,1-4: Ele te cobrirá com as suas penas.",
            "Dia 35 - Isaías 43,1-2: Não temas, porque eu te resgatei.",
            "Dia 36 - Salmo 27,4: Uma coisa pedi ao Senhor: habitar na casa do Senhor.",
            "Dia 37 - Apocalipse 21,3-4: O próprio Deus estará com eles.",
            "Dia 38 - Salmo 23,1-4: O Senhor é meu pastor, nada me faltará.",
            "Dia 39 - João 14,1-3: Vou preparar-vos um lugar.",
            "Dia 40 - Apocalipse 7,9-12: Uma multidão imensa diante do trono."
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 6, 7);
        LocalDate dataFim = LocalDate.of(data.getYear(), 7, 16);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de N. Sra. do Carmo (07/06 - 16/07).");
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
        return "Não há leitura definida para este dia.";
    }
}
