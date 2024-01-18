package com.makaia.grupo4.entrevista.security.jwt;

import java.security.Key;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JwtUtil {

    private Key secret = Jwts.SIG.HS256.key().build();

    public String extractEmail(String token) {
        return extractClaims(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaims(token, Claims::getExpiration);
    }

    private <T> T extractClaims(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extracAllClaims(token);
        log.info("Claims extracted from {}", claims);
        return claimsResolver.apply(claims);
    }

    public Claims extracAllClaims(String token) {
        log.info("secret {}", secret);
        Claims claims = Jwts.parser().setSigningKey(secret)
                .build().parseClaimsJws(token).getBody();

        log.info("claims {}", claims);
        return claims;
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public String generateToken(String email, long idUser) {
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("idUser", idUser);
        return Jwts.builder()
                .setClaims(Jwts.claims().add("idUser", idUser).build()) // Agregando la afirmación // manualmente
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(Date.from(Instant.now().plusSeconds(100 * 60 * 60 * 10)))
                .signWith(secret)
                .compact();

    }

    public boolean validateToken(String token, UserDetails userDetails) {
        log.info("Validation {}", extractEmail(token));
        final String email = extractEmail(token);
        return (email.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

}
