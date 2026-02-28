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
public class NovenaMaiNossaSenhoraFatimaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Nossa Senhora de Fatima";

    private String periodo =
            "De 4 a 12 de maio, com a festa no dia 13 de maio.";

    private String historia =
            "Em 1917, a Virgem Maria apareceu tres vezes a tres pastorinhos em Fatima, Portugal: Lucia, Francisco e Jacinta. "
          + "Nossa Senhora pediu oracao, penitencia e a devocao ao Imaculado Coracao de Maria para a conversao dos pecadores "
          + "e pela paz no mundo. As aparicoes de Fatima sao uma das mais importantes da historia da Igreja e continuam "
          + "a inspirar milhoes de fieis no mundo inteiro.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "O Santissima Virgem de Fatima, que aparecestes aos pastorinhos pedindo oracao e penitencia, "
          + "concedei-nos a graca de atender aos vossos pedidos com fervor e fidelidade. "
          + "Intercedei por nos junto ao vosso Filho Jesus. Amen.";

    private String oracaoFinal =
            "Nossa Senhora de Fatima, Rainha do Santissimo Rosario, rogai por nos. "
          + "Concedei-nos a graca da conversao, da paz e da perseveranca na fe. "
          + "O Imaculado Coracao de Maria, sede o nosso refugio e o caminho que nos conduz a Deus. Amen.";

    private String jaculatoria =
            "O meu Jesus, perdoai-nos, livrai-nos do fogo do inferno, "
          + "levai as almas todas para o ceu e socorrei principalmente as que mais precisarem.";

    private String primeiroDia =
            "1.o Dia - A primeira aparicao.\n\n"
          + "O Virgem Santissima de Fatima, que aparecestes aos tres pastorinhos pedindo oracao e penitencia, "
          + "concedei-nos a graca da conversao sincera. Ensinai-nos a rezar o Rosario com devocao.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String segundoDia =
            "2.o Dia - O Rosario diario.\n\n"
          + "Nossa Senhora de Fatima, que revelastes os segredos do Ceu, ajudai-nos a viver "
          + "os vossos pedidos de oracao diaria do Rosario para alcancar a paz do mundo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - A paz no mundo.\n\n"
          + "Mae de Fatima, que prometestes a conversao da Russia e a paz no mundo, "
          + "intercedei pela paz entre os povos e nacoes. Que a humanidade se converta a Deus.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String quartoDia =
            "4.o Dia - Sacrificio pelos pecadores.\n\n"
          + "Virgem do Rosario de Fatima, ensinai-nos a oferecer sacrificios "
          + "pela conversao dos pecadores como pedistes aos videntes.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String quintoDia =
            "5.o Dia - O Imaculado Coracao de Maria.\n\n"
          + "Nossa Senhora de Fatima, que consagrastes o vosso Imaculado Coracao como refugio, "
          + "acolhei-nos nele. Que o vosso Coracao triunfe sobre todo o mal.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String sextoDia =
            "6.o Dia - Os cinco primeiros sabados.\n\n"
          + "Mae Santissima de Fatima, concedei-nos a graca de participar devotamente "
          + "dos cinco primeiros sabados em reparacao ao vosso Imaculado Coracao.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String setimoDia =
            "7.o Dia - Os pastorinhos de Fatima.\n\n"
          + "Nossa Senhora de Fatima, protegei as criancas e jovens do mundo "
          + "dos perigos da falta de fe. Dai-lhes a graca de conhecerem e amarem Jesus.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - O sofrimento oferecido.\n\n"
          + "Virgem de Fatima, ensinai-nos a aceitar os sofrimentos como oferenda de amor por Cristo, "
          + "unindo-os a Paixao do vosso Filho pela salvacao das almas.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Consagracao final.\n\n"
          + "O Santissima Virgem de Fatima, neste ultimo dia vos consagramos as nossas vidas e familias. "
          + "Sede nossa Mae e protetora para sempre. Guardai-nos sob o manto do vosso Imaculado Coracao.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Nossa Senhora de Fatima, rogai por nos! Amen.";

    private String disponivel = "https://www.fatima.pt/pt/";
}
