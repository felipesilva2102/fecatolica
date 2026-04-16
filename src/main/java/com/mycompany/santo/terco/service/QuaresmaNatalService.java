package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuaresmaNatalService {

    private static final String PREPARACAO_DIARIA = """
            • Faça o Sinal da Cruz.
            • Acenda uma vela na coroa do Advento (se possuir).
            • Entre em silêncio e prepare o coração para o nascimento do Salvador.""";

    private static final String ORACAO_ADVENTO = """
            Senhor Jesus, que viestes ao mundo como luz para dissipar as trevas,
            iluminai o meu coração nesta preparação para o Vosso Natal.
            Que cada dia desta quaresma me aproxime mais de Vos
            e me faça digno de receber-Vos na manjedoura do meu coração.
            Vinde, Senhor Jesus, não tardeis! Amém.""";

    private static final String ANTIFONA_O = """
            As Antífonas do 'O' são rezadas nos sete dias que antecedem o Natal (17 a 23 de dezembro):
            
            17/12 - O Sapientia! (O Sabedoria!)
            18/12 - O Adonai! (O Senhor!)
            19/12 - O Radix Jesse! (O Raiz de Jesse!)
            20/12 - O Clavis David! (O Chave de David!)
            21/12 - O Oriens! (O Sol Nascente!)
            22/12 - O Rex Gentium! (O Rei das Nações!)
            23/12 - O Emmanuel! (O Deus Conosco!)
            
            Vinde, Senhor, e não tardeis!""";

    private static final String ORACAO_PRESEPIO = """
            Menino Jesus, que nascestes na pobreza de uma manjedoura
            para nos ensinar a humildade e o desprendimento:
            ajudai-nos a preparar o nosso coração como presépio vivo
            onde possais nascer e reinar. Dai-nos a simplicidade dos pastores,
            a fé dos Magos e o amor de Maria e José. Amém.""";

    private static final String ORACAO_FINAL = """
            Ó Deus de bondade infinita, que enviastes o Vosso Filho Unigênito
            para nos salvar: concedei-nos a graça de preparar dignamente
            os nossos corações para celebrar com piedade o Natal do Senhor.
            Que o Menino Jesus encontre em nós morada agradável.
            Por Jesus Cristo, nosso Senhor. Amém.""";

    private static final String JACULATORIA = "Vinde, Senhor Jesus! Maranatha!";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (3x)\n• Glória ao Pai (1x)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Isaías 2,1-5: Vinde, caminhemos na luz do Senhor.",
            "Dia 2 - Isaías 7,14: Uma virgem conceberá e dará à luz um filho: Emanuel.",
            "Dia 3 - Isaías 9,1-2: O povo que andava nas trevas viu uma grande luz.",
            "Dia 4 - Isaías 9,5-6: Um menino nos nasceu, um filho nos foi dado.",
            "Dia 5 - Isaías 11,1-4: Um ramo sairá do tronco de Jessé.",
            "Dia 6 - Isaías 25,6-9: O Senhor enxugará as lágrimas de todos os rostos.",
            "Dia 7 - Isaías 35,1-6: O deserto se alegrará, florescerá como o lírio.",
            "Dia 8 - Isaías 40,1-5: Consolai o meu povo. Preparai o caminho do Senhor.",
            "Dia 9 - Isaías 40,9-11: Como um pastor, Ele apascentará o Seu rebanho.",
            "Dia 10 - Isaías 45,8: Céus, destilai o orvalho! Nuvens, chovam o Justo!",
            "Dia 11 - Isaías 49,8-13: No tempo favorável, Eu te ouvi.",
            "Dia 12 - Isaías 54,1-10: Com amor eterno, tive compaixão de ti.",
            "Dia 13 - Isaías 60,1-6: Levanta-te e resplandece, porque chegou a tua luz!",
            "Dia 14 - Isaías 61,1-3: Enviou-me para anunciar a boa nova aos pobres.",
            "Dia 15 - Miquéias 5,1-3: De ti sairá Aquele que governará Israel.",
            "Dia 16 - Baruc 5,1-9: Deus guiará Israel na alegria, na luz da Sua glória.",
            "Dia 17 - Sofonias 3,14-18: Exulta, filha de Sião! O Senhor está no meio de ti.",
            "Dia 18 - Malaquias 3,1-4: Eis que envio o meu mensageiro diante de mim.",
            "Dia 19 - Lucas 1,5-25: O anjo anuncia a Zacarias o nascimento de João.",
            "Dia 20 - Lucas 1,26-38: O anjo Gabriel anuncia a Maria: Ave, cheia de graça!",
            "Dia 21 - Lucas 1,39-45: Maria visita Isabel: Bendita és tu entre as mulheres!",
            "Dia 22 - Lucas 1,46-56: A minha alma engrandece ao Senhor (Magnificat).",
            "Dia 23 - Lucas 1,57-66: Nascimento de João Batista.",
            "Dia 24 - Lucas 1,67-79: Cântico de Zacarias (Benedictus).",
            "Dia 25 - Mateus 1,1-17: Genealogia de Jesus Cristo, filho de David.",
            "Dia 26 - Mateus 1,18-25: José, não temas receber Maria.",
            "Dia 27 - Mateus 2,1-6: Os magos do Oriente: Onde está o Rei dos Judeus?",
            "Dia 28 - João 1,1-5: No princípio era o Verbo, e o Verbo estava com Deus.",
            "Dia 29 - João 1,6-13: Veio a luz verdadeira que ilumina todo homem.",
            "Dia 30 - João 1,14-18: E o Verbo se fez carne e habitou entre nós.",
            "Dia 31 - Romanos 13,11-14: A noite vai avançada, o dia está próximo.",
            "Dia 32 - 1Coríntios 1,3-9: Aguardais a manifestação de Nosso Senhor.",
            "Dia 33 - Gálatas 4,4-7: Quando chegou a plenitude dos tempos...",
            "Dia 34 - Filipenses 4,4-7: Alegrai-vos! O Senhor está perto!",
            "Dia 35 - Tito 2,11-14: Manifestou-se a graça de Deus para a salvação.",
            "Dia 36 - Tito 3,4-7: Manifestou-se a bondade e o amor de Deus.",
            "Dia 37 - Hebreus 1,1-4: Nestes últimos tempos, Deus falou-nos pelo Filho.",
            "Dia 38 - 1João 1,1-4: O que era desde o princípio, o que vimos e ouvimos.",
            "Dia 39 - 1João 4,9-10: Deus enviou o Seu Filho ao mundo para nos dar a vida.",
            "Dia 40 - Lucas 2,1-14: Nasceu-vos hoje o Salvador! Glória a Deus nas alturas!"
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 11, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 12, 24);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

                if (!dentro) {
                        result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de Natal (15/11 - 24/12).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Natal");
        }

        result.put("diaQuaresma", dia);
        result.put("preparacaoDiaria", PREPARACAO_DIARIA);
        result.put("oracaoAdvento", ORACAO_ADVENTO);
        result.put("antifonaO", ANTIFONA_O);
        result.put("oracaoPresepio", ORACAO_PRESEPIO);
        result.put("leituraDoDia", getLeituraDoDia(dia));
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
