package com.makaia.grupo4.entrevista.controllers;

import com.makaia.grupo4.entrevista.dto.request.CreateAspirante;
import com.makaia.grupo4.entrevista.dto.request.CreateBooking;
import com.makaia.grupo4.entrevista.dto.response.ResponseBooking;
import com.makaia.grupo4.entrevista.dto.response.ResponseEntrevista;
import com.makaia.grupo4.entrevista.services.BookingService;
import com.makaia.grupo4.entrevista.services.EntrevistaService;
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
@RequestMapping("api/v1/booking")
public class BookingController {

  @Autowired
  private BookingService service;

  @GetMapping
  public ResponseEntity<List<ResponseBooking>> getBookings() {
    return service.getAllBookings();
  }

  @GetMapping(path = "/mentor/{mentorId}")
  public ResponseEntity<List<ResponseBooking>> getBookingMentor(
      @PathVariable Long mentorId) {
    return service.getBookingMentorId(mentorId);
  }

  @GetMapping(path = "/aspirante/{aspiranteId}")
  public ResponseEntity<ResponseBooking> getEntrevistaAspirante(
      @PathVariable Long aspiranteId) {
    return service.getBookingByAspiranteId(aspiranteId);
  }

  @PostMapping()
  public ResponseEntity<ResponseBooking> createBooking(@RequestBody CreateBooking entity) {
    return service.createBooking(entity);
  }

}
