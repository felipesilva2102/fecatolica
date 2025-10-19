/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.quaresma;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class QuaresmaSaoJoseBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDate dataSelecionada = LocalDate.now();
    private LocalDate dataInicio = LocalDate.of(dataSelecionada.getYear(), 2, 19); // 19 de fevereiro
    private LocalDate dataFim = LocalDate.of(dataSelecionada.getYear(), 3, 19);   // 19 de março

    public boolean isQuaresmaJose() {
        ajustarData();
        return !dataSelecionada.isBefore(dataInicio) && !dataSelecionada.isAfter(dataFim);
    }
    
    private void ajustarData() {
        dataInicio = LocalDate.of(dataSelecionada.getYear(), 2, 19);
        dataFim = LocalDate.of(dataSelecionada.getYear(), 3, 19);
    }
    
    public boolean isDiaSelecionadoRenderizar() {
        if (dataSelecionada == null) {
            return false;
        }
        
        ajustarData();

        return (dataSelecionada.isEqual(dataInicio) || dataSelecionada.isAfter(dataInicio))
                && (dataSelecionada.isEqual(dataFim) || dataSelecionada.isBefore(dataFim));
    }
    
    public String getMensagemDia() {
        int dia = getDiaQuaresma();
        if (dia == -1) {
            return "A data selecionada não está dentro da Quaresma de São José (19/02 - 19/03).";
        }
        return "Dia " + dia + " da Quaresma de São José";
    }

    private transient final String oracaoPreparatoria = """
                                                        Glorioso São José, esposo puríssimo de Maria e pai adotivo de Jesus!
                                                        Venho com confiança suplicar a vossa intercessão.
                                                        Coloco em vossas mãos esta graça que tanto necessito: (fazer o pedido).
                                                        Amparai-me, ó pai bondoso, e alcançai-me do Senhor tudo o que for para a salvação da minha alma. Amém.""";

    private transient final String suplicas = """
                                              1. São José, espelho de paciência, rogai por nós!
                                              2. São José, amante da pobreza, rogai por nós!
                                              3. São José, modelo dos trabalhadores, rogai por nós!
                                              4. São José, honra da vida de família, rogai por nós!
                                              5. São José, guarda das virgens, rogai por nós!
                                              6. São José, sustentáculo das famílias, rogai por nós!
                                              7. São José, consolo dos infelizes, rogai por nós!
                                              8. São José, esperança dos doentes, rogai por nós!
                                              9. São José, padroeiro dos moribundos, rogai por nós!
                                              10. São José, terror dos demônios, rogai por nós!
                                              11. São José, defensor da Santa Igreja, rogai por nós!
                                              12. São José, chefe da Sagrada Família, rogai por nós!
                                              13. São José, luz dos patriarcas, rogai por nós!
                                              14. São José, esposo da Mãe de Deus, rogai por nós!
                                              15. São José, protetor dos castos, rogai por nós!
                                              16. São José, modelo de obediência, rogai por nós!
                                              17. São José, exemplo de humildade, rogai por nós!
                                              18. São José, justo entre os homens, rogai por nós!
                                              19. São José, forte nas provações, rogai por nós!
                                              20. São José, prudente nas decisões, rogai por nós!
                                              21. São José, fidelíssimo servo de Deus, rogai por nós!
                                              22. São José, guardião do Redentor, rogai por nós!
                                              23. São José, pai adotivo de Jesus, rogai por nós!
                                              24. São José, patrono dos consagrados, rogai por nós!
                                              25. São José, amigo dos anjos, rogai por nós!
                                              26. São José, intercessor poderoso, rogai por nós!
                                              27. São José, nosso advogado, rogai por nós!
                                              28. São José, refúgio das almas aflitas, rogai por nós!
                                              29. São José, guia seguro no caminho, rogai por nós!
                                              30. São José, nosso pai e protetor, rogai por nós!
                                              
                                              (Após terminar as 30, repetir com firmeza três vezes:)
                                              São José, providenciai! São José, providenciai! São José, providenciai!""";

    private transient final String oracaoFinal = """
                                                 Ó glorioso São José, pai e protetor dos que vos invocam com confiança,
                                                 não desprezeis minhas súplicas e alcançai-me a graça que tanto desejo (repetir o pedido).
                                                 Prometo propagar a vossa devoção e confiar sempre em vossa intercessão.
                                                 Amém.""";
    
    private transient final String jaculatoria = """
                                                 São José, meu pai e senhor, guardai minha alma e minha vida!
                                                 """;

    public LocalDate getDataSelecionada() {
        return dataSelecionada;
    }

    public void setDataSelecionada(LocalDate dataSelecionada) {
        this.dataSelecionada = dataSelecionada;
    }

    // Retorna o dia da Quaresma com base na data
    public int getDiaQuaresma() {
        ajustarData();
        if (dataSelecionada.isBefore(dataInicio) || dataSelecionada.isAfter(dataFim)) {
            return -1; // fora do período
        }
        return (int) ChronoUnit.DAYS.between(dataInicio, dataSelecionada) + 1;
    }

}
