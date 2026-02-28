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
public class NovenaSagradaFaceBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena da Sagrada Face de Jesus";

    private String periodo =
            "Pode ser rezada em qualquer época, por 9 dias. Tradicionalmente é feita em preparação "
          + "para a Festa da Sagrada Face, celebrada na terça-feira antes da Quarta-feira de Cinzas (terça-feira de Carnaval).";

    private String historia =
            "A devoção à Sagrada Face é uma espiritualidade de contemplação e reparação a Jesus em Sua Paixão, "
          + "com forte ênfase no rosto do Senhor ultrajado (bofetadas, escarros, coroa de espinhos) e no desejo de consolá-Lo. "
          + "Nos tempos modernos, ela foi impulsionada por revelações privadas associadas à Beata Maria Pierina de Micheli "
          + "e também por iniciativas anteriores ligadas a Maria de São Pedro e ao leigo Léon Papin-Dupont, em Tours (França). "
          + "A espiritualidade inspirou santos como Santa Teresinha do Menino Jesus e da Sagrada Face e, no Brasil, a festa recebeu especial relevo.";

    private String oracaoInicial =
            "Senhor Jesus, eu busco a Vossa Face e desejo permanecer sob a luz do Vosso olhar. "
          + "Não me afasteis por causa dos meus pecados e não retireis de mim o Vosso Espírito. "
          + "Fazei resplandecer sobre mim a luz da Vossa Face e conduzi-me no caminho dos Vossos mandamentos. "
          + "Eterno Pai, eu Vos ofereço a Face Santíssima do Vosso Filho: dai-me espírito de reparação "
          + "e concedei-me a graça que peço nesta novena, se for para minha salvação. Amém.";

    private String oracaoFinal =
            "Deus todo-poderoso e misericordioso, concedei-nos a graça de venerar com fé a Face Santíssima do Vosso Filho, "
          + "ferida e desfigurada na Paixão por causa de nossos pecados, e fazei que, purificados e convertidos, "
          + "possamos contemplá-la eternamente no resplendor da glória do Céu. Por Jesus Cristo, nosso Senhor. Amém.";

    private String jaculatoria =
            "℣. Mostrai-nos, Senhor, a Vossa Face.\n"
          + "\n"
          + "℟. E seremos salvos.";

    private String primeiroDia =
            "Contemplemos a Face de Jesus no mistério da Eucaristia: o Senhor que se entrega por amor e permanece conosco. "
          + "Peçamos um coração eucarístico, que ame a presença real de Cristo e repare as indiferenças e tibiezas. "
          + "Virtude: desapego interior das coisas da terra para que Jesus seja nosso tesouro.";

    private String segundoDia =
            "Contemplemos a Face de Jesus no Getsêmani, marcada pelo suor de sangue e pela dor do pecado do mundo. "
          + "Peçamos contrição verdadeira e firme propósito de não pecar, oferecendo também reparação pelos pecadores. "
          + "Virtude: docilidade às inspirações da graça, deixando-nos conduzir pelo olhar do Senhor.";

    private String terceiroDia =
            "Contemplemos a Face de Jesus no beijo do traidor: o amor ferido pela infidelidade e pelo sacrílego desprezo. "
          + "Peçamos fidelidade e reverência, especialmente diante do Santíssimo Sacramento, reparando as comunhões indignas. "
          + "Virtude: obedecer com prontidão aos mandamentos e à vontade de Deus.";

    private String quartoDia =
            "Contemplemos a Face de Jesus humilhada e ferida, e aprendamos com Ele a mansidão e o perdão. "
          + "Peçamos a graça de perdoar de coração, renunciando à vingança e oferecendo expiação pelos pecados do mundo. "
          + "Virtude: penitência e aceitação das provações como reparação unida à Paixão de Cristo.";

    private String quintoDia =
            "Contemplemos a Face de Jesus desfigurada por insultos e escarros: reparação pelas blasfêmias e profanações. "
          + "Peçamos coragem para professar a fé sem respeito humano e para não colaborar com o pecado por omissão. "
          + "Virtude: fortaleza cristã para cumprir o dever e evitar o mal, mesmo sob críticas.";

    private String sextoDia =
            "Contemplemos a Face de Jesus coroada de espinhos: o verdadeiro Rei que reina pela cruz e pela entrega. "
          + "Peçamos que Cristo reine em nós, mortificando paixões e desejos desordenados que renovam Suas dores. "
          + "Virtude: mortificação e domínio próprio, para que a vida seja reparação e louvor.";

    private String setimoDia =
            "Contemplemos a Face de Jesus no caminho do Calvário, caída na poeira, mas firme no amor até o fim. "
          + "Peçamos constância para carregar nossa cruz com paciência e generosidade, sem desânimo. "
          + "Virtude: zelo reparador; comunhão, oração, palavras e exemplo para consolar o Coração de Jesus.";

    private String oitavoDia =
            "Contemplemos a Face de Jesus consolada por Verônica: um pequeno gesto de amor que se torna grande diante de Deus. "
          + "Peçamos ternura e compaixão para consolar Jesus, gravando em nós os traços de Sua Face pela oração e pela vida santa. "
          + "Virtude: suportar injúrias e friezas do próximo com paciência, oferecendo-as em reparação.";

    private String nonoDia =
            "Contemplemos a Face de Jesus no mistério de Sua morte: o Reparador divino que oferece perdão e salvação. "
          + "Peçamos que nossa vida e nossa morte sejam unidas à reparação de Cristo e vividas na graça, para contemplá-Lo face a face. "
          + "Virtude: perseverança final e amor fiel, buscando as realidades do Céu acima das vaidades do mundo.";

    private String disponivel = "https://formacao.cancaonova.com/novena/novena-a-sagrada-face/";
}
