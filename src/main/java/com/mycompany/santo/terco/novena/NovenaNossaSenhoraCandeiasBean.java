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
public class NovenaNossaSenhoraCandeiasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Nossa Senhora das Candeias";

    private String periodo = "Normalmente feita dos dias 24 de Janeiro à 01 de Fevereiro.";

    private String historia = "Nossa Senhora das Candeias, celebrada em 2 de fevereiro, é uma devoção que remonta à purificação de Maria e à apresentação do Menino Jesus no Templo, seguindo a tradição mosaica. Também conhecida como Nossa Senhora da Luz ou da Candelária, a devoção inclui relatos como a aparição nas Ilhas Canárias, onde pastores encontraram uma imagem iluminada por velas sustentadas por forças invisíveis. A procissão das velas, instituída pelo Papa Gelásio I no século V, tornou-se símbolo da luz de Cristo para o mundo.";

    private String oracaoInicial = "I. Saudamos-vos Senhora das Candeias, doce Mãe de Deus, por aquela ardente caridade com que quiseste manifestar as misericórdias do vosso Filho, aparecendo em uma gruta deserta cuja as águas milagrosas servem de remédio para os enfermos. Nós vos pedimos a graça de fazerdes brilhar na obscuridade do nosso pobre coração a misericórdia de Jesus, concedendo-vos a graça que imploramos… (peça a graça especial que deseja alcançar) Para a honra do mesmo Senhor Nosso, Jesus Cristo. Amém.\n"
            + "\n"
            + "Jaculatória: Ó Virgem Mãe das Candeias, estrela resplandecente, livrai-nos de todas as trevas que cercam a nossa mente. Ave Maria.\n"
            + "\n"
            + "II. Saudamos-vos Senhora das Candeias, doce Mãe de Deus, por aquela profunda humildade com que quiseste estar, por espaço de trezentos anos em um lugar assim pobre, longe de todo o bulício e rodeadas de pobres choupanas, para nos mostrar ainda uma vez, vosso amor, a vossa simplicidade e vosso desapego do mundo. Por este belo exemplo que nos dais, pedimos que desapegueis o nosso coração de todas as vaidades da terra e o conformeis de tudo com a divina vontade, para mais facilmente alcançar a graça que imploramos… (peça a graça especial que deseja alcançar) Por amor do vosso bendito filho. Amém!\n"
            + "\n"
            + "Jaculatória: Das vossas divinas graças, nossas almas estão cheias, por vossa misericórdia, ó Mãe de Deus das Candeias. Ave Maria.\n"
            + "\n"
            + "III. Saudamos-vos, Senhora das Candeias, doce Mãe de Deus, por bondade satisfazeis aos romeiros que de todas as partes acorrem aos vossos pés, para pedir as graças desejadas, e a todos atendei com entranhas de Mãe extremosa. Por essa grande do vosso materno coração, fazei que entreguemos a Deus, sem reservas e obtenhamos a graça de que vos pedimos nesta Novena… (peça a graça especial que deseja alcançar) Para o bem da nossa alma e para a glória do vosso bendito Filho. Amém.\n"
            + "\n"
            + "Jaculatória: Por vossos grandes milagres, rogamos Mãe de Jesus, que nos livreis do pecado e nos deis a vossa Luz. Ave Maria.";

    private String ladainha = "Senhor, tende piedade de nós.\n"
            + " Jesus Cristo, tende piedade de nós.\n"
            + " Senhor, tende piedade de nós.\n"
            + " Jesus Cristo, ouvi-nos.\n"
            + " Jesus Cristo, atendei-nos.\n"
            + " Pai celeste que sois Deus, tende piedade de nós.\n"
            + " Filho, Redentor do mundo, que sois Deus, tende piedade de nós.\n"
            + " Espírito Santo, que sois Deus, tende piedade de nós.\n"
            + " Santíssima Trindade, que sois um só Deus, tende piedade de nós.\n"
            + " Santa Maria, rogai por nós.\n"
            + " Santa Mãe de Deus, rogai por nós.\n"
            + " Santa Virgem das Virgens, rogai por nós.\n"
            + " Mãe de Jesus Cristo, rogai por nós.\n"
            + " Mãe da divina graça, rogai por nós.\n"
            + " Mãe puríssima, rogai por nós.\n"
            + " Mãe castíssima, rogai por nós.\n"
            + " Mãe imaculada, rogai por nós.\n"
            + " Mãe intacta, rogai por nós.\n"
            + " Mãe amável, rogai por nós.\n"
            + " Mãe admirável, rogai por nós.\n"
            + " Mãe do bom conselho, rogai por nós.\n"
            + " Mãe do Criador, rogai por nós.\n"
            + " Mãe do Salvador, rogai por nós.\n"
            + " Mãe da Igreja, rogai por nós.\n"
            + " Virgem prudentíssima, rogai por nós.\n"
            + " Virgem venerável, rogai por nós.\n"
            + " Virgem louvável, rogai por nós.\n"
            + " Virgem poderosa, rogai por nós.\n"
            + " Virgem clemente, rogai por nós.\n"
            + " Virgem fiel, rogai por nós.\n"
            + " Espelho de justiça, rogai por nós.\n"
            + " Sede de sabedoria, rogai por nós.\n"
            + " Causa da nossa alegria, rogai por nós.\n"
            + " Vaso espiritual, rogai por nós.\n"
            + " Vaso honorífico, rogai por nós.\n"
            + " Vaso insigne de devoção, rogai por nós.\n"
            + " Rosa mística, rogai por nós.\n"
            + " Torre de Davi, rogai por nós.\n"
            + " Torre de marfim, rogai por nós.\n"
            + " Casa de ouro, rogai por nós.\n"
            + " Arca da aliança, rogai por nós.\n"
            + " Porta do céu, rogai por nós.\n"
            + " Estrela da manhã, rogai por nós.\n"
            + " Saúde dos enfermos, rogai por nós.\n"
            + " Refúgio dos pecadores, rogai por nós.\n"
            + " Consoladora dos aflitos, rogai por nós.\n"
            + " Auxílio dos cristãos, rogai por nós.\n"
            + " Rainha dos anjos, rogai por nós.\n"
            + " Rainha dos patriarcas, rogai por nós.\n"
            + " Rainha dos profetas, rogai por nós.\n"
            + " Rainha dos apóstolos, rogai por nós.\n"
            + " Rainha dos mártires, rogai por nós.\n"
            + " Rainha dos confessores, rogai por nós.\n"
            + " Rainha das virgens, rogai por nós.\n"
            + " Rainha de todos os santos, rogai por nós.\n"
            + " Rainha concebida sem pecado original, rogai por nós.\n"
            + " Rainha elevada ao céu em corpo e alma, rogai por nós.\n"
            + " Rainha do sacratíssimo Rosário, rogai por nós.\n"
            + " Rainha da paz, rogai por nós.\n"
            + "\n"
            + "Cordeiro de Deus, que tirais os pecados do mundo, perdoai-nos Senhor.\n"
            + " Cordeiro de Deus, que tirais os pecados do mundo, ouvi-nos Senhor.\n"
            + " Cordeiro de Deus, que tirais os pecados do mundo, tende piedade de nós.\n"
            + "\n"
            + "℣. Rogai por nós, Santa Mãe de Deus,\n"
            + " ℟. Para que sejamos dignos das promessas de Cristo.\n"
            + "\n"
            + "Oremos. Senhor Deus, nós Vos suplicamos que concedais aos vossos servos perpétua saúde de alma e de corpo; e que, pela gloriosa intercessão da bem-aventurada sempre Virgem Maria, sejamos livres da presente tristeza e gozemos da eterna alegria. Por Cristo Nosso Senhor. Amém.";

    private String oracaoFinal = "Deus, qui sanctum Joánnem Confessórem tuum\n"
            + "adolescéntium patrem et magístrum excitásti,\n"
            + "ac per eum, auxiliatríce Vírgine María,\n"
            + "novas in Ecclésia tua famílias floréscere voluísti:\n"
            + "concéde, quǽsumus;\n"
            + "ut, eódem caritátis igne succénsi,\n"
            + "ánimas quǽrere, tibíque soli servíre valeámus.\n"
            + "Per Dóminum nostrum Iesum Christum, Filium tuum:\n"
            + "Qui tecum vivit et regnat\n"
            + "in unitáte Spíritus Sancti, Deus:\n"
            + "per omnia sǽcula sǽculorum. ℟. Amen.\n"
            + "\n"
            + "Ó Deus, que suscitaste São João, vosso Confessor,\n"
            + "como pai e mestre dos jovens\n"
            + "e por ele, auxiliado pela Virgem Maria,\n"
            + "quisestes florescessem novas famílias em vossa Igreja,\n"
            + "concedei, vos rogamos,\n"
            + "que, inflamados pelo mesmo fogo da caridade,\n"
            + "busquemos as almas\n"
            + "e a vós somente sirvamos.\n"
            + "Por nosso Senhor Jesus Cristo, vosso Filho,\n"
            + "que convosco vive e reina\n"
            + "na unidade do Espírito Santo. ℟. Amém.\n"
            + "\n"
            + "Oração a Nossa Senhora Auxiliadora\n"
            + "(composta por São João Bosco)\n"
            + "\n"
            + "O Maria, Vergine potente,\n"
            + "Tu grande illustre presidio della Chiesa;\n"
            + "Tu aiuto meraviglioso dei Cristiani;\n"
            + "Tu terribile come esercito schierato a battaglia;\n"
            + "Tu sola hai distrutto ogni eresia in tutto il mondo;\n"
            + "Tu nelle angustie, nelle lotte, nelle strettezze\n"
            + "difendici dal nemico e nell'ora della morte\n"
            + "accogli l'anima nostra in Paradiso!\n"
            + "Amen.\n"
            + "\n"
            + "Ó Maria, Virgem poderosa,\n"
            + "vós, grande e ilustre defensora da Igreja;\n"
            + "vós, Auxílio maravilhoso dos cristãos,\n"
            + "vós, terrível como um exército em ordem de batalha;\n"
            + "vós, que, sozinha, destruístes toda heresia no mundo inteiro;\n"
            + "nas angústias, nas lutas, nas aflições,\n"
            + "defendei-nos do inimigo;\n"
            + "e, na hora da morte,\n"
            + "acolhei a nossa alma no Paraíso!\n"
            + "Amém.";

    private String disponivel = "https://rumoasantidade.com.br/novena-a-nossa-senhora-das-candeias/?srsltid=AfmBOoqRNtmUOuMM27i6U6zGQCeaBiE8AYvRfpDOEkcsRIa2r14Xc1Np#google_vignette";
}
