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
public class NovenaSagradaFamiliaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Novena a Sagrada Família";

    private String periodo = "Normalmente feita dos dias 19 de Dezembro à 27 de Dezembro.";

    private String historia = "“Os pais de família têm em São José um modelo admirável de vigilância e solicitude paterna; as mães podem admirar na Virgem Santíssima um exemplo insigne de amor, de respeito e de submissão; os filhos têm em Jesus, submisso a seus pais, um exemplo divino de obediência.” (Papa Leão XIII).";

    private String primeiroDia = "Sagrada Família, exemplo de amor\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "Ao entrarmos na casa de Nazaré, encontramos uma família muito unida. Jesus, Maria e José sabiam que o amor que os unia vinha de Deus. José, na carpintaria, deixava transparecer toda a dedicação à sua família no trabalho que desempenhava construindo objetos primorosos. Maria solidificava um lar feliz, sabendo que a harmonia da família passava por suas mãos no pão que preparava e no carinho que dedicava a Jesus e José. O Menino Jesus, entre a carpintaria e a sua casa, amava com dedicação a seus pais. Esse amor foi formado nas dificuldades e na confiança em Deus. Quantos obstáculos foram ultrapassados, quantas situações foram vencidas, porque entre os três reinava o pleno amor divino, pois Deus fazia parte dessa família.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de amor, concedei à minha família o dom do divino amor, amor mútuo e verdadeiro, amor do coração do próprio Deus, livrando-nos de toda divisão. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String segundoDia = "Sagrada Família, exemplo de fé\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "Maria teve fé no anjo Gabriel, que lhe trouxera a Palavra de Deus, comunicando-lhe que seria a mãe do Salvador. José viveu uma experiência de fé ao ouvir de um anjo, em sonho, o que devia fazer. Ambos foram com o Menino Jesus ao Templo e ouviram as promessas que Deus anunciara a Simeão e a Ana. Esta família viveu uma fé sincera e confiante em Deus, em todos os momentos e em todas as circunstâncias. Amém.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de fé, ensinai-me a viver a experiência da fé verdadeira e confiante, que abre a minha vida à ação de Deus. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String terceiroDia = "Sagrada Família, exemplo de confiança\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "Confiando em Deus, Maria disse “sim” ao Senhor e José a aceitou como esposa. Confiando em Deus, ambos foram de Nazaré a Belém, acolheram com alegria Jesus na manjedoura, fugiram para o Egito e retornaram a Nazaré. Confiando em Deus, Jesus, Maria e José seguiram para Jerusalém, perderam-se e reencontraram-se. Confiar em Deus não é apenas acreditar, mas agir e caminhar na força dessa fé.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de confiança, ajudai-me a vencer o medo e a confiar em Deus, que age em nossa vida protegendo-nos do mal. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String quartoDia = "Sagrada Família, exemplo de simplicidade\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "\n"
            + "O Rei dos reis e Senhor dos senhores nasceu na simplicidade. Modestos também eram a vida e os hábitos da Sagrada Família. Podemos dizer que José, Maria e Jesus viviam, trabalhavam, oravam e eram muito felizes em sua simplicidade. Tiveram a alegria de não conhecer as complicações da vida moderna e, na humilde casa de Nazaré, José e Maria formaram o Salvador da humanidade.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de simplicidade, ajudai-nos a descobrir nas coisas simples as maravilhas que existem em nossa vida. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String quintoDia = "Sagrada Família, exemplo de virtude\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "Maria de Nazaré era a Virgem; e José, o carpinteiro, era o Justo. Jesus, nesta família, crescia em sabedoria, estatura e graça diante de Deus e dos homens. Por isso, podemos hoje olhar essa família e chamá-la de sagrada ou santa. Que alegria sentiam Jesus, Maria e José ao olharem sua família, que trilhava no caminho da santidade!\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de virtude, ajudai-nos a viver a alegria de estarmos no caminho da santidade e do bem. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String sextoDia = "Sagrada Família, exemplo de disponibilidade\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "Com que tranquilidade o bom Deus pôde confiar missão tão importante à família de Nazaré! Com o “sim” de Maria e a obediência de José, Jesus teve um lar em que a disponibilidade ao serviço do Senhor e dos irmãos era a regra. Jesus realizou sua primeira missão no ventre de sua mãe, quando Nossa Senhora, momentos após o anúncio do anjo, foi servir Isabel.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de disponibilidade, inspirai, por vosso exemplo, o espírito de serviço em minha família. Que possamos ajudar-nos mutuamente e auxiliar nossos irmãos mais necessitados. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String setimoDia = "Sagrada Família, exemplo de alegria\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "A alegria forma os santos. Só podemos imaginar o lar de Nazaré como um lar alegre e feliz. Vivendo na simplicidade e tendo como única meta ser fiel a Deus, que outro sentimento poderia imperar em tal família? Confiando plenamente em Deus, Jesus, Maria e José estavam distantes da angústia causadas pelas incertezas. Sentindo-se uma comunidade reunida em torno do amor, podiam alegrar-se em sua confiança em Deus.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de alegria, auxiliai-nos a descobrir que somos felizes por sermos somente filhos de Deus. Afastai-nos da tentação de só valorizar os fatos tristes e esquecermos o amor de Deus para conosco. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String oitavoDia = "Sagrada Família, exemplo de oração\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "Onde, senão na Sagrada família, Jesus aprendeu a orar tanto e tão bem? Vemos Jesus, em muitos momentos de sua vida pública, dedicar-se à oração, mesmo sozinho ou em comunidade. Aprendera dos pais da Terra a estar com o Pai do Céu. Podemos até imaginar Maria dizendo: “Deus é teu Pai, fala com ele, Filho!”.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de oração, abri nosso coração ao diálogo com Deus. Ensinai-nos que se, não falamos com Deus, não falamos também com ninguém, e dai-nos o dom de saber orar com Jesus. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";

    private String nonoDia = "Sagrada Família, exemplo de união\n"
            + "Oração inicial\n"
            + "\n"
            + "Ó Deus, Pai e Criador de todas as coisas, que preparastes para vosso Filho e Senhor nosso uma família que lhe fosse digna, concedei-nos, pelos méritos desta novena que vamos rezar, os dons necessários para minha família e eu vivermos na paz e no amor. Jesus Cristo, ensinai-me a construir uma família feliz. Espírito Santo paráclito, infundi em mim o dom da compreensão, para conviver em união com os que me destes. Vós que sois um só Deus, eterno e santo. Amém.\n"
            + "\n"
            + "Reflexão\n"
            + "“Filho, teu pai e eu estávamos angustiados à tua procura!”, diz a Virgem Mãe ao encontrar Jesus no Templo de Jerusalém. Estas palavras resumem bem o espírito de união que reinava na Sagrada Família de Nazaré. Para onde iam, iam juntos, desde o exílio no Egito até a Páscoa em Jerusalém. Unidos pelos laços de amor, de fé e de esperança em Deus.\n"
            + "\n"
            + "Oração final\n"
            + "\n"
            + "Sagrada Família, exemplo de união, concedei este dom à minha família, às vezes tão dividida por tantas circunstâncias. Afastai-nos do poder daquele que divide, guardai-nos unidos para a vinda do Reino de Deus. Amém.\n"
            + "\n"
            + "Pai-Nosso, Ave-Maria, Glória.";
    
    private String disponivel = "https://bibliotecacatolica.com.br/blog/novenas/novena-da-sagrada-familia/?srsltid=AfmBOooEPCNeeIW2g8qVTg29s-8juvlgoagtS_a5rpzHFcKl5ktwUb59";
}
