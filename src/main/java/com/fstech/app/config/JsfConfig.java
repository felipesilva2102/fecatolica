/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstech.app.config;

import jakarta.faces.webapp.FacesServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Felipe
 */
@Configuration
public class JsfConfig {

    @Bean
    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
        return new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
    }
}

