package com.mycompany.santo.terco.service;

import com.mycompany.santo.terco.util.CalendarioLiturgicoUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TempoLiturgicoService {

    public Map<String, String> getTempoLiturgico() {
        LocalDate hoje = LocalDate.now();
        String tempo = CalendarioLiturgicoUtils.getTempoLiturgico(hoje);
        String corPrimaria = CalendarioLiturgicoUtils.getCorPrimariaHex(tempo);
        String corSecundaria = CalendarioLiturgicoUtils.getCorSecundariaHex(tempo);
        String corTexto = CalendarioLiturgicoUtils.getCorTextoHex(tempo);
        String corFundo = CalendarioLiturgicoUtils.getCorFundoHex(tempo);

        Map<String, String> result = new LinkedHashMap<>();
        result.put("tempoLiturgico", tempo);
        result.put("corPrimaria", corPrimaria);
        result.put("corSecundaria", corSecundaria);
        result.put("corTexto", corTexto);
        result.put("corFundo", corFundo);
        result.put("cssVariaveis", String.format(
            ":root { --cor-primaria: %s; --cor-secundaria: %s; --cor-texto-liturgico: %s; --cor-fundo-liturgico: %s; }",
            corPrimaria, corSecundaria, corTexto, corFundo));
        return result;
    }
}
