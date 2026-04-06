package com.mycompany.santo.terco.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.santo.terco.DTO.LiturgiaDTO;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;

@Service
public class LiturgiaService {

    private static final String API_URL = "https://liturgia.up.railway.app/v2/";
    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public LiturgiaDTO carregarLiturgia(int dia, int mes) {
        try {
            String url = String.format("%s?dia=%d&mes=%d", API_URL, dia, mes);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return objectMapper.readValue(response.body(), LiturgiaDTO.class);
            } else {
                LiturgiaDTO dto = new LiturgiaDTO();
                dto.setLiturgia("Erro HTTP: " + response.statusCode());
                return dto;
            }
        } catch (Exception e) {
            e.printStackTrace();
            LiturgiaDTO dto = new LiturgiaDTO();
            dto.setLiturgia("Erro ao carregar liturgia: " + e.getMessage());
            return dto;
        }
    }

    public LiturgiaDTO carregarLiturgiaHoje() {
        LocalDate hoje = LocalDate.now();
        return carregarLiturgia(hoje.getDayOfMonth(), hoje.getMonthValue());
    }

    public String getCorLiturgiaHex(String cor) {
        if (cor == null) return "#ffffff";
        return switch (cor) {
            case "Verde" -> "#28a745";
            case "Vermelho" -> "#dc3545";
            case "Roxo" -> "#6f42c1";
            case "Branco" -> "#f8f9fa";
            case "Rosa" -> "#ffb6c1";
            default -> "#ffffff";
        };
    }
}
