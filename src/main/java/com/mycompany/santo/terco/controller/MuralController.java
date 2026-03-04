package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.mural.IntencaoDTO;
import com.mycompany.santo.terco.service.MuralService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/mural")
public class MuralController {

    private final MuralService muralService;

    public MuralController(MuralService muralService) {
        this.muralService = muralService;
    }

    @GetMapping("/intencoes")
    public List<IntencaoDTO> listarIntencoes() {
        return muralService.listarIntencoes();
    }

    @GetMapping("/total")
    public Map<String, Integer> totalIntencoes() {
        return Map.of("total", muralService.contarIntencoes());
    }

    @PostMapping("/intencoes")
    public ResponseEntity<Map<String, Object>> adicionarIntencao(@RequestBody Map<String, String> body) {
        String nome = body.getOrDefault("nome", "");
        String intencao = body.getOrDefault("intencao", "");

        if (intencao == null || intencao.trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("success", false, "error", "Intencao e obrigatoria"));
        }

        muralService.adicionarIntencao(nome, intencao);
        return ResponseEntity.ok(Map.of("success", true));
    }
}
