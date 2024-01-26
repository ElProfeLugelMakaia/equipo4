package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.request.CreateMentor;
import com.makaia.grupo4.entrevista.dto.response.ResponseMentor;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AgendaRepository;
import com.makaia.grupo4.entrevista.repositories.MentorRespository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@org.springframework.stereotype.Service
@Slf4j
public class MentorService {

  @Autowired
  MentorRespository repository;

  @Autowired
  AgendaService agendaService;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public ResponseEntity<ResponseMentor> createMentor(
      CreateMentor mentorDTO) {
    log.info("Creación de usuario Mentor: {} ", mentorDTO);
    Mentor mentor = repository.findByCorreo(mentorDTO.getCorreo());

    if (mentor != null) {
      throw new EntrevistaApiException(HttpStatus.CONFLICT,
          "El mentor con el email ingresado ya existe");
    }

    Mentor newMentor = new Mentor(
        mentorDTO.getNombres(),
        mentorDTO.getCorreo(),
        mentorDTO.getTelefono(),
        mentorDTO.getDepartamento(),
        mentorDTO.getCiudad(),
        mentorDTO.getDireccion(),
        mentorDTO.getFechaNacimiento(),
        mentorDTO.getGenero(),
        mentorDTO.getNacionalidad(),
        mentorDTO.getEstrato(),
        mentorDTO.getTipoPoblacion(),
        mentorDTO.getNivelEducativo(), passwordEncoder().encode(mentorDTO.getPassword()), mentorDTO.getEstado());

    log.info("Nuevo mentor: {}", newMentor);

    repository.save(newMentor);

    agendaService.createDefaultAgendasByMentor(newMentor);

    return ResponseEntity.ok(convertMentorToDTO(newMentor));
  }

  public ResponseEntity<List<ResponseMentor>> getAllMentor() {
    List<ResponseMentor> responseMentors = StreamSupport
        .stream(this.repository.findAll().spliterator(), false)
        .map(this::convertMentorToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseMentors);
  }

  public ResponseEntity<ResponseMentor> getMentorId(
      Long id) {
    Optional<Mentor> mentor = repository.findById(id);

    if (!mentor.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El mentor no existe");
    }

    return ResponseEntity.ok(convertMentorToDTO(mentor.get()));
  }

  private ResponseMentor convertMentorToDTO(Mentor mentor) {
    return new ResponseMentor(
        mentor.getId(),
        mentor.getCorreo(),
        mentor.getNombres(),
        mentor.getEstado());
  }

  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(8);
  }
}
