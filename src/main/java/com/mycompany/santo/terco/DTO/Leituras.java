/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.DTO;

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
}
