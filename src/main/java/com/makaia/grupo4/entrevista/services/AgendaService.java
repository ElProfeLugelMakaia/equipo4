package com.makaia.grupo4.entrevista.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.makaia.grupo4.entrevista.dto.request.CreateAgenda;
import com.makaia.grupo4.entrevista.dto.response.ResponseAgenda;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Agenda;
import com.makaia.grupo4.entrevista.models.Mentor;
import com.makaia.grupo4.entrevista.repositories.AgendaRepository;
import com.makaia.grupo4.entrevista.repositories.MentorRespository;
import com.makaia.grupo4.entrevista.utils.GenerateDates;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AgendaService {

    @Autowired
    AgendaRepository repository;

    @Autowired
    MentorRespository mentorRespository;

    public ResponseEntity<List<ResponseAgenda>> getAgendaByMentorId(
            Long mentor_id) {
        log.info("Mentor: {} ", mentor_id);
        Optional<Mentor> mentor = mentorRespository.findById(mentor_id);

        if (!mentor.isPresent()) {
            throw new EntrevistaApiException(
                    "El mentor con el id ingresado no existe");
        }

        List<Agenda> agendas = repository.findByMentor(mentor.get());

        log.info("agenda: {}", agendas);

        List<ResponseAgenda> responseAgenda = StreamSupport
                .stream(agendas.spliterator(), false)
                .map(this::convertAgendaToDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responseAgenda);
    }

    public ResponseEntity<ResponseAgenda> createAgenda(
            CreateAgenda dto) {
        log.info("Creación de agenda: {} ", dto);
        Optional<Mentor> mentor = mentorRespository.findById(dto.getMentora_id());

        if (!mentor.isPresent()) {
            throw new EntrevistaApiException(
                    "El mentor con el id ingresado no existe");
        }

        Agenda newAgenda = new Agenda(
                dto.getFecha(), dto.getEstado(), mentor.get());

        log.info("Nueva agenda: {}", newAgenda);

        repository.save(newAgenda);

        return ResponseEntity.ok(convertAgendaToDTO(newAgenda));
    }

    public ResponseEntity<List<ResponseAgenda>> createDefaultAgendasByMentor(
            Mentor mentor) {

        List<Agenda> newAgendas = createDefaultAgenda(mentor);

        log.info("Nueva agenda: {}", newAgendas);

        repository.saveAll(newAgendas);

        List<ResponseAgenda> responseAgenda = StreamSupport
                .stream(newAgendas.spliterator(), false)
                .map(this::convertAgendaToDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responseAgenda);
    }

    public ResponseEntity<List<ResponseAgenda>> createDefaultAgendasByMentorId(
            Long mentor_id) {
        log.info("Creación de agendas: {} ", mentor_id);
        Optional<Mentor> mentor = mentorRespository.findById(mentor_id);

        if (!mentor.isPresent()) {
            throw new EntrevistaApiException(
                    "El mentor con el id ingresado no existe");
        }

        List<Agenda> newAgendas = createDefaultAgenda(mentor.get());

        log.info("Nueva agenda: {}", newAgendas);

        repository.saveAll(newAgendas);

        List<ResponseAgenda> responseAgenda = StreamSupport
                .stream(newAgendas.spliterator(), false)
                .map(this::convertAgendaToDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responseAgenda);
    }

    public ResponseEntity<List<ResponseAgenda>> getAllAgenda() {
        List<ResponseAgenda> responseEntrevistas = StreamSupport
                .stream(this.repository.findAll().spliterator(), false)
                .map(this::convertAgendaToDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responseEntrevistas);
    }

    public ResponseEntity<ResponseAgenda> getAgendaId(Long id) {
        Optional<Agenda> aspirante = repository.findById(id);

        if (!aspirante.isPresent()) {
            throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
        }

        return ResponseEntity.ok(convertAgendaToDTO(aspirante.get()));
    }

    private ResponseAgenda convertAgendaToDTO(Agenda aspirante) {
        return new ResponseAgenda(
                aspirante.getId(),
                aspirante.getFecha(),
                aspirante.getEstado(),
                aspirante.getMentor().getId());
    }

    private List<Agenda> createDefaultAgenda(Mentor mentor) {
        List<Date> fechasFebreroAgosto = StreamSupport
                .stream(GenerateDates.obtenerFechasFebreroAgosto(LocalDate.now().getYear()).spliterator(), false)
                .map(this::convertirADate)
                .collect(Collectors.toList());
        List<Agenda> newAgendas = new ArrayList<>();

        for (Date date : fechasFebreroAgosto) {
            newAgendas.add(new Agenda(date, true, mentor));
        }

        return newAgendas;
    }

    private Date convertirADate(LocalDateTime localDate) {
        Instant instant = localDate.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
}
