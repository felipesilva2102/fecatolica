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
public class NovenaSaoJoseBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena Tradicional em Honra de São José";

    private String periodo = "Normalmente feita dos dias 10 de março à 18 de março";

    private String comoFazer = "Inicia-se com o Sinal da Cruz. Reza-se a oração inicial, a meditação e a oração do dia correspondente, "
            + "seguida pela intercessão final de cada dia.";

    private String oracaoInicial = "Deus e Senhor meu, Uno e Trino, Pai, Filho e Espírito Santo, creio que estou em Vossa soberana "
            + "presença agora, quando pretendo consagrar a São José esta novena. A vós recorro com confiança filial e vos peço, por vossos "
            + "méritos e intercessão, as graças de que tanto necessito. Amém.";

    private String primeiroDia = "São José, Pai Nutrício de Jesus: Amabilíssimo São José, que tivestes a honra de alimentar, educar e "
            + "abraçar o Messias, obtende-me, com o perdão das minhas culpas, a graça da oração humilde e confiante que tudo alcança de Deus. "
            + "Acolhei com bondade paternal os pedidos que vos faço nesta novena e apresentai-os a Jesus, que se dignou obedecer-vos na terra. Amém."
            + "\n\nV/. Rogai por nós, São José, Pai Nutrício de Jesus."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência Vos dignastes escolher o bem-aventurado São José "
            + "para Esposo de Vossa Mãe Santíssima, concedei-nos que aquele mesmo que na terra veneramos como protetor, "
            + "mereçamos tê-lo no céu por nosso intercessor. Amém."; 

    private String segundoDia = "São José, Esposo da Virgem Maria: São José, castíssimo Esposo da Mãe de Deus e guarda fiel da sua virgindade, "
            + "obtende-me, por Maria, a pureza do corpo e da alma e a vitória em todas as tentações e dificuldades. Amém."
            + "\n\nV/. Rogai por nós, São José, Esposo da Virgem Maria."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém.";

    private String terceiroDia = "São José, Chefe da Sagrada Família: Glorioso São José, que gozastes durante tantos anos da presença de Jesus "
            + "e Maria, alcançai para nós a graça de viver sempre em união com Deus pela graça santificante. Amém."
            + "\n\nV/. Rogai por nós, São José, Chefe da Sagrada Família."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém."; 

    private String quartoDia = "São José, Exemplo de Fidelidade: Fidelíssimo São José, que nos destes belo exemplo no fiel cumprimento de vossos deveres, "
            + "rogai-me a graça de imitar vosso exemplo na fidelidade. Amém."
            + "\n\nV/. Rogai por nós, São José, Exemplo de Fidelidade."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém."; 

    private String quintoDia = "São José, Espelho de Paciência: Bondoso São José, que suportastes com heróica paciência as provações, "
            + "obtende-me virtude de paciência nas dificuldades de cada dia. Amém."
            + "\n\nV/. Rogai por nós, São José, Espelho de Paciência."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém.";

    private String sextoDia = "São José, Modelo dos Operários: Humilde São José, que dignificastes o trabalho com retidão e paciência, "
            + "obtende-me o amor ao trabalho segundo a vontade de Deus. Amém."
            + "\n\nV/. Rogai por nós, São José, Modelo dos Operários."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém.";

    private String setimoDia = "São José, Protetor da Santa Igreja: Glorioso Patriarca São José, protetor da Igreja Universal, "
            + "obtende-nos a graça de amar a Igreja e honrá-la como verdadeira Mãe. Amém."
            + "\n\nV/. Rogai por nós, São José, Protetor da Santa Igreja."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém."; 

    private String oitavoDia = "São José, Consolo dos Enfermos: Compassivo São José, esperança dos doentes e necessitados, "
            + "alcançai-me conformidade com os desígnios de Deus e defesa contra as tentações. Amém."
            + "\n\nV/. Rogai por nós, São José, Consolo dos Enfermos."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém.";

    private String nonoDia = "São José, Padroeiro dos Moribundos: Ditoso São José, que morrestes na presença de Jesus e Maria, "
            + "alcançai-me graça de uma boa e santa morte. Amém."
            + "\n\nV/. Rogai por nós, São José, Padroeiro dos Moribundos."
            + "\nR/. Para que sejamos dignos das promessas de Cristo."
            + "\n\nOremos: Ó Deus, que por uma inefável Providência… Amém."; 

    private String oracaoFinal = "Glorioso São José, exaltado por Deus, obedecido pelo Verbo Encarnado, favorecido pelo Espírito Santo "
            + "e amado pela Virgem Maria; rogai por nós que recorremos convosco com filial confiança. Obtende-nos as graças que pedimos nesta novena. "
            + "Amém."; 

    private String disponivel = "https://padrepauloricardo.org/blog/novena-tradicional-em-honra-de-sao-jose";
}
