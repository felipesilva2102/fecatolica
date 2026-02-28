package com.mycompany.santo.terco.util;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class TempoLiturgicoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tempoLiturgico;
    private String corPrimaria;
    private String corSecundaria;
    private String corTexto;
    private String corFundo;

    @PostConstruct
    public void init() {
        atualizar();
    }

    public void atualizar() {
        LocalDate hoje = LocalDate.now();
        this.tempoLiturgico = CalendarioLiturgicoUtils.getTempoLiturgico(hoje);
        this.corPrimaria = CalendarioLiturgicoUtils.getCorPrimariaHex(tempoLiturgico);
        this.corSecundaria = CalendarioLiturgicoUtils.getCorSecundariaHex(tempoLiturgico);
        this.corTexto = CalendarioLiturgicoUtils.getCorTextoHex(tempoLiturgico);
        this.corFundo = CalendarioLiturgicoUtils.getCorFundoHex(tempoLiturgico);
    }

    /**
     * Gera o bloco CSS inline para injetar no h:head.
     */
    public String getCssVariaveis() {
        return String.format(
            ":root { --cor-primaria: %s; --cor-secundaria: %s; --cor-texto-liturgico: %s; --cor-fundo-liturgico: %s; }",
            corPrimaria, corSecundaria, corTexto, corFundo
        );
    }
}
