/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santo.terco.liturgia;

import com.mycompany.santo.terco.DTO.LiturgiaDTO;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbException;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
@Getter
@Setter
public class LiturgiaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String API_URL = "https://liturgia.up.railway.app/v2/";

    private transient LiturgiaDTO liturgia;
    private LocalDate dataSelecionada;

    @PostConstruct
    public void init() {
        dataSelecionada = LocalDate.now(); // Inicializa com a data atual
        carregarLiturgia();
    }

    public void carregarLiturgia() {
        carregarLiturgiaPorData(dataSelecionada);
    }

    public void carregarLiturgiaPorData(LocalDate data) {
        try {
            String url = String.format("%s?dia=%d&mes=%d", API_URL, data.getDayOfMonth(), data.getMonthValue());

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Jsonb jsonb = JsonbBuilder.create();
                this.liturgia = jsonb.fromJson(response.body(), LiturgiaDTO.class);
            } else {
                liturgia = new LiturgiaDTO();
                liturgia.setLiturgia("Erro HTTP: " + response.statusCode());
            }
        } catch (JsonbException | IOException | InterruptedException e) {
            liturgia = new LiturgiaDTO();
            liturgia.setLiturgia("Erro ao carregar liturgia: " + e.getMessage());
        }
    }

    public String getCorLiturgiaHex() {
        if (liturgia == null || liturgia.getCor() == null) {
            return "#ffffff"; 
        }
        return switch (liturgia.getCor()) {
            case "Verde" ->
                "#28a745";
            case "Vermelho" ->
                "#dc3545";
            case "Roxo" ->
                "#6f42c1";
            case "Branco" ->
                "#f8f9fa";
            case "Rosa" ->
                "#ffb6c1";
            default ->
                "#ffffff";
        };
    }

    public String getCorTexto() {
        if (liturgia == null || liturgia.getCor() == null) {
            return "#000000";
        }
        return "Branco".equals(liturgia.getCor()) || "Rosa".equals(liturgia.getCor()) ? "#000000" : "#ffffff";
    }

}
