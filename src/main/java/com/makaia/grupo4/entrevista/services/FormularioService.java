package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.request.CreateFormulario;
import com.makaia.grupo4.entrevista.dto.response.ResponseAspirante;
import com.makaia.grupo4.entrevista.dto.response.ResponseEntrevista;
import com.makaia.grupo4.entrevista.dto.response.ResponseFormulario;
import com.makaia.grupo4.entrevista.dto.response.ResponseMentor;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Formulario;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AspiranteRepository;
import com.makaia.grupo4.entrevista.repositories.EntrevistaRepository;
import com.makaia.grupo4.entrevista.repositories.FormularioRepository;
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
public class FormularioService {

  @Autowired
  FormularioRepository repository;

  @Autowired
  EntrevistaRepository entrevistaRepository;

  @Autowired
  AspiranteRepository aspiranteRespository;

  @Autowired
  MentorRespository mentorRespository;

  public ResponseEntity<ResponseFormulario> createFormulario(
      CreateFormulario dto) {
    log.info("DTO: {}", dto);
    Optional<Entrevista> entrevista = entrevistaRepository.findById(dto.getEntrevista_id());

    if (!entrevista.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "La entrevista no existe");
    }
    log.info("entrevista {}", entrevista.get());

    Formulario newFormulario = new Formulario(dto.getPuntajeTestGorilla(), dto.getEneagrama(), dto.getCohorte(),
        dto.getCooperante(), dto.getBackgroundIT(), dto.getIdiomas(), dto.getProfesionEducacion(),
        dto.getEstudioActual(), dto.getTrabajoActual(), dto.getDisponibilidadDeTiempo(), dto.getIntereses(),
        dto.getExperienciaLaboral(), dto.getAspiracionProyectoDeVida(), dto.getRedDeApoyo(), dto.getTrabajoEnEquipo(),
        dto.getComunicacionAsertiva(), dto.getRespetoPorLaDiversidad(), dto.getManejoDeEmociones(),
        dto.getAutogestion(), dto.getManejoDeTiempo(), dto.getEstiloDeAprendizaje(), dto.getOrientacionAlLogro(),
        dto.getCapacidadDeCompromiso(), dto.getManejoDeSistemas(), dto.getEquipoYConectividadOptima(),
        dto.getRiesgoDeDesercion(), dto.getAnotacionPsicosocial(), dto.getAlertaPsicosocial(), dto.getTieneElPerfil(),
        dto.getComentario(), entrevista.get());

    this.repository.save(newFormulario);

    log.info("Formulario created {}", newFormulario);

    return ResponseEntity.ok(convertFormularioToDTO(newFormulario));
  }

  public ResponseEntity<List<ResponseFormulario>> getAllFormularios() {
    List<ResponseFormulario> responseFormularios = StreamSupport
        .stream(this.repository.findAll().spliterator(), false)
        .map(this::convertFormularioToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseFormularios);
  }

  public ResponseEntity<ResponseFormulario> getFormularioByAspiranteId(
      Long id) {
    log.info("Id aspirante: {}", id);
    Optional<Aspirante> aspirante = aspiranteRespository.findById(id);

    if (!aspirante.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
    }
    log.info("Aspirante {}", aspirante.get());
    Formulario formulario = this.repository.findByAspirante(aspirante.get());
    if (formulario == null) {
      return new ResponseEntity<>(new ResponseFormulario(), HttpStatus.NOT_FOUND);
    }
    ResponseFormulario responseBooking = convertFormularioToDTO(formulario);

    return ResponseEntity.ok(responseBooking);
  }

  public ResponseEntity<List<ResponseFormulario>> getBookingMentorId(
      Long id) {
    log.info("Inicia Servicio Booking/mentor id_mentor: {}", id);
    Optional<Mentor> mentor = mentorRespository.findById(id);

    if (!mentor.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El mentor no existe");
    }
    log.info("Inicia Servicio Entrevista/mentor id_mentor: {}", id);
    List<ResponseFormulario> responseBooking = StreamSupport
        .stream(
            this.repository.findByMentor(mentor.get()).spliterator(),
            false)
        .map(this::convertFormularioToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseBooking);
  }

  private ResponseFormulario convertFormularioToDTO(Formulario formulario) {
    Entrevista entrevista = formulario.getEntrevistas();
    Mentor mentor = entrevista.getBooking().getMentor();
    ResponseMentor responseMentor = new ResponseMentor(mentor.getId(), mentor.getCorreo(), mentor.getNombres(),
        mentor.isEstado());
    Aspirante aspirante = entrevista.getBooking().getAspirante();
    ResponseAspirante responseAspirante = new ResponseAspirante(aspirante.getId(), aspirante.getCorreo(),
        aspirante.getNombres(), aspirante.getTipo(), aspirante.getEstado());

    return new ResponseFormulario(
        formulario.getId(),
        formulario.getPuntajeTestGorilla(),
        formulario.getEneagrama(),
        formulario.getCohorte(),
        formulario.getCooperante(),
        formulario.getBackgroundIT(),
        formulario.getIdiomas(),
        formulario.getProfesionEducacion(),
        formulario.getEstudioActual(),
        formulario.getTrabajoActual(),
        formulario.getDisponibilidadDeTiempo(),
        formulario.getIntereses(),
        formulario.getExperienciaLaboral(),
        formulario.getAspiracionProyectoDeVida(),
        formulario.getRedDeApoyo(),
        formulario.getTrabajoEnEquipo(),
        formulario.getComunicacionAsertiva(),
        formulario.getRespetoPorLaDiversidad(),
        formulario.getManejoDeEmociones(),
        formulario.getAutogestion(),
        formulario.getManejoDeTiempo(),
        formulario.getEstiloDeAprendizaje(),
        formulario.getOrientacionAlLogro(),
        formulario.getCapacidadDeCompromiso(),
        formulario.getManejoDeSistemas(),
        formulario.getEquipoYConectividadOptima(),
        formulario.getRiesgoDeDesercion(),
        formulario.getAnotacionPsicosocial(),
        formulario.getAlertaPsicosocial(),
        formulario.getTieneElPerfil(),
        formulario.getComentario(),
        new ResponseEntrevista(entrevista.getId(), entrevista.getFecha(), entrevista.getAsistida(),
            entrevista.getBooking().getId(), responseAspirante, responseMentor));
  }
}
