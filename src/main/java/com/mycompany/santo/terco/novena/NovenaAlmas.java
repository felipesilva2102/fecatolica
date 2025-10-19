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
public class NovenaAlmas implements Serializable {

    private static final long serialVersionUID = 1L;

    private String explicacao = "A NOVENA TÊM TRÊS PARTES\n"
            + "\n"
            + "1 – ORAÇÕES INICIAIS PARA TODOS OS DIAS\n"
            + "\n"
            + "2 – MEDITAÇÃO PRÓPRIA PARA CADA DIA\n"
            + "\n"
            + "3 – ORAÇÃO FINAL PARA TODOS OS DIAS";

    private String atoContricao = "ATO DE CONTRIÇÃO\n"
            + "\n"
            + "Senhor Jesus Cristo, verdadeiro Deus e verdadeiro Homem, Criador e Redentor meu, em quem firmemente creio e espero e a quem amo mais que a mim mesmo, mais do que todas as coisas; pesa-me, Senhor, de todo o meu coração por Vos ter ofendido.\n"
            + "\n"
            + "Por serdes Vós quem sois tão bom, santo, amável e adorável; pesa-me também, porque com meus pecados tenho merecido as cruéis penas do Purgatório, e, quem sabe, se também os tormentos eternos do Inferno.\n"
            + "\n"
            + "Proponho, ajudado com a vossa graça, nunca mais pecar, fugir de todas as ocasiões de ofender-vos, confessar-me, corrigir e emendar meus erros e perseverar até à morte na vossa amizade.\n"
            + "\n"
            + "Peço-vos, meu Deus, esta graça, pelo amor que tendes às benditas Almas do Purgatório, pelos méritos de Vossa paixão e pelas dores de Vossa aflitíssima Mãe. Amém.";

    private String oracaoInicial = "Ó Pai Eterno, amoroso e misericordioso, que impelido pela Vossa infinita misericórdia, tanto amastes o Mundo, a ponto de lhe dardes o vosso Filho Unigênito, para que aqueles que n’Ele crerem não pereçam, mas vivam eternamente.\n"
            + "\n"
            + "Permitireis acaso, ó Senhor, que sofram ainda por muito tempo no Purgatório essas Almas queridas, filhas vossas e esposas de Jesus Cristo, que as comprou com o preço infinito de seu Sangue?\n"
            + "\n"
            + "Tende piedade dessas aflitas prisioneiras e livrai-as das suas penas e tormentos. Tende também compaixão de minha pobre Alma, livrando-a do abismo do pecado.\n"
            + "\n"
            + "E se vossa justiça, não satisfeita ainda, exige maior reparação pelas faltas que cometeram, ofereço-Vos os atos de virtudes que praticar durante esta novena. Nada, ou muito pouco, valem todos eles, é verdade; mas eu Vo-lo ofereço unidos aos merecimentos de Jesus Cristo, às dores de sua Mãe Santíssima e às virtudes heroicas de todas as Almas justas que até hoje têm vivido no Mundo.\n"
            + "\n"
            + "Compadecei-Vos dos vivos e dos defuntos e concedei-nos a todos a graça de cantarmos um dia no Céu os triunfos da vossa misericórdia. Amém.";

    private String oracaoFinal = "Encomendamos agora a Jesus Cristo e a sua Santíssima Mãe todas as Almas do Purgatório e, em especial, as dos nossos parentes, benfeitores, amigos e inimigos e, sobretudo, as daqueles por quem temos obrigação de pedir.\n"
            + "Súplicas a Nosso Senhor Jesus Cristo, para que, pelas dores de sua Paixão, se compadeça das Almas do Purgatório\n"
            + "\n"
            + "Ó dulcíssimo Jesus, pelo suor de sangue que derramastes no Horto de Getsêmani, tende piedade das Almas do Purgatório.\n"
            + "\n"
            + "Ó dulcíssimo Jesus, pelas dores de vossa crudelíssima flagelação, tende piedade das Almas do Purgatório.\n"
            + "\n"
            + "Ó dulcíssimo Jesus, pelas dores de vossa coroação de espinhos, tende piedade das Almas do Purgatório.\n"
            + "\n"
            + "Ó dulcíssimo Jesus, pelas dores que sofrestes levando a Cruz, tende piedade das Almas do Purgatório.\n"
            + "\n"
            + "Ó dulcíssimo Jesus ,pela imensa dor que sofrestes ao separar-se vossa Alma do vosso sacratíssimo corpo, tende piedade das Almas do Purgatório.";

    private String primeiroDia = "PRIMEIRO DIA\n"
            + "\n"
            + "Consideração: São muitas as penas que sofrem as benditas Almas do Purgatório; mas a maior de todas é o pensamento de que foram elas próprias a causa dos seus sofrimentos pelos pecados que cometeram em vida.\n"
            + "\n"
            + "ORAÇÃO:\n"
            + "\n"
            + "Ó Jesus, Salvador meu! Eu, que tantas vezes tenho merecido o Inferno, que pena não experimentaria agora, se me visse condenado, ao pensar que eu próprio fora a causa da minha condenação? Dou-Vos infinitas graças pela paciência que tendes tido em me suportar.\n"
            + "\n"
            + "Amo-vos, meu Deus, sobre todas as coisas, porque sois a Bondade Infinita; arrependo-me de todo o meu coração de vos ter ofendido e antes quero morrer, do que tornar a ofender-Vos. Concedei-me a graça da perseverança; tende piedade de mim e das benditas Almas que sofrem no ardente fogo do Purgatório.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com as Vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "OBSÉQUIO: Formar a generosa resolução de rezar todos os dias da novena em sufrágio das benditas Almas.\n"
            + "\n"
            + "Fazer as orações finais";

    private String segundoDia = "Consideração: A pena que em segundo lugar atormenta excessivamente as benditas Almas é a recordação do tempo que perderam em sua vida, durante o qual teriam podido adquirir maiores méritos para o Céu; e a lembrança de que esta perda é para sempre irreparável, pois que com a vida termina o tempo de merecer.\n"
            + "\n"
            + "ORAÇÃO:\n"
            + "\n"
            + "Infeliz de mim, Senhor! Que, por espaço de tanto anos, tenho vivido sobre a Terra, durante os quais só tenho merecido os castigos do Inferno.\n"
            + "Dou-vos infinitas graças por me concederdes ainda tempo para remediar o mal que tenho feito.\n"
            + "\n"
            + "Arrependo-me, meu Deus, de vos ter ofendido, a Vós que sois infinitamente bom.\n"
            + "\n"
            + "Auxiliai-me para que, daqui até ao fim da minha vida, empregue todos os momentos unicamente em servir-Vos e amar-vos.\n"
            + "\n"
            + "Tende piedade de mim e dessas Almas benditas que sofrem no Purgatório.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com as vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: Assistir pela manhã, e sempre que se possa, ao Santo Sacrifício da Missa, em sufrágio das Almas do Purgatório.\n"
            + "\n"
            + "Fazer as orações finais";

    private String terceiroDia = "Consideração: Outra pena das maiores, que afligem as benditas Almas do Purgatório, é a consideração dos pecados que estão expiados.\n"
            + "\n"
            + "Na vida presente não se conhece bem a fealdade dos pecados, mas compreende-se claramente na outra, e esta é uma das mais vivas dores que sofrem as Almas no Purgatório.\n"
            + "\n"
            + "ORAÇÃO:Ó meu Deus! Amo-vos sobre todas as coisas porque sois a Bondade Infinita; pesa-me de todo o meu coração de vos ter ofendido; antes quero morrer que tornar a ofender-vos; concedei-me a graça da santa perseverança; tende piedade de mim e das Almas santas que estão ainda a purificar-se naquele fogo abrasador.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com vossas poderosas súplicas, e rogai também por nós, que estamos ainda em perigo de nos condenarmos. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: Pela manhã procuraremos sofrer com paciência os trabalhos que Deus nos enviar e as ofensas do nosso próximo, em sufrágio das benditas Almas.\n"
            + "\n"
            + "Fazer as orações finais";

    private String quartoDia = "Consideração: Uma outra pena que muito aflige no Purgatório as Almas, esposas de Jesus Cristo, é o pensamento de que, durante a vida, desgostaram com suas culpas aquele Deus a quem tanto amam.\n"
            + "\n"
            + "Têm-se visto penitentes morrer de dor, ao meditar que ofenderam um Deus tão bom. Muito melhor que nós, conhecem as Almas do Purgatório quão amável é Deus, e por conseguinte amam-No com todas as forças do seu coração, e, ao meditar que o desgostaram nesta vida, experimentam uma dor superior a qualquer outra.\n"
            + "\n"
            + "ORAÇÃO:Ó meu Deus! Porque sois a infinita bondade, arrependo-me de todo o meu coração de vos ter ofendido, antes quero morrer do que tornar a ofender-Vos.\n"
            + "\n"
            + "Concedei-me a graça da santa perseverança; tende piedade de mim e daquelas santas Almas que sofrem ainda no fogo do Purgatório e que vos amam de todo o seu coração.\n"
            + "\n"
            + " \n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus ,socorrei-as com vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: Formemos o propósito de beijar pela manhã três vezes a terra, em sufrágio das benditas Almas, e em satisfação das palavras altivas que dissermos; e, se quisermos humilhar-nos mais, poderemos fazer com a língua uma pequena Cruz no chão.\n"
            + "\n"
            + "Fazer as orações finais";

    private String quintoDia = "Consideração: Outra pena que tortura horrivelmente as benditas Almas do Purgatório é o terem de sofrer os ardores de um fogo abrasador sem saber quando terão fim os seus tormentos.\n"
            + "\n"
            + "É verdade que têm certeza de ver-se um dia livres deles; mas é um tormento gravíssimo para elas a incerteza do tempo em que hão de acabar.\n"
            + "\n"
            + "ORAÇÃO:Ó Senhor! Que grande desgraça seria a minha, se me tivésseis precipitado no Inferno, nesse lugar de tormentos donde com certeza nunca mais tornaria a sair!\n"
            + "\n"
            + "Amo-Vos sobre todas as coisas, Bondade Infinita, e arrependo-me de vos ter ofendido; antes quero morrer que tornar a ofender-Vos.\n"
            + "\n"
            + "Concedei-me a graça por intermédio das santas Almas que estão ainda a acabar de purificar-se no fogo do Purgatório.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + " \n"
            + "\n"
            + "OBSÉQUIO: Não comer nada fora das horas costumadas, ou fazer alguma mortificação corporal em sufrágio das Almas do Purgatório.\n"
            + "\n"
            + "Fazer as orações finais";

    private String sextoDia = "Consideração: Quanto maior é a consolação que as benditas Almas do Purgatório sentem, proporcionada pela recordação da Paixão de Jesus Cristo, por cujos méritos se salvaram, e do Santíssimo Sacramento do Altar, que tantas graças lhes dispensou e dispensa ainda, por meio de Missas e comunhões por elas aplicadas, tanto mais as atormenta o pensamento de não terem correspondido durante a vida a estes dois grandes benefícios do amor de Jesus Cristo.\n"
            + "\n"
            + "ORAÇÃO:Ó meu Senhor Jesus Cristo! Vós morrestes também por mim e tendes vos dado muitas vezes a mim na Sagrada Comunhão; e eu sempre vos tenho correspondido com negra ingratidão; mas agora amo-Vos sobre todas as coisas meu sumo Bem.\n"
            + "\n"
            + "Arrependo-me de todo o coração de vos ter ofendido e prefiro antes a morte que tornar a ofender-vos. Concedei-me a graça da santa perseverança e tende piedade de mim e das Almas que ainda sofrem no Purgatório.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: Aplicar em sufrágio das Almas do Purgatório uma indulgência parcial que se pode lucrar por cada vez que se disser devotamente: “Jesus, Maria e José, eu vos dou meu coração e minha alma”.\n"
            + "\n"
            + "Fazer as orações finais";

    private String setimoDia = "Consideração: Aumenta também o sofrimento das benditas Almas do Purgatório a lembrança dos benefícios particulares que receberam de Deus, como o ter nascido em país católico, ter recebido o Batismo e haver Deus esperado que fizessem penitência de seus pecados para conseguirem o perdão dos mesmos; porque todos estes favores lhes fazem conhecer agora melhor a ingratidão com que corresponderam a Deus.\n"
            + "\n"
            + "ORAÇÃO:Ó meu Deus! Quem tem sido, mais ingrato do que eu? Vós tendes me esperado com tanta paciência, tendes-me tantas vezes e com tanto amor perdoado os meus crimes, e eu, depois de tantas promessas, tenho voltado a ofender-vos novamente.\n"
            + "\n"
            + "Oh! Não me precipiteis no Inferno. Ó Bondade Infinita! Arrependo-me sinceramente de Vos ter ofendido e antes quero morrer, do que tornar a ofender-Vos.\n"
            + "\n"
            + "Concedei-me a graça da santa perseverança e compadecei-vos de mim e das Almas que gemem ainda no fogo do Purgatório.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: Dar uma esmola em sufrágio das Almas do Purgatório.\n"
            + "\n"
            + "Fazer as orações finais";

    private String oitavoDia = "Consideração: Outra pena que muito tortura as benditas Almas do Purgatório, é o pensamento de que, durante a sua vida, Deus usou para com elas de muitas misericórdias especiais que não dispensou a muitas outras; e a lembrança também de que com os seus pecados O obrigaram muitas vezes a retirar-lhes a sua amizade e a condená-las ao Inferno, posto que depois lhes haja concedido o perdão e a graça da salvação.\n"
            + "\n"
            + "ORAÇÃO:Senhor, eu sou um desses ingratos que, depois de ter recebido de Vós tantas graças, tenho desprezado o vosso amor e vos obriguei a condenar-me ao Inferno.\n"
            + "\n"
            + "Mas agora, ó Bondade Infinita, prometo que vos amarei sempre sobre todas as coisas; arrependo-me, de toda a minha Alma, de vos ter ofendido e antes quero morrer, que tornar a ofender-vos.\n"
            + "\n"
            + "Concedei-me a graça da santa perseverança, e tende piedade de mim e das Almas do Purgatório.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus socorrei-as com Vossas poderosas súplicas. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: O maior sufrágio que de nós reclama as benditas Almas, e o mais importante para nós e agradável a Deus, é fazermos por elas uma boa confissão, não calando pecado algum, e com verdadeira dor e arrependimento.\n"
            + "\n"
            + "Fazer as orações finais";

    private String nonoDia = "Consideração: São grandes todas as penas que sofrem as Almas no Purgatório; o fogo, o tédio, a escuridão, a incerteza do tempo em que hão de ver-se livres de todos estes tormentos; mas a maior de todas é o verem-se separadas do seu divino Esposo e privadas dos prazeres da sua companhia.\n"
            + "\n"
            + "ORAÇÃO:Ó meu Deus! Como tenho eu podido viver tantos anos longe de Vós e privado de vossa graça?\n"
            + "\n"
            + "Ó Bondade Infinita, amo-vos sobre todas as coisas; arrependo-me, de todo o meu coração, de Vos ter ofendido e antes quero morrer do que tornar a ofender-Vos.\n"
            + "\n"
            + "Concedei-me a graça da santa perseverança, e não permitais que torne a cair outra vez no vosso desagrado.\n"
            + "\n"
            + "Peço-vos que tenhais compaixão das santas Almas do Purgatório, as alivieis nos seus tormentos e abrevieis o tempo do seu desterro, admitindo-as o mais depressa possível à graça de vos amarem para sempre no Céu.\n"
            + "\n"
            + "E Vós, Maria, Mãe de Deus, socorrei-as com vossas poderosas súplicas, e rogai também por nós, que estamos ainda em perigo de nos condenarmos. Amém.\n"
            + "\n"
            + "5 Pai-Nossos e 5 Ave-Marias pelas Almas que mais sofrem.\n"
            + "\n"
            + "OBSÉQUIO: Formemos uma firme resolução de oferecer todas as nossas obras satisfatórias em sufrágio das necessitadas Almas do Purgatório.\n"
            + "\n"
            + "Fazer as orações finais";

    private String nonoDiaContinuacao = "ORAÇÕES ÀS BENDITAS ALMAS, LIVRES DO PURGATÓRIO PELOS NOSSOS SUFRÁGIOS\n"
            + "\n"
            + "Ó felizes e bem-aventuradas Almas, que tivestes a graça de entrar na pátria celestial! Felicitamo-Vos com toda a efusão do nosso coração e em nome de toda a Igreja vos damos mil felicitações. Alegramo-nos convosco; unimos nossa alegria à dos Santos e Bem-aventurados; juntamos nossos louvores aos que vós rendeis ao Criador por tão imenso favor.\n"
            + "\n"
            + "Sim, Almas ditosas, regozijai-vos. Já não há para vós tristezas nem angústias; acabaram-se já os perigos e as tentações.\n"
            + "\n"
            + "Agora tendes a paz, a felicidade, a alegria, o gozo, a consolação e o eterno descanso dos bem-aventurados. Que glória pra vós se com os nossos sufrágios antecipamos a vossa eterna felicidade!\n"
            + "\n"
            + "Triunfai, pois, reinai e gozai do Céu, mas não esqueçais de nós, que ainda combatemos sobre a Terra; olhai-nos com compaixão, porque estamos rodeados de numerosos e terríveis inimigos.\n"
            + "\n"
            + "Já que sois tão poderosas perante Deus, rogai pelos vossos devotos, para que sejamos fiéis e constantes no serviço de Deus e possamos também louvá-Lo e bendizê-Lo um dia convosco eternamente na glória celeste. Amém";
}
