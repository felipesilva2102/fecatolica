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
public class NovenaApresentacaoNossaSenhoraBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String nome = "Novena da Apresentação de Nossa Senhora";

    private String periodo = "Normalmente feita dos dias 12 de novembro à 20 de novembro.";

    private String comoFazer = "    Inicia-se com o Sinal da Cruz: Em nome do Pai e do Filho e do Espírito Santo;\n"
            + "    Reza-se todos os dias as mesmas orações seguidas das 3 Ave-Marias;\n"
            + "    Finaliza-se com o Sinal da Cruz.";

    private String oracaoDias = "Seja bendita, ó Maria, a prontidão de ânimo com que tão infantinha vos apresentastes no templo. Suplico-vos, Virgem Santíssima, me alcanceis de vosso Filho a graça de servi-lo sempre até à morte. Ave-Maria.\n"
            + "Seja bendito, ó Maria, o fervor de espírito com que soubestes servir e dar gosto a Deus. Suplico-vos, Virgem Santíssima, me alcanceis de vosso Filho a graça de me dar com toda a alma ao seu serviço. Ave-Maria.\n"
            + "Seja bendita, ó Maria, a plenitude da perfeição com que tão cedo vos fizestes modelo completo de santidade. Suplico-vos, Virgem Santíssima, me alcanceis de vosso Filho a graça de aborrecer sempre a culpa e amar de todo o coração a virtude. Ave-Maria.\n"
            + "\n"
            + "    Cabazes de oferta\n"
            + "\n"
            + "℣. Dignáre me laudáte te, Virgo sacráta:	℣. Concedei-me que vos louve, Virgem Sagrada.\n"
            + "℟. Da mihi virtutem contra hostes tuos.	℟. Dai-me valor contra os vossos inimigos.\n"
            + "Orémus. Deus, qui beátam Mariam semper Vírginem Spíritus Sancti habitáculum hodiérna dia in templo praesentári voluísti: praesta, quaesumus, ut ejus intercessióne in templo glóriae tuae praesentári mereámur. Per Christum Dóminum nostrum. ℟. Amen	Oremos. Ó Deus, que quisestes se apresentasse neste dia no templo a bem-aventurada sempre Virgem Maria, habitáculo do Espírito Santo: concedei-nos que por sua intercessão mereçamos ser apresentados no templo da vossa glória. Por Cristo, Nosso Senhor. ℟. Amém.";

}
