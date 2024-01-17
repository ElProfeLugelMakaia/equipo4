package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.ResponseEntrevista;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AspiranteRepository;
import com.makaia.grupo4.entrevista.repositories.EntrevistaRepository;
import com.makaia.grupo4.entrevista.repositories.MentorRespository;

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
public class EntrevistaService {

  @Autowired
  EntrevistaRepository repository;

  @Autowired
  MentorRespository mentorRepository;

  @Autowired
  AspiranteRepository aspiranteRespository;

  public ResponseEntity<List<ResponseEntrevista>> getAllEntrevistas() {
    List<ResponseEntrevista> responseEntrevistas = StreamSupport
        .stream(this.repository.findAll().spliterator(), false)
        .map(this::convertEntrevistaToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseEntrevistas);
  }

  public ResponseEntity<ResponseEntrevista> getEntrevistaByAspiranteId(
      Long id) {
    log.info("Id aspirante: {}", id);
    Optional<Aspirante> aspirante = aspiranteRespository.findById(id);

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
    Optional<Mentor> mentor = mentorRepository.findById(id);

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
    return new ResponseEntrevista(
        entrevista.getId(),
        entrevista.getFecha(),
        entrevista.isAsistida(),
        entrevista.getBooking().getId());
  }
}
