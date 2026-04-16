package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quaresma de Santa Luzia
 * Período: 4 de novembro a 13 de dezembro (40 dias, encerrando na festa da santa)
 */
@Service
public class QuaresmaSantaLuziaService {

    private static final String ORACAO_PREPARATORIA = """
            O gloriosa Santa Luzia, virgem e mártir, cuja nome significa Luz!
            Tu que permaneceste fiel a Cristo mesmo diante do tirano Diocleciano,
            apresento a vos este meu pedido com toda confiança:
            (fazer o pedido em silêncio).
            Que como voce, eu tambem permita que a Luz de Cristo brilhe atraves de mim.
            Iluminai meus olhos do corpo e da alma para ver o caminho de Deus. Amém.""";

    private static final String SUPLICAS = """
            1. Santa Luzia, virgem de Siracusa, rogai por nós!
            2. Santa Luzia, prometida a Cristo desde jovem, rogai por nós!
            3. Santa Luzia, filha piedosa que curou sua mãe em Catania, rogai por nós!
            4. Santa Luzia, que distribuistes teus bens aos pobres, rogai por nós!
            5. Santa Luzia, noiva do Espouso Celestial, rogai por nós!
            6. Santa Luzia, que sofrestes torturas sem apostatar, rogai por nós!
            7. Santa Luzia, cujos olhos foram arrancados pelos bourros, rogai por nós!
            8. Santa Luzia, a quem foram restituídos os olhos por Deus, rogai por nós!
            9. Santa Luzia, mártir pela pureza e fidelidade, rogai por nós!
            10. Santa Luzia, glória da Igreja nascente, rogai por nós!
            11. Santa Luzia, padroeira dos cegos e doentes dos olhos, rogai por nós!
            12. Santa Luzia, padroeira dos escritores e estudiosos, rogai por nós!
            13. Santa Luzia, cuja festa ilumina o advento, rogai por nós!
            14. Santa Luzia, modelo de fortaleza cristã, rogai por nós!
            15. Santa Luzia, que profetizastes a queda do pagao Maximiano, rogai por nós!
            16. Santa Luzia, cujo corpo não foi movido nem por mil homens, rogai por nós!
            17. Santa Luzia, que recebestes o Viatico antes de morrer, rogai por nós!
            18. Santa Luzia, venerada desde os primeiros seculos, rogai por nós!
            19. Santa Luzia, cujo nome louva a luz divina, rogai por nós!
            20. Santa Luzia, radiante no Paraiso eterno, rogai por nós!
            
            (Concluir em oração: "Santa Luzia, iluminai-nos com a luz da fé.")""";

    private static final String ORACAO_FINAL = """
            O bendita Santa Luzia, tu que preferiste a morte a trair Cristo,
            rogai por todos os que sofrem perseguição por causa da fé.
            Pede ao Senhor que cure os doentes dos olhos, ilumine os que estao em trevas
            e fortaleca nossa visao espiritual para reconhecermos Deus em tudo.
            Que a luz do Senhor nos guie em nosso caminho até a vida eterna. Amém.""";

    private static final String JACULATORIA = "Santa Luzia, virgem e mártir, iluminai nossos olhos, rogai por nós!";

    public Map<String, Object> getDadosQuaresma(LocalDate data) {
        LocalDate dataInicio = LocalDate.of(data.getYear(), 11, 4);
        LocalDate dataFim = LocalDate.of(data.getYear(), 12, 13);

        boolean dentro = !data.isBefore(dataInicio) && !data.isAfter(dataFim);
        int dia = dentro ? (int) ChronoUnit.DAYS.between(dataInicio, data) + 1 : -1;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("diaSelecionadoRenderizar", dentro);

        if (!dentro) {
            result.put("mensagemDia", "A data selecionada não está dentro da Quaresma de Santa Luzia (04/11 - 13/12).");
        } else {
            result.put("mensagemDia", "Dia " + dia + " da Quaresma de Santa Luzia");
        }

        result.put("diaQuaresma", dia);
        result.put("oracaoPreparatoria", ORACAO_PREPARATORIA);
        result.put("suplicas", SUPLICAS);
        result.put("oracaoFinal", ORACAO_FINAL);
        result.put("jaculatoria", JACULATORIA);
        return result;
    }
}
