package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.service.QuaresmaLiturgicaService;
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

    public QuaresmaController(QuaresmaLiturgicaService liturgicaService,
                              QuaresmaSaoJoseService saoJoseService,
                              QuaresmaSaoMiguelService saoMiguelService) {
        this.liturgicaService = liturgicaService;
        this.saoJoseService = saoJoseService;
        this.saoMiguelService = saoMiguelService;
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
}
