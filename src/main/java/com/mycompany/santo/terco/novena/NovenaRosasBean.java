package com.mycompany.santo.terco.novena;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Novena das Rosas — consagrada a Santa Teresinha do Menino Jesus
 * Rezada de 30 de setembro a 8 de outubro (Festa de Nossa Senhora do Rosário)
 */
@Getter
@Setter
public class NovenaRosasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena das Rosas";

    private String periodo = "Normalmente rezada de 30 de setembro a 8 de outubro, véspera da Festa de Nossa Senhora do Rosário. Pode também ser rezada em qualquer tempo com devoção a Santa Teresinha.";

    private String comoFazer = "A NOVENA TEM TRÊS PARTES\n"
            + "\n"
            + "1 – ORAÇÃO INICIAL (igual para todos os dias)\n"
            + "\n"
            + "2 – MEDITAÇÃO PRÓPRIA DE CADA DIA\n"
            + "\n"
            + "3 – ORAÇÃO FINAL (igual para todos os dias)\n"
            + "\n"
            + "Ao final de cada intenção, invoca-se: 'Santa Teresinha do Menino Jesus, jogai vossas rosas!'";

    private String oracaoInicial = "Ó Santa Teresinha do Menino Jesus, que prometestes derramar uma chuva de rosas sobre a terra, e gastar o Céu fazendo o bem na terra;\n"
            + "\n"
            + "Alcançai-me do Divino Coração de Jesus a graça que peço nesta novena, se for para a glória de Deus e bem de minha alma.\n"
            + "\n"
            + "Pequena, humilde e confiante como vós, deposito esta intenção nos Vossos braços de santa e espero que a levai ao Pai por intercessão de Vossa Mãe Imaculada.\n"
            + "\n"
            + "Amém.";

    private String oracaoFinal = "Ó Santa Teresinha, que na terra nunca recusastes nenhum pedido, e no Céu prometestes fazer o bem, intercedei por nós junto ao Coração de Jesus.\n"
            + "\n"
            + "Que vossas rosas — símbolo do amor e da graça — caiam sobre nós e nossos irmãos que mais precisam da misericórdia divina.\n"
            + "\n"
            + "Pela Vossa 'pequena via', ensinai-nos a caminho do Céu com simplicidade, confiança e amor.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, rogai por nós!\n"
            + "\n"
            + "Amém.";

    private String primeiroDia = "1º DIA — A INFÂNCIA DE TERESINHA\n"
            + "\n"
            + "Maria Francisca Teresa Martin nasceu em Alençon, França, em 2 de janeiro de 1873. Foi a caçula de cinco irmãs, numa família profundamente cristã. Desde cedo sentiu o chamado de Deus em seu coração: aos quatro anos, quando sua mãe morreu, escolheu a irmã mais velha Paulina como nova 'mamãe'.\n"
            + "\n"
            + "A infância de Teresinha foi marcada tanto por ternura quanto por sofrimentos — doenças, separações das irmãs que entraram no Carmelo, uma crise nervosa prolongada. Mas tudo isso foi moldando aquele caráter de ouro que a tornaria santa.\n"
            + "\n"
            + "REFLEXÃO: Como você está respondendo às cruzes que Deus permite em sua vida?\n"
            + "\n"
            + "ORAÇÃO: Santa Teresinha, que desde criança amaste Jesus com todo o coração, pede por todas as crianças do mundo — especialmente as que sofrem — e por mim que preciso renovar a simplicidade da minha fé.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String segundoDia = "2º DIA — A CONVERSÃO DO NATAL\n"
            + "\n"
            + "Na noite de Natal de 1886, com 13 anos, Teresinha teve o que ela mesma chamou de 'sua grande conversão'. Ao ouvir seu pai murmurar que ela ainda chorava como criança, em vez de explodir em lágrimas como de costume, ela se controlou completamente. Sentiu que Jesus, nascendo em seu coração, havia terminado aquela hipersensibilidade que a atormentava.\n"
            + "\n"
            + "A partir desse Natal, Teresinha tornou-se outra — forte, determinada, com ardor apostólico. Em poucos meses, lutou para entrar no Carmelo com apenas 15 anos, chegando a pedir pessoalmente ao Papa Leão XIII durante uma audiência em Roma.\n"
            + "\n"
            + "REFLEXÃO: Você já experimentou uma 'conversão' — um momento em que Deus tocou seu coração e mudou algo? Hoje você pode pedir por esse toque.\n"
            + "\n"
            + "ORAÇÃO: Santa Teresinha, que em uma noite de Natal recebestes o presente da força e do amor apostólico, alcançai para mim a graça de uma conversão profunda do coração. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String terceiroDia = "3º DIA — A ENTRADA NO CARMELO\n"
            + "\n"
            + "Em 9 de abril de 1888, Teresinha entrou no Carmelo de Lisieux com apenas 15 anos. Encontrou vida dura: frio rigoroso, alimentação escassa, trabalho pesado, e uma priora muito severa. Mas ela tinha encontrado o que buscava: a vida de total entrega a Deus.\n"
            + "\n"
            + "Uma de suas maiores cruzes interiores foi a aridez na oração — ela cochilava durante o Ofício Divino, dispersava-se, lutava contra distrações. Mas ela aprendeu a oferecer a Deus até esses momentos.\n"
            + "\n"
            + "REFLEXÃO: Você persevera na oração mesmo quando ela parece seca e sem consolação?\n"
            + "\n"
            + "ORAÇÃO: Santa Teresinha, que permaneceste fiel mesmo nas noites sem consolo, ensinai-me a orar com perseverança, oferecendo ao Senhor até minhas distrações e securas. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String quartoDia = "4º DIA — A PEQUENA VIA\n"
            + "\n"
            + "A 'pequena via' de Teresinha é o coração de sua espiritualidade. Dizia ela: 'Jesus não pediu grandes feitos — apenas abandono a Ele e gratidão.' Assim como uma criança sobe pelo elevador no colo do pai, Teresinha queria subir ao Céu pelos braços de Jesus, sem a 'escada' de grandes penitências ou feitos heroicos.\n"
            + "\n"
            + "Esta via é caracterizada por: humildade que aceita a própria pequenez; confiança absoluta no amor misericordioso de Deus; oferecer os pequenos atos do cotidiano com muito amor.\n"
            + "\n"
            + "REFLEXÃO: Você acredita que as pequenas coisas feitas com grande amor têm valor eterno?\n"
            + "\n"
            + "ORAÇÃO: Jesus, pelo pequena via de Santa Teresinha, ensinai-me que a santidade não é feita de grandes gestos heróicos, mas de pequenos atos de amor fiéis, cotidianos e humildes. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String quintoDia = "5º DIA — O AMOR COMO VOCAÇÃO\n"
            + "\n"
            + "Num de seus maiores textos espirituais, Teresinha escreveu: 'Compreendi que a Igreja tem um Coração e que este coração está ardendo de Amor... Compreendi que o Amor encerrava todas as vocações, que o Amor era tudo... Então exclamei: Ó Jesus, minha Vocação, enfim eu a encontrei: minha vocação é o Amor!'\n"
            + "\n"
            + "Este texto da 'História de Uma Alma' está colocado junto à sua imagem no altar do Carmelo de Lisieux. É o resumo de toda a sua vida espiritual — e um convite a cada cristão.\n"
            + "\n"
            + "REFLEXÃO: Qual é a sua vocação dentro da vocação? Como o amor permeia tudo o que você faz?\n"
            + "\n"
            + "ORAÇÃO: Jesus, como Teresinha descobriu que a vocação dela era Amar, ajudai-me a descobrir como o amor deve ser o centro de tudo o que sou e faço. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String sextoDia = "6º DIA — A NOITE DO ESPÍRITO\n"
            + "\n"
            + "Nos últimos dezoito meses de vida, Teresinha foi envolta numa noite espiritual profunda — a fé como que desapareceu de seus sentidos. Ela, que sempre havia vivido na luz da fé gozosa, passou a rezar nas trevas, sem consolação, tentada pela dúvida. E ainda assim continuou a amar.\n"
            + "\n"
            + "'Corri para o meu Jesus e lhe disse que estava pronta a derramar meu sangue até a última gota para atestar minha fé...' Ela viu que sua missão seria ser a irmã dos incrédulos, rezando no escuro por eles.\n"
            + "\n"
            + "REFLEXÃO: Você já passou por uma noite escura da fé? Como reagiu?\n"
            + "\n"
            + "ORAÇÃO: Santa Teresinha, que amaste a Jesus mesmo no escuro, intercedei por todos que vivem a crise da fé, e ampara aqueles que duvidam e sofrem sem saber porquê. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String setimoDia = "7º DIA — O SOFRIMENTO SANTIFICADO\n"
            + "\n"
            + "Teresinha morreu de tuberculose aos 24 anos, após meses de sofrimentos intensos. Seus últimos dois anos foram de agonia física, com febre, hemoptises, falta de ar — tudo isso unido às provas espirituais da noite do espírito.\n"
            + "\n"
            + "Mas ela dizia: 'Não me arrependo de ter me entregado ao Amor.' E pouco antes de morrer: 'Eu não morro, eu entro na Vida.' Sua última palavra foi: 'Jesus!' Morreu em 30 de setembro de 1897.\n"
            + "\n"
            + "REFLEXÃO: Como você enfrenta o sofrimento? Ele te aproxima ou afasta de Deus?\n"
            + "\n"
            + "ORAÇÃO: Santa Teresinha, que transformastes a agonia em oferta de amor, ensinai-nos a unir nossos sofrimentos aos de Cristo, para que nada se perca e tudo sirva à salvação. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String oitavoDia = "8º DIA — A CHUVA DE ROSAS\n"
            + "\n"
            + "Antes de morrer, Teresinha disse: 'Quero passar o meu céu fazendo o bem na terra. Minha missão começa depois da minha morte... Derramarei uma chuva de rosas.'\n"
            + "\n"
            + "Desde então, inúmeras graças e curas foram atribuídas à sua intercessão. Em menos de 28 anos após a morte ela foi canonizada (1925) por Pio XI, que a chamou de 'a maior santa dos tempos modernos'. Em 1997, João Paulo II a declarou Doutora da Igreja.\n"
            + "\n"
            + "REFLEXÃO: Você tem recorrido a Santa Teresinha com confiança filial?\n"
            + "\n"
            + "ORAÇÃO: Santa Teresinha, cumpri o que prometestes — continuais derramando rosas sobre quem vos invoca com fé. Apresentai ao Senhor a nossa intenção e envolve-nos com vosso patrocínio maternal. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas!";

    private String nonoDia = "9º DIA — CONFIANÇA E ABANDONO\n"
            + "\n"
            + "O último ensinamento de Santa Teresinha é o mais essencial: confiar. 'É a confiança e só a confiança que deve nos conduzir ao Amor.' Ela não temia o julgamento de Deus porque sabia que Ele é Pai, e que o Pai não rejeita a criança que se lança em seus braços mesmo sendo imperfeita.\n"
            + "\n"
            + "'Se cometesse todos os crimes possíveis, teria sempre a mesma confiança.' — não porque o pecado não importa, mas porque o amor de Deus é maior que todos os pecados.\n"
            + "\n"
            + "REFLEXÃO: Você se aproxima de Deus com confiança de filho ou com medo de escravo?\n"
            + "\n"
            + "ORAÇÃO: Jesus misericordioso, pela intercessão de Santa Teresinha, dá-me aquela confiança filial que transforma o pecador em santo, o temeroso em amante, o fraco em forte. Que eu me abandone nos Vossos braços como uma criança. Amém.\n"
            + "\n"
            + "Santa Teresinha do Menino Jesus, jogai vossas rosas! Amém.";
}
