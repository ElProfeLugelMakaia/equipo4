package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.request.CreateAgenda;
import com.makaia.grupo4.entrevista.dto.response.ResponseAgenda;
import com.makaia.grupo4.entrevista.dto.response.ResponseDelete;
import com.makaia.grupo4.entrevista.services.AgendaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("api/v1/agenda")
public class AgendaController {

  @Autowired
  private AgendaService service;

  @PutMapping()
  public ResponseEntity<ResponseAgenda> updateAgenda(
      @RequestBody CreateAgenda entity) {
    return service.updateAgenda(entity);
  }

  @DeleteMapping("/{agenda_id}")
  public ResponseEntity<ResponseDelete> deleteAgenda(
      @PathVariable Long agenda_id) {
    return service.deleteAgenda(agenda_id);
  }

  @GetMapping(path = "/mentor/{mentorId}")
  public ResponseEntity<List<ResponseAgenda>> getAgendaByMentorId(
      @PathVariable Long mentorId) {
    return service.getAgendaByMentorId(mentorId);
  }

  @PostMapping(path = "/mentor/{mentorId}")
  public ResponseEntity<ResponseAgenda> createAgenda(
      @RequestBody CreateAgenda entity) {
    return service.createAgenda(entity);
  }
}
