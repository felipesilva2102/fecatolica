/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstech.app.DTO;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Leituras {
    private List<Leitura> primeiraLeitura;
    private List<Salmo> salmo;
    private List<Leitura> segundaLeitura;
    private List<Leitura> evangelho;
    private List<String> extras;

    public List<Leitura> getPrimeiraLeitura() {
        return primeiraLeitura;
    }

    public void setPrimeiraLeitura(List<Leitura> primeiraLeitura) {
        this.primeiraLeitura = primeiraLeitura;
    }

    public List<Salmo> getSalmo() {
        return salmo;
    }

    public void setSalmo(List<Salmo> salmo) {
        this.salmo = salmo;
    }

    public List<Leitura> getSegundaLeitura() {
        return segundaLeitura;
    }

    public void setSegundaLeitura(List<Leitura> segundaLeitura) {
        this.segundaLeitura = segundaLeitura;
    }

    public List<Leitura> getEvangelho() {
        return evangelho;
    }

    public void setEvangelho(List<Leitura> evangelho) {
        this.evangelho = evangelho;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }
    
    
}
