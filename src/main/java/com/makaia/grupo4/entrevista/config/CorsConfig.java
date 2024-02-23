package com.makaia.grupo4.entrevista.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableWebMvc
// @Slf4j
public class CorsConfig {

    // @Override
    // public void addCorsMappings(CorsRegistry registry) {
    // log.info(("Ingresando a los CORS"));
    // registry.addMapping("/**")
    // .allowedOrigins("http://localhost:5173",
    // "https://entrevista-makaia-app.onrender.com")
    // .allowedMethods("GET", "POST", "PUT", "DELETE")
    // .allowedHeaders("*") // Permitir cualquier encabezado
    // .exposedHeaders("Access-Control-Allow-Origin") // Exponer el encabezado CORS
    // .allowCredentials(true);
    // }

    // }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("https://entrevista-makaia-app.onrender.com")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEADERS")
                        .allowCredentials(true);
            }
        };
    }
}