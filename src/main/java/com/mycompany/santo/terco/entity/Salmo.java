/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.entity;

import java.io.Serializable;

public class Salmo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String referencia;
    private String refrao;
    private String texto;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getRefrao() {
        return refrao;
    }

    public void setRefrao(String refrao) {
        this.refrao = refrao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
