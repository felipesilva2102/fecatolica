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
public class NovenaJunSantoAntonioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Santo Antonio de Padua";

    private String periodo =
            "De 4 a 12 de junho, com a festa no dia 13 de junho.";

    private String historia =
            "Santo Antonio nasceu em Lisboa, Portugal, em 1195. Entrou na Ordem dos Franciscanos "
          + "e tornou-se um dos maiores pregadores da Igreja. Conhecido como o 'Doutor Evangelico', "
          + "era famoso pela eloquencia e pelos milagres. E invocado como padroeiro dos pobres, "
          + "dos objetos perdidos e dos que buscam casamento. Morreu em Padua, Italia, em 1231.";

    private String oracaoInicial =
            "Em nome do Pai, do Filho e do Espirito Santo. Amen.\n\n"
          + "O glorioso Santo Antonio, luz da Igreja e doutor do Evangelho, "
          + "vos que pregastes o amor de Cristo com tanta eloquencia e poder, "
          + "intercedei por nos junto a Deus para que sejamos fieis ao Evangelho. Amen.";

    private String oracaoFinal =
            "Santo Antonio, nosso protetor e advogado, apresentai ao Senhor as nossas suplicas "
          + "e alcancai-nos as gracas que necessitamos. Que pelo vosso exemplo aprendamos a amar "
          + "os pobres e a viver segundo o Evangelho de Cristo. Amen.";

    private String jaculatoria =
            "Santo Antonio de Padua, rogai por nos!";

    private String primeiroDia =
            "1.o Dia - A vocacao de Santo Antonio.\n\n"
          + "O glorioso Santo Antonio, que deixastes tudo para seguir Cristo na pobreza franciscana, "
          + "ensinai-nos o verdadeiro desprendimento dos bens terrenos.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String segundoDia =
            "2.o Dia - A sabedoria de Santo Antonio.\n\n"
          + "Santo Antonio, Doutor Evangelico, iluminai a nossa mente com a sabedoria divina "
          + "para que possamos discernir a vontade de Deus em nossas vidas.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String terceiroDia =
            "3.o Dia - A caridade de Santo Antonio.\n\n"
          + "O Santo Antonio, padroeiro dos pobres, ensinai-nos a partilhar com os necessitados "
          + "e a ver o rosto de Cristo nos que sofrem.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String quartoDia =
            "4.o Dia - A humildade de Santo Antonio.\n\n"
          + "Santo Antonio, modelo de humildade, ajudai-nos a reconhecer que tudo o que somos "
          + "e temos vem de Deus, e a servi-Lo com coracao sincero.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String quintoDia =
            "5.o Dia - Os milagres de Santo Antonio.\n\n"
          + "O glorioso Santo Antonio, taumaturgo de Deus, intercedei por nos "
          + "para que experimentemos o poder de Deus em nossas necessidades.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String sextoDia =
            "6.o Dia - A devocao ao Menino Jesus.\n\n"
          + "Santo Antonio, que tivestes a graca de segurar o Menino Jesus em vossos bracos, "
          + "ajudai-nos a acolher Cristo em nossos coracoes com amor e simplicidade.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String setimoDia =
            "7.o Dia - A pregacao de Santo Antonio.\n\n"
          + "O Santo Antonio, pregador incanasvel do Evangelho, dai-nos a coragem "
          + "de testemunhar Cristo com nossas palavras e acoes.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String oitavoDia =
            "8.o Dia - A intercessao de Santo Antonio.\n\n"
          + "Santo Antonio, que encontrais o que se perdeu, ajudai-nos a reencontrar "
          + "a fe, a esperanca e o amor quando os perdemos no caminho da vida.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio, rogai por nos!";

    private String nonoDia =
            "9.o Dia - Entrega final.\n\n"
          + "O glorioso Santo Antonio, neste ultimo dia, entregamos em vossas maos todas as nossas intencoes. "
          + "Apresentai-as ao Senhor e alcancai-nos a graca que mais necessitamos.\n\n"
          + "Pai-Nosso, Ave-Maria, Gloria ao Pai.\n"
          + "Santo Antonio de Padua, rogai por nos! Amen.";

    private String disponivel = "https://www.santuariodesantoantoniodelisboa.com/";
}
