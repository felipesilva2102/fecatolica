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
public class NovenaSaoCarloAcutisBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String comoFazer = "A novena a Carlo Acutis consiste em 4 momentos:\n"
            + "\n"
            + "Oração inicial: é a mesma, deve ser repetida todos os dias, incluindo nela o pedido da graça que se deseja alcançar com a novena.\n"
            + "Meditação do dia: em cada um dos dias da novena, medita-se um pequeno ponto de sua vida, um aspecto de sua espiritualidade.\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias: também deve-se rezá-los todos os dias, ao término da meditação do dia. São 15 orações feitas em honra aos 15 anos de vida de Carlo Acutis nesta Terra.\n"
            + "Oração final: reforça-se o pedido da graça pelos méritos de Carlo Acutis.";

    private String primeiroDia = "Primeiro dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do primeiro dia\n"
            + "“Não eu, mas Deus”\n"
            + "\n"
            + "São Carlo Acutis, que fizeste de tua vida uma contínua renúncia e aniquilamento, dá-me a graça de buscar as coisas do Céu e desprezar as que passam. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String segundoDia = "Segundo dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do segundo dia\n"
            + "“Estar sempre junto com Jesus: este é o meu plano de vida”\n"
            + "\n"
            + "São Carlo Acutis, que viveste imerso no Coração de Jesus, dá-me a graça de realizar, em tudo, este teu plano de amor. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String terceiroDia = "Terceiro dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do terceiro dia\n"
            + "“Peça ao seu Anjo da Guarda para ajudá-lo continuamente, de modo que ele se torne seu melhor amigo.”\n"
            + "\n"
            + "São Carlo Acutis, que buscaste, já neste mundo, a companhia dos santos anjos, dá-me a graça de viver na retidão que o meu santo anjo deseja. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String quartoDia = "Quarto dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do quarto dia\n"
            + "“Nossa alma é como um balão… Se por acaso existe um pecado mortal, a alma cai sobre a Terra e a confissão será como fogo… É preciso confessar-se frequentemente.”\n"
            + "\n"
            + "São Carlo Acutis, que tão bem viveste o sacramento da reconciliação, dá-me a graça de buscá-lo sempre com uma contrição profunda. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String quintoDia = "Quinto dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do quinto dia\n"
            + "“A tristeza é a visão voltada para si; a felicidade é seu olhar para Deus.”\n"
            + "\n"
            + "São Carlo Acutis, que jamais desviaste o teu olhar de Jesus, teu grande amor, dá-me a graça de viver já neste mundo esta verdadeira felicidade. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String sextoDia = "Sexto dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do sexto dia\n"
            + "“A única coisa que nós temos que pedir a Deus na oração é a vontade de ser santos”\n"
            + "\n"
            + "São Carlo Acutis, que soubeste sempre pedir a Deus o essencial, dá-me a graça de um profundo desejo do Céu. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String setimoDia = "Sétimo dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do sétimo dia\n"
            + "“A Virgem Maria é a única mulher da minha vida”\n"
            + "\n"
            + "São Carlo Acutis, que amaste a Virgem Maria mais que tudo, dá-me a graça de corresponder ao amor desta tão terna e boa mãe. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String oitavoDia = "Oitavo dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do oitavo dia\n"
            + "“A Eucaristia é a minha estrada para o Céu”\n"
            + "\n"
            + "São Carlo Acutis, que buscavas sempre teu Jesus escondido no sacrário, dá-me a graça de um profundo ardor eucarístico. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";

    private String nonoDia = "Nono dia da novena a Carlo Acutis\n"
            + "Oração inicial\n"
            + "Santíssima Trindade, Pai, Filho e Espírito Santo, eu vos agradeço por todos os favores e todas as graças com que enriquecestes a alma de São Carlo Acutis durante os 15 anos que passou nesta Terra e, pelos méritos deste tão querido Anjo da Juventude, vos suplico que me concedais a graça que ardentemente vos peço: (faz-se o pedido da graça que se deseja).\n"
            + "\n"
            + "Meditação do nono dia\n"
            + "“Eu estou feliz de morrer, porque vivi a minha vida sem perder nenhum minuto em coisas que não agradam a Deus”\n"
            + "\n"
            + "São Carlo Acutis, dá-me a graça das graças, que é a perseverança final e uma morte santa. Amém.\n"
            + "\n"
            + "5 Pai-Nossos, 5 Ave-Marias e 5 Glórias ao Pai, em honra dos 15 anos de vida do servo de Deus nesta Terra.\n"
            + "\n"
            + "Oração final\n"
            + "Deus Pai de Misericórdia, que elevastes à glória dos altares este vosso servo Carlo Acutis, a fim de que, por ele, vós fôsseis mais glorificado, concedei-nos, pelos méritos dele — que em tudo viveu a vossa vontade —, a graça que ardentemente desejo. Amém.";
}
