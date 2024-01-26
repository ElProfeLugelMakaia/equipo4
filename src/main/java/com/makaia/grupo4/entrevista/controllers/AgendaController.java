package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.response.ResponseAgenda;
import com.makaia.grupo4.entrevista.services.AgendaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/agenda")
public class AgendaController {

  @Autowired
  private AgendaService service;

  @GetMapping(path = "/mentor/{mentorId}")
  public ResponseEntity<List<ResponseAgenda>> getAgendaByMentorId(
      @PathVariable Long mentorId) {
    return service.getAgendaByMentorId(mentorId);
  }
}
