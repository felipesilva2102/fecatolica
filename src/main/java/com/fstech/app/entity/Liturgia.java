/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstech.app.entity;

import com.fstech.app.DTO.Antifonas;
import com.fstech.app.DTO.Leituras;
import com.fstech.app.DTO.Oracoes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Felipe
 */
@Entity
@Getter
@Setter
public class Liturgia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;
    private String liturgia;
    private String cor;

    @Transient
    private Oracoes oracoes;  // Não será persistido no banco

    @Transient
    private Leituras leituras; // Também não será persistido

    @Transient
    private Antifonas antifonas; // Também não será persistido

}

