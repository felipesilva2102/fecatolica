package com.mycompany.santo.terco.mural;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IntencaoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String nome;
    private String intencao;
    private String dataHora;
}
