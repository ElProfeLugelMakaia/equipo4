package com.makaia.grupo4.entrevista.dto.request;

import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateAgenda {

  private Long id;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime fecha;

  private boolean estado;

  private Long mentora_id;

  public CreateAgenda() {
  }

  public CreateAgenda(LocalDateTime fecha, boolean estado, Long mentora_id) {
    this.fecha = fecha;
    this.estado = estado;
    this.mentora_id = mentora_id;
  }

  public CreateAgenda(Long id, LocalDateTime fecha, boolean estado, Long mentora_id) {
    this.id = id;
    this.fecha = fecha;
    this.estado = estado;
    this.mentora_id = mentora_id;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getFecha() {
    return this.fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  public boolean isEstado() {
    return this.estado;
  }

  public boolean getEstado() {
    return this.estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  public Long getMentora_id() {
    return this.mentora_id;
  }

  public void setMentora_id(Long mentora_id) {
    this.mentora_id = mentora_id;
  }

  public CreateAgenda id(Long id) {
    setId(id);
    return this;
  }

  public CreateAgenda fecha(LocalDateTime fecha) {
    setFecha(fecha);
    return this;
  }

  public CreateAgenda estado(boolean estado) {
    setEstado(estado);
    return this;
  }

  public CreateAgenda mentora_id(Long mentora_id) {
    setMentora_id(mentora_id);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof CreateAgenda)) {
      return false;
    }
    CreateAgenda createAgenda = (CreateAgenda) o;
    return Objects.equals(id, createAgenda.id) && Objects.equals(fecha, createAgenda.fecha)
        && estado == createAgenda.estado && Objects.equals(mentora_id, createAgenda.mentora_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fecha, estado, mentora_id);
  }

  @Override
  public String toString() {
    return "{" +
        " fecha='" + getFecha() + "'" +
        ", estado='" + isEstado() + "'" +
        ", mentora_id='" + getMentora_id() + "'" +
        "}";
  }

}
