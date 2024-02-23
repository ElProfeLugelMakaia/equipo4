package com.makaia.grupo4.entrevista.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.makaia.grupo4.entrevista.security.jwt.JwtFilter;

import jakarta.servlet.http.HttpServletResponse;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {

        @Autowired
        private JwtFilter jwtTokenFilter;

        @Autowired
        AuthDetailsService authDetailsService;

        @Bean
        PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder(8);
        }

        @Bean
        SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
                httpSecurity = httpSecurity
                                .csrf(AbstractHttpConfigurer::disable);

                httpSecurity = httpSecurity
                                .sessionManagement(management -> management
                                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));

                // // Set unauthorized requests exception handler
                // httpSecurity = httpSecurity
                // .exceptionHandling(handling -> handling
                // .authenticationEntryPoint(
                // (request, response, ex) -> {
                // response.sendError(
                // HttpServletResponse.SC_UNAUTHORIZED,
                // ex.getMessage());
                // }));

                httpSecurity = httpSecurity
                                .authorizeHttpRequests((authorize) -> {
                                        authorize
                                                        .requestMatchers("/public/**", "api/v1/users/login",
                                                                        "api/v1/users/forgotPassword",
                                                                        "api/v1/users/signup")
                                                        .permitAll()
                                                        .anyRequest().authenticated();
                                });

                // Add JWT token filter
                httpSecurity.addFilterBefore(
                                jwtTokenFilter,
                                UsernamePasswordAuthenticationFilter.class);

                return httpSecurity.build();
        }

        // Used by Spring Security if CORS is enabled.
        @Bean
        CorsFilter corsFilter() {
                UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
                CorsConfiguration config = new CorsConfiguration();
                config.setAllowCredentials(true);
                config.addAllowedOrigin("*");
                config.addAllowedHeader("*");
                config.addAllowedMethod("*");
                source.registerCorsConfiguration("/**", config);
                return new CorsFilter(source);
        }
}
