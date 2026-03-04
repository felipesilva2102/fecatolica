package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.DTO.LiturgiaDTO;
import com.mycompany.santo.terco.service.LiturgiaService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/liturgia")
public class LiturgiaController {

    private final LiturgiaService liturgiaService;

    public LiturgiaController(LiturgiaService liturgiaService) {
        this.liturgiaService = liturgiaService;
    }

    @GetMapping
    public LiturgiaDTO getLiturgia(
            @RequestParam(required = false) Integer dia,
            @RequestParam(required = false) Integer mes) {
        if (dia == null || mes == null) {
            return liturgiaService.carregarLiturgiaHoje();
        }
        return liturgiaService.carregarLiturgia(dia, mes);
    }
}
