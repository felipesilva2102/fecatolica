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
public class NovenaAgoAssuncaoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena da Assuncao de Nossa Senhora";

    private String periodo =
            "De 6 a 14 de agosto, com a Solenidade no dia 15 de agosto.";

    private String historia =
            "A Assuncao de Nossa Senhora e o dogma que proclama que Maria, terminado o curso de sua vida terrena, "
          + "foi elevada em corpo e alma a gloria celeste. Este dogma foi definido pelo Papa Pio XII em 1950, "
          + "na Constituicao Apostolica Munificentissimus Deus. A festa da Assuncao e uma das mais antigas "
          + "e solenes dedicadas a Virgem Maria.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "O Maria, elevada ao Ceu em corpo e alma, ensinai-nos a buscar as coisas do alto. "
          + "Intercedei por nos junto ao vosso Filho, para que um dia possamos contemplar "
          + "a gloria de Deus com Vos no Paraiso. Amen.";

    private String oracaoFinal =
            "O Deus todo-poderoso e eterno, que elevastes ao Ceu a Virgem Imaculada Maria, Mae do vosso Filho, "
          + "concedei-nos que, voltados para as coisas do alto, participemos da mesma gloria celeste. "
          + "Por nosso Senhor Jesus Cristo. Amen.";

    private String jaculatoria =
            "Maria Assunta ao Ceu, rogai por nos!";

    private String primeiroDia =
            "1.o Dia - A gloria de Maria.\n\n"
          + "O Maria, elevada ao Ceu em corpo e alma, ensinai-nos a buscar as coisas do alto. "
          + "Intercedei por nos junto ao vosso Filho para vivermos com o olhar fixo na eternidade.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String segundoDia =
            "2.o Dia - O desprendimento terreno.\n\n"
          + "Mae Assunta, gloriosa Rainha do Ceu, dai-nos a graca de vivermos desprendidos "
          + "dos bens terrenos, buscando sempre o tesouro que nao perece.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - A vitoria sobre o pecado.\n\n"
          + "Virgem Assunta, vos que fostes preservada da corrupcao do sepulcro, "
          + "ajudai-nos a vencer o pecado que corrompe a alma e a viver na graca de Deus.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String quartoDia =
            "4.o Dia - A esperanca crista.\n\n"
          + "Nossa Senhora da Assuncao, esperanca dos cristaos, confortai os aflitos "
          + "e os que sofrem neste vale de lagrimas. Dai-lhes a certeza da vida eterna.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String quintoDia =
            "5.o Dia - A fe na vida eterna.\n\n"
          + "Maria Assunta, modelo de fe perfeita, fortalecei a nossa confianca "
          + "na vida eterna prometida por Cristo a todos os que O seguem.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String sextoDia =
            "6.o Dia - A intercessao pelos moribundos.\n\n"
          + "Rainha Assunta ao Ceu, intercedei por todos os moribundos "
          + "para que alcancem a salvacao eterna nos bracos do vosso Filho.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String setimoDia =
            "7.o Dia - A graca da boa morte.\n\n"
          + "Virgem Santissima, elevada pelos anjos ao Ceu, "
          + "dai-nos a graca de uma boa morte e a consolacao da vossa presenca nessa hora.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - A ressurreicao da carne.\n\n"
          + "Nossa Senhora da Assuncao, que participais da gloria de Cristo Ressuscitado, "
          + "dai-nos a esperanca da nossa ressurreicao e da vida que nao tem fim.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Consagracao final.\n\n"
          + "O Maria Assunta, neste ultimo dia, carregai ao Ceu todas as nossas preces. "
          + "Sede nossa Mae e Rainha para sempre. Levai-nos convosco a gloria do Pai.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Maria Assunta ao Ceu, rogai por nos! Amen.";

    private String disponivel = "https://www.vaticannews.va/pt/santo-do-dia/08/15/assuncao-da-virgem-maria.html";
}
