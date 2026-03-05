package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.service.QuaresmaEspiritoSantoService;
import com.mycompany.santo.terco.service.QuaresmaLiturgicaService;
import com.mycompany.santo.terco.service.QuaresmaNatalService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraAparecidaService;
import com.mycompany.santo.terco.service.QuaresmaNossaSenhoraCarmoService;
import com.mycompany.santo.terco.service.QuaresmaSantoAntonioService;
import com.mycompany.santo.terco.service.QuaresmaSantaTeresinhaService;
import com.mycompany.santo.terco.service.QuaresmaSaoFranciscoService;
import com.mycompany.santo.terco.service.QuaresmaSaoJoseService;
import com.mycompany.santo.terco.service.QuaresmaSaoMiguelService;
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

    public QuaresmaController(QuaresmaLiturgicaService liturgicaService,
            QuaresmaSaoJoseService saoJoseService,
            QuaresmaSaoMiguelService saoMiguelService,
            QuaresmaSantoAntonioService santoAntonioService,
            QuaresmaNossaSenhoraAparecidaService nossaSenhoraAparecidaService,
            QuaresmaEspiritoSantoService espiritoSantoService,
            QuaresmaNossaSenhoraCarmoService nossaSenhoraCarmoService,
            QuaresmaSantaTeresinhaService santaTeresinhaService,
            QuaresmaSaoFranciscoService saoFranciscoService,
            QuaresmaNatalService natalService) {
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
}
