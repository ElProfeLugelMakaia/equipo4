package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.request.CreateBooking;
import com.makaia.grupo4.entrevista.dto.response.ResponseAspirante;
import com.makaia.grupo4.entrevista.dto.response.ResponseBooking;
import com.makaia.grupo4.entrevista.dto.response.ResponseMentor;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Booking;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AspiranteRepository;
import com.makaia.grupo4.entrevista.repositories.BookingRepository;
import com.makaia.grupo4.entrevista.repositories.MentorRespository;
import com.makaia.grupo4.entrevista.utils.Utils;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
@Slf4j
public class BookingService {

  @Autowired
  BookingRepository repository;

  @Autowired
  MentorRespository mentorRepository;

  @Autowired
  AspiranteRepository aspiranteRespository;

  @Autowired
  SendEmailService sendEmailService;

  public ResponseEntity<ResponseBooking> createBooking(
      CreateBooking dto) {
    log.info("DTO: {}", dto);
    Optional<Aspirante> aspirante = aspiranteRespository.findById(dto.getAspirante_id());

    if (!aspirante.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
    }
    log.info("Aspirante {}", aspirante.get());

    Optional<Mentor> mentor = mentorRepository.findById(dto.getMentor_id());

    if (!mentor.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El mentor no existe");
    }
    log.info("Mentor {}", aspirante.get());

    Booking booking = this.repository.findByAspirante(aspirante.get());
    if (booking != null) {
      throw new EntrevistaApiException(HttpStatus.BAD_REQUEST, "El booking con este aspirante ya existe");
    }

    Booking newBooking = new Booking(dto.getFecha(), mentor.get(), Utils.generateCodeAlphNumString(), aspirante.get());
    this.repository.save(newBooking);

    // sendEmailService.sendEmail(booking.getAspirante().getCorreo(), "Un paso al
    // ser el mejor programador ", "Tienes una entrevista agendada en el siguiente
    // link : " + booking.ge);

    log.info("Booking created {}", newBooking);

    return ResponseEntity.ok(convertBookingToDTO(newBooking));
  }

  public ResponseEntity<List<ResponseBooking>> getAllBookings() {
    List<ResponseBooking> responseEntrevistas = StreamSupport
        .stream(this.repository.findAll().spliterator(), false)
        .map(this::convertBookingToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseEntrevistas);
  }

  public ResponseEntity<ResponseBooking> getBookingByAspiranteId(
      Long id) {
    log.info("Id aspirante: {}", id);
    Optional<Aspirante> aspirante = aspiranteRespository.findById(id);

    if (!aspirante.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
    }
    log.info("Aspirante {}", aspirante.get());
    Booking booking = this.repository.findByAspirante(aspirante.get());
    if (booking == null) {
      return new ResponseEntity<>(new ResponseBooking(), HttpStatus.NOT_FOUND);
    }
    ResponseBooking responseBooking = convertBookingToDTO(booking);

    return ResponseEntity.ok(responseBooking);
  }

  public ResponseEntity<List<ResponseBooking>> getBookingMentorId(
      Long id) {
    log.info("Inicia Servicio Booking/mentor id_mentor: {}", id);
    Optional<Mentor> mentor = mentorRepository.findById(id);

    if (!mentor.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El mentor no existe");
    }
    log.info("Inicia Servicio Entrevista/mentor id_mentor: {}", id);
    List<ResponseBooking> responseBooking = StreamSupport
        .stream(
            this.repository.findByMentorActive(mentor.get()).spliterator(),
            false)
        .map(this::convertBookingToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseBooking);
  }

  private ResponseBooking convertBookingToDTO(Booking booking) {
    Mentor mentor = booking.getMentor();
    Aspirante aspirante = booking.getAspirante();
    return new ResponseBooking(
        booking.getId(),
        booking.getFecha(),
        new ResponseMentor(mentor.getId(), mentor.getCorreo(), mentor.getNombres(), mentor.getEstado()),
        new ResponseAspirante(aspirante.getId(), aspirante.getCorreo(), aspirante.getNombres(), aspirante.getTipo(),
            aspirante.getEstado()));
  }
}
