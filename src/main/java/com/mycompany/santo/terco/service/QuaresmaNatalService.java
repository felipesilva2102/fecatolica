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
            • Faca o Sinal da Cruz.
            • Acenda uma vela na coroa do Advento (se possuir).
            • Entre em silencio e prepare o coracao para o nascimento do Salvador.""";

    private static final String ORACAO_ADVENTO = """
            Senhor Jesus, que viestes ao mundo como luz para dissipar as trevas,
            iluminai o meu coracao nesta preparacao para o Vosso Natal.
            Que cada dia desta quaresma me aproxime mais de Vos
            e me faca digno de receber-Vos na manjedoura do meu coracao.
            Vinde, Senhor Jesus, nao tardeis! Amem.""";

    private static final String ANTIFONA_O = """
            As Antifonas do 'O' sao rezadas nos sete dias que antecedem o Natal (17 a 23 de dezembro):
            
            17/12 - O Sapientia! (O Sabedoria!)
            18/12 - O Adonai! (O Senhor!)
            19/12 - O Radix Jesse! (O Raiz de Jesse!)
            20/12 - O Clavis David! (O Chave de David!)
            21/12 - O Oriens! (O Sol Nascente!)
            22/12 - O Rex Gentium! (O Rei das Nacoes!)
            23/12 - O Emmanuel! (O Deus Conosco!)
            
            Vinde, Senhor, e nao tardeis!""";

    private static final String ORACAO_PRESEPIO = """
            Menino Jesus, que nascestes na pobreza de uma manjedoura
            para nos ensinar a humildade e o desprendimento:
            ajudai-nos a preparar o nosso coracao como presepio vivo
            onde possais nascer e reinar. Dai-nos a simplicidade dos pastores,
            a fe dos Magos e o amor de Maria e Jose. Amem.""";

    private static final String ORACAO_FINAL = """
            O Deus de bondade infinita, que enviastes o Vosso Filho Unigenito
            para nos salvar: concedei-nos a graca de preparar dignamente
            os nossos coracoes para celebrar com piedade o Natal do Senhor.
            Que o Menino Jesus encontre em nos morada agradavel.
            Por Jesus Cristo, nosso Senhor. Amem.""";

    private static final String JACULATORIA = "Vinde, Senhor Jesus! Maranatha!";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (3x)\n• Gloria ao Pai (1x)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Isaias 2,1-5: Vinde, caminhemos na luz do Senhor.",
            "Dia 2 - Isaias 7,14: Uma virgem conceberae dara a luz um filho: Emanuel.",
            "Dia 3 - Isaias 9,1-2: O povo que andava nas trevas viu uma grande luz.",
            "Dia 4 - Isaias 9,5-6: Um menino nos nasceu, um filho nos foi dado.",
            "Dia 5 - Isaias 11,1-4: Um ramo sairá do tronco de Jessé.",
            "Dia 6 - Isaias 25,6-9: O Senhor enxugara as lagrimas de todos os rostos.",
            "Dia 7 - Isaias 35,1-6: O deserto se alegrara, florescera como o lirio.",
            "Dia 8 - Isaias 40,1-5: Consolai o meu povo. Preparai o caminho do Senhor.",
            "Dia 9 - Isaias 40,9-11: Como um pastor, Ele apascentara o Seu rebanho.",
            "Dia 10 - Isaias 45,8: Ceus, destilai o orvalho! Nuvens, chovam o Justo!",
            "Dia 11 - Isaias 49,8-13: No tempo favoravel, Eu te ouvi.",
            "Dia 12 - Isaias 54,1-10: Com amor eterno, tive compaixao de ti.",
            "Dia 13 - Isaias 60,1-6: Levanta-te e resplandece, porque chegou a tua luz!",
            "Dia 14 - Isaias 61,1-3: Enviou-me para anunciar a boa nova aos pobres.",
            "Dia 15 - Miquéias 5,1-3: De ti saira Aquele que governara Israel.",
            "Dia 16 - Baruc 5,1-9: Deus guiara Israel na alegria, na luz da Sua gloria.",
            "Dia 17 - Sofonias 3,14-18: Exulta, filha de Siao! O Senhor esta no meio de ti.",
            "Dia 18 - Malaquias 3,1-4: Eis que envio o meu mensageiro diante de mim.",
            "Dia 19 - Lucas 1,5-25: O anjo anuncia a Zacarias o nascimento de Joao.",
            "Dia 20 - Lucas 1,26-38: O anjo Gabriel anuncia a Maria: Ave, cheia de graca!",
            "Dia 21 - Lucas 1,39-45: Maria visita Isabel: Bendita es tu entre as mulheres!",
            "Dia 22 - Lucas 1,46-56: A minha alma engrandece ao Senhor (Magnificat).",
            "Dia 23 - Lucas 1,57-66: Nascimento de Joao Batista.",
            "Dia 24 - Lucas 1,67-79: Cantico de Zacarias (Benedictus).",
            "Dia 25 - Mateus 1,1-17: Genealogia de Jesus Cristo, filho de David.",
            "Dia 26 - Mateus 1,18-25: Jose, nao temas receber Maria.",
            "Dia 27 - Mateus 2,1-6: Os magos do Oriente: Onde esta o Rei dos Judeus?",
            "Dia 28 - Joao 1,1-5: No principio era o Verbo, e o Verbo estava com Deus.",
            "Dia 29 - Joao 1,6-13: Veio a luz verdadeira que ilumina todo homem.",
            "Dia 30 - Joao 1,14-18: E o Verbo se fez carne e habitou entre nos.",
            "Dia 31 - Romanos 13,11-14: A noite vai avancada, o dia esta proximo.",
            "Dia 32 - 1Corintios 1,3-9: Aguardais a manifestacao de Nosso Senhor.",
            "Dia 33 - Galatas 4,4-7: Quando chegou a plenitude dos tempos...",
            "Dia 34 - Filipenses 4,4-7: Alegrai-vos! O Senhor esta perto!",
            "Dia 35 - Tito 2,11-14: Manifestou-se a graca de Deus para a salvacao.",
            "Dia 36 - Tito 3,4-7: Manifestou-se a bondade e o amor de Deus.",
            "Dia 37 - Hebreus 1,1-4: Nestes ultimos tempos, Deus falou-nos pelo Filho.",
            "Dia 38 - 1Joao 1,1-4: O que era desde o principio, o que vimos e ouvimos.",
            "Dia 39 - 1Joao 4,9-10: Deus enviou o Seu Filho ao mundo para nos dar a vida.",
            "Dia 40 - Lucas 2,1-14: Nasceu-vos hoje o Salvador! Gloria a Deus nas alturas!"
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 11, 15);
        LocalDate dataFim = LocalDate.of(data.getYear(), 12, 24);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Natal (15/11 - 24/12).");
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
        return "Nao ha leitura definida para este dia.";
    }
}
