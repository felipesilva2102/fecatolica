package com.fstech.app.health;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/culturas")
public class HealthCheckServlet {
    
    @GetMapping
    public String home() {
        return "Bem-vindo à página Home do Sistema de Monitoramento de Plantações";
    }
}
