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
public class NovenaJulSantAnaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Sant'Ana e Sao Joaquim";

    private String periodo =
            "De 17 a 25 de julho, com a festa no dia 26 de julho.";

    private String historia =
            "Sant'Ana e Sao Joaquim sao os pais da Virgem Maria e avos de Jesus Cristo. "
          + "Embora nao sejam mencionados nos Evangelhos canonicos, a tradicao da Igreja "
          + "e os escritos apocrifos nos contam que foram um casal piedoso e fiel que, "
          + "apos longos anos de esterilidade, receberam a graca de gerar a Mae de Deus. "
          + "Sao padroeiros dos avos, das maes e das familias.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "Gloriosa Sant'Ana e Sao Joaquim, avos de Jesus Cristo, "
          + "vos que tivestes a honra de gerar e educar a Mae de Deus, "
          + "intercedei por nos e por nossas familias junto ao Senhor. Amen.";

    private String oracaoFinal =
            "O Deus, que concedestes a Sant'Ana e Sao Joaquim a graca de serem avos do vosso Filho, "
          + "concedei-nos, por sua intercessao, a bencao sobre as nossas familias "
          + "e a graca de educarmos nossos filhos na fe e no amor de Cristo. Amen.";

    private String jaculatoria =
            "Sant'Ana e Sao Joaquim, rogai por nos e nossas familias!";

    private String primeiroDia =
            "1.o Dia - A paciencia de Sant'Ana e Sao Joaquim.\n\n"
          + "Gloriosa Sant'Ana, mae da Virgem Maria, dai-nos a graca de educar bem "
          + "nossos filhos e netos na fe. Ensinai-nos a esperar com paciencia os designios de Deus.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String segundoDia =
            "2.o Dia - A perseveranca na oracao.\n\n"
          + "Sant'Ana, modelo de perseveranca, ensinai-nos a confiar em Deus "
          + "mesmo nos longos periodos de espera e provacao.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - A bencao da maternidade.\n\n"
          + "Querida Sant'Ana, vos que tivestes a honra de gerar a Mae de Deus, "
          + "intercedei pelas mulheres que desejam ser maes e pelas que estao gravidas.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String quartoDia =
            "4.o Dia - A missao dos avos.\n\n"
          + "Sant'Ana, padroeira dos avos, abencoai todos os avos do mundo "
          + "que transmitem a fe as novas geracoes com carinho e sabedoria.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String quintoDia =
            "5.o Dia - O matrimonio santo.\n\n"
          + "Gloriosa Sant'Ana, esposa fiel de Sao Joaquim, abencoai os casamentos "
          + "e fortalecei a unidade familiar. Que os esposos vivam em santidade.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String sextoDia =
            "6.o Dia - A fe inabalavel.\n\n"
          + "Sant'Ana, mulher de fe inabalavel, ajudai-nos a nunca perder a esperanca "
          + "mesmo diante das dificuldades e sofrimentos da vida.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String setimoDia =
            "7.o Dia - A preparacao para a missao.\n\n"
          + "Querida Sant'Ana, que preparastes a Virgem Maria para a sua missao, "
          + "preparai os nossos coracoes para receberem Cristo com amor.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - A protecao do lar.\n\n"
          + "Sant'Ana, protetora dos lares, livrai nossas casas de todo mal "
          + "e enchei-as com a presenca e a bencao de Deus.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Entrega das intencoes.\n\n"
          + "Gloriosa Sant'Ana e Sao Joaquim, neste ultimo dia apresentamos "
          + "todas as intencoes das nossas familias. Cobri-nos com o vosso manto de amor e protecao.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Sant'Ana e Sao Joaquim, rogai por nos! Amen.";

    private String disponivel = "https://www.vaticannews.va/pt/santo-do-dia/07/26/ss--joaquim-e-ana--pais-da-b--v--maria.html";
}
