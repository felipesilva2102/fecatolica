package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.service.QuaresmaEspiritoSantoService;
import com.mycompany.santo.terco.service.QuaresmaJoaoPauloIIService;
import com.mycompany.santo.terco.service.QuaresmaLiturgicaService;
import com.mycompany.santo.terco.service.QuaresmaNatalService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraAparecidaService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraCarmoService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraDoresService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraFatimaService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraGracasService;
import com.mycompany.santo.terco.service.QuaresmaPadrePioService;
import com.mycompany.santo.terco.service.QuaresmaSagradoCoracaoService;
import com.mycompany.santo.terco.service.QuaresmaSantaRitaService;
import com.mycompany.santo.terco.service.QuaresmaSantoAntonioService;
import com.mycompany.santo.terco.service.QuaresmaSantaTeresinhaService;
import com.mycompany.santo.terco.service.QuaresmaSaoBentoService;
import com.mycompany.santo.terco.service.QuaresmaSaoFranciscoService;
import com.mycompany.santo.terco.service.QuaresmaSaoJoseService;
import com.mycompany.santo.terco.service.QuaresmaSaoJudasTadeuService;
import com.mycompany.santo.terco.service.QuaresmaSaoMiguelService;
import com.mycompany.santo.terco.service.QuaresmaSaoSebastiaoService;
import com.mycompany.santo.terco.service.QuaresmaSaoJorgeService;
import com.mycompany.santo.terco.service.QuaresmaSaoJoaoBatistaService;
import com.mycompany.santo.terco.service.QuaresmaSantaLuziaService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraAuxiliadoraService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraAssuncaoService;
import com.mycompany.santo.terco.service.QuaresmaSaoCristovaoService;
import com.mycompany.santo.terco.service.QuaresmaSantaBarbaraService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/quaresma")
public class QuaresmaController {

    private final QuaresmaLiturgicaService liturgicaService;
    private final QuaresmaSaoJoseService saoJoseService;
    private final QuaresmaSaoMiguelService saoMiguelService;
    private final QuaresmaSantoAntonioService santoAntonioService;
    private final QuaresmaNossaSenhoraAparecidaService nossaSenhoraAparecidaService;
    private final QuaresmaEspiritoSantoService espiritoSantoService;
    private final QuaresmaNossaSenhoraCarmoService nossaSenhoraCarmoService;
    private final QuaresmaSantaTeresinhaService santaTeresinhaService;
    private final QuaresmaSaoFranciscoService saoFranciscoService;
    private final QuaresmaNatalService natalService;
    private final QuaresmaSagradoCoracaoService sagradoCoracaoService;
    private final QuaresmaNossaSenhoraGracasService nossaSenhoraGracasService;
    private final QuaresmaSantaRitaService santaRitaService;
    private final QuaresmaSaoJudasTadeuService saoJudasTadeuService;
    private final QuaresmaPadrePioService padrePioService;
    private final QuaresmaSaoBentoService saoBentoService;
    private final QuaresmaNossaSenhoraFatimaService nossaSenhoraFatimaService;
    private final QuaresmaNossaSenhoraDoresService nossaSenhoraDoresService;
    private final QuaresmaJoaoPauloIIService joaoPauloIIService;
    private final QuaresmaSaoSebastiaoService saoSebastiaoService;
    private final QuaresmaSaoJorgeService saoJorgeService;
    private final QuaresmaSaoJoaoBatistaService saoJoaoBatistaService;
    private final QuaresmaSantaLuziaService santaLuziaService;
    private final QuaresmaNossaSenhoraAuxiliadoraService nossaSenhoraAuxiliadoraService;
    private final QuaresmaNossaSenhoraAssuncaoService nossaSenhoraAssuncaoService;
    private final QuaresmaSaoCristovaoService saoCristovaoService;
    private final QuaresmaSantaBarbaraService santaBarbaraService;

    public QuaresmaController(QuaresmaLiturgicaService liturgicaService,
            QuaresmaSaoJoseService saoJoseService,
            QuaresmaSaoMiguelService saoMiguelService,
            QuaresmaSantoAntonioService santoAntonioService,
            QuaresmaNossaSenhoraAparecidaService nossaSenhoraAparecidaService,
            QuaresmaEspiritoSantoService espiritoSantoService,
            QuaresmaNossaSenhoraCarmoService nossaSenhoraCarmoService,
            QuaresmaSantaTeresinhaService santaTeresinhaService,
            QuaresmaSaoFranciscoService saoFranciscoService,
            QuaresmaNatalService natalService,
            QuaresmaSagradoCoracaoService sagradoCoracaoService,
            QuaresmaNossaSenhoraGracasService nossaSenhoraGracasService,
            QuaresmaSantaRitaService santaRitaService,
            QuaresmaSaoJudasTadeuService saoJudasTadeuService,
            QuaresmaPadrePioService padrePioService,
            QuaresmaSaoBentoService saoBentoService,
            QuaresmaNossaSenhoraFatimaService nossaSenhoraFatimaService,
            QuaresmaNossaSenhoraDoresService nossaSenhoraDoresService,
            QuaresmaJoaoPauloIIService joaoPauloIIService,
            QuaresmaSaoSebastiaoService saoSebastiaoService,
            QuaresmaSaoJorgeService saoJorgeService,
            QuaresmaSaoJoaoBatistaService saoJoaoBatistaService,
            QuaresmaSantaLuziaService santaLuziaService,
            QuaresmaNossaSenhoraAuxiliadoraService nossaSenhoraAuxiliadoraService,
            QuaresmaNossaSenhoraAssuncaoService nossaSenhoraAssuncaoService,
            QuaresmaSaoCristovaoService saoCristovaoService,
            QuaresmaSantaBarbaraService santaBarbaraService) {
        this.liturgicaService = liturgicaService;
        this.saoJoseService = saoJoseService;
        this.saoMiguelService = saoMiguelService;
        this.santoAntonioService = santoAntonioService;
        this.nossaSenhoraAparecidaService = nossaSenhoraAparecidaService;
        this.espiritoSantoService = espiritoSantoService;
        this.nossaSenhoraCarmoService = nossaSenhoraCarmoService;
        this.santaTeresinhaService = santaTeresinhaService;
        this.saoFranciscoService = saoFranciscoService;
        this.natalService = natalService;
        this.sagradoCoracaoService = sagradoCoracaoService;
        this.nossaSenhoraGracasService = nossaSenhoraGracasService;
        this.santaRitaService = santaRitaService;
        this.saoJudasTadeuService = saoJudasTadeuService;
        this.padrePioService = padrePioService;
        this.saoBentoService = saoBentoService;
        this.nossaSenhoraFatimaService = nossaSenhoraFatimaService;
        this.nossaSenhoraDoresService = nossaSenhoraDoresService;
        this.joaoPauloIIService = joaoPauloIIService;
        this.saoSebastiaoService = saoSebastiaoService;
        this.saoJorgeService = saoJorgeService;
        this.saoJoaoBatistaService = saoJoaoBatistaService;
        this.santaLuziaService = santaLuziaService;
        this.nossaSenhoraAuxiliadoraService = nossaSenhoraAuxiliadoraService;
        this.nossaSenhoraAssuncaoService = nossaSenhoraAssuncaoService;
        this.saoCristovaoService = saoCristovaoService;
        this.santaBarbaraService = santaBarbaraService;
    }

    @GetMapping("/liturgica")
    public Map<String, Object> quaresmaLiturgica(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return liturgicaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-jose")
    public Map<String, Object> quaresmaSaoJose(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoJoseService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-miguel")
    public Map<String, Object> quaresmaSaoMiguel(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoMiguelService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/santo-antonio")
    public Map<String, Object> quaresmaSantoAntonio(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return santoAntonioService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-aparecida")
    public Map<String, Object> quaresmaNossaSenhoraAparecida(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraAparecidaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/espirito-santo")
    public Map<String, Object> quaresmaEspiritoSanto(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return espiritoSantoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-carmo")
    public Map<String, Object> quaresmaNossaSenhoraCarmo(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraCarmoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/santa-teresinha")
    public Map<String, Object> quaresmaSantaTeresinha(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return santaTeresinhaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-francisco")
    public Map<String, Object> quaresmaSaoFrancisco(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoFranciscoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/natal")
    public Map<String, Object> quaresmaNatal(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return natalService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sagrado-coracao")
    public Map<String, Object> quaresmaSagradoCoracao(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return sagradoCoracaoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-gracas")
    public Map<String, Object> quaresmaNossaSenhoraGracas(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraGracasService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/santa-rita")
    public Map<String, Object> quaresmaSantaRita(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return santaRitaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-judas-tadeu")
    public Map<String, Object> quaresmaSaoJudasTadeu(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoJudasTadeuService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/padre-pio")
    public Map<String, Object> quaresmaPadrePio(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return padrePioService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-bento")
    public Map<String, Object> quaresmaSaoBento(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoBentoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-fatima")
    public Map<String, Object> quaresmaNossaSenhoraFatima(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraFatimaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-dores")
    public Map<String, Object> quaresmaNossaSenhoraDores(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraDoresService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/joao-paulo-ii")
    public Map<String, Object> quaresmaJoaoPauloII(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return joaoPauloIIService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-sebastiao")
    public Map<String, Object> quaresmaSaoSebastiao(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoSebastiaoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-jorge")
    public Map<String, Object> quaresmaSaoJorge(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoJorgeService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-joao-batista")
    public Map<String, Object> quaresmaSaoJoaoBatista(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoJoaoBatistaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/santa-luzia")
    public Map<String, Object> quaresmaSantaLuzia(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return santaLuziaService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-auxiliadora")
    public Map<String, Object> quaresmaNossaSenhoraAuxiliadora(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraAuxiliadoraService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/nossa-senhora-assuncao")
    public Map<String, Object> quaresmaNossaSenhoraAssuncao(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return nossaSenhoraAssuncaoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/sao-cristovao")
    public Map<String, Object> quaresmaSaoCristovao(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return saoCristovaoService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }

    @GetMapping("/santa-barbara")
    public Map<String, Object> quaresmaSantaBarbara(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return santaBarbaraService.getDadosQuaresma(data != null ? data : LocalDate.now());
    }
}
