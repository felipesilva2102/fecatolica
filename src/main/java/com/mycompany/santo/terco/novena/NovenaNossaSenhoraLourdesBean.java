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
public class NovenaNossaSenhoraLourdesBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena de Nossa Senhora de Lourdes";

    // A novena costuma ser feita em preparação à festa de 11/02
    private String periodo = "Normalmente feita de 02 a 10 de fevereiro, em preparação à festa de Nossa Senhora de Lourdes, celebrada em 11 de fevereiro.";

    private String historia =
            "Nossa Senhora de Lourdes apareceu 18 vezes à jovem Santa Bernadete Soubirous, em 1858, na gruta de Massabielle, em Lourdes, na França. " +
            "Apresentando-se como a Imaculada Conceição, Maria convidou à conversão, à oração e à penitência, tornando Lourdes um grande santuário de cura e misericórdia para os enfermos e pecadores.";

    private String oracaoInicial =
            "Senhor meu Jesus Cristo, Deus e Homem verdadeiro, Criador e Redentor meu, por ser Vós quem sois, "
          + "e porque Vos amo sobre todas as coisas, a mim me pesa, de todo coração, ter-Vos ofendido, "
          + "e proponho firmemente nunca mais pecar, confessar-me, cumprir a penitência que me for imposta "
          + "e apartar-me de todas as ocasiões de ofender-Vos. "
          + "Ofereço-Vos minha vida, minhas obras e meus trabalhos em satisfação de todos os meus pecados; "
          + "e confio em Vossa bondade e misericórdia infinita para que me perdoeis pelos méritos de Vosso "
          + "preciosíssimo Sangue, Paixão e Morte, e me dareis graça para emendar-me e para perseverar em "
          + "Vosso santo serviço até o fim de minha vida. Amém.";

    private String oracaoFinal =
            "Debaixo de vosso amparo nos acolhemos, Santa Mãe de Deus; não desprezeis as nossas súplicas "
          + "em nossas necessidades, mas livrai-nos sempre de todos os perigos, ó Virgem gloriosa e bendita.\n\n"
          + "V. Rogai por nós, ó Virgem de Lourdes.\n"
          + "R. Para que sejamos dignos das promessas de Jesus Cristo.\n\n"
          + "Oremos: Ó Deus eterno e compassivo, concedei-nos a graça de viver santa e cristãmente, "
          + "venerando a Virgem Santíssima de Lourdes, para que sejamos dignos de sua intercessão na vida "
          + "e na hora da morte. Por Cristo, nosso Senhor. Amém.";

    private String jaculatoria =
            "V. Senhora de Lourdes.\n"
          + "R. Rogai por nós.";


    private String primeiroDia =
            "Contemplamos Maria Imaculada que aparece na gruta de Lourdes à humilde Bernadete, "
          + "e pedimos a graça de viver nossa vocação com simplicidade, pureza e fidelidade, "
          + "merecendo o olhar e as bênçãos da Virgem.";

    private String segundoDia =
            "Invocamos Nossa Senhora de Lourdes como Mãe escolhida por Deus, tesoureira das graças "
          + "e refúgio dos pecadores, pedindo perdão dos pecados, perseverança no bem e salvação da alma, "
          + "para vivermos eternamente em sua companhia no Céu.";

    private String terceiroDia =
            "Voltamo-nos à Virgem de Lourdes como vida e esperança dos pobres, âncora dos náufragos, "
          + "saúde dos enfermos e amparo dos agonizantes, suplicando que não nos abandone nas tentações, "
          + "perigos e na hora da morte.";

    private String quartoDia =
            "Diante de Nossa Senhora de Lourdes, consoladora dos aflitos, apresentamos nossas dores físicas "
          + "e espirituais, pedindo alívio, cura e fortaleza, para que, purificados, possamos adorar a Deus "
          + "eternamente com coração renovado.";

    private String quintoDia =
            "Meditamos sobre a fé viva que Maria nos inspira em Lourdes, pedindo uma fé que não seja "
          + "apenas palavras, mas se traduza em obras, de modo que nossa vida corresponda ao que cremos "
          + "e àquilo que a Igreja ensina.";

    private String sextoDia =
            "Honramos Nossa Senhora de Lourdes como Virgem das virgens, lírio de pureza, "
          + "rogando a graça da castidade e da reta vivência da sexualidade, para que, "
          + "pela pureza do coração e do corpo, vivamos na terra como cidadãos do Céu.";

    private String setimoDia =
            "Contemplamos Maria em Lourdes como Mãe pobre e humilde, que abraça a simplicidade "
          + "e as privações; pedimos o verdadeiro espírito de pobreza evangélica, desapego dos bens "
          + "e amor concreto aos pobres, em vista do Reino dos Céus.";

    private String oitavoDia =
            "Recordamos a obediência perfeita de Maria ao plano de Deus e o exemplo de Bernadete, "
          + "pedindo a graça de uma obediência dócil e perseverante à vontade divina, "
          + "mais agradável a Deus do que qualquer sacrifício exterior.";

    private String nonoDia =
            "Invocamos Nossa Senhora de Lourdes como rainha dos mártires e esperança dos aflitos, "
          + "suplicando heroica paciência para carregar as cruzes desta vida com resignação cristã, "
          + "a fim de alcançar a eterna felicidade e viver para sempre em sua doce companhia.";

    private String disponivel = "https://formacao.cancaonova.com/novena/novena-de-nossa-senhora-de-lourdes/";
}
