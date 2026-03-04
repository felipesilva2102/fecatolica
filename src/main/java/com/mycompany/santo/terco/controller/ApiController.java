package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.service.TempoLiturgicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final TempoLiturgicoService tempoLiturgicoService;

    public ApiController(TempoLiturgicoService tempoLiturgicoService) {
        this.tempoLiturgicoService = tempoLiturgicoService;
    }

    @GetMapping("/tempo-liturgico")
    public Map<String, String> getTempoLiturgico() {
        return tempoLiturgicoService.getTempoLiturgico();
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
