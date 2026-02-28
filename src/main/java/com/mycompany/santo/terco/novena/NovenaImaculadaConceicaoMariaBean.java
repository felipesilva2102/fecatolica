/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.novena;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Felipe
 */
@Named
@SessionScoped
@Getter
@Setter
public class NovenaImaculadaConceicaoMariaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena à Imaculada Conceição de Maria";

    private String periodo = "Normalmente feita dos dias 29 de novembro à 07 de dezembro.";

    private String historia = "A novena inicia-se em 29 de novembro e deve ser rezada por nove dias consecutivos, encerrando-se em 7 de dezembro, comemorando a solenidade no dia 8.\n"
            + "\n"
            + "O dogma da Imaculada Conceição da Virgem Maria foi oficialmente proclamado pelo Papa Pio IX na bula Ineffabilis Deus, em 8 de dezembro de 1854. A festa dedicada à Imaculada Conceição, celebrada no mesmo dia, foi incluída no calendário litúrgico pelo Papa Sisto IV, em 28 de fevereiro de 1477. Em sua aparição a Santa Bernadete, em 1858, a Virgem Santíssima declarou-se como a Imaculada Conceição. Até hoje, o corpo de Santa Bernadete permanece incorrupto, reforçando a importância dessa mensagem.\n"
            + "\n"
            + "A Santa Igreja Católica ensina solenemente que a Bem-aventurada Virgem Maria foi preservada de toda mancha do pecado original desde o primeiro instante de sua concepção, por graça especial e privilégio de Deus Todo-Poderoso, através dos méritos de Jesus Cristo, Salvador da humanidade. Todo católico é chamado a crer e proclamar esse dogma de fé.\n"
            + "\n"
            + "Imbuídos de um espírito de humildade, arrependimento e confiança na intercessão de Maria, apresentemos nossas intenções e necessidades a esta que é Mãe e Medianeira de todas as graças.\n"
            + "\n"
            + "    “A Virgem Imaculada, no entanto, nos convida a não fixar nossos olhos nela, mas a ir além e, tanto quanto possível, entrar no mistério em que ela foi concebida: o mistério de Deus que é Um e Três, cheio de graça e fidelidade. Assim como a lua brilha com a luz do sol, o esplendor imaculado de Maria é totalmente relativo ao do Redentor. A Mãe nos conduz ao seu Filho; passando por ela, chegamos a Cristo” – Papa São João Paulo II";

    private String comoFazer = "    Inicia-se com o Sinal da Cruz: Em nome do Pai e do Filho e do Espírito Santo;\n"
            + "    Reza-se a oração inicial para todos os dias;\n"
            + "    Faz-se a meditação do dia;\n"
            + "    Reza-se a oração final,\n"
            + "    Finaliza-se com o Sinal da Cruz.";

    private String oracaoInicial = "Ó Virgem puríssima concebida sem pecado, desde o primeiro instante toda bela e sem mancha. Ó gloriosa Maria, cheia de graça e Mãe de meu Deus, Rainha dos anjos e dos homens. Humildemente vos venero como Mãe do meu Salvador, que, sendo Deus, me ensinou com sua estima, respeito e submissão a vós a honra e a homenagem que vos devo prestar. Dignai-vos acolher-me a mim, que nesta novena a vós me consagro. Sendo vós refúgio seguro dos pecadores arrependidos, tenho razão para recorrer a vós; sendo Mãe de misericórdia, não podeis não vos compadecer de minha miséria; sendo, depois de Jesus Cristo, toda a minha esperança, não podeis não vos agradar da tenra confiança que em vós tenho. Fazei-me digno de chamar-me vosso filho, a fim de que possa dizer com confiança: Mostrais que sois Mãe.\n"
            + "\n"
            + "Fazer aqui o pedido que se deseja obter.";

    private String oracaoFinal = "℣.Toda sois formosa, ó Maria.\n"
            + " ℟. Toda sois formosa, ó Maria.\n"
            + "\n"
            + "℣. E mácula original não há em Vós.\n"
            + " ℟. E mácula original não há em Vós.\n"
            + "\n"
            + "℣. Vós sois a glória de Jerusalém.\n"
            + " ℟. Vós a alegria de Israel.\n"
            + "\n"
            + "℣. Vós a honra do nosso povo.\n"
            + " ℟. Vós a advogada dos pecadores.\n"
            + "\n"
            + "℣. Ó Maria.\n"
            + " ℟. Ó Maria.\n"
            + "\n"
            + "℣. Virgem prudentíssima.\n"
            + " ℟. Mãe clementíssima.\n"
            + "\n"
            + "℣. Rogai por nós.\n"
            + " ℟. Intercedei por nós a Nosso Senhor Jesus Cristo.\n"
            + "\n"
            + "℣. Vós fostes, ó Virgem, Imaculada em vossa Conceição.\n"
            + " ℟. Rogai por nós ao Pai, cujo Filho destes à luz.\n"
            + "\n"
            + "℣. Protegei, Senhora, a minha oração.\n"
            + " ℟. E chegue até vós o meu clamor.\n"
            + "\n"
            + "Oremos. Santa Maria, Rainha dos céus, Mãe de nosso Senhor Jesus Cristo e dominadora do mundo, que a ninguém desamparais nem desprezais; ponde, Senhora, em mim os olhos de vossa piedade e alcançai-me de vosso amado Filho o perdão de todos os meus pecados, para que, venerando agora afetuosamente a vossa Imaculada Conceição, consiga depois a coroa da eterna bem-aventurança: por mercê do mesmo vosso Filho Jesus Cristo, Senhor nosso, que com o Padre e o Espírito Santo vive e reina em unidade perfeita, Deus, pelos séculos dos séculos. Amém.";

    private String primeiroDia = "Eis-me aqui aos vossos pés santíssimos, ó Virgem Imaculada. Alegro-me grandemente convosco, eleita desde a eternidade para ser Mãe do Verbo eterno e preservada da culpa original. Dou graças e bendigo à Santíssima Trindade, que vos enriqueceu com este privilégio em vossa Conceição, e suplico-vos humildemente que me alcanceis a graça de vencer as tristes sequelas que em mim deixou o pecado original. Fazei que eu as supere e não deixe mais de amar ao meu Deus.";

    private String segundoDia = "Ó Maria, lírio imaculado de pureza, alegro-me convosco, que desde o primeiro instante de vossa Conceição fostes cumulada de graça e recebestes o uso perfeito da razão . Dou graças e adoro à Santíssima Trindade, que vos concedeu dons tão sublimes. Confundo-me todo diante de vós, vendo-me tão pobre de graça. Vós, que fostes plenamente cumulada de graça celeste, fazei-me participar e compartilhar dos tesouros de vossa Imaculada Conceição.";

    private String terceiroDia = "Ó Maria, rosa mística de pureza, alegro-me convosco, que em vossa Imaculada Conceição triunfastes gloriosamente da serpente infernal e fostes concebida sem a mancha do pecado original. Dou graças e louvo com todo o coração à Santíssima Trindade, que vos concedeu tal privilégio, e vos suplico que me alcanceis a força para superar todas as insídias do inimigo infernal e não manchar com o pecado a minha alma. Ajudai-me sempre e fazei-me, com vossa proteção, triunfar sempre do inimigo comum de nossa eterna salvação.";

    private String quartoDia = "Ó Imaculada Virgem Maria, espelho de pureza, encho-me de sumo gozo ao ver que vos foram infusos desde a vossa Conceição os dons mais sublimes e perfeitos de virtude e também todos os dons do Espírito Santo. Dou graças e louvo à Santíssima Trindade, que vos favoreceu com estes privilégios, e vos suplico, ó Mãe benigna, que me alcanceis a prática da virtude e a graça de tornar-me digno de receber os dons e a graça do Espírito Santo.";

    private String quintoDia = "Ó Maria, lua reluzente de pureza, alegro-me convosco, pois o mistério de vossa Imaculada Conceição foi o início da salvação de todo o gênero humano e a alegria do mundo inteiro. Dou graças e bendigo à Santíssima Trindade, que assim vos engrandeceu e glorificou, e vos suplico que me alcanceis a graça de saber aproveitar-me da paixão e morte do vosso Jesus. Que não seja para mim inútil o Sangue derramado na cruz, mas que eu viva santamente e me salve.";

    private String sextoDia = "Ó Maria Imaculada, estrela esplendorosa de pureza, alegro-me convosco, porque a vossa Imaculada Conceição foi motivo de grandíssima alegria para todos os anjos do paraíso. Dou graças e bendigo à Santíssima Trindade, que vos enriqueceu de tão belo privilégio. Fazei-me entrar um dia nesta alegria e poder, na companhia dos anjos, louvar-vos e bendizer-vos eternamente.";

    private String setimoDia = "Ó Maria Imaculada, aurora nascente de pureza, alegro-me convosco, admirado de que no momento mesmo de vossa Conceição fostes confirmada em graça e tornada impecável. Dou graças e exalto à Santíssima Trindade, que vos distinguiu somente a vós com este particular privilégio. Impetrai-me, ó Virgem santa, um total e contínuo horror ao pecado, mais do que a qualquer outro mal, e que eu prefira antes morrer que voltar a pecar.";

    private String oitavoDia = "Ó Virgem Maria, sol sem mancha, alegro-me convosco, cheio de gozo por terdes recebido de Deus em vossa Conceição uma graça maior e mais copiosa que a alcançada por todos os anjos e santos no auge de seus méritos. Dou graças à Santíssima Trindade, admirado da suma beneficência com que vos dispensou este privilégio. Fazei-me corresponder à graça divina e a dela não mais abusar. Transformai-me o coração e fazei que eu me arrependa desde agora de minhas culpas.";

    private String nonoDia = "Ó Maria, Virgem Imaculada, luz viva de santidade, exemplo de pureza e Mãe minha. Vós, apenas concebida, adorastes profundamente a Deus e lhe rendestes graças, já que por meio de vós, desfeita a antiga maldição, derramou-se a maior bênção sobre os filhos de Adão. Fazei que esta bênção acenda em meu coração um amor ardente a Deus. Inflamai-o vós, para que eu o ame constantemente e dele goze depois para sempre no paraíso, onde poderei dar-lhe graças mais ardentemente pelos singulares privilégios que vos concedeu e gozar de vós coroada de tanta glória.";
    
    private String disponivel = "https://rumoasantidade.com.br/novena-imaculada-conceicao/?srsltid=AfmBOoqPptyVAKJz5IPK5-_rETls0fD8cZ47M3-CYCdplWGQ75Lo3UcY";
}
