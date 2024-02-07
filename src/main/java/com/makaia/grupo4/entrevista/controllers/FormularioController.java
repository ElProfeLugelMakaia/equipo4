package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.request.CreateAspirante;
import com.makaia.grupo4.entrevista.dto.request.CreateBooking;
import com.makaia.grupo4.entrevista.dto.request.CreateFormulario;
import com.makaia.grupo4.entrevista.dto.response.ResponseBooking;
import com.makaia.grupo4.entrevista.dto.response.ResponseEntrevista;
import com.makaia.grupo4.entrevista.dto.response.ResponseFormulario;
import com.makaia.grupo4.entrevista.services.BookingService;
import com.makaia.grupo4.entrevista.services.EntrevistaService;
import com.makaia.grupo4.entrevista.services.FormularioService;

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
@RequestMapping("api/v1/formulario")
public class FormularioController {

  @Autowired
  private FormularioService service;

  @GetMapping
  public ResponseEntity<List<ResponseFormulario>> getFormularios() {
    return service.getAllFormularios();
  }

  @GetMapping(path = "/mentor/{mentorId}")
  public ResponseEntity<List<ResponseFormulario>> getFormulariosMentor(
      @PathVariable Long mentorId) {
    return service.getBookingMentorId(mentorId);
  }

  @GetMapping(path = "/aspirante/{aspiranteId}")
  public ResponseEntity<ResponseFormulario> getFormularioAspirante(
      @PathVariable Long aspiranteId) {
    return service.getFormularioByAspiranteId(aspiranteId);
  }

  @PostMapping()
  public ResponseEntity<ResponseFormulario> createFormulario(@RequestBody CreateFormulario entity) {
    return service.createFormulario(entity);
  }

}
