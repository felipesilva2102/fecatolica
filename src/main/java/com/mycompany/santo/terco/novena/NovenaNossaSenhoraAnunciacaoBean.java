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
public class NovenaNossaSenhoraAnunciacaoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Nossa Senhora da Anunciação";

    private String periodo = "Normalmente feita dos dias 16 de março à 24 de março";

    private String comoFazer =
            "Inicia-se com o Sinal da Cruz;\n"
          + "Reza-se a Oração Preparatória (todos os dias);\n"
          + "Segue-se a meditação de cada dia, com uma Ave Maria após cada invocação;\n"
          + "Pode-se rezar também a Ladainha de Nossa Senhora;\n"
          + "Finaliza-se com a Oração Final (todos os dias).";

    private String oracaoInicial =
            "Oração Preparatória (todos os dias):\n"
          + "Vinde, Espírito Santo, enchei o coração dos vossos fiéis e acendei neles o fogo do vosso amor.\n"
          + "\n"
          + "℣. Enviai o vosso Espírito, e tudo será criado.\n"
          + "℟. E renovareis a face da terra.\n"
          + "\n"
          + "Oremos. Ó Deus, que instruístes os corações dos vossos fiéis com a luz do Espírito Santo, "
          + "concedei-nos amar, no mesmo Espírito, o que é reto e gozar sempre a sua consolação. "
          + "Por Cristo, Senhor nosso. ℟. Amém."; 

    private String primeiroDia =
            "I. Eu vos venero e admiro, Santíssima Virgem Maria, como à mais humilde de todas as criaturas diante de Deus, "
          + "no exato momento em que, no dia da Anunciação, fostes por Ele exaltada à sublime dignidade de sua Mãe! "
          + "Ó grande Virgem, fazei-me, miserável pecador, reconhecer o nada que sou e humilhar-me de coração perante todos. — Reza-se uma Ave Maria."; 

    private String segundoDia =
            "II. Ó santíssima Virgem Maria, que, saudada e visitada pelo Arcanjo Gabriel, exaltada por Deus acima de todos os coros angélicos, "
          + "vos confessastes serva do Senhor: “Eis a serva do Senhor” — alcançai-me uma verdadeira humildade e uma pureza verdadeiramente angélica, "
          + "fazendo-me levar uma vida sempre digna das bênçãos de Deus. — Reza-se uma Ave Maria.";

    private String terceiroDia =
            "III. Alegro-me convosco, ó Virgem beatíssima, que com um só “fiat”, por vós proferido com tanta humildade, "
          + "do seio do Pai Eterno trouxestes ao vosso seio o Verbo divino. Trazei-me sempre a Deus ao coração e, com Ele no coração, "
          + "a graça de bendizer sempre o vosso “fiat”. — Reza-se uma Ave Maria."; 

    private String quartoDia =
            "IV. Ó grande Virgem Maria, a quem o Arcanjo Gabriel encontrou pronta e bem disposta à vontade de Deus, "
          + "fazei que, em todo encontro com Deus, favorável ou doloroso, eu diga sempre com resignação: "
          + "“Faça-se em mim segundo a vossa palavra”. — Reza-se uma Ave Maria.";

    private String quintoDia =
            "V. Bem sei, ó Maria Santíssima, que a vossa obediência vos uniu tão estreitamente a Deus, "
          + "mas confundo-me ao ver-me separado de Deus pelos meus pecados. Ajudai-me, ó Mãe benigna, "
          + "a arrepender-me sinceramente, a fim de unir-me outra vez ao vosso amado Jesus. — Reza-se uma Ave Maria."; 

    private String sextoDia =
            "VI. Se vós, ó Maria Santíssima, por vossa modéstia, vos perturbastes com a presença do Arcanjo São Gabriel, "
          + "encho-me eu de pavor, por minha grande soberba, ao apresentar-me diante de vós; também por vossa incomparável humildade, "
          + "imploro que me tireis das profundezas de minhas culpas. — Reza-se uma Ave Maria.";

    private String setimoDia =
            "VII. Embora eu tenha a língua impura, ó Virgem puríssima, desejo saudá-la a todo momento: “Ave, ave, cheia de graça”, "
          + "e de coração vos suplico que participeis em minha alma um pouco daquela abundância de graça de que fostes cheia. — Reza-se uma Ave Maria."; 

    private String oitavoDia =
            "VIII. Creio, ó Maria Santíssima, que Deus, que esteve sempre convosco desde a vossa Conceição até a Encarnação, "
          + "vos suplico que me façais estar sempre sinceramente unido ao meu amado Senhor Jesus por meio da graça santificante. — Reza-se uma Ave Maria."; 

    private String nonoDia =
            "IX. Abençoai-me o coração, abençoai-me a alma, ó Santíssima Virgem Maria, assim como fostes sempre abençoada por Deus "
          + "com todos os dons — “Bendita sois vós entre as mulheres” — confiando que, se vós me abençoardes, já nesta vida "
          + "serei ainda mais bendito depois da morte por toda a eternidade na glória. — Reza-se uma Ave Maria."; 

    private String ladainha =
            "Ladainha de Nossa Senhora (todos os dias):\n"
          + "Senhor, tende piedade de nós.\n"
          + "Jesus Cristo, tende piedade de nós.\n"
          + "Senhor, tende piedade de nós.\n"
          + "Jesus Cristo, ouvi-nos.\n"
          + "Jesus Cristo, atendei-nos.\n"
          + "Santa Maria, rogai por nós.\n"
          + "(…continua como no texto tradicional da Ladainha de Nossa Senhora)";

    private String oracaoFinal =
            "Oração final (todos os dias):\n"
          + "℣. O Anjo do Senhor anunciou a Maria.\n"
          + "℟. E ela concebeu do Espírito Santo.\n\n"
          + "Oremos. Deus, que quisestes que o vosso Verbo, ao anúncio do Anjo, assumisse a carne no útero da Virgem Maria: "
          + "concedei-nos, nós vos suplicamos, que os que nela cremos como verdadeira Mãe de Deus sejamos assistidos junto de Vós pela sua intercessão. "
          + "Por Cristo, Senhor nosso. Amém."; 

    private String disponivel = "https://padrepauloricardo.org/blog/novena-a-nossa-senhora-da-anunciacao";
}
