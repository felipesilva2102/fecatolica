/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Liturgia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String titulo;  // "Sábado Santo - Vigília Pascal"
    private String cor;     // "Branco"

    @OneToMany(cascade = CascadeType.ALL)
    private List<Oracoes> oracoes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Leitura> leituras;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Antifonas> antifonas;

}
