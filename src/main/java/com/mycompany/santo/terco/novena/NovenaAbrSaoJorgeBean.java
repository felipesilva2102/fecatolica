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
public class NovenaAbrSaoJorgeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Sao Jorge";

    private String periodo =
            "De 14 a 22 de abril, com a festa no dia 23 de abril.";

    private String historia =
            "Sao Jorge foi um soldado romano de origem grega que se tornou martir por professar a fe crista. "
          + "Segundo a tradicao, ele enfrentou e venceu um dragao que aterrorizava uma cidade, salvando a princesa e convertendo o povo. "
          + "E um dos santos mais venerados tanto no Ocidente quanto no Oriente. Patrono de diversos paises e cidades, "
          + "Sao Jorge e simbolo de coragem, fe e luta contra o mal. No Brasil, e especialmente querido e celebrado no dia 23 de abril.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "O glorioso Sao Jorge, fiel soldado de Jesus Cristo, vos que tivestes a coragem de professar a fe "
          + "em meio as perseguicoes, intercedei por nos junto ao Pai. Dai-nos a armadura de Deus para enfrentarmos "
          + "as batalhas espirituais de cada dia. Amen.";

    private String oracaoFinal =
            "O Deus todo-poderoso, que glorificastes o martir Sao Jorge com a palma da vitoria, "
          + "concedei-nos, por sua intercessao, a forca e a coragem para vencermos as tentacoes "
          + "e permanecermos firmes na fe ate o fim. Por nosso Senhor Jesus Cristo. Amen.";

    private String jaculatoria =
            "Sao Jorge, cavaleiro de Cristo, rogai por nos!";

    private String primeiroDia =
            "1.o Dia - Contemplemos a coragem de Sao Jorge ao professar a fe diante do imperador.\n\n"
          + "O valente soldado de Cristo, Sao Jorge, que enfrentastes o dragao com a forca da fe, "
          + "ajudai-nos a vencer as tentacoes do maligno. Dai-nos a armadura espiritual para combatermos o bom combate.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String segundoDia =
            "2.o Dia - Meditemos sobre a fe inabalavel de Sao Jorge.\n\n"
          + "Sao Jorge, cavaleiro da fe, vos que nao negastes a Cristo diante dos tormentos, "
          + "fortalecei a nossa confianca em Deus. Ensinai-nos a sermos valentes na profissao da nossa fe.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - Contemplemos o exemplo de caridade de Sao Jorge.\n\n"
          + "Glorioso martir Sao Jorge, vos que libertastes os oprimidos e socorrestes os necessitados, "
          + "intercedei por nos para que tenhamos coragem de lutar pela justica e pelo bem do proximo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String quartoDia =
            "4.o Dia - Meditemos sobre a perseveranca de Sao Jorge.\n\n"
          + "Sao Jorge, protetor dos necessitados, vos que perseverastes na fe ate o martorio, "
          + "ajudai-nos a nao desistir diante das dificuldades e a confiar sempre na providencia divina.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String quintoDia =
            "5.o Dia - Contemplemos a vitoria de Sao Jorge sobre o mal.\n\n"
          + "O Sao Jorge, vos que vencestes o mal com a lanca da fe, ajudai-nos a combater o bom combate "
          + "e a revestir-nos da armadura de Deus contra as ciladas do demonio.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String sextoDia =
            "6.o Dia - Meditemos sobre a valentia e a fe de Sao Jorge.\n\n"
          + "Sao Jorge, exemplo de valentia e fe, ensinai-nos a sermos corajosos no cumprimento "
          + "da vontade de Deus e a nao temermos os poderes deste mundo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String setimoDia =
            "7.o Dia - Contemplemos a firmeza de Sao Jorge na perseguicao.\n\n"
          + "Glorioso Sao Jorge, dai-nos a graca de permanecermos firmes na fe "
          + "mesmo diante das perseguicoes e dificuldades do mundo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - Meditemos sobre a entrega total de Sao Jorge.\n\n"
          + "Sao Jorge, vos que entregastes vossa vida por amor a Cristo, "
          + "inspirai-nos a viver com generosidade e desprendimento, colocando Deus acima de tudo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Ultimo dia da novena.\n\n"
          + "O bravo Sao Jorge, neste ultimo dia, colocamos todas as nossas intencoes sob vossa protecao. "
          + "Rogai por nos junto ao trono de Deus e alcancai-nos as gracas que necessitamos.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sao Jorge, rogai por nos! Amen.";

    private String disponivel = "https://www.vaticannews.va/pt/santo-do-dia/04/23/s--jorge--martir.html";
}
