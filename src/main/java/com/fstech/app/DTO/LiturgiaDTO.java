/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstech.app.DTO;

/**
 *
 * @author Felipe
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LiturgiaDTO {
    private String data;
    private String liturgia;
    private String cor;
    private Oracoes oracoes;
    private Leituras leituras;
    private Antifonas antifonas;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLiturgia() {
        return liturgia;
    }

    public void setLiturgia(String liturgia) {
        this.liturgia = liturgia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Oracoes getOracoes() {
        return oracoes;
    }

    public void setOracoes(Oracoes oracoes) {
        this.oracoes = oracoes;
    }

    public Leituras getLeituras() {
        return leituras;
    }

    public void setLeituras(Leituras leituras) {
        this.leituras = leituras;
    }

    public Antifonas getAntifonas() {
        return antifonas;
    }

    public void setAntifonas(Antifonas antifonas) {
        this.antifonas = antifonas;
    }
    
    
}
