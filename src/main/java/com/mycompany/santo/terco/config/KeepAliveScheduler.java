package com.mycompany.santo.terco.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class KeepAliveScheduler {

    @Scheduled(fixedRate = 300000) // 5 minutos
    public void executar() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://fecatolica.onrender.com/api/keepalive"))
                    .GET()
                    .build();
            client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            // silencioso - apenas keepalive
        }
    }
}
