package com.makaia.grupo4.entrevista.security.jwt;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.makaia.grupo4.entrevista.security.AuthDetailsService;

import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    public JwtUtil jwtUtil;

    @Autowired
    private AuthDetailsService authDetailsService;

    private Claims claims = null;

    private String email = null;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        log.info("getServletPath headers: {}", request.getServletPath());
        if (request.getServletPath().matches("/users/login|/users/forgotPassword|/users/signup")) {
            filterChain.doFilter(request, response);
        } else {
            String authorizationHeaders = request.getHeader("Authorization");
            log.info("Authorization headers: {}", authorizationHeaders);
            String token = null;

            if (authorizationHeaders != null && authorizationHeaders.startsWith("Bearer ")) {
                token = authorizationHeaders.substring(7);
                log.info("Token {}", token);
                email = jwtUtil.extractEmail(token);
                log.info("Email {}", email);
                claims = jwtUtil.extracAllClaims(token);
                log.info("claims {}", claims);
            }
            if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                UserDetails userDetails = authDetailsService.loadUserByUsername(email);
                if (jwtUtil.validateToken(token, userDetails)) {
                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                            userDetails, null, userDetails.getAuthorities());
                    new WebAuthenticationDetailsSource().buildDetails(request);
                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                }
            }
            filterChain.doFilter(request, response);
        }

    }

}
