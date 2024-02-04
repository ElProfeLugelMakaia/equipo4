package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.response.ResponseMentor;
import com.makaia.grupo4.entrevista.services.MentorService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
