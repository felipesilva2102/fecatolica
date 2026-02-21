package com.mycompany.santo.terco.novena;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class NovenaSetNossaSenhoraDoresBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Nossa Senhora das Dores";

    private String periodo =
            "De 6 a 14 de setembro, com a festa no dia 15 de setembro.";

    private String historia =
            "A memoria de Nossa Senhora das Dores celebra as sete dores de Maria: a profecia de Simeao, "
          + "a fuga para o Egito, a perda de Jesus no Templo, o encontro com Jesus a caminho do Calvario, "
          + "a crucificacao e morte de Jesus, a descida do corpo da cruz e a sepultura de Jesus. "
          + "Esta devocao convida-nos a unir o nosso sofrimento ao de Maria e de Cristo pela salvacao do mundo.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "O Maria Dolorosa, que sofreu junto a Cruz do vosso Filho, "
          + "ensinai-nos a unir nossos sofrimentos aos de Cristo para a salvacao das almas. "
          + "Intercedei por nos, Mae das Dores. Amen.";

    private String oracaoFinal =
            "O Deus, que quisestes que junto a Cruz do vosso Filho estivesse de pe a Mae Dolorosa, "
          + "concedei-nos que, meditando com Ela a Paixao de Cristo, participemos dos frutos da Redencao. "
          + "Por nosso Senhor Jesus Cristo. Amen.";

    private String jaculatoria =
            "Nossa Senhora das Dores, rogai por nos que recorremos a Vos!";

    private String primeiroDia =
            "1.o Dia - A profecia de Simeao.\n\n"
          + "O Maria Dolorosa, que sofreu junto a Cruz do vosso Filho, "
          + "ensinai-nos a unir nossos sofrimentos aos de Cristo. "
          + "Meditamos a dor que sentistes ao ouvir a profecia de Simeao: uma espada traspassara a vossa alma.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String segundoDia =
            "2.o Dia - A fuga para o Egito.\n\n"
          + "Mae das Dores, vos que fugistes para o Egito para proteger o Menino Jesus, "
          + "protegei todas as familias que sofrem perseguicao e deslocamento.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - A perda de Jesus no Templo.\n\n"
          + "Maria Dolorosa, que procurastes Jesus perdido no Templo, "
          + "ajudai-nos a encontrar Cristo quando nos sentirmos perdidos e desorientados.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String quartoDia =
            "4.o Dia - O encontro no caminho do Calvario.\n\n"
          + "Mae Dolorosa, que encontrastes Jesus no caminho do Calvario, "
          + "dai-nos forcas para carregar a nossa cruz com amor e uniao a Cristo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String quintoDia =
            "5.o Dia - A crucificacao.\n\n"
          + "Maria ao pe da Cruz, que presenciastes a morte do vosso Filho, "
          + "consolai os que choram a perda de entes queridos e dai-lhes esperanca.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String sextoDia =
            "6.o Dia - A descida da Cruz.\n\n"
          + "Nossa Senhora das Dores, que recebestes o corpo morto de Jesus em vossos bracos, "
          + "acolhei-nos em vosso colo materno nas horas de dor e sofrimento.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String setimoDia =
            "7.o Dia - A sepultura de Jesus.\n\n"
          + "Maria Dolorosa, vos que acompanhastes Jesus ate o sepulcro, "
          + "acompanhai-nos em todos os momentos de nossa vida, especialmente nos mais dificeis.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - O sofrimento redentor.\n\n"
          + "Mae das Sete Dores, ensinai-nos a oferecer os nossos sofrimentos "
          + "em uniao com a Paixao de Cristo pela salvacao do mundo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Entrega total.\n\n"
          + "O Mae das Sete Dores, neste ultimo dia entregamos a vos todas as nossas dores e angustias. "
          + "Transformai-as em oferenda de amor e reparacao. Sede nossa consoladora e protetora.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora das Dores, rogai por nos! Amen.";

    private String disponivel = "https://www.vaticannews.va/pt/santo-do-dia/09/15/nossa-senhora-das-dores.html";
}
