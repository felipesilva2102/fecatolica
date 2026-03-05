package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuaresmaSantaTeresinhaService {

    private static final String PREPARACAO_DIARIA = """
            • Faca o Sinal da Cruz.
            • Coloque uma flor ou imagem de Santa Teresinha diante de voce.
            • Entre em silencio e peca a graca da infancia espiritual.""";

    private static final String ORACAO_CAMINHOINFANCIA = """
            O Meu Deus, eu Vos ofereço todas as acoes que vou praticar hoje,
            com as intencoes e pelos meritos de Jesus Cristo.
            Quero santificar os batimentos do meu coracao,
            meus pensamentos e obras mais simples,
            unindo-os aos meritos infinitos de Jesus.
            Quero reparar minhas faltas lancando-me
            nos bracos da Vossa misericordiosa bondade.
            (inspirada em Santa Teresinha)""";

    private static final String OFERECIMENTO_DAS_ROSAS = """
            Santa Teresinha do Menino Jesus, vos prometestes:
            'Passarei o meu ceu fazendo o bem na terra.
            Farei cair uma chuva de rosas.'
            Confiando nesta promessa, eu vos peco:
            (fazer o pedido)
            Se for da vontade de Deus, enviai-me um sinal
            da vossa intercessao. Amem.""";

    private static final String ATO_CONFIANCA = """
            Meu Deus, eu creio firmemente que Vos sois bom e misericordioso.
            Sei que nao devo ter medo de Vos,
            mas correr para os Vossos bracos como uma crianca corre para o pai.
            Entrego-Vos todas as minhas imperfeicoes,
            pois Vos transformais a minha fraqueza em forca.
            Amem.""";

    private static final String ORACAO_FINAL = """
            O Santa Teresinha do Menino Jesus, que pela vossa docura e simplicidade
            conquistastes o Coracao de Deus, alcancai-me a graca de viver
            com a mesma confianca e abandono. Fazei cair sobre mim e sobre toda
            a minha familia uma chuva de rosas.
            O Santa Teresinha, flor do Carmelo, rogai por nos. Amem.""";

    private static final String JACULATORIA = "Santa Teresinha, fazei cair do ceu uma chuva de rosas sobre nos!";

    private static final String ORACOES_FINAIS = "• Pai-Nosso (1x)\n• Ave-Maria (3x)\n• Gloria ao Pai (1x)";

    private static final List<String> LEITURAS = List.of(
            "Dia 1 - Mateus 18,1-4: Se nao vos converterdes e nao vos tornardes como criancas...",
            "Dia 2 - Mateus 11,25-26: Escondestes estas coisas aos sabios e as revelastes aos pequeninos.",
            "Dia 3 - Marcos 10,13-16: Deixai vir a mim as criancinhas.",
            "Dia 4 - Lucas 1,46-49: O Poderoso fez em mim maravilhas.",
            "Dia 5 - Salmo 131: Senhor, meu coracao nao se exaltou.",
            "Dia 6 - Joao 15,4-5: Sem mim nada podeis fazer.",
            "Dia 7 - Isaias 66,13: Como uma mae consola o filho, assim Eu vos consolarei.",
            "Dia 8 - 2Corintios 12,9-10: Na fraqueza e que se revela a forca.",
            "Dia 9 - Filipenses 4,4-7: Alegrai-vos sempre no Senhor.",
            "Dia 10 - 1Pedro 5,6-7: Lancai sobre Ele toda a vossa preocupacao.",
            "Dia 11 - Salmo 23: O Senhor e meu pastor, nada me faltara.",
            "Dia 12 - Isaias 43,4: Es precioso aos meus olhos e Eu te amo.",
            "Dia 13 - Cantico 2,16: O meu amado e meu e eu sou dele.",
            "Dia 14 - Romanos 8,28: Tudo concorre para o bem dos que amam a Deus.",
            "Dia 15 - Sabedoria 3,1-3: As almas dos justos estao nas maos de Deus.",
            "Dia 16 - Cantico 8,6-7: Forte como a morte e o amor.",
            "Dia 17 - Mateus 25,21: Muito bem, servo bom e fiel.",
            "Dia 18 - Joao 14,27: Dou-vos a minha paz.",
            "Dia 19 - Tiago 1,2-4: Considerai como alegria as diversas provacoes.",
            "Dia 20 - Galatas 2,20: Ja nao sou eu que vivo, e Cristo que vive em mim.",
            "Dia 21 - 1Joao 4,16-18: No amor nao ha temor.",
            "Dia 22 - Salmo 51,12-14: Criai em mim um coracao puro.",
            "Dia 23 - Efesios 3,16-19: Arraigados e fundados no amor.",
            "Dia 24 - Romanos 8,38-39: Nada nos podera separar do amor de Deus.",
            "Dia 25 - Lucas 12,32: Nao temais, pequeno rebanho.",
            "Dia 26 - Salmo 139,1-4: Senhor, Vos me sondais e me conheceis.",
            "Dia 27 - Proverbios 3,5-6: Confia no Senhor de todo o coracao.",
            "Dia 28 - Joao 13,34-35: Amai-vos uns aos outros como Eu vos amei.",
            "Dia 29 - 1Corintios 13,4-7: O amor e paciente, o amor e bondoso.",
            "Dia 30 - Colossenses 3,12-14: Revesti-vos de ternura e bondade.",
            "Dia 31 - Hebreus 12,1-2: Corramos com perseveranca, olhando para Jesus.",
            "Dia 32 - 2Corintios 4,16-18: A nossa leve tribulacao produz gloria eterna.",
            "Dia 33 - Salmo 63,2-4: Vossa bondade vale mais que a vida.",
            "Dia 34 - Isaias 49,15-16: Gravei-te nas palmas das minhas maos.",
            "Dia 35 - Mateus 6,25-34: Nao vos preocupeis com o que haveis de comer.",
            "Dia 36 - Lucas 18,1-8: E necessario rezar sempre sem desanimar.",
            "Dia 37 - Filipenses 1,6: Aquele que iniciou a boa obra ha de completa-la.",
            "Dia 38 - 1Tessalonicenses 5,16-18: Alegrai-vos sempre, orai sem cessar.",
            "Dia 39 - 2Timoteo 4,7-8: Combati o bom combate, terminei a corrida.",
            "Dia 40 - Apocalipse 2,10: Se fiel ate a morte e te darei a coroa da vida."
    );

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 8, 23);
        LocalDate dataFim = LocalDate.of(data.getYear(), 10, 1);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada nao esta dentro da Quaresma de Santa Teresinha (23/08 - 01/10).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santa Teresinha");
        }

        result.put("diaQuaresma", dia);
        result.put("preparacaoDiaria", PREPARACAO_DIARIA);
        result.put("oracaoCaminhoInfancia", ORACAO_CAMINHOINFANCIA);
        result.put("oferecimentoRosas", OFERECIMENTO_DAS_ROSAS);
        result.put("atoConfianca", ATO_CONFIANCA);
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
