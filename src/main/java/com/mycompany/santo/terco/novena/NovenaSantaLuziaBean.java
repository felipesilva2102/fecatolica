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
public class NovenaSantaLuziaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Santa Luzia";

    private String periodo = "Normalmente feita dos dias 04 de Dezembro à 12 de Dezembro.";

    private String historia = "Conhecida como padroeira ou “protetora dos olhos”, peçamos a Santa Luzia que, num mundo onde reinam a vaidade, a sensualidade e a nudez, nossos olhos — que são janelas da nossa alma — estejam sob sua proteção e sejam iluminados pela luz de Cristo, não consentindo jamais se, por infelicidade, avistarem ofensas à santa pureza. Reze conosco as orações da Novena a Santa Luzia.";

    private String oracaoInicial = "Reza-se no início de todos os dias da novena, antes da meditação.\n"
            + "\n"
            + "Soberano e Altíssimo Deus e Senhor nosso, que levais a bem e Vos apraz, que honremos os Vossos servos, que depois de nos terem dado exemplo neste mundo de todas as virtudes cristãs, reinam hoje convosco na eterna bem-aventurança. Louvores eternos Vos sejam dados, pois Vós nos mostrais que nos não é impossível a prática dos Vossos mandamentos, e até mesmo sofrer por Vós os tormentos e a morte. Vós, Senhor, no-lo mostrais na gloriosa donzela S. Luzia, a quem destes o ânimo varonil que é necessário para o martírio.\n"
            + "\n"
            + "Dignai-vos, Senhor, vir em nosso auxílio, quando nestes nove dias queremos meditar nas suas ações, e tomá-la por nossa advogada diante de Vós. Fazei com que nos envergonhemos da nossa fraqueza, e falta de ânimo. E, pois, que nos é fácil, hoje, em um país católico, a prática das obrigações cristãs, sem os perigos dos tormentos, dai-nos zelo e ânimo para a observância de vossos mandamentos, pela intercessão desta santa virgem, perdoando-nos primeiro quanto nos serve de obstáculo a imitar os Vossos santos. Amém\n"
            + "\n"
            + "Reza-se três Pai-Nossos, Ave-Marias e Glórias ao Pai.";

    private String oracaoFinal = "Oferecimento\n"
            + "℣. Ora pro nobis, beáta Lúcia.\n"
            + "\n"
            + "℟. Ut digni efficiámur promissiónibus Christi.\n"
            + "\n"
            + "Oremus: Exáudi nos, Deus salutáris noster, ut, sicut de beátae Lúciae, Vírginis et Martyris tuae, festivitáte gaudémus, ita piae devotiónis erudiámur afféctu. Per Christum Dominum Nostrum. Ámen.\n"
            + "\n"
            + "℣. Rogai por nós, Bem-aventurada Luzia.\n"
            + "\n"
            + "℟. Para que sejamos dignos das promessas de Cristo.\n"
            + "\n"
            + "Oremos: Ouvi-nos, ó Deus Salvador nosso, e fazei que, celebrando com alegria a festividade da Bem-aventurada Luzia, Vossa virgem e mártir, nos inflamemos em piedosos afetos de devoção. Por Nosso Senhor Jesus Cristo. Amém.";

    private String jaculatoria = "℣. Santa Luzia, mártir verdadeira.\n"
            + "\n"
            + "℟. Fazei que sigamos a vossa carreira.";

    private String primeiroDia = "Consideremos que sendo S. Luzia nobre por geração, muito mais o foi pelo seu amor à virgindade, e pelo desprezo dos gostos e delícias deste mundo. Foi a santa virgem em companhia de sua mãe visitar o sepulcro de S. Águeda, para pedirem por intercessão daquela santa o remédio para uma grave enfermidade que sofria a mãe da nossa santa. Deus Nosso Senhor despachou favoravelmente a sua súplica e a enferma foi curada. “Pedi, que haveis de receber, procurai, que haveis de achar, batei, que vos hão de abrir,” diz Nosso Senhor. Tendo Nosso Senhor assim empenhado a Sua palavra, que é palavra de rei, se o que pedirmos não nos for oposto a nossa salvação, Deus nos há de conceder o que pedirmos.";

    private String segundoDia = "Consideremos como tendo a mãe da nossa santa impetrado a sua saúde, que pedia por sua intercessão e de S. Águeda, pediu S. Luzia à sua boa mãe uma graça, em oposição ao que qualquer outra moça faria em tais circunstâncias. “Minha boa mãe”, diz a santa, “rogo-vos uma graça, a maior que me podereis fazer, e vem a ser que me entregueis desde já o dote que me tínheis destinado para o meu consórcio, quero distribuí-lo de um melhor e mais útil modo: dar-lhe-ei o destino que Jesus Cristo aconselhou a um moço desse as suas riquezas; sou moça, também tomarei, como dito a mim, este conselho que o Redentor deu ao moço.”. Esta petição foi sumamente agradável à boa mãe, que cedeu de boa mente aos rogos de sua santa filha.";

    private String terceiroDia = "Consideremos como, recebendo S. Luzia o abundante dote que sua mãe lhe deu, que destino lhe daria a santa moça? Outra qualquer da mesma idade o gastaria em joias e adereços preciosos, que poderiam servir-lhe de laços a sua castidade. Mas a nossa santa tem outros sentimentos. Ela reduz tudo a dinheiro e lhe dá o mesmo destino que S. Lourenço deu às pratas e ouro da igreja, quando o presidente gentio lhas pediu: repartiu tudo com os pobres que é o conselho que Jesus Cristo deu ao moço, que é o mesmo que mandar tudo antecipadamente para o Céu pela mão dos pobres, para lá receber principal e juros abundantes em outro gênero de bens, espirituais e eternos, sólidos e verdadeiros. Parabéns a S. Luzia.";

    private String quartoDia = "Consideremos como, chegando à notícia do moço a quem estava prometida em casamento S. Luzia por seus pais, ainda que contra vontade dela, e exasperado o moço com a resolução da que tinha já por sua prometida esposa, tomou a resolução de a acusar e levá-la até o cadafalso. Era o tempo em que nessa região era crime ser cristão. O mancebo dirige-se ao governador da terra e acusa a Luzia de ser cristã. Infeliz moço, que quando pensava vingar-se da santa, lhe procurou a maior felicidade. Geme ele no Inferno eternamente, se morreu assim como viveu: e a santa goza da eterna felicidade que lhe conseguiu a virgindade e o martírio.";

    private String quintoDia = "Consideremos como, acusada S. Luzia de ser cristã, citada para comparecer perante o governador, aonde depois de muito boas promessas, afagos, vendo o presidente que nada conseguia, diz: “Deixemos palavras, vamos aos tormentos”. A santa responde: “Aos servos de Deus nunca lhe podem faltar palavras, pois que o Espírito Santo que mora neles lhes inspirará o que devem falar”. Então, o tirano disse: “Eu te mandarei para a casa da prostituição, para que o Espírito Santo saia de ti e te desampare.”. Mandou, então, que a santa fosse conduzida para uma dessas casas da maldição, onde mora o Demônio e suas amigas. Que será da nossa santa em tal casa? Não temamos, pois Deus nunca desamparou os Seus servos.";

    private String sextoDia = "Consideremos hoje uma grande maravilha de Nosso Senhor a favor de Sua serva S. Luzia. O tirano a mandou levar para uma casa má, para ali perder a virgindade. Até quanto pode chegar a barbaridade humana! Mas o Senhor deu ao santo corpo de Sua serva um dote de imobilidade, que nenhuma força humana foi capaz de fazer andar um passo: parecia como um esteio pregado e fincado até o profundo, ou uma barra de ferro, ou um rochedo vivo, que forças humanas não podiam abalar. Bendito seja Deus, que assim acode a seus servos. Como estaria, então, a alma da santa, vendo o que Deus obrava em seu favor!)";

    private String setimoDia = "Consideremos como se verifica o que o Espírito Santo diz: “Um abismo chama por outro abismo.”. A imobilidade de S. Luzia, que era tão visível milagre e suficiente prova da religião para o tirano gentio cego pela sua seita, cada vez o cegou e exasperou mais, e o Demônio lhe sugeriu o pensamento de a queimar viva no mesmo lugar, de que seu corpo não podia ser abalado: manda cercá-la de muita lenha e matérias combustíveis, untado tudo com pez, resina e azeite, e que a tudo se pegasse fogo. Eis uma delicada moça no meio das labaredas. Que será dela? Deus seja louvado para sempre. Quem a fez imóvel no mesmo lugar, também a livrou das chamas, como noutro tempo aos meninos de Babilônia. Ó poder admirável de Deus! Ó obstinação dos gentios e pecadores! Ó efeitos da divina proteção!";

    private String oitavoDia = "Consideremos como, não conseguindo o tirano nem que a santa renegasse da fé, nem que o fogo lhe tirasse a vida, continua, mas em vão, a atormentá-la com suplícios que os demônios lhe faziam vir à cabeça, até que, perdendo toda a esperança, lhe manda atravessar a garganta com uma espada, e tirar-lhe a vida, quando ela estava profetizando a paz que Deus estava para dar à Sua Igreja pela morte de Domiciano e Maximiano, que tantos centos e milhares de cristãos martirizaram. Voa a bem-aventurada alma de Luzia para o Céu, aonde agora goza da eterna felicidade para sempre. Bendita santa, olhai para os vossos devotos, dai-lhes constância nos trabalhos deste mundo, e a vossa companhia na terra dos viventes.";

    private String nonoDia = "Consideremos como o povo cristão, tomando a diversos santos para advogados em diversas moléstias corporais, tem tomado a nossa santa por protetora nas doenças dos olhos, e certamente o não faria, se a experiência lhe não mostrasse que é valiosa a sua proteção. Convém, porém, advertirmos, que os benefícios corporais se devem pedir a Deus por intercessão de seus servos, sempre debaixo da condição que eles sejam úteis à nossa salvação. Muitos cegos se salvaram que, se tivessem vista, se perderiam. S. Luzia, que tanta glória conseguiu no Céu por seus relevantes merecimentos, nos consiga que vejamos a Terra como lugar de desterro, e cheia de laços, que o Demônio arma aos pobres filhos de Adão, e vejamos ao Céu como nossa pátria, lugar de eterno descanso, casa de Deus, onde Jesus Cristo, com Seus merecimentos, nos tem preparado um lugar.";
}
