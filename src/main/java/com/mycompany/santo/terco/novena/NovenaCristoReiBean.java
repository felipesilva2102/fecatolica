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
public class NovenaCristoReiBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Cristo Rei";

    private String periodo = "Normalmente feita dos dias 11 de novembro à 23 de novembro";

    private String comoFazer = "    Inicia-se com o Sinal da Cruz: Em nome do Pai e do Filho e do Espírito Santo;\n"
            + "    Reza-se a oração inicial para todos os dias;\n"
            + "    Faz-se a meditação do dia;\n"
            + "    Reza-se a oração final;\n"
            + "    Reza-se a Ladainha de Cristo Rei;\n"
            + "    Reza-se a Ato de Consagração;\n"
            + "    Reza-se a Consagração Individual;\n"
            + "    Finaliza-se com o Sinal da Cruz.";

    private String oracaoInicial = "Ó Cristo Jesus, eu Vos reconheço como Rei do Universo, Sois o autor de toda a criação; exercei sobre mim todos os Vossos direitos. Renovo as minhas promessas do batismo, renunciando a Satanás, suas pompas e suas obras; e de modo especial comprometo-me a lançar mão de todos os meios ao meu alcance para fazer triunfar os direitos de Deus e de Vossa Igreja.\n"
            + "\n"
            + "Ó Sagrado Coração de Jesus, eu Vos ofereço minhas pobres ações para que os homens reconheçam a Vossa Realeza Sagrada e o Reino de Vossa paz se estabeleça por todo o universo.";

    private String primeiroDia = "    “A quem buscais? – A Jesus Nazareno! Eu sou”.\n"
            + "\n"
            + "Senhor e Rei nosso: sempre deixas que descubram Vosso amor, ainda quando tuas criaturas tão amadas por Vós, te busquem para martirizar-Vos.\n"
            + "\n"
            + "Sabendo que vós sois Jesus Nazareno, vos buscamos hoje de novo para prender-vos outra vez, mas não com cadeias e cordas, mas sim com nossas misérias e nossos amores, pois sabemos que é o que mais ata e sujeita vosso misericordioso e amante coração, e assim preso por amor, conduzir-vos em triunfo ao trono que vos tem formado os corações amantes, para que comeces vosso reinado de misericórdia e amor na terra. Amém.\n"
            + "\n"
            + "Resolução prática: cumprir com fidelidade minhas obrigações por ser laços de amor que me unem com Jesus.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String segundoDia = "    “Cristo, adivinha quem vos tem ferido”.\n"
            + "\n"
            + "Oh! Jesus amante e bom!, aquela noite triste de Vossa Paixão Vossos olhos divinos viam através dos séculos todos os nossos pecados e esquecias que tão dolorosamente feriam Vosso Divino Coração, tanto, que para que Vossa pureza não Vos fizestes fugir de nós, não como os soldados fecharam Vossos olhos, mas sim que agora o amor vende Vossos olhos, a fim de que não vejas mais que as almas tanto se perdem sem a Vossa graça.\n"
            + "\n"
            + "Fazei que essas almas as que com Vosso Sangue e Vossas lágrimas tem lavado e purificado cheguem a amar-Vos com tanto entusiasmo, que se cerrem Seus olhos a todo o que não sejas Vós Rei de seus amores. Fazei, Senhor, que os homens Vos conheçam e Vos amem. Amém.\n"
            + "\n"
            + "Resolução prática: fechar os olhos a tudo o que não seja Jesus.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String terceiroDia = "“Logo vós sois Rei? – bem dizes: Eu sou Rei. – Eu tenho vindo ao mundo para dar testemunho da verdade.- e o que é a verdade?”.\n"
            + "\n"
            + "Deus nosso Senhor é a verdade por essência, e é verdade encantadora, é verdade que entusiasma o coração; que este Deus onipotente se fez Homem por mim, e me amou entre desprezos, entre burlas, entre toda classe de sofrimentos, e não por ser necessário para salvar-me, pois umas gotas de Seu Sangue bastavam para isso, mas sim por ser necessário ao amor\n"
            + " grande e infinito que ardia em Seu coração pelas almas.\n"
            + "\n"
            + "Senhor e Rei nosso: ensinai-nos a amar como Vós, sem retroceder ante o sacrifício e a dor, pois queremos sofrer e amar, para que nem um só coração deixe de amar-Vos; fazei-los todos Vossos. Amém.\n"
            + "\n"
            + "Resolução prática: abraçar-me com o que me faça sofrer.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String quartoDia = "    “Desprezando-lhe Herodes com todo seu exército e vestindo-lhe uma roupa branca, dele riram e lhe mandaram a Pilatos.”\n"
            + "\n"
            + "Oh! Jesus divino Rei nosso!, quão grande tem de ser nosso amor até Vós, que pelo nosso quisestes ser zombado e tido por louco, e em verdade, Jesus meu, loucura de amor parece, o que a grandeza de Deus se encerre no corpinho de um Menino, que o poder de Deus esteja sujeito com cravos, que este mesmo Deus e Homem se esconda em uma pequena Hóstia, e enamorado venha buscando a intimidade de nossos corações, para ter neles suas delicias; Jesus amante e bom, que o fogo de Vosso amor nos converta também em pequenas hóstias, que escondidas em Vosso Coração encontrem verdadeiro asilo, para que Vós sejas conhecido e amado.\n"
            + "\n"
            + "Resolução prática: fugir de todo o que me possa fazer gosto.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String quintoDia = "    “Vamos a coroar-lhe de Rei. -Salve, Rei dos judeus, e cuspindo lhe tomavam seu bastão e lhe feriam sua cabeça e lhe davam bofetadas.”\n"
            + "\n"
            + "Que pensavas Jesus meu naquela triste prisão? que desejavas quando eras coroado de espinhos, quando eras maltratado? apenas duas coisas, Oh! sabedoria e amor infinitos!: que vossa Eterno Pai fosse glorificado, que as almas se salvassem; e poderíamos pensar as almas em outra coisa que não em Vós? Poderá nossos corações desejarem outra coisa que não que se repitam por amor aquelas palavras “Salve Rei”, mas não apenas dos judeus, mas sim de todas as nações da terra conquistadas com teus sofrimentos e vossa morte? Que o grito “Vamos a coroar-lhe por Rei!” ressoe por amor em toda a terra, Oh! Deus meu!. Amém.\n"
            + "\n"
            + "Resolução prática: apartar meu pensamento do que não seja Deus.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String sextoDia = "    “Ecce Homo. – Eis aqui a vosso Rei”\n"
            + "\n"
            + "Oh! Divino Jesus!, como te apresentam por Rei, coroado de espinhos Vossa cabeça, Vosso corpo coberto de feridas, cheios de lágrimas Teus olhos; mas era preciso que essa fosse Vossa apresentação, pois não apenas Sois nosso Rei, mas sim nosso modelo, e nunca melhor que isto podias dizer: “Aprendei de Mim que sou manso e humilde de coração”. Caíram, Senhor, em presença de tanta grandeza, de tanta humildade, de tanto amor, todos os ídolos que ficam em nossos corações. Deixai-nos recolher Vosso sangue e tuas lágrimas, para que derramando-as sobre os corações de todas as criaturas sejamos de novo purificados e envoltos no amor. Amém.\n"
            + "\n"
            + "Resolução prática: procurar com empenho a humildade.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String setimoDia = "    “Senhor, lembrai-vos de mim quando vier o vosso reino. – Em verdade te digo que hoje estarás comigo no paraíso”\n"
            + "\n"
            + "Quiséramos, Senhor, apresentar no dia de Vossa festa os corações de todos os homens rendidos a Vosso amor; mas olhai, Rei nosso, quantos milhões deles estão envoltos nas trevas da morte e do pecado e não Vos conhecem; por eles Vos pedimos nós que temos a sorte de conhecer Vosso coração, todo misericórdia. “Senhor, lembrai-Vos destes desgraçados quando estiveres em Vosso Reino”, fazei-nos, Senhor, ouvir: “logo, muito logo estarão comigo no paraíso”. Amém.\n"
            + "\n"
            + "Resolução prática: Atos de fé, esperança e caridade, disponíveis em Orações da Manhã.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String oitavoDia = "    “Mulher, tens aí vosso Filho.” “Eis aí vossa Mãe.”\n"
            + "\n"
            + "Mas um dos soldados Lhe abriu o peito com uma lança e saiu dEle sangue e água. A Mãe de nosso Deus é nossa Mãe querida! Que felicidade e que confiança! O coração de nosso Deus é nosso céu, nosso tesouro. Mãe bendita, queremos amar-vos como vós amava Jesus, e a Ele, como vós O amavas; ensinai-nos as delicadezas do amor, a felicidade da vida de união, de união íntima, confiante, amorosa; fazei-nos pequenos, muito pequenos, para poder entrar e perder-nos no Coração de Jesus, sem ter mais motivo nem desejo que vos amar e fazer-vos amar. Amém.\n"
            + "\n"
            + "Resolução prática: consagrarei-me de todo coração a Santíssima Virgem.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String nonoDia = "    “Jesus Nazareno, Rei dos judeus.” “Regnavit a ligno Deus“\n"
            + "\n"
            + "    “E ao nome de Jesus dobraram os joelhos no céu, na terra.”\n"
            + "\n"
            + "Oh! Rei divino!, ao apresentar-Vos neste dia bendito nossas adorações, Vos oferecemos quanto somos, temos e desejamos; não nos detém nossa miséria, pois Sois todo misericórdia; confiamos conseguir todos os nossos pedidos, pois Sois todo amor e o amor atende sempre, e vos pedimos em união de nossa Rainha e Mãe Imaculada e dos anjos custódios de todas as almas.\n"
            + "\n"
            + "Senhor!, tirai de Vosso reino os demônios e a todos Teus inimigos e concede a Igreja uma era de paz. Levai a Vós neste dia as almas do purgatório, um perdão geral a todos os pecadores e pondo luz em suas inteligências e amor em seus corações, provai uma vez mais que é maior Vossa misericórdia que nossa malícia e miséria.\n"
            + "\n"
            + "Cheio de amor e pureza aos sacerdotes, aos pequenos e as almas a Vós consagradas, formando delas essas legiões de almas puras, humildes e amantes que Vós desejas: Almas pequenas que como grãos de trigo, formem todas em uma perfeita união de intenções e corações com a Vítima divina do Calvário e do altar uma hóstia que aplaque ao céu pelos pecados da terra e faça descer sobre ela perdão e misericórdia para os desgraçados pobres pecadores, por essas almas que queres que sejam as delicias de Vosso Coração na terra e Vossa corte de amor no céu.\n"
            + "\n"
            + "Resolução prática: abandonar-me no coração de Deus.\n"
            + "\n"
            + "Unindo meu coração ao Coração de Cristo Rei e minhas intenções as suas, rezarei: Pai-Nosso, Ave-Maria e Glória.\n"
            + "\n"
            + "Eterno Pai, derramai Tuas misericórdias sobre toda a terra, reino de Vosso Filho Jesus. Amém.\n"
            + "\n"
            + "    Oh! Cristo Rei!, estabelece Vossa paz em Vosso reino. Amém.\n"
            + "    Espírito Santo, abrasai ao mundo em vosso puríssimo e ardente amor. Amém.\n"
            + "    Mãe querida, une cada vez mais e mais a Vosso Filho Divino, todo misericórdia, com teus filhos na terra. Amém.\n"
            + "    São José, ensinai-nos a amar a Jesus e a Maria. Amém";

    private String ladainha = "℣. Senhor, tende piedade de nós.\n"
            + " ℟. Senhor, tende piedade de nós.\n"
            + "\n"
            + "℣. Cristo, tende piedade de nós.\n"
            + " ℟. Cristo, tende piedade de nós.\n"
            + "\n"
            + "℣. Senhor, tende piedade de nós.\n"
            + " ℟. Senhor, tende piedade de nós.\n"
            + "\n"
            + "℣.Cristo, ouvi-nos.\n"
            + " ℟. Cristo, ouvi-nos.\n"
            + "\n"
            + "℣. Cristo, atendei-nos.\n"
            + " ℟. Cristo, atendei-nos.\n"
            + "\n"
            + "Deus Pai dos céus,\n"
            + " ℟. tende piedade de nós.\n"
            + "\n"
            + "Deus Filho, Redentor do mundo,\n"
            + " Deus Espírito Santo,\n"
            + " Santíssima Trindade, que sois um só Deus,\n"
            + " Senhor Jesus Cristo, Rei do céu e da terra,\n"
            + " Senhor Jesus Cristo, Rei soberano de todas as nações,\n"
            + " Senhor Jesus Cristo, Rei anunciado pelos profetas,\n"
            + " Senhor Jesus Cristo, Rei entronizado na cruz,\n"
            + " Senhor Jesus Cristo, Rei ressuscitado dentre os mortos,\n"
            + " Senhor Jesus Cristo, Rei sentado à direita de Deus Pai,\n"
            + " Senhor Jesus Cristo, Rei de infinita majestade,\n"
            + " Senhor Jesus Cristo, Rei exaltado no trono da graça,\n"
            + " Senhor Jesus Cristo, Rei de misericórdia,\n"
            + " Senhor Jesus Cristo, Rei de cujo lado aberto brotaram sangue e água,\n"
            + " Senhor Jesus Cristo, Rei compassivo,\n"
            + " Senhor Jesus Cristo, Rei, autor e eficácia dos sacramentos,\n"
            + " Senhor Jesus Cristo, Rei verdadeiramente presente no Santíssimo Sacramento do altar,\n"
            + " Senhor Jesus Cristo, Rei do coração que arde de amor,\n"
            + " Senhor Jesus Cristo, Rei que sois alfa e ômega,\n"
            + " Senhor Jesus Cristo, Rei que fostes, sois e vireis,\n"
            + " Senhor Jesus Cristo, Rei de cujo trono nos aproximamos confiantes,\n"
            + " Senhor Jesus Cristo, Rei do qual provém toda autoridade,\n"
            + " Senhor Jesus Cristo, Rei cujo reino não é deste mundo,\n"
            + " Senhor Jesus Cristo, Rei que cura toda divisão,\n"
            + " Senhor Jesus Cristo, Rei ferido por nossa indiferença,\n"
            + " Senhor Jesus Cristo, Rei manso e humilde de coração,\n"
            + " Senhor Jesus Cristo, Rei que habitais os corações,\n"
            + " Senhor Jesus Cristo, Rei das famílias,\n"
            + "\n"
            + "℣.Cordeiro de Deus que tirais o pecado do mundo,\n"
            + " ℟. perdoai-nos, Senhor.\n"
            + "\n"
            + "℣.Cordeiro de Deus que tirais o pecado do mundo,\n"
            + " ℟. ouvi-nos, Senhor.\n"
            + "\n"
            + "℣. Cordeiro de Deus que tirais o pecado do mundo,\n"
            + " ℟. tende piedade de nós.\n"
            + "\n"
            + "℣. Vossa é a grandeza e o poder.\n"
            + " ℟. Vosso é o reino, Senhor.\n"
            + "\n"
            + "℣. OREMOS\n"
            + " Deus eterno e todo-poderoso, que dispusestes restaurar todas as coisas no vosso amado Filho, Rei do universo, fazei que todas as criaturas, libertas da escravidão e servindo à vossa majestade, vos glorifiquem eternamente. Pelo mesmo Cristo, Senhor nosso. ℟. Amém.";

    private String atoConsagracaoGenero = "Ato de Consagração do Gênero Humano ao Sagrado Coração de Jesus\n"
            + "\n"
            + "Dulcíssimo Jesus, Redentor do gênero humano, lançai sobre nós que humildemente estamos prostrados na vossa presença, os vossos olhares. Nós somos e queremos ser vossos; e a fim de podermos viver mais intimamente unidos a vós, cada um de nós se consagra, espontaneamente, neste dia, ao vosso sacratíssimo Coração.\n"
            + "\n"
            + "Muitos há que nunca vos conheceram; muitos, desprezando os vossos mandamentos, vos renegaram. Benigníssimo Jesus, tende piedade de uns e de outros e trazei-os todos ao vosso Sagrado Coração.\n"
            + "\n"
            + "Senhor, sede rei não somente dos fiéis, que nunca de vós se afastaram, mas também dos filhos pródigos, que vos abandonaram; fazei que estes tornem, quanto antes, à casa paterna, para não perecerem de miséria e de fome.\n"
            + "\n"
            + "Sede rei dos que vivem iludidos no erro, ou separados de vós pela discórdia; trazei-os ao porto da verdade e à unidade da fé, a fim de que, em breve, haja um só rebanho e um só pastor.\n"
            + "\n"
            + "Senhor, conservai incólume a vossa Igreja, e dai-lhe uma liberdade segura e sem peias; concedei ordem e paz a todos os povos; fazei que, de um pólo a outro do mundo ressoe uma só voz: louvado seja o coração divino, que nos trouxe a salvação; honra e glória a ele, por todos os séculos. Amém.\n"
            + "\n"
            + "Concede-se indulgência parcial ao fiel que recitar piedosamente este ato, e plenária quando se recitar publicamente na solenidade de Jesus Cristo Rei.";

    private String atoConsagracaoIndividual = "Eu, (O SEU NOME), vos dou e consagro, ó Sagrado Coração de Jesus Cristo, a minha vida, as minhas ações, penas e sofrimentos, para não querer mais servir-me de nenhuma parte do meu ser, senão para vos honrar, amar e glorificar. É esta a minha vontade irrevogável: ser todo vosso e tudo fazer por vosso amor, renunciando de todo o meu coração a tudo quanto vos possa desagradar.\n"
            + "\n"
            + "Tomo-vos, pois, ó Sagrado Coração, por único bem do meu amor, protetor da minha vida, segurança da minha salvação, remédio da minha fragilidade e da minha inconstância, reparador de todas as imperfeições da minha vida e meu asilo seguro na hora da morte.\n"
            + "\n"
            + "Sê, ó Coração de bondade, a minha justificação diante de Deus, vosso Pai, para que desvie de mim a sua justa cólera. Ó Coração de amor, deposito toda a minha confiança em Vós, pois tudo temo de minha malícia e de minha fraqueza, mas tudo espero de vossa bondade! Extingui em mim tudo o que possa desagradar-Vos ou que se oponha à vossa vontade.\n"
            + "\n"
            + "Seja o vosso puro amor tão profundamente impresso em meu coração, que jamais possa eu esquecer-Vos nem separar-me de Vós. Suplico-Vos que o meu nome seja escrito no vosso Coração, pois quero fazer consistir toda a minha felicidade e toda a minha glória em viver e morrer como vosso escravo. Amém.";
    
    private String disponivel = "https://rumoasantidade.com.br/novena-a-jesus-cristo-rei-do-universo/?srsltid=AfmBOoqF0nD4sqUoMESjXnLKsPMUJDFahjXvKeOn5ASUnQwbfEnz-mCH";
}
