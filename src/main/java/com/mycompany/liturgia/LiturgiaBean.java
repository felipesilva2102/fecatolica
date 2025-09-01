package com.mycompany.liturgia;

import com.mycompany.santo.terco.entity.Liturgia;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Named
@ViewScoped
public class LiturgiaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private transient List<Liturgia> liturgias;
    private transient Liturgia liturgiaSelecionada;

    private final String API_URL = "http://localhost:8080/api/liturgia";

//    @PostConstruct
//    public void init() {
//        RestTemplate restTemplate = new RestTemplate();
//        Liturgia[] response = restTemplate.getForObject(API_URL, Liturgia[].class);
//        liturgias = Arrays.asList(response);
//        if (!liturgias.isEmpty()) {
//            liturgiaSelecionada = liturgias.get(0);
//        }
//    }

    public void selecionarLiturgia(Liturgia l) {
        this.liturgiaSelecionada = l;
    }

    // Getters e setters
    public List<Liturgia> getLiturgias() {
        return liturgias;
    }

    public Liturgia getLiturgiaSelecionada() {
        return liturgiaSelecionada;
    }

    public void setLiturgiaSelecionada(Liturgia liturgiaSelecionada) {
        this.liturgiaSelecionada = liturgiaSelecionada;
    }
}
