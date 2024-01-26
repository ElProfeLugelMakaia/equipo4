package com.makaia.grupo4.entrevista.services;

import com.makaia.grupo4.entrevista.dto.request.CreateAspirante;
import com.makaia.grupo4.entrevista.dto.response.ResponseAspirante;
import com.makaia.grupo4.entrevista.exceptions.EntrevistaApiException;
import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.repositories.AspiranteRepository;

import io.micrometer.common.lang.NonNull;
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
public class AspiranteService {

  @Autowired
  AspiranteRepository repository;

  public ResponseEntity<ResponseAspirante> createAspirante(
      CreateAspirante aspiranteDTO) {
    log.info("Creación de usuario Aspirante: {} ", aspiranteDTO);
    Aspirante aspirante = repository.findByCorreo(aspiranteDTO.getCorreo());

    if (aspirante != null) {
      throw new EntrevistaApiException(
          "El aspirante con el email ingresado ya existe");
    }

    Aspirante newAspirante = new Aspirante(
        aspiranteDTO.getNombres(),
        aspiranteDTO.getCorreo(),
        aspiranteDTO.getTelefono(),
        aspiranteDTO.getDepartamento(),
        aspiranteDTO.getCiudad(),
        aspiranteDTO.getDireccion(),
        aspiranteDTO.getFechaNacimiento(),
        aspiranteDTO.getGenero(),
        aspiranteDTO.getNacionalidad(),
        aspiranteDTO.getEstrato(),
        aspiranteDTO.getTipoPoblacion(),
        aspiranteDTO.getNivelEducativo(), aspiranteDTO.getTipo(), aspiranteDTO.getEstado());

    log.info("Nuevo aspirante: {}", newAspirante);

    repository.save(newAspirante);

    return ResponseEntity.ok(convertAspiranteToDTO(newAspirante));
  }

  public ResponseEntity<List<ResponseAspirante>> getAllAspirante() {
    List<ResponseAspirante> responseEntrevistas = StreamSupport
        .stream(this.repository.findAll().spliterator(), false)
        .map(this::convertAspiranteToDTO)
        .collect(Collectors.toList());

    return ResponseEntity.ok(responseEntrevistas);
  }

  public ResponseEntity<ResponseAspirante> getAspiranteId(Long id) {
    Optional<Aspirante> aspirante = repository.findById(id);

    if (!aspirante.isPresent()) {
      throw new EntrevistaApiException(HttpStatus.NOT_FOUND, "El aspirante no existe");
    }

    return ResponseEntity.ok(convertAspiranteToDTO(aspirante.get()));
  }

  private ResponseAspirante convertAspiranteToDTO(Aspirante aspirante) {
    return new ResponseAspirante(
        aspirante.getId(),
        aspirante.getCorreo(),
        aspirante.getTipo(),
        aspirante.getEstado());
  }
}
