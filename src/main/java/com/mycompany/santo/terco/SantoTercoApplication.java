package com.mycompany.santo.terco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SantoTercoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SantoTercoApplication.class, args);
    }
}
