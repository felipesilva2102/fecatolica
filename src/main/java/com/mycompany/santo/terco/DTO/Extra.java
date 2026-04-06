/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.DTO;

import java.io.Serializable;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Extra implements Serializable {
    private static final long serialVersionUID = 1L;
    private String titulo;
    private String texto;
}
