/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstech.app.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Antifonas {
    private String entrada;
    private String comunhao;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getComunhao() {
        return comunhao;
    }

    public void setComunhao(String comunhao) {
        this.comunhao = comunhao;
    }
    
    
}

