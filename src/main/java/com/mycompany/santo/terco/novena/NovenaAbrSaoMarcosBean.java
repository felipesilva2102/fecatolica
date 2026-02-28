package com.mycompany.santo.terco.novena;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class NovenaAbrSaoMarcosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Sao Marcos Evangelista";

    private String periodo =
            "De 16 a 24 de abril, com a festa no dia 25 de abril.";

    private String historia =
            "Sao Marcos e o autor do segundo Evangelho e considerado o fundador da Igreja de Alexandria no Egito. "
          + "Discipulo de Sao Pedro, acompanhou-o em Roma, onde redigiu o seu Evangelho baseado na pregacao do Apostolo. "
          + "Sao Marcos e representado por um leao, simbolizando o inicio do seu Evangelho com a voz que clama no deserto.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "O glorioso Sao Marcos, evangelista de Cristo, vos que registrastes a Boa Nova de Jesus "
          + "para todas as geracoes, iluminai os nossos coracoes com a luz do Evangelho. "
          + "Intercedei por nos para que sejamos fieis anunciadores da Palavra de Deus. Amen.";

    private String oracaoFinal =
            "Senhor Deus, que inspirastes Sao Marcos a escrever o vosso Evangelho, "
          + "concedei-nos a graca de acolher a vossa Palavra e de vive-la no dia a dia, "
          + "para que sejamos testemunhas credíveis do vosso amor. Por Cristo nosso Senhor. Amen.";

    private String jaculatoria =
            "Sao Marcos Evangelista, rogai por nos!";

    private String primeiroDia =
            "1.o Dia - Meditemos sobre a vocacao de Sao Marcos.\n\n"
          + "O Sao Marcos, que fostes chamado a seguir Cristo e a anunciar o Evangelho, "
          + "ajudai-nos a ouvir o chamado de Deus em nossas vidas e a responder com generosidade.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String segundoDia =
            "2.o Dia - Contemplemos a fidelidade de Sao Marcos.\n\n"
          + "Sao Marcos, fiel companheiro de Sao Pedro e Sao Paulo, ensinai-nos a ser fieis "
          + "ao Senhor e a Sua Igreja em todos os momentos da vida.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - Meditemos sobre o Evangelho de Sao Marcos.\n\n"
          + "O Sao Marcos, que nos revelastes a urgencia do Reino de Deus, "
          + "concedei-nos um coracao disposto a acolher a Palavra e a coloca-la em pratica.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String quartoDia =
            "4.o Dia - Contemplemos a coragem missionaria de Sao Marcos.\n\n"
          + "Sao Marcos, fundador da Igreja em Alexandria, dai-nos a coragem de levar o Evangelho "
          + "a todos os lugares, sem medo das dificuldades.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String quintoDia =
            "5.o Dia - Meditemos sobre o martirio de Sao Marcos.\n\n"
          + "O glorioso Sao Marcos, vos que derramastes o sangue pela fe, "
          + "fortalecei-nos para que sejamos firmes no testemunho cristao, mesmo diante das adversidades.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String sextoDia =
            "6.o Dia - Contemplemos a humildade de Sao Marcos.\n\n"
          + "Sao Marcos, que servistes a Cristo e aos Apostolos com humildade, "
          + "ensinai-nos a servir ao proximo sem buscar reconhecimento humano.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String setimoDia =
            "7.o Dia - Meditemos sobre a graca da Palavra de Deus.\n\n"
          + "O Sao Marcos, que transmitistes fielmente as palavras de Cristo, "
          + "intercedei por nos para que amemos e meditemos as Sagradas Escrituras todos os dias.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - Contemplemos o zelo apostolico de Sao Marcos.\n\n"
          + "Sao Marcos, cheio de zelo pela salvacao das almas, "
          + "inflamai em nos o desejo de levar Cristo aos que ainda nao O conhecem.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Ultimo dia da novena.\n\n"
          + "O glorioso Sao Marcos Evangelista, neste ultimo dia, colocamos todas as nossas intencoes "
          + "em vossas maos. Intercedei junto a Deus por nos e por todas as nossas necessidades.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Marcos Evangelista, rogai por nos! Amen.";

    private String disponivel = "https://www.vaticannews.va/pt/santo-do-dia/04/25/s--marcos--evangelista.html";
}
