package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.request.CreateEntrevista;
import com.makaia.grupo4.entrevista.dto.response.ResponseAspirante;
import com.makaia.grupo4.entrevista.dto.response.ResponseEntrevista;
import com.makaia.grupo4.entrevista.dto.response.ResponseMentor;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Booking;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AspiranteRepository;
import com.makaia.grupo4.entrevista.repositories.BookingRepository;
import com.makaia.grupo4.entrevista.repositories.EntrevistaRepository;
import com.makaia.grupo4.entrevista.repositories.MentorRespository;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
@Slf4j
public class EntrevistaService {

  @Autowired
  EntrevistaRepository repository;

  @Autowired
  BookingRepository bookingRepository;

  @Autowired
  AspiranteRepository aspiranteRepository;

  @Autowired
  MentorRespository mentorRespository;

  @Autowired
  GoogleCalendaService googleCalendaService;

  @SuppressWarnings("null")
  public ResponseEntity<ResponseEntrevista> createEntrevista(CreateEntrevista dto)
      throws IOException, GeneralSecurityException {
    log.info("DTO: {}", dto);
    Optional<Booking> booking = bookingRepository.findById(dto.getBooking_id());

    if (!booking.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El ID del booking no existe");
    }
    log.info("booking {}", booking.get());
    // String meetLink = googleCalendaService.generateMeetLink(dto.getMeeting());
    String meetLink = "https://zoom.us/j/99070830834?pwd=QkNXb1BkYzU3WnBjMDltRDIxT2JMQT09";
    Entrevista newEntrevista = new Entrevista(booking.get().getFecha(), false, meetLink, booking.get());
    this.repository.save(newEntrevista);

    booking.get().setEntrevista(newEntrevista);
    booking.get().setActive(false);
    this.bookingRepository.save(booking.get());

    log.info("Entrevista created {}", newEntrevista);

    return ResponseEntity.ok(convertEntrevistaToDTO(newEntrevista));
  }

  public ResponseEntity<List<ResponseEntrevista>> getAllEntrevistas() {
    List<ResponseEntrevista> responseEntrevistas = StreamSupport
        .stream(this.repository.findAll().spliterator(), false)
        .map(this::convertEntrevistaToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseEntrevistas);
  }

  public ResponseEntity<ResponseEntrevista> getEntrevistaById(
      Long id) {
    log.info("Id Entrevista: {}", id);
    Optional<Entrevista> entrevistaOptional = repository.findById(id);

    if (!entrevistaOptional.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
    }

    ResponseEntrevista responseEntrevista = convertEntrevistaToDTO(entrevistaOptional.get());

    return ResponseEntity.ok(responseEntrevista);
  }

  public ResponseEntity<ResponseEntrevista> getEntrevistaByAspiranteId(
      Long id) {
    log.info("Id aspirante: {}", id);
    Optional<Aspirante> aspirante = aspiranteRepository.findById(id);

    if (!aspirante.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
    }
    log.info("Aspirante {}", aspirante.get());
    Optional<Entrevista> entrevista = this.repository.findByAspirante(aspirante.get());
    if (!entrevista.isPresent()) {
      return new ResponseEntity<>(new ResponseEntrevista(), HttpStatus.NOT_FOUND);
    }
    ResponseEntrevista responseEntrevista = convertEntrevistaToDTO(entrevista.get());

    return ResponseEntity.ok(responseEntrevista);
  }

  public ResponseEntity<List<ResponseEntrevista>> getEntrevistasMentorId(
      Long id) {
    log.info("Inicia Servicio Entrevista/mentor id_mentor: {}", id);
    Optional<Mentor> mentor = mentorRespository.findById(id);

    if (!mentor.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El mentor no existe");
    }
    log.info("Inicia Servicio Entrevista/mentor id_mentor: {}", id);
    List<ResponseEntrevista> responseEntrevistas = StreamSupport
        .stream(
            this.repository.findByMentor(mentor.get()).spliterator(),
            false)
        .map(this::convertEntrevistaToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseEntrevistas);
  }

  private ResponseEntrevista convertEntrevistaToDTO(Entrevista entrevista) {
    Mentor mentor = entrevista.getBooking().getMentor();
    ResponseMentor responseMentor = new ResponseMentor(mentor.getId(), mentor.getCorreo(), mentor.getNombres(),
        mentor.isEstado());
    Aspirante aspirante = entrevista.getBooking().getAspirante();
    ResponseAspirante responseAspirante = new ResponseAspirante(aspirante.getId(), aspirante.getCorreo(),
        aspirante.getNombres(), aspirante.getTipo(), aspirante.getEstado());
    return new ResponseEntrevista(
        entrevista.getId(),
        entrevista.getBooking().getFecha(),
        entrevista.isAsistida(),
        entrevista.getBooking().getId(), responseAspirante, responseMentor);
  }
}
