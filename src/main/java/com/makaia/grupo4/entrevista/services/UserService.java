package com.makaia.grupo4.entrevista.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.makaia.grupo4.entrevista.dto.LoginDTO;
import com.makaia.grupo4.entrevista.dto.ResponseLogin;
import com.makaia.grupo4.entrevista.dto.ResponseMentor;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.security.AuthDetailsService;
import com.makaia.grupo4.entrevista.security.jwt.JwtUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

    @Autowired
    private AuthDetailsService authDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // public ResponseEntity<Object> signUp(Map<String, Object> userData) {
    // log.info("Registro interno de un usuario {}", userData);
    // Map<String, Object> resp = new HashMap<>();
    // if (validateSignUpMap(userData)) {

    // Usuario usuario =
    // repositorioUsuario.findByEmail(userData.get("correo").toString()).orElse(null);
    // if (usuario == null) {
    // Usuario n = new Usuario();
    // n.setNombre(userData.get("nombre").toString());
    // n.setApellido(userData.get("apellido").toString());
    // n.setNombreUsuario(userData.get("nombreUsuario").toString());
    // n.setCorreo(userData.get("correo").toString());
    // n.setContrasena(passwordEncoder.encode(userData.get("contrasena").toString()));
    // repositorioUsuario.save(n);
    // return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    // } else {

    // resp.put("error", "Usuario ya existente");
    // return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
    // }

    // } else {
    // resp.put("error", "Campos invalidos");
    // return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
    // }
    // }

    public ResponseEntity<ResponseLogin> login(LoginDTO userData) {

        log.info("Ingresando al login");
        try {
            // String pwdEncoded = passwordEncoder.encode();
            UserDetails userDetails = authDetailsService.loadUserByUsername(userData.getCorreo());
            log.info("User: " + userDetails);
            if (userDetails == null) {
                throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "Usuario no existente");
            }
            String password = userData.getPassword();
            String pwdEncoded = userDetails.getPassword();
            log.info("pwdEncoded: " + pwdEncoded);
            log.info("password: " + password);
            if (passwordEncoder.matches(password, pwdEncoded)) {
                String token = jwtUtil.generateToken(authDetailsService.getUserDetail().getCorreo(),
                        authDetailsService.getUserDetail().getId());
                ResponseMentor user = new ResponseMentor(authDetailsService.getUserDetail().getId(),
                        authDetailsService.getUserDetail().getCorreo(), authDetailsService.getUserDetail().getEstado());

                log.info("User {}", user);
                return ResponseEntity.ok(new ResponseLogin(HttpStatus.ACCEPTED, token, user));
            } else {
                return new ResponseEntity<>(new ResponseLogin(HttpStatus.FORBIDDEN, "", new ResponseMentor()),
                        HttpStatus.FORBIDDEN);
            }
        } catch (UsernameNotFoundException e) {
            log.error("{}", e.getMessage());
            throw new EntrevistaApiException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (Exception e) {
            log.error("{}", e);
            throw new EntrevistaApiException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    // private boolean validateSignUpMap(Map<String, Object> requestBody) {
    // return (requestBody.containsKey("contrasena") &&
    // requestBody.containsKey("correo") &&
    // requestBody.containsKey("nombre") &&
    // requestBody.containsKey("apellido") &&
    // requestBody.containsKey("nombreUsuario"));
    // }

}
