package com.makaia.grupo4.entrevista.dto.response;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponseEntrevista {

  private long id;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime fecha;

  private boolean asistida;

  private Long booking_id;

  private Long comentario_id;

  private Long formulario_id;

  private ResponseAspirante aspirante;

  private ResponseMentor mentor;

  public ResponseEntrevista() {
  }

  public ResponseEntrevista(long id, LocalDateTime fecha, boolean asistida, Long booking_id,
      ResponseAspirante aspirante, ResponseMentor mentor) {
    this.id = id;
    this.fecha = fecha;
    this.asistida = asistida;
    this.booking_id = booking_id;
    this.aspirante = aspirante;
    this.mentor = mentor;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getFecha() {
    return this.fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  public boolean isAsistida() {
    return this.asistida;
  }

  public boolean getAsistida() {
    return this.asistida;
  }

  public void setAsistida(boolean asistida) {
    this.asistida = asistida;
  }

  public Long getBooking_id() {
    return this.booking_id;
  }

  public void setBooking_id(Long booking_id) {
    this.booking_id = booking_id;
  }

  public Long getComentario_id() {
    return this.comentario_id;
  }

  public void setComentario_id(Long comentario_id) {
    this.comentario_id = comentario_id;
  }

  public Long getFormulario_id() {
    return this.formulario_id;
  }

  public void setFormulario_id(Long formulario_id) {
    this.formulario_id = formulario_id;
  }

  public ResponseAspirante getAspirante() {
    return this.aspirante;
  }

  public void setAspirante(ResponseAspirante aspirante) {
    this.aspirante = aspirante;
  }

  public ResponseMentor getMentor() {
    return this.mentor;
  }

  public void setMentor(ResponseMentor mentor) {
    this.mentor = mentor;
  }

  public ResponseEntrevista id(long id) {
    setId(id);
    return this;
  }

  public ResponseEntrevista fecha(LocalDateTime fecha) {
    setFecha(fecha);
    return this;
  }

  public ResponseEntrevista asistida(boolean asistida) {
    setAsistida(asistida);
    return this;
  }

  public ResponseEntrevista booking_id(Long booking_id) {
    setBooking_id(booking_id);
    return this;
  }

  public ResponseEntrevista comentario_id(Long comentario_id) {
    setComentario_id(comentario_id);
    return this;
  }

  public ResponseEntrevista formulario_id(Long formulario_id) {
    setFormulario_id(formulario_id);
    return this;
  }

  public ResponseEntrevista aspirante(ResponseAspirante aspirante) {
    setAspirante(aspirante);
    return this;
  }

  public ResponseEntrevista mentor(ResponseMentor mentor) {
    setMentor(mentor);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof ResponseEntrevista)) {
      return false;
    }
    ResponseEntrevista responseEntrevista = (ResponseEntrevista) o;
    return id == responseEntrevista.id && Objects.equals(fecha, responseEntrevista.fecha)
        && asistida == responseEntrevista.asistida && Objects.equals(booking_id, responseEntrevista.booking_id)
        && Objects.equals(comentario_id, responseEntrevista.comentario_id)
        && Objects.equals(formulario_id, responseEntrevista.formulario_id)
        && Objects.equals(aspirante, responseEntrevista.aspirante) && Objects.equals(mentor, responseEntrevista.mentor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fecha, asistida, booking_id, comentario_id, formulario_id, aspirante, mentor);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", fecha='" + getFecha() + "'" +
        ", asistida='" + isAsistida() + "'" +
        ", booking_id='" + getBooking_id() + "'" +
        ", comentario_id='" + getComentario_id() + "'" +
        ", formulario_id='" + getFormulario_id() + "'" +
        ", aspirante='" + getAspirante() + "'" +
        ", mentor='" + getMentor() + "'" +
        "}";
  }

}
