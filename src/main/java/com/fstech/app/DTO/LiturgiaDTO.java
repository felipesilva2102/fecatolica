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
}
