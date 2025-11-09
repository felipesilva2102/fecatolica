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
public class NovenaSaoJoaoCruzBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a São João da Cruz";

    private String periodo = "Normalmente feita dos dias 05 de Dezembro à 13 de Dezembro.";

    private String comoFazer = "Inicia-se com o Sinal da Cruz: Em nome do Pai e do Filho e do Espírito Santo;\n"
            + "Reza-se todos os dias a oração inicial;\n"
            + "Finaliza-se com o Sinal da Cruz.";

    private String oracaoPreparatoria = "Senhor, que inspirastes a São João da Cruz, nosso pai, um extraordinário amor da Cruz e uma perfeita abnegação de si mesmo, concedei-nos a graça que vos pedimos… e que, imitando o seu exemplo, cheguemos à contemplação eterna da Vossa glória. Por Nosso Senhor Jesus Cristo.\n"
            + "\n"
            + "São João da Cruz, rogai por nós!";

    private String primeiroDia = "Amor de Deus / Amor do Próximo\n"
            + "«Ame muito aos que a contradizem e não a amam, porque nisso se gera amor no peito onde não o há, como faz Deus conosco, que nos ama mediante o amor que nos tem» (Cartas 33) … «Porque o verdadeiro amante só está contente quando tudo o que ele é, vale, tem e recebe, o emprega no Amado, e quanto mais é tudo isso, tanto mais gosto tem em lho dar» (Chama de Amor Viva III, 1).";

    private String segundoDia = "Obediência\n"
            + "«Perguntando alguém um dia ao venerável Padre João da Cruz como era que uma pessoa se arrebatava, respondeu: negando a sua vontade e fazendo a de Deus, porque o êxtase não é senão sair a alma de si mesma e arrebatar-se em Deus, e isto faz o que obedece porque é sair de si e do seu próprio querer e assim aliviado submerge-se em Deus» (Avisos 65).";

    private String terceiroDia = "Castidade\n"
            + "«Pensam que, por ter estado tão mudo, as perco de vista e deixo de andar vendo como com grande facilidade podem ser santas e com muito gosto e seguro amparo andar em delícias do Amado Esposo? Pois aí irei e então hão de ver como não me esquecia e veremos as riquezas ganhas no amor puro e sendas de vida eterna e os passos formosos que dão em Cristo, cujas delícias e coroas são as suas esposas…» (Cartas 7; 5).";

    private String quartoDia = "Pobreza\n"
            + "«Dizia-se pobre (o rei David, no salmo 87, 16, numa tradução acomodatícia), bem que na verdade fosse rico, porque não tinha nas riquezas a sua vontade e assim era como se na realidade fosse pobre. Mas fosse ele realmente pobre, e a vontade o não fora, não seria verdadeiramente pobre; pois a alma estaria rica e cheia no apetite. Por isso chamamos a esta desnudez noite para a alma, porque não tratamos aqui da carência das coisas, porque isso não despe a alma, se delas tem apetite; senão da desnudez do gosto e apetite delas, pois é o que deixa a alma livre e vazia delas, mesmo que as tenha…» (Subida do Monte Carmelo I, III, 4).";

    private String quintoDia = "Assistência ao Coro\n"
            + "«Também disto temos figura muito ao vivo no Gênesis, onde se lê que o Patriarca Jacob querendo subir ao monte de Betel a fim de aí erguer um altar a Deus, para Lhe oferecer sacrifício, ordenou primeiramente três coisas a toda a sua gente: a primeira, que rejeitassem todos os deuses estranhos, a segunda que se purificassem e a terceira que mudassem as vestes (Gn 35, 2). Por estas três coisas dá-se a entender a toda a alma que quer subir a este monte a fazer de si mesma altar onde ofereça a Deus sacrifício de puro amor, louvor e reverência pura, que antes que suba ao cimo do monte, há de cumprir perfeitamente as três coisas já referidas» (Subida do Monte Carmelo I, V, 6-7).";

    private String sextoDia = "Penitência / Mortificação\n"
            + "«Por isso é muito para chorar a ignorância de alguns que se sobrecarregam de penitências extraordinárias (…) e pensam que lhes bastará isto e aquilo para chegar à união com a Sabedoria Divina, e não é assim, se com diligência não procurarem negar os apetites (…) Porque assim como é necessário lavrar a terra para ela dar fruto, e se não for lavrada não produz senão ervas más, assim é necessária a mortificação dos apetites para que haja proveito na alma» (Subida do Monte Carmelo I, VIII, 4).";

    private String setimoDia = "Humildade\n"
            + "«A alma enamorada é suave, mansa, humilde e paciente» (Ditos de Luz e Amor 28; 27) «e, para se enamorar de uma alma, não põe Deus os olhos na grandeza dela, mas na grandeza da sua humildade» (Pontos de Amor, Ditos de Luz e Amor 102; Pontos de Amor 24).";

    private String oitavoDia = "Oração\n"
            + "«’Buscai primeiro o reino de Deus e a sua justiça, e tudo o mais se vos dará por acréscimo’. Porque esta é a pretensão e petição mais a Seu gosto; e para alcançar as petições que temos no nosso coração, não há melhor meio de que pôr a força da nossa oração naquilo que é mais do gosto de Deus; porque então, não só nos dará o que Lhe pedimos, que é a salvação, como ainda o que vê que nos convém e nos é bom, embora não Lho peçamos» (S III, XLIV, 1-2); «procure, pois, ser contínuo na oração e no meio dos exercícios exteriores não a deixe. Quer coma, quer beba, quer trate com os de fora, quer faça qualquer outra coisa ande sempre desejando a Deus, pondo n’Ele o afeto do seu coração» (Cons. Rel. 9). «Quem foge da oração, foge de todo o bem» (Outros Avisos, Ditos de Luz e Amor 170/Outros Avisos, Avisos 11).";

    private String nonoDia = "Silêncio / Paz\n"
            + "«Veja aquele saber infinito, aquele segredo escondido! Que paz, que amor, que silêncio não está naquele peito divino, que ciência tão elevada a que Deus ali ensina» (Pontos de Amor, Ditos de Luz e Amor 138/Pontos de Amor 60), … «em todas as coisas, pois, por adversas que sejam, nos devemos alegrar em vez de perturbar, para não perder o bem maior que toda a prosperidade, isto é, a tranquilidade de ânimo e paz em todas as coisas adversas ou prósperas, levando a todas de igual maneira» (Subida do Monte Carmelo III, VI, 4), «pondo todo o cuidado em coisa mais alta que é buscar o reino de Deus isto é, em não faltar a Deus, porque o demais, como Sua Majestade disse, nos será dado por acréscimo, pois não se há de esquecer de nós Aquele que cuida dos animais. Com isto se adquirirá silêncio e paz» (2ª Cautela contra o mundo).";
    
    private String disponivel = "https://rumoasantidade.com.br/novena-a-sao-joao-da-cruz/?srsltid=AfmBOoqzRWlG0rPcDhC74oIMbj7f0jpiTXOyIzakEpfFaSTJstdpX51O";
}
