package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.request.CreateMentor;
import com.makaia.grupo4.entrevista.dto.response.ResponseAspirante;
import com.makaia.grupo4.entrevista.dto.response.ResponseEntrevista;
import com.makaia.grupo4.entrevista.dto.response.ResponseMentor;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.services.AspiranteService;
import com.makaia.grupo4.entrevista.services.EntrevistaService;
import com.makaia.grupo4.entrevista.services.MentorService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/mentor")
public class MentorController {

  @Autowired
  private MentorService service;

  @GetMapping
  public ResponseEntity<List<ResponseMentor>> getEntrevistas() {
    return service.getAllMentor();
  }

  @GetMapping(path = "/{mentorId}")
  public ResponseEntity<ResponseMentor> getMentor(
      @PathVariable Long mentorId) {
    return service.getMentorId(mentorId);
  }
}
