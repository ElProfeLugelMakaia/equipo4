package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.ResponseEntrevista;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AspiranteRepository;
import com.makaia.grupo4.entrevista.repositories.EntrevistaRepository;
import com.makaia.grupo4.entrevista.repositories.MentorRespository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class Service {

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
    Long id
  ) {
    Optional<Aspirante> aspirante = aspiranteRespository.findById(id);

    if (!aspirante.isPresent()) {
      throw new EntrevistaApiException("El aspirante no existe");
    }
    ResponseEntrevista responseEntrevista = convertEntrevistaToDTO(
      this.repository.getEntrevistaAspiranteId(aspirante.get())
    );

    return ResponseEntity.ok(responseEntrevista);
  }

  public ResponseEntity<List<ResponseEntrevista>> getEntrevistasMentorId(
    Long id
  ) {
    Optional<Mentor> mentor = mentorRepository.findById(id);

    if (!mentor.isPresent()) {
      throw new EntrevistaApiException("El mentor no existe");
    }
    List<ResponseEntrevista> responseEntrevistas = StreamSupport
      .stream(
        this.repository.getEntrevistaMentorId(mentor.get()).spliterator(),
        false
      )
      .map(this::convertEntrevistaToDTO)
      .collect(Collectors.toList());

    return ResponseEntity.ok(responseEntrevistas);
  }

  private ResponseEntrevista convertEntrevistaToDTO(Entrevista entrevista) {
    return new ResponseEntrevista(
      entrevista.getId(),
      entrevista.getFecha(),
      entrevista.isAsistida(),
      entrevista.getBooking(),
      entrevista.getAspirante().getId(),
      entrevista.getMentor().getId()
    );
  }
}
