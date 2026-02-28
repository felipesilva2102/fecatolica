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
public class Oracoes {
    private String coleta;
    private String oferendas;
    private String comunhao;
    private List<String> extras;

    public String getColeta() {
        return coleta;
    }

    public void setColeta(String coleta) {
        this.coleta = coleta;
    }

    public String getOferendas() {
        return oferendas;
    }

    public void setOferendas(String oferendas) {
        this.oferendas = oferendas;
    }

    public String getComunhao() {
        return comunhao;
    }

    public void setComunhao(String comunhao) {
        this.comunhao = comunhao;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }
    
    
}
