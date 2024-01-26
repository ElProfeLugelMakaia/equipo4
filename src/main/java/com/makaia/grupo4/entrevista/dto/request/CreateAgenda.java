package com.makaia.grupo4.entrevista.dto.request;

import java.sql.Date;
import java.util.Objects;

public class CreateAgenda {

  private Date fecha;

  private boolean estado;

  private Long mentora_id;

  public CreateAgenda() {
  }

  public CreateAgenda(Date fecha, boolean estado, Long mentora_id) {
    this.fecha = fecha;
    this.estado = estado;
    this.mentora_id = mentora_id;
  }

  public Date getFecha() {
    return this.fecha;
  }

  public void setFecha(Date fecha) {
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

  public CreateAgenda fecha(Date fecha) {
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
    return Objects.equals(fecha, createAgenda.fecha) && estado == createAgenda.estado
        && Objects.equals(mentora_id, createAgenda.mentora_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, estado, mentora_id);
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
