package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.ResponseEntrevista;
import com.makaia.grupo4.entrevista.services.EntrevistaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/entrevista")
public class EntrevistaController {

  @Autowired
  private EntrevistaService service;

  @GetMapping
  public ResponseEntity<List<ResponseEntrevista>> getEntrevistas() {
    return service.getAllEntrevistas();
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
