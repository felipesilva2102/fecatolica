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
public class NovenaTodosSantosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Todos os Santos";

    private String periodo = "Normalmente feita dos dias 23 de outubro à 31 de outubro.";

    private String historia = "Antes de falar da Novena de Todos os Santos, lembremos do que se trata a festa.\n"
            + "\n"
            + "A Igreja que, no decurso do ano, celebra incessantemente as festas dos santos, reúne-os todos numa festa comum. Além dos que pode chamar pelo seu nome, ela evoca, numa visão grandiosa, a multidão inumerável dos outros “de todas as nações, tribos, povos e línguas, de pé diante do trono e diante do Cordeiro, vestidos com túnicas brancas e de palmas na mão”, aclamando Aquele que os resgatou com o Seu Sangue.\n"
            + "\n"
            + "A festa de Todos os Santos deve suscitar em nós uma imensa esperança. Dentre os santos do Céu há os que nós conhecemos. Todos viveram na Terra uma vida semelhante à nossa. Batizados, marcados com o sinal da fé, fiéis aos ensinamentos de Cristo, eles precederam-nos na pátria celeste e nos convidam a ir ter consigo. Ao proclamar a sua felicidade, o Evangelho das bem-aventuranças nos indica a rota seguinte: só ela nos pode conduzir até lá.\n"
            + "\n"
            + "De acordo com o ensinamento católico, há três estados na Igreja: a Igreja militante, a Igreja padecente e a Igreja triunfante. Somos a Igreja militante, pois ainda estamos vivendo e participando do combate espiritual aqui na Terra; a Igreja padecente são aquelas almas que estão no Purgatório, sendo purificados a fim de se tornarem dignos de adentrarem no Céu; a Igreja triunfante, enfim, são aqueles que já estão no Céu. É esta última que celebramos no Dia de Todos os Santos e cuja intercessão frequentemente buscamos nessas novenas, pois são aqueles que já contemplam Deus face a face.\n"
            + "\n"
            + "O Dia de Todos os Santos é celebrado em 1º de novembro, o dia seguinte ao Halloween, o que não é mera coincidência, uma vez que a origem do nome em inglês é véspera de todos os santos.\n"
            + "\n"
            + "Muitos santos canonizados possuem o seu dia próprio de comemoração, mas no Dia de Todos os Santos os celebramos todos, tanto os conhecidos como os desconhecidos por nós, que ainda estamos na Terra. Conforme celebramos todos aqueles que estão no Céu, recordemos que somos chamados a nos unirmos a eles.";

    private String primeiroDia = "Ó Santa Maria, Mãe de Deus e Mãe da Igreja, mostrais que és Mãe e me guieis em direção à uma vida de santidade, para que eu possa unir-me a vós e vosso Filho no Céu por toda a eternidade. \n"
            + "\n"
            + "Intercedeis por mim, para que eu seja um aprendiz de sua humildade e pureza. Levais, vos peço, as minhas petições ao vosso Filho. (Mencionar intenções).\n"
            + "\n"
            + "Maria, concebida sem pecado, rogai por nós.\n"
            + "Maria Santíssima, rogai por nós.\n"
            + "Maria puríssima, rogai por nós.\n"
            + "Maria, Estrela do Mar, rogai por nós.\n"
            + "Maria, Rainha do Céu e da Terra, rogai por nós.\n"
            + "Maria, Rainha dos Anjos e Santos, rogai por nós.\n"
            + "Amém.";

    private String segundoDia = "Ó santos anjos, fiéis servidores de Deus desde antes de o mundo ser formado, protegei-nos e guiai-nos em nossas vidas cotidianas, de modo que possamos crescer em santidade.\n"
            + "\n"
            + "Intercedeis por mim, para que eu cresça na fortaleza de sempre seguir a Deus, como vós fizestes. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Miguel, rogai por nós.\n"
            + "S. Gabriel, rogai por nós.\n"
            + "S. Rafael, rogai por nós.\n"
            + "Anjos da guarda, rogai por nós.\n"
            + "Amém.";

    private String terceiroDia = "Ó santos Apóstolos, fostes os primeiros chamados por Jesus para O seguirem, e a demonstrardes o que significa ser discípulo de Cristo.\n"
            + "\n"
            + "Intercedeis por mim, para que melhor me disponha ao Espírito que recebestes em Pentecostes, de modo que anseie por crescer como discípulo de Cristo. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Pedro, rogai por nós.\n"
            + "S. André, rogai por nós.\n"
            + "S. Tiago, rogai por nós.\n"
            + "S. João, rogai por nós.\n"
            + "S. Filipe, rogai por nós.\n"
            + "S. Judas Tadeu, rogai por nós.\n"
            + "S. Bartolomeu, rogai por nós.\n"
            + "S. Tomé, rogai por nós.\n"
            + "S. Tiago, rogai por nós.\n"
            + "S. Mateus, rogai por nós.\n"
            + "S. Simão, rogai por nós.\n"
            + "S. Matias, rogai por nós.\n"
            + "Amém.";

    private String quartoDia = "Ó santos mártires, morrestes pela fé como fiéis servidores de Deus; agradeço-vos pela coragem e sacrifício que tornaram possível ao Evangelho chegar até mim.\n"
            + "\n"
            + "Intercedeis por mim, para que eu cresça em coragem e fé, de modo que possa me manter firme na minha devoção a Deus mesmo diante a morte. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Paulo, rogai por nós.\n"
            + "Ss. Perpétua e Felicidade, rogai por nós.\n"
            + "S. Policarpo, rogai por nós.\n"
            + "S. Maximiliano Kolbe, rogai por nós.\n"
            + "S. Maria Goretti, rogai por nós.\n"
            + "Santos inocentes, rogai por nós.\n"
            + "Amém.";

    private String quintoDia = "Ó santos místicos, passastes a vida em união com Deus pela oração contemplativa e devoção, sois os modelos da santificação pelo tesouro da oração.\n"
            + "\n"
            + "Intercedeis por mim, para que eu cresça em perseverança na oração contemplativa. Leveis, vos peço, as minhas petições a Deus.(Mencionar intenções).\n"
            + "\n"
            + "S. Teresa de Ávila, rogai por nós.\n"
            + "S. Catarina de Sena, rogai por nós.\n"
            + "S. João da Cruz, rogai por nós.\n"
            + "S. Francisco de Sales, rogai por nós.\n"
            + "S. Faustina, rogai por nós.\n"
            + "S. Padre Pio, rogai por nós.\n"
            + "Amém.";

    private String sextoDia = "Ó santos Doutores da Igreja, com vossas obras enriquecestes e esclarecestes os ensinamentos da Igreja; usastes dos vossos dons de conhecimento, sabedoria e articulação para preservardes a verdade da Igreja ao longo da história.\n"
            + "\n"
            + "Intercedeis por mim, de modo que eu use os dons que Deus me deu para trazer aqueles que eu encontro para mais perto de Cristo. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Ambrósio, rogai por nós.\n"
            + "S. Agostinho, rogai por nós.\n"
            + "S. Gregório Magno, rogai por nós.\n"
            + "S. Jerônimo, rogai por nós.\n"
            + "S. Tomás de Aquino, rogai por nós.\n"
            + "S. Teresa de Lisieux, rogai por nós.\n"
            + "Amém.";

    private String setimoDia = "FÓ santos servos de Deus, resplandecestes em santidade pela vossa genuína humildade, e abraçastes vossa identidade como instrumentos de Deus.\n"
            + "\n"
            + "Intercedeis por mim, para que eu me esvazie de mim mesmo e seja purificado, de modo a ser um vaso consagrado ao trabalho de Deus. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Bernadette, rogai por nós.\n"
            + "S. Teresa de Lisieux, rogai por nós.\n"
            + "S. José de Cupertino, rogai por nós.\n"
            + "S. Juan Diego, rogai por nós.\n"
            + "Ss. Francisco e Jacinta de Jesus Marto, rogai por nós.\n"
            + "Amém.";

    private String oitavoDia = "Ó santos sacerdotes, monges e freiras, dedicastes vossas vidas ao serviço de Deus e Sua Igreja pelos votos religiosos, e fostes os pés e as mãos de Deus na Terra.\n"
            + "\n"
            + "Intercedeis por mim, para que eu tenha uma crescente devoção e desejo de frequentar os sacramentos. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Bento, rogai por nós.\n"
            + "S. Domingos, rogai por nós.\n"
            + "S. Inácio de Loyola, rogai por nós.\n"
            + "S. Clara de Assis, rogai por nós.\n"
            + "S. Francisco de Assis, rogai por nós.\n"
            + "Amém.";

    private String nonoDia = "Ó santos que durante a vida na Terra foram casados, prefigurastes com vosso matrimônio as bodas no Céu, e soubestes crescer em santidade no meio das alegrias e tristezas da vida matrimonial e familiar.\n"
            + "\n"
            + "Intercedeis por mim, para que eu possa reconhecer, no curso ordinário da vida, o dom extraordinário da família. Leveis, vos peço, as minhas petições a Deus. (Mencionar intenções).\n"
            + "\n"
            + "S. Maria e S. José, pais de Jesus, rogai por nós.\n"
            + "S. Ana e S. Joaquim, pais da Santíssima Virgem Maria, rogai por nós.\n"
            + "S. Isabel e S. Zacarias, pais de S. João Batista, rogai por nós.\n"
            + "S. Zélia e S. Luís Martin, pais de S. Teresa de Lisieux, rogai por nós.\n"
            + "S. Nona e S. Gregório, o Velho, pais de S. Gorgonia, S. Cesáreo e S. Gregório Nazianzeno, rogai por nós.\n"
            + "Amém.";
}
