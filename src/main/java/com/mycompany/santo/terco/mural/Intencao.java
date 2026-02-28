package com.mycompany.santo.terco.mural;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(
        name = "intencao",
        indexes = {
            @Index(name = "idx_intencao_criado_em", columnList = "criado_em"),
            @Index(name = "idx_intencao_nome", columnList = "nome")
        }
)
public class Intencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 500)
    private String texto;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;
}
