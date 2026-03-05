package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.service.IntencoesPapaService;
import com.mycompany.santo.terco.service.TempoLiturgicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final TempoLiturgicoService tempoLiturgicoService;
    private final IntencoesPapaService intencoesService;

    public ApiController(TempoLiturgicoService tempoLiturgicoService,
                         IntencoesPapaService intencoesService) {
        this.tempoLiturgicoService = tempoLiturgicoService;
        this.intencoesService = intencoesService;
    }

    @GetMapping("/tempo-liturgico")
    public Map<String, String> getTempoLiturgico() {
        return tempoLiturgicoService.getTempoLiturgico();
    }

    /**
     * Retorna as intenções mensais de oração do Papa para o ano corrente,
     * extraídas automaticamente do PDF oficial em português (popesprayer.va).
     *
     * Resposta: { "ano": 2026, "status": "ok", "pdfUrl": "...", "intencoes": [...] }
     */
    @GetMapping(value = "/intencoes-papa", produces = "application/json;charset=UTF-8")
    public Map<String, Object> getIntencoesPapa() {
        return intencoesService.getIntencoesDoPapa();
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/keepalive")
    public Map<String, String> keepalive() {
        return Map.of("status", "alive");
    }
}

