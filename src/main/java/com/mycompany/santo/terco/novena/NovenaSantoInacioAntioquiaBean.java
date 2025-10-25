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
public class NovenaSantoInacioAntioquiaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String nome = "Novena a Santo Inácio de Antioquia";

    private String periodo = "Normalmente feita dos dias 08 de outubro à 16 de outubro.";

    private String comoFazer = "Inicia-se com o Sinal da Cruz: Em nome do Pai e do Filho e do Espírito Santo;\n"
            + "Reza-se a Oração preparatória para todos os dias\n"
            + "Faz-se a meditação do dia;\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai;\n"
            + "Reza-se a Oração final para todos os dias,\n"
            + "Finaliza-se com o Sinal da Cruz.";

    private String oracaoPreparatoria = "Santíssima Trindade: Pai, Filho e Espírito Santo, creio firmemente estar em Vossa presença e sob Vossos cuidados, e, fiando-me nessa certeza, rogo-Vos que me inspire nesta novena a alcançar as virtudes de Vosso servo Santo Inácio de Antioquia. Acendei em meu coração o fogo de Vosso amor, para que, assim como Inácio, também eu possa estar revestido do brilho que emana de Vos e preparado para iluminar o mundo com a Vossa mensagem resplandecente.";

    private String oracaoFinal = "Graças Vos dou, Pai Eterno, por enviar ao mundo Vosso diletíssimo Filho, Jesus Cristo, que salvou a humanidade e inspirou muitos a O seguirem. Veneramos especialmente Vosso servo Santo Inácio de Antioquia e rogamos, com grande confiança em Vós, Senhor Deus, que nos conceda pela intercessão de Inácio a graça que pedimos (pede-se agora a graça desejada). Com grande confiança na valorosa súplica de Santo Inácio de Antioquia, dignai-Vos atender-nos conforme Vossa perfeita vontade.\n"
            + "\n"
            + "Rogai por nos, Santo Inácio de Antioquia, para que sejamos dignos das promessas de Cristo.";

    private String primeiroDia = "Por esse motivo, eu te exorto a reavivar a chama do dom de Deus que recebeste pela imposição das minhas mãos. Pois Deus não nos deu um espírito de timidez, mas de fortaleza, de amor e de sabedoria. (II Tm 1,6-7)\n"
            + "\n"
            + "Santo Inácio honrou o nome que recebeu. Inácio faz. alusão a fogo (ígneo), recordando-nos a exortação de São Paulo, em sua segunda carta a Timóteo: tenham coragem e mantenham viva a chama do amor de Deus em vossos corações! O santo também era conhecido pelo nome de Teóforo, que signitica portador de Deus, o que foi evidenciado por sua conduta frente ao martírio: via na morte cruel uma feliz oportunidade de estar para sempre unido ao Senhor.\n"
            + " Neste primeiro dia da novena, roguemos a Deus pelo fogo do Espírito Santo, a fim de que sejamos firmes na caminhada cristã.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String segundoDia = "Onde está, ó morte, a tua vitória? Onde está, ó morte, o teu aguilhão? (I Cor 15,55)\n"
            + "\n"
            + "Todo cristão deve estar aberto à possibilidade do martírio, pois ao tomarmos o nome de Cristo devemos estar prontos a receber o que Ele também recebeu. Santo Inácio sabia disso e ao ser condenado às feras, declarou: “Eu sou trigo de Deus. Quero ser triturado e moido pelos dentes das feras, a fim de me converter em pão puro de Cristo”. Cristo, pela morte, venceu a morte, portanto não devemos temer a perseguição que o mundo pode infligir a nós. Hoje, rezemos para que o sofrimento seja fonte de santificação para os cristãos, de modo que não temamos testemunhar o amor de Deus, mesmo que nos seja exigida a vida.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String terceiroDia = "O Deus da perseverança e da consolação vos conceda o mesmo sentimento uns para com os outros, segundo Jesus Cristo. para que, com um só coração e uma só voz, glorifiqueis a Deus, Pai de Nosso Senhor Jesus Cristo (Rm 15,5-6)\n"
            + "\n"
            + "Santo Inácio foi um bispo zeloso que não deixou de se preocupar com suas ovelhas, mesmo em face da morte. Escreveu sete cartas orientando os fiéis em diversos tópicos, tendo a unidade da Igreja como um de seus temas mais caros. Inácio pregou contra falsas doutrinas e exortou o povo a não dar lugar ao pecado do orgulho. Animados pela dedicação de Santo Inácio em preservar a unidade dos cristãos e inspirados pela palavra de São Paulo aos Romanos, oremos ao Senhor para que o corpo místico de Cristo permaneça unido e imploremos a Deus pela conversão dos nossos irmãos separados da Igreja.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String quartoDia = "Guardo no fundo do meu coração a vossa palavra, para não vos ofender. (Sl 118,11)\n"
            + "\n"
            + "Conta-nos a tradição cristã que Inácio, apesar dos inúmeros flagelos perpetrados por seus algozes a mando do imperador Trajano, continuava a proclamar o nome de Cristo. Inácio, ao perceber que os carrascos estavam impressionados, disse: “Trago este nome escrito em meu coração, e é por isso que não posso parar de invocá-lo”. O que poderia soar apenas como metáfora, confirmou-se verdadeiro: após a morte de Santo Inácio, seu coração foi aberto ao meio e encontraram o nome de Jesus Cristo gravado em letras douradas. Rezemos, hoje, para que carreguemos sempre o nome de Cristo conosco, a fim de dar provas de nossa fé quando nos for exigido.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String quintoDia = "Guardo no fundo do meu coração a vossa palavra, para não vos ofender. (Sl 118,11)\n"
            + "\n"
            + "Conta-nos a tradição cristã que Inácio, apesar dos inúmeros flagelos perpetrados por seus algozes a mando do imperador Trajano, continuava a proclamar o nome de Cristo. Inácio, ao perceber que os carrascos estavam impressionados, disse: “Trago este nome escrito em meu coração, e é por isso que não posso parar de invocá-lo”. O que poderia soar apenas como metáfora, confirmou-se verdadeiro: após a morte de Santo Inácio, seu coração foi aberto ao meio e encontraram o nome de Jesus Cristo gravado em letras douradas. Rezemos, hoje, para que carreguemos sempre o nome de Cristo conosco, a fim de dar provas de nossa fé quando nos for exigido.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String sextoDia = "Tenho para mim que os sofrimentos da presente vida não têm proporção alguma com a glória futura que nos deve ser manifestada. (Rm 8,18)\n"
            + "\n"
            + "Inácio ensina-nos a virtude da esperança: ele não se prendia às expectativas deste mundo, pois tinha sempre diante dos olhos a gloriosa vida futura celestial. Em seu trajeto rumo ao martírio, Inácio rogou aos companheiros cristãos influentes que não impedissem sua execução, pois via na morte a graça de estar para sempre unido a Jesus Cristo. Roguemos hoje pelo dom da esperança, de modo que possamos estar dispostos a imitar Cristo até mesmo em Sua paixão.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String setimoDia = "Se o mundo vos odeia, sabei que me odiou a mim antes que a vós. Se fósseis do mundo, o mundo vos amaria como sendo seus. Como, porém, não sois do mundo, mas do mundo vos escolhi, por isso o mundo vos odeia. (Jo 15,18-19)\n"
            + "\n"
            + "Trajano, antes de condenar Inácio à morte, impôs-lhe pesados flagelos: caminhar descalço sobre brasas ardentes, ser açoitado com chicotes de pontas de chumbo, ter pedras pontiagudas e sal esfregados sobre seus ferimentos. Em todos esses sofrimentos Inácio deu testemunho da fé viva que o animava, impressionando o imperador, que o acusou de feitiçaria. E sinal de fidelidade a Cristo ser odiado e caluniado pelo mundo, portanto não devemos lamentar quando tais eventos sobrevierem a nós. Hoje, no sétimo dia da novena, rogamos a Deus por perseverança, a fim de que sejamos corajosos e firmes quando formos vítimas de castigos e mentiras por amor a Cristo.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String oitavoDia = "Eu vos amo, Senhor, minha força!” (Sl 17,2)\n"
            + "\n"
            + "Inácio foi figura de grande valor histórico no cristianismo: discípulo direto de São João, Evangelista, também conviveu com São Paulo e sucedeu a São Pedro no bispado de Antioquia. Ressaltamos no dia de hoje a convivência de Santo Inácio com seu mestre, São João. Conhecido como o discípulo amado, João certamente transmitiu a Inácio o amor devotado a Cristo, fazendo ressoar na vida de Inácio as palavras do salmista: “Eu vos amo, Senhor, minha força!”. Não fosse a força do amor de Cristo a dar sentido à vida, não seria possível suportar a dor dos castigos, as calúnias e a morte cruel. Hoje, no oitavo dia da novena, rogamos a Santo Inácio que nos inflame com o amor profundo que lhe foi transmitido por seu mestre, São João, a fim de que possamos também dar testemunho da força do amor de Cristo.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";

    private String nonoDia = "Tomou em seguida o pão e depois de ter dado graças, partiu-o e deu-lho, dizendo: Isto é o meu corpo, que é dado por vós; fazei isto em memória de mim (Lc 22,19).\n"
            + "\n"
            + "Muitos perderam a fé na Eucaristia: comungam em estado de pecado mortal, faltam com respeito à comunhão sagrada e não creem na presença real de Jesus sob as formas do pão e do vinho. Santo Inácio de Antioquia destacava o valor da Eucaristia chamando-a de “remédio da imortalidade”, o que evidencia a crença dos primeiros cristãos na transubstanciação.\n"
            + "\n"
            + "Ao finalizarmos a novena, rogamos a Deus que nos conceda a graça de sempre estarmos unidos a Ele por meio do Divino Pão que nos foi dado por herança na Última Ceia. Para tanto, imploramos por um coração contrito, puro e arrependido, o que nos deixará em estado propício para O recebermos dignamente em nosso ser, e assim sermos um com Cristo como o foi Santo Inácio de Antioquia.\n"
            + "\n"
            + "Rezar um Pai-Nosso, uma Ave Maria e um Glória ao Pai.\n"
            + "\n"
            + "Santo Inácio de Antioquia, dai-nos o vosso espírito de sacrifício e ousadia.";
}
