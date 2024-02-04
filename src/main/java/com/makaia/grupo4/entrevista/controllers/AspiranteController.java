package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.request.CreateAspirante;
import com.makaia.grupo4.entrevista.dto.response.ResponseAspirante;
import com.makaia.grupo4.entrevista.services.AspiranteService;
import jakarta.validation.constraints.NotNull;

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
@RequestMapping("api/v1/aspirante")
public class AspiranteController {

  @Autowired
  private AspiranteService service;

  @GetMapping
  public ResponseEntity<List<ResponseAspirante>> getEntrevistas() {
    return service.getAllAspirante();
  }

  @PostMapping()
  public ResponseEntity<ResponseAspirante> postMethodName(@RequestBody CreateAspirante entity) {
    // TODO: process POST request
    return service.createAspirante(entity);
  }

  @GetMapping(path = "/{aspiranteId}")
  public ResponseEntity<ResponseAspirante> getEntrevistasMentor(
      @PathVariable @NotNull Long aspiranteId) {
    return service.getAspiranteId(aspiranteId);
  }
}
