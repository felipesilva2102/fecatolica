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
public class NovenaSaoJoaoBoscoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a São João Bosco";

    private String periodo = "Normalmente feita dos dias 22 de Janeiro à 30 de Janeiro.";

    private String oracaoInicial = "Em nome do Pai e do Filho e do Espírito Santo. Amém.\n"
            + "\n"
            + "Vinde Espírito Santo,\n"
            + "enchei os corações dos vossos fiéis\n"
            + "e acendei neles o fogo do vosso amor. \n"
            + "\n"
            + "℣. Enviai o vosso Espírito e tudo será criado,\n"
            + "℟. E renovareis a face da terra.\n"
            + "\n"
            + "Oremos: Deus, que instruístes os corações dos vossos fiéis\n"
            + "com a luz do Espírito Santo,\n"
            + "fazei que apreciemos retamente todas as coisas,\n"
            + "segundo o mesmo Espírito,\n"
            + "e gozemos sempre da sua consolação.\n"
            + "Por Cristo Senhor Nosso. Amém.\n\n"
            + "Oração a Dom Bosco\n"
            + "\n"
            + "Ó Glorioso São João Bosco,\n"
            + "quando estáveis nesta terra,\n"
            + "não havia ninguém que, acudindo a vós,\n"
            + "não fosse por vós mesmo\n"
            + "benignamente recebido, consolado e ajudado.\n"
            + "Agora no céu, onde a caridade atinge a perfeição,\n"
            + "quanto deve arder vosso grande coração\n"
            + "em amor aos necessitados!\n"
            + "Vede, pois, as minhas presentes necessidades\n"
            + "e ajudai-me, obtendo-me do Senhor a graça...\n"
            + "(pede-se a graça).\n"
            + "Também vós haveis experimentado durante a vida\n"
            + "as privações, as enfermidades, as contradições,\n"
            + "a incerteza do porvir, as ingratidões, as afrontas,\n"
            + "as calúnias, as perseguições e sabeis que coisa é sofrer.\n"
            + "Por isso, ó Dom Bosco santo,\n"
            + "volvei até mim vosso bondoso olhar\n"
            + "e obtende do Senhor quanto vos peço,\n"
            + "se for vantajoso para minha alma;\n"
            + "e se assim não o for, obtende alguma outra graça\n"
            + "que me seja ainda mais útil\n"
            + "e uma conformidade filial à divina vontade\n"
            + "em todas as coisas,\n"
            + "ao mesmo tempo que uma vida virtuosa\n"
            + "e uma santa morte. Amém.";

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

    private String primeiroDia = "“Quereis que o Senhor vos conceda muitas graças? Visitai-o frequentemente. Quereis que Ele vos conceda poucas? Visitai-o raramente.”\n"
            + "\n"
            + "Glorioso São João Bosco, pelo amor ardente que tivestes a Jesus Sacramentado e pelo zelo com que propagastes seu culto, sobretudo com a assistência da Santa Missa, com a Comunhão frequente e com a visita cotidiana ao Santíssimo Sacramento; alcançai-nos a graça de crescer cada vez mais no amor e na prática de tão santas devoções, e de terminar nossos dias fortalecidos e confortados pelo celestial alimento da Divina Eucaristia.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String segundoDia = "“Quem confia em Maria nunca ficará desiludido”\n"
            + "\n"
            + "Glorioso São João Bosco, pelo amor que tivestes à Virgem Auxiliadora, vossa mãe e mestra; alcançai-nos uma verdadeira e constante devoção a tão dulcíssima mãe, a fim de que, como filhos seus devotíssimos, possamos merecer seu valioso patrocínio nesta vida e de um modo especial na hora de nossa morte.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String terceiroDia = "“A oração é o primeiro alimento, como o pão é o alimento do corpo. Há que rezar com uma ilimitada esperança de ser ouvidos”\n"
            + "\n"
            + "Glorioso São João Bosco, pelo amor filial que tivestes à Santa Igreja e ao Sumo Pontífice, a quem defendestes constantemente; alcançai-nos a graça de ser sempre dignos filhos da Igreja Católica, e de amar o Papa e venerar nele a infalibilidade de Vigário de Nosso Senhor Jesus Cristo.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String quartoDia = "“Em cada manhã entregai a Deus as ocupações do dia; e fazei cada coisa como se fosse a última da vossa vida”\n"
            + "\n"
            + "Glorioso São João Bosco, pelo grande amor com que amastes a juventude, fazendo-se pai e mestre dela, e pelos heroicos sacrifícios que fizestes por sua salvação; fazei que também nós amemos com um amor santo e generoso a esta porção eleita do Sagrado Coração de Jesus, e que em todo jovem contemplemos a pessoa adorável de nosso divino Salvador.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String quintoDia = "“A oração faz violência ao coração de Deus”\n"
            + "\n"
            + "Glorioso São João Bosco, vós que, a fim de continuar a estender sempre mais vosso santo apostolado, fundastes a Sociedade Salesiana e o Instituto das Filhas de Maria Auxiliadora; fazei que os membros destas duas famílias religiosas estejam sempre cheios de vosso espírito e sejam fiéis imitadores de vossas heroicas virtudes.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String sextoDia = "“Dom Bosco, em sua vida, jamais será capaz de afastar quem lhe peça para ficar com ele”\n"
            + "\n"
            + "Glorioso São João Bosco, vós que a fim de obter no mundo mais abundantes frutos de exercício da fé e de terníssima caridade, instituístes a União dos Cooperadores Salesianos; fazei que estes sejam sempre modelos das virtudes cristãs e providenciais ajudantes de vossas obras.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String setimoDia = "“Ajude sempre os seus colegas. Mesmo que lhe custe sacrifício. A santidade está toda aqui”\n"
            + "\n"
            + "Glorioso São João Bosco, vós que amastes com amor inefável a todas as almas, e que para salvá-las enviastes vossos filhos até os últimos confins da terra; fazei que também nós pensemos continuamente na salvação de nossas almas e cooperemos com todos os meios possíveis para salvar tantos pobres irmãos nossos.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String oitavoDia = "“Amem muito a castidade. Lembrem-se, para conservá-la é precioso trabalhar e rezar.”\n"
            + "\n"
            + "Glorioso São João Bosco, vós que amastes com um amor de predileção a bela virtude da pureza, e a tomastes como exemplo, com a palavra e com os escritos; fazei que também nós, enamorados de tão indispensável virtude, a pratiquemos constantemente e a difundamos com todas nossas forças.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String nonoDia = "“Quem perseverar até o fim, será salvo”\n"
            + "\n"
            + "Glorioso São João Bosco, vós que fostes sempre tão compassivo com as humanas desventuras, dirigi um olhar a nós, tão necessitados de vosso auxílio. Fazei descer sobre nós e sobre nossas famílias as maternais bênçãos de Maria Auxiliadora; alcançai-nos todas aquelas graças espirituais e temporais de que necessitamos: intercedei por nós na vida e na morte, a fim de que possamos cantar eternamente as divinas misericórdias no Paraíso Celestial.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria e Glória.";

    private String disponivel = "https://padrepauloricardo.org/blog/novena-a-sao-joao-bosco";
}
