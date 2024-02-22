package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.request.CreateEntrevista;
import com.makaia.grupo4.entrevista.dto.response.ResponseEntrevista;
import com.makaia.grupo4.entrevista.services.EntrevistaService;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/entrevista")
public class EntrevistaController {

  @Autowired
  private EntrevistaService service;

  @PostMapping()
  public ResponseEntity<ResponseEntrevista> createEntrevista(@RequestBody CreateEntrevista entity)
      throws IOException, GeneralSecurityException {
    // TODO: process POST request
    return service.createEntrevista(entity);
  }

  @GetMapping
  public ResponseEntity<List<ResponseEntrevista>> getEntrevistas() {
    return service.getAllEntrevistas();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<ResponseEntrevista> getEntrevistaId(
      @PathVariable Long id) {
    return service.getEntrevistaById(id);
  }

  @GetMapping(path = "/mentor/{mentorId}")
  public ResponseEntity<List<ResponseEntrevista>> getEntrevistasMentor(
      @PathVariable Long mentorId) {
    return service.getEntrevistasMentorId(mentorId);
  }

  @GetMapping(path = "/aspirante/{aspiranteId}")
  public ResponseEntity<ResponseEntrevista> getEntrevistaAspirante(
      @PathVariable Long aspiranteId) {
    return service.getEntrevistaByAspiranteId(aspiranteId);
  }
}
