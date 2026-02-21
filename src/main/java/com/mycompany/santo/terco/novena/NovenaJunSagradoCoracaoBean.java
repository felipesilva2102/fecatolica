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
public class NovenaJunSagradoCoracaoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena ao Sagrado Coracao de Jesus";

    private String periodo =
            "Reza-se nos nove dias que antecedem a Solenidade do Sagrado Coracao de Jesus "
          + "(sexta-feira apos o domingo de Corpus Christi).";

    private String historia =
            "A devocao ao Sagrado Coracao de Jesus tem origem nas revelacoes de Jesus a Santa Margarida Maria Alacoque, "
          + "religiosa francesa do seculo XVII. Jesus mostrou-lhe o Seu Coracao ardente de amor pela humanidade "
          + "e pediu que se estabelecesse a festa do Sagrado Coracao e a pratica dos nove primeiros sextas-feiras.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "Sagrado Coracao de Jesus, fonte de todo amor, eu Vos adoro e Vos amo. "
          + "Abri o meu coracao para receber a vossa graca e misericordia. "
          + "Fazei que eu Vos ame cada dia mais e que o meu coracao esteja unido ao Vosso. Amen.";

    private String oracaoFinal =
            "Sagrado Coracao de Jesus, em Vos confio! "
          + "Reinai sobre nos, sobre as nossas familias e sobre o mundo inteiro. "
          + "Concedei-nos as gracas que Vos pedimos nesta novena e inflamai-nos no vosso divino amor. Amen.";

    private String jaculatoria =
            "Sagrado Coracao de Jesus, tende piedade de nos!\n"
          + "Imaculado Coracao de Maria, rogai por nos!";

    private String primeiroDia =
            "1.o Dia - O amor infinito do Coracao de Jesus.\n\n"
          + "Sagrado Coracao de Jesus, fonte de todo amor, abri o nosso coracao para receber vossa graca "
          + "e misericordia. Ensinai-nos a amar como Vos amais.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String segundoDia =
            "2.o Dia - A confianca no Coracao de Jesus.\n\n"
          + "Coracao Sacratissimo de Jesus, em Vos confio! Dai-nos a graca de uma fe viva "
          + "e operante que nos leve a fazer o bem e a confiar plenamente na vossa Providencia.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String terceiroDia =
            "3.o Dia - As virtudes do Coracao de Jesus.\n\n"
          + "Sagrado Coracao de Jesus, modelo de virtudes, ensinai-nos a mansidao e a humildade de coracao. "
          + "Transformai-nos a vossa imagem e semelhanca.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String quartoDia =
            "4.o Dia - A reparacao ao Coracao de Jesus.\n\n"
          + "Coracao de Jesus, ferido pelos nossos pecados, perdoai as nossas faltas "
          + "e dai-nos a graca da contricao perfeita. Oferecemos reparacao pelos nossos pecados e os do mundo.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String quintoDia =
            "5.o Dia - O refugio dos pecadores.\n\n"
          + "Sagrado Coracao de Jesus, refugio dos pecadores, acolhei todos os que se afastaram de Vos "
          + "e trazei-os de volta ao vosso amor misericordioso.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String sextoDia =
            "6.o Dia - A esperanca dos moribundos.\n\n"
          + "Coracao de Jesus, esperanca dos moribundos, assistei todos os que partem deste mundo "
          + "para que encontrem a vida eterna nos bracos da vossa misericordia.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String setimoDia =
            "7.o Dia - A paz do Coracao de Jesus.\n\n"
          + "Sagrado Coracao de Jesus, paz e reconciliacao nossa, abencoi as nossas familias "
          + "e comunidades com a vossa paz. Que reine o amor onde ha discordia.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String oitavoDia =
            "8.o Dia - O caminho da santidade.\n\n"
          + "Coracao de Jesus, delicia de todos os santos, atrai-nos ao caminho da santidade "
          + "para que alcancemos o Ceu e participemos da vossa gloria eterna.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos!";

    private String nonoDia =
            "9.o Dia - Consagracao ao Sagrado Coracao.\n\n"
          + "Sacratissimo Coracao de Jesus, neste ultimo dia, consagramos-Vos a nossa vida. "
          + "Reinai sobre nos e sobre o mundo inteiro, para sempre. "
          + "Que o Vosso Reino de amor, justica e paz se estabeleca em todos os coracoes.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sagrado Coracao de Jesus, tende piedade de nos! Amen.";

    private String disponivel = "https://www.vaticannews.va/pt/santo-do-dia.html";
}
