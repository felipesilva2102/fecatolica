/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.entity;

import java.io.Serializable;
import java.util.List;

public class Leituras implements Serializable {

    private static final long serialVersionUID = 1L;
    private transient List<Leitura> primeiraLeitura;
    private transient List<Leitura> segundaLeitura;
    private transient List<Salmo> salmo;
    private transient List<Leitura> evangelho;

    public List<Leitura> getPrimeiraLeitura() {
        return primeiraLeitura;
    }

    public void setPrimeiraLeitura(List<Leitura> primeiraLeitura) {
        this.primeiraLeitura = primeiraLeitura;
    }

    public List<Leitura> getSegundaLeitura() {
        return segundaLeitura;
    }

    public void setSegundaLeitura(List<Leitura> segundaLeitura) {
        this.segundaLeitura = segundaLeitura;
    }

    public List<Salmo> getSalmo() {
        return salmo;
    }

    public void setSalmo(List<Salmo> salmo) {
        this.salmo = salmo;
    }

    public List<Leitura> getEvangelho() {
        return evangelho;
    }

    public void setEvangelho(List<Leitura> evangelho) {
        this.evangelho = evangelho;
    }
}
