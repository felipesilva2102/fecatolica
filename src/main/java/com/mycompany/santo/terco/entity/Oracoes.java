/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Oracoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;  // coleta, oferendas, comunhao, extra

    private String titulo; // Apenas para extras
    @Lob
    private String texto;

    @ElementCollection
    @CollectionTable(name = "oracoes_extras", joinColumns = @JoinColumn(name = "liturgia_id"))
    private List<OracaoExtra> extras;

}

@Getter
@Setter
@Embeddable
class OracaoExtra {

    private String titulo;

    @Lob
    private String texto;

}
