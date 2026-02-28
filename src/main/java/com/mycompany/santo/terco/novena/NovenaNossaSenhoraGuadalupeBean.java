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
public class NovenaNossaSenhoraGuadalupeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Nossa Senhora de Guadalupe";

    private String periodo = "Normalmente feita dos dias 03 de Dezembro à 11 de Dezembro.";

    private String historia = "Numa manhã de sábado, 9 de dezembro de 1531, na colina de Tepeyac, nos arredores da atual Cidade do México, um pobre índio convertido, batizado com o nome cristão de Juan Diego, ouviu uma bela música como o chilrear de pássaros enquanto se dirigia à Missa em honra de Nossa Senhora. Tendo ouvido o que parecia ser um chamado, aproximou-se do local e deparou-se com uma formosa senhora, que se identificou como a Mãe de Deus.\n"
            + "\n"
            + "A senhora lhe pediu a construção de um santuário naquele local, ao que obedeceu prontamente Juan Diego procurando o bispo local. Este, incrédulo, não sem alguma insistência, o instruiu a solicitar prova aceitável da identidade da senhora. Três dias depois, ela mandou que o índio colhesse rosas no topo da colina, especialmente árido no frio mês de dezembro. Obedecendo às ordens da senhora, Juan Diego encontrou diversas rosas-de-castela, que não são nativas do México, e as entregou à senhora, que as arranjou em sua tilma (mistura de capa e avental, muito usada por aquele povo) dobrada em forma de cesto, e pediu que as mostrasse ao bispo. Quando Juan Diego desdobrou sua tilma na presença do bispo, as rosas caíram ao chão e revelaram a imagem da Santa Virgem miraculosamente impressa no tecido.\n"
            + "\n"
            + "Devoção iniciada após tais aparições, à Virgem de Guadalupe é atribuída uma das intercessões das mais portentosas na história da Igreja. Fontes estimam que pouco tempo depois das aparições, o número de convertidos já alcançava a casa dos nove milhões de índios, aumentando prodigiosamente os frutos do lento e custoso trabalho de evangelização daquelas terras.\n"
            + "\n"
            + "É difícil intuir a enormidade e a importância das ramificações dessas aparições e de sua devoção na história dos mexicanos: ela está tão fundamentalmente arraigada na cultura e na formação da nação mexicana, que hoje em dia há muitos que, mesmo sem professar a fé católica, se consideram devotos de Nossa Senhora de Guadalupe.\n"
            + "\n"
            + "A atual Basílica de Nossa Senhora de Guadalupe, construída em meados de 1970, é o santuário mais visitado pelos fiéis do mundo todo.";

    private String oracaoInicial = "Lembre-se ó bondosa Virgem de Guadalupe, que em vossa celestial aparição, prometestes mostrar vossa compaixão e piedade a todos que amam e creem em vós, procurando vosso auxílio e vos chamando em suas necessidades e aflições. Vós prometestes ouvir com atenção as nossas súplicas, enxugar nossas lágrimas e nos dar consolo e alívio. Nunca se soube que quem buscasse vossa proteção e implorasse vosso socorro ou procurasse vossa intercessão, mesmo nos pedidos de prosperidade, ou ansiedades pessoais, não fosse por vós atendidos. Inspirada por esta confiança venho até vós ó doce e sempre Virgem Maria, Mãe do Deus Verdadeiro!\n"
            + "\n"
            + "Sofrendo sob o peso dos nossos pecados, nós vimos nos prostrar diante de vossa augusta presença, certos de que vós ireis realizar vossas misericordiosas promessas. Nós estamos cheios de esperança, que sob vosso manto e proteção nada nos será problema ou aflição, nem temeremos as doenças e infortúnios, ou qualquer outro pesar.\n"
            + "\n"
            + "Vós quisestes permanecer conosco através da vossa admirável imagem, pois sois nossa Mãe, nossa saúde e nossa vida. Colocando-nos sob o vosso maternal olhar e recorrendo a vós em todas as nossas necessidades, não precisamos de mais nada. Ó Santa Mãe de Deus, não despreze nossos pedidos, mas por vossa misericórdia, ouvi-nos e respondei-nos. Amém.";

    private String oracaoFinal = "Lembrai-vos, ó bondosa Virgem de Guadalupe, que em vossa celestial aparição prometestes mostrar vossa compaixão e piedade a todos que amam e creem em vós, procurando vosso auxílio e vos chamando em suas necessidades e aflições. Prometestes ouvir com atenção as nossas súplicas, enxugar nossas lágrimas e nos dar consolo e alívio. Nunca se soube que quem buscasse vossa proteção e implorasse vosso socorro ou procurasse vossa intercessão, mesmo nos pedidos de prosperidade ou ansiedades pessoais, não fosse por vós atendido. Inspirado(a) por essa confiança, venho até vós, ó doce e sempre Virgem Maria, Mãe do Deus verdadeiro!\n"
            + "\n"
            + "Sofrendo sob o peso dos nossos pecados, viemos nos prostrar diante de vossa augusta presença, certos de que realizareis vossas misericordiosas promessas; viemos cheios de esperança que sob vosso manto e proteção nada nos será problema ou aflição, nem temeremos as doenças e infortúnios ou qualquer outro pesar.\n"
            + "\n"
            + "Quisestes permanecer conosco através da vossa admirável imagem, pois sois nossa Mãe, nossa saúde e nossa vida. Colocando-nos sob o vosso maternal olhar e recorrendo a vós em todas as nossas necessidades, não precisamos de mais nada. Ó Santa Mãe de Deus, não desprezeis nossos pedidos, mas, por vossa misericórdia, ouvi-nos e respondei-nos. Amém.\n"
            + "\n"
            + "Faça agora o seu pedido à Virgem nesta Novena de Nossa Senhora de Guadalupe.\n"
            + "\n"
            + "Pai Nosso, Ave-Maria, Glória ao Pai.\n"
            + "\n"
            + "Ó gloriosa Mãe de Deus, Nossa Senhora de Guadalupe, padroeira das Américas,\n"
            + "Tu és nossa mãe compassiva,\n"
            + "Curai nossas penas,\n"
            + "Nossas misérias e dores,\n"
            + "Acolhei-nos no aconchego do Teu manto,\n"
            + "Escutai mãe as nossas preces.\n"
            + "Amparai os doentes e desempregados,\n"
            + "Abençoai nossas casas e as nossas famílias,\n"
            + "Protegei nossos filhos,\n"
            + "Livrando-os das maldades e dos perigos desse mundo,\n"
            + "Guardai nossos lares,\n"
            + "Escondendo-os dos olhos dos maus,\n"
            + "Que neles o nome de Deus seja sempre invocado com respeito e amor,\n"
            + "Que os seus mandamentos sejam observados com fidelidade,\n"
            + "Que Vosso bendito nome, ó Mãe querida,\n"
            + "Seja sempre lembrado com muita devoção,\n"
            + "Que a palavra de Deus seja sempre meditada,\n"
            + "E seguida todos os dias da nossa vida.\n"
            + "Que a nossa obediência a Teu Filho Jesus,\n"
            + "Exale tal qual rosa um perfume de santidade.\n"
            + "Amém.";

    private String primeiroDia = "As palavras de Nossa Senhora de Guadalupe ditas ao índio S. Juan Diego a 9 de dezembro de 1531: “Meu querido filho a quem amo ternamente, saiba que eu sou a Virgem Maria, Mãe do Deus Verdadeiro. É Ele quem dá e mantém a vida, Criador de todas as coisas Senhor do céu e da terra, que está em todos os lugares. Eu desejo um templo a ser erguido aqui, onde possa manifestar a compaixão que tenho pelos nativos e por todos que solicitarem meu auxílio”.\n"
            + "\n"
            + "Estas vossas palavras, minha Mãe celestial, enchem meu coração de amor e gratidão com renovada fé, porque elas foram direcionadas à mim também. Por isso eu venho a vos, confiante de obter a vossa intercessão, a graça que me tornará capaz de viver de acordo com os ensinamentos do vosso Divino Filho, Jesus, a quem desejo amar de todo coração.\n"
            + "\n"
            + "Vós compartilhastes com todo o sofrimento do meu Salvador por mim, portanto, eu também vos pertenço, e vós sois minha amada Mãe. Não me abandone neste vale de lágrimas; tende piedade, eu vos procuro na minha pobreza e necessidade; tenha compaixão das minhas ansiedades e inquietações; assista-me nas minhas enfermidades e misérias.";

    private String segundoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "As misericordiosas palavras ditas na quarta e última visita a Juan Diego: “Não deixe nada afligir você, e não tenha medo das doenças, acidentes ou dores. Não estou aqui eu que sou sua Mãe? você não está sob meu manto e proteção? você necessita de mais alguma coisa?”\n"
            + "\n"
            + "Essas vossas palavras foram também dirigidas a mim e elas enchem meu coração de alegria e esperança. Volva então, vossos olhos misericordiosos a mim; aperfeiçoa meu amor a vós.\n"
            + "\n"
            + "Por este amor, que seja possível eu colocar aos vossos pés, todos os meus problemas e preocupações, sabendo que vós ireis se lembrar porque sois minha Mãe, que sob vosso manto e proteção, obtereis para mim a consolação que tanto necessito.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String terceiroDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "Quando visitastes, Juan Bernardino, o tio moribundo de Juan Diego, curando-o e dizendo o vosso nome: “Imaculada Virgem Maria que esmagou a cabeça da serpente”, vós enchestes os corações dos Índios Nativos de alegria. Dissestes que eles não precisariam mais fazer sacrifícios humanos aos ídolos pagãos.\n"
            + "\n"
            + "Salve Rainha Mãe de misericórdia. Nossa vida, nossa doçura e nossa esperança! Permita-me juntar-me com cânticos e louvores à esta nação, onde muitos vieram de longe, a ofertar ao vosso trono, presentes e preces neste dia.\n"
            + "\n"
            + "Rogai por nós Santa Mãe de Deus, eliminando a serpente do mal de nossas vidas, que possamos ser dignos das promessas de Cristo vosso Divino Filho.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String quartoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "Quando os índios viram a admirável imagem dela deixada no poncho de Juan Diego, eles reconheceram que aquela pintura impressa continha uma mensagem celestial dirigida a eles. Sua régia figura na forma de uma mulher, ensinou-lhes que a sua moradia naquele momento era necessária que fosse na terra.\n"
            + "\n"
            + "Os raios de sol, as nuvens rodeando seu corpo, as estrelas sobre seu manto, a lua crescente sob seus pés, os anjos que a transportam pelo espaço, tudo denota que sua atual permanência é no céu e chama a atenção deles para a imortalidade da alma humana.\n"
            + "\n"
            + "Ó Santa Maria, como a vossa imagem no poncho de Juan Diego ensinou aos índios, ensina-me também nunca esquecer da imortalidade da minha alma, que o céu é meu objetivo e minha herança. No meio das tentações e das misérias desta vida, deixa-me sempre pensar nesta morada de paz, de glória e eterna felicidade.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String quintoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "Por séculos os nativos do México adoraram o sol como deus, sacrificando inúmeros seres humanos em sua honra. Mas quando eles contemplaram a bela imagem onde somente os raios eram bem visíveis, eles entenderam a lição a que estavam sendo conduzidos. Depois dos índios terem ouvido a vossa mensagem e lido o que a vossa imagem contém, eles abandonaram seus falsos deuses e abraçaram a amada doutrina do vosso Divino Filho.\n"
            + "\n"
            + "Nunca eles cessaram de agradecer pela grande misericórdia que o Deus Todo Poderoso lhes mostrou quando Ele vos enviou a eles para ser sua Rainha, sua Mãe e sua mestra.\n"
            + "\n"
            + "Oh Santa Maria, pelo mistério da Encarnação do vosso amado Filho, Nosso Senhor Jesus Cristo, onde nossa salvação começou, conceda-nos luz para entender a grandeza do benefício por Ele a nós concedido tornando-se nosso irmão e nos dando a vossa venerável mãe, para ser também a nossa mãe.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String sextoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "O fogo que ardeu nos altares dos falsos deuses, se extinguiu para sempre depois que os índios contemplaram vossa imagem e viram vosso manto como o firmamento coberto de estrelas.\n"
            + "\n"
            + "Isto lhes mostrou que as estrelas foram criadas pelo Deus Invisível para servir a humanidade e, portanto não poderiam ser por eles divinizadas, adoradas e dadas em sacrifício.\n"
            + "\n"
            + "Santíssima Virgem Maria, que através da imagem estampada no poncho do Índio, trouxe milhões de pagãos à luz da verdadeira fé; eu peço a Vós obter-me a graça do entendimento que esta mensagem contém. Derrama sobre mim a luz do vosso semblante; dirija e santifica meus empreendimentos.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String setimoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "O emblema de nossa redenção estampado sobre o broche dourado preso sobre vossa túnica serviu para dizer aos índios que a religião que eles haviam abraçado era a mesma que a dos seus conquistadores; a cruz sobre a bandeira de Hernando Cortez e a do broche eram as mesmas. Quando eles a viram sobre a imagem, se juntaram ao redor do missionário espanhol ansiosos para saber seu significado.\n"
            + "\n"
            + "Eles lhes contaram como o Salvador veio do céu para redimir a raça humana através da sua morte na cruz e como a Virgem Mãe da Divina Vítima associou a ele no mistério da nossa redenção.\n"
            + "\n"
            + "Feliz a nação a quem Ele se revelou a si mesmo e a Deus. Santa Virgem Maria de Guadalupe, minha rainha e mãe, mais de 400 anos se passaram desde que falastes com S. Juan Diego, e até agora um pequeno número de seus filhos em outras terras ficaram cientes do propósito da vossa imagem sobre o altar do vosso santuário. Inspira-nos então a ver nesta miraculosa pintura, o instrumento para a conversão de todos à Fé Católica e Apostólica, vós que sois a adorável Rainha e Mãe dos Apóstolos e Missionários.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String oitavoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "Depois que S. Juan Diego cortou as flores que brotaram repentinamente naquela desoladora colina, ele as trouxe a Vós, no pé da montanha onde o aguardavas. Com vossas próprias mãos, vós as colocastes no poncho dele, atando-o no seu pescoço, dizendo-lhe que as levasse ao bispo Zumarraga, que este sinal o induziria a iniciar a construção do templo. As últimas palavras que ele ouviu dos vossos adoráveis lábios foram: “você é meu embaixador digno de confiança, vá em paz”\n"
            + "\n"
            + "A sagrada pintura sobre aquele poncho de qualidade inferior não poderia ter sido pintada por mãos humanas. Ela convenceu o bispo como convenceu a todas as pessoas que a viram, que a mensagem de Juan Diego era verdadeira.\n"
            + "\n"
            + "Humildemente eu vos imploro, minha Rainha e Mãe, deixa-me ser vossa embaixatriz como Juan Diego, a divulgar a doutrina contida na vossa imagem, a todos meus amigos e convence-los também, acreditem eles ou não.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String nonoDia = "(Fazer a oração inicial)\n"
            + "\n"
            + "Óh, Santa Virgem, entronizada no coração de uma nação de idólatras, vós fizestes um maravilhoso trabalho de conversão.\n"
            + "\n"
            + "Depois de verem a vossa imagem sobre o poncho de Juan Diego, os índios tiraram de seus templos, todos os ídolos, construíram belas igrejas em cujas torres as cruzes brilhavam à luz do sol, e os enormes tambores que em inúmeras vezes anunciaram sacrifícios humanos em honra aos seus deuses, não se ouviu nunca mais.\n"
            + "\n"
            + "Como nos remanescentes 17 anos de sua vida, Juan Diego divulgou a mensagem aos índios, permita-me minha amada Mãe, ajudar a humanidade a conhecer vossa celestial mensagem entre os meus conterrâneos. Anima e abençoa a todos os que se juntarem neste Apostolado e Novena, a fim de propagar a religião Católica entre seus amigos, tendo como bandeira vossa admirável imagem sobre o poncho de Juan Diego, junto com a cruz, emblema de nossa redenção.\n"
            + "\n"
            + "(Fazer a oração final)";

    private String disponivel = "https://bibliotecacatolica.com.br/blog/novenas/novena-de-nossa-senhora-de-guadalupe/?srsltid=AfmBOook9CAKFPeO-F5_W57nvAPAFdmXeT11cp5DlgLyb4XXTKqv9-9O";
}
