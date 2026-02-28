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
public class NovenaPurificacao implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena para a Purificação de Nossa Senhora";

    private String periodo = "Normalmente feita dos dias 24 de Janeiro à 01 de Fevereiro.";

    private String oracaoPreparatoria = "Vinde, Espírito Santo, enchei o coração dos vossos fiéis e acendei neles o fogo do vosso amor.\n"
            + "\n"
            + "℣. Enviai o vosso Espírito, e tudo será criado.\n"
            + "\n"
            + "℟. E renovareis a face da terra.\n"
            + "\n"
            + "Oremos. Ó Deus, que instruístes os corações dos vossos fiéis com a luz do Espírito Santo, concedei-nos amar, no mesmo Espírito, o que é reto e gozar sempre a sua consolação. Por Cristo, Senhor nosso. ℟. Amém.\n"
            + "\n"
            + "— Em seguida, reza-se a oração do dia:";

    private String primeiroDia = "Ó Espelho puríssimo de todas as virtudes, Maria Santíssima! Vós, passados quarenta dias após o parto, quisestes, sendo embora a mais pura das virgens, apresentar-vos no Templo segundo a Lei para serdes purificada. Fazei que, à vossa imitação, mantenhamos o nosso coração puro de toda culpa, para merecermos assim apresentar-nos no templo da glória. — Ave-Maria.";

    private String segundoDia = "Ó Virgem obedientíssima! Apresentando-vos no Templo, quisestes oferecer o sacrifício de costume, à semelhança de todos os outros dons. Fazei que também nós, seguindo o vosso exemplo, saibamos oferecer-nos em sacrifício a Deus pela prática das virtudes. — Ave-Maria.";

    private String terceiroDia = "Ó Virgem puríssima! Vós, observando as prescrições da Lei, não temestes ser considerada impura pelos homens. Alcançai-nos a graça de mantermos sempre puro o nosso coração, ainda que pareçamos culpados aos olhos do mundo— Ave-Maria.";

    private String quartoDia = "Ó Virgem Santíssima! Vós, oferecendo o vosso divino Filho ao Pai Eterno, fizestes o céu todo alegrar-se. Apresentai o nosso pobre coração a Deus, para que, com a sua graça, Ele o preserve sempre do pecado mortal. — Ave-Maria.";

    private String quintoDia = "Ó Virgem humílima! Vós, entregando Jesus nas mãos do justo Simeão, lhe enchestes a alma de celestes doçuras. Entregai o nosso coração a Deus, para que Ele o cumule de seu santo Espírito. — Ave-Maria.";

    private String sextoDia = "Ó Virgem diligentíssima! Vós, resgatando segundo a Lei o vosso Filho, cooperastes para a salvação do mundo. Resgatai o nosso pobre coração da escravidão do pecado, para que seja sempre puro diante de Deus. — Ave-Maria.";

    private String setimoDia = "Ó Virgem clementíssima! Vós, ouvindo do profeta Simeão o anúncio de vossas dores, prontamente vos conformastes às disposições de Deus. Fazei que também nós, conformados sempre à vontade divina, suportemos com paciência todas as tribulações. — Ave-Maria.";

    private String oitavoDia = "Ó Virgem pientíssima! Vós, enchendo a profetisa Ana, por meio de vosso divino Filho, de luz soberana a fizestes louvar a misericórdia de Deus ao reconhecer Jesus como o Redentor do mundo. Enchei-nos a alma de graça celeste, para que possamos gozar abundantemente dos frutos da divina Redenção. — Ave-Maria.";

    private String nonoDia = "Ó Virgem mansíssima! Vós, prevendo a dolorosa Paixão do vosso Filho, sentistes a vossa alma ser trespassada de dor e, conhecendo a aflição do vosso esposo José pelos vossos padecimentos, o consolates com santas palavras. Trespassai-nos a alma com dor verdadeira por nossos pecados, para termos a consolação de participar de vossa glória no Paraíso. — Ave-Maria.";

    private String disponivel = "https://padrepauloricardo.org/blog/novena-em-preparacao-a-festa-da-purificacao-de-nossa-senhora";

    private String ladainha = "Senhor, tende piedade de nós.\n"
            + "Jesus Cristo, tende piedade de nós.\n"
            + "Senhor, tende piedade de nós.\n"
            + "\n"
            + "Jesus Cristo, ouvi-nos.\n"
            + "Jesus Cristo, atendei-nos.\n"
            + "\n"
            + "Pai celeste que sois Deus, tende piedade de nós.\n"
            + "Filho, Redentor do mundo, que sois Deus, tende piedade de nós.\n"
            + "Espírito Santo, que sois Deus, tende piedade de nós.\n"
            + "Santíssima Trindade, que sois um só Deus, tende piedade de nós.\n"
            + "\n"
            + "Santa Maria, rogai por nós.\n"
            + "Santa Mãe de Deus, rogai por nós.\n"
            + "Santa Virgem das Virgens, rogai por nós.\n"
            + "Mãe de Jesus Cristo, rogai por nós.\n"
            + "Mãe da Divina graça, rogai por nós.\n"
            + "Mãe puríssima, rogai por nós.\n"
            + "Mãe castíssima, rogai por nós.\n"
            + "Mãe imaculada, rogai por nós.\n"
            + "Mãe intacta, rogai por nós.\n"
            + "Mãe amável, rogai por nós.\n"
            + "Mãe admirável, rogai por nós.\n"
            + "Mãe do bom conselho, rogai por nós.\n"
            + "Mãe do Criador, rogai por nós.\n"
            + "Mãe do Salvador, rogai por nós.\n"
            + "Mãe da Igreja, rogai por nós.\n"
            + "\n"
            + "Virgem prudentíssima, rogai por nós.\n"
            + "Virgem venerável, rogai por nós.\n"
            + "Virgem louvável, rogai por nós.\n"
            + "Virgem poderosa, rogai por nós.\n"
            + "Virgem clemente, rogai por nós.\n"
            + "Virgem fiel, rogai por nós.\n"
            + "\n"
            + "Espelho de justiça, rogai por nós.\n"
            + "Sede de sabedoria, rogai por nós.\n"
            + "Causa da nossa alegria, rogai por nós.\n"
            + "Vaso espiritual, rogai por nós.\n"
            + "Vaso honorífico, rogai por nós.\n"
            + "Vaso insigne de devoção, rogai por nós.\n"
            + "Rosa mística, rogai por nós.\n"
            + "Torre de Davi, rogai por nós.\n"
            + "Torre de marfim, rogai por nós.\n"
            + "Casa de ouro, rogai por nós.\n"
            + "Arca da aliança, rogai por nós.\n"
            + "Porta do céu, rogai por nós.\n"
            + "Estrela da manhã, rogai por nós.\n"
            + "Saúde dos enfermos, rogai por nós.\n"
            + "Refúgio dos pecadores, rogai por nós.\n"
            + "Consoladora dos aflitos, rogai por nós.\n"
            + "Auxílio dos cristãos, rogai por nós.\n"
            + "\n"
            + "Rainha dos anjos, rogai por nós.\n"
            + "Rainha dos patriarcas, rogai por nós.\n"
            + "Rainha dos profetas, rogai por nós.\n"
            + "Rainha dos apóstolos, rogai por nós.\n"
            + "Rainha dos mártires, rogai por nós.\n"
            + "Rainha dos confessores, rogai por nós.\n"
            + "Rainha das virgens, rogai por nós.\n"
            + "Rainha de todos os santos, rogai por nós.\n"
            + "Rainha concebida sem pecado original, rogai por nós.\n"
            + "Rainha elevada ao céu em corpo e alma, rogai por nós.\n"
            + "Rainha do sacratíssimo Rosário, rogai por nós.\n"
            + "Rainha da paz, rogai por nós.\n"
            + "\n"
            + "Cordeiro de Deus, que tirais os pecados do mundo, perdoai-nos Senhor.\n"
            + "Cordeiro de Deus, que tirais os pecados do mundo, ouvi-nos Senhor.\n"
            + "Cordeiro de Deus, que tirais os pecados do mundo, tende piedade de nós.\n"
            + "\n"
            + "℣. Rogai por nós, Santa Mãe de Deus,\n"
            + "℟. Para que sejamos dignos das promessas de Cristo.\n"
            + "\n"
            + "Oremos.\n"
            + "Senhor Deus, nós Vos suplicamos que concedais aos vossos servos perpétua saúde de alma e de corpo; e que, pela gloriosa intercessão da bem-aventurada sempre Virgem Maria, sejamos livres da presente tristeza e gozemos da eterna alegria. Por Cristo Nosso Senhor.\n"
            + "Amém.\n"
            + "\n"
            + "— Por fim, reza-se:\n"
            + "\n"
            + "℣. Tinha o Espírito Santo revelado a Simeão.\n"
            + "℟. Que não veria a morte sem ver primeiro o Cristo do Senhor.\n"
            + "\n"
            + "Oremos. Ó Deus eterno e todo-poderoso, suplicamos à vossa divina majestade que, assim como o vosso Filho Unigênito foi apresentado no Templo com a substância de nossa carne, nos façais comparecer purificados à vossa presença.";
}
