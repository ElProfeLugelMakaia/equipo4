package com.makaia.grupo4.entrevista.dto;

import java.util.Date;
import java.util.Objects;

public class ResponseEntrevista {

  private long id;

  private Date fecha;

  private boolean asistida;

  private String booking;

  private Long aspirante;

  private Long mentor_id;

  private Long comentario_id;

  private Long formulario_id;

  public ResponseEntrevista() {}

  public ResponseEntrevista(
    long id,
    Date fecha,
    boolean asistida,
    String booking,
    Long aspirante,
    Long mentor_id,
    Long comentario_id,
    Long formulario_id
  ) {
    this.id = id;
    this.fecha = fecha;
    this.asistida = asistida;
    this.booking = booking;
    this.aspirante = aspirante;
    this.mentor_id = mentor_id;
    this.comentario_id = comentario_id;
    this.formulario_id = formulario_id;
  }

  public ResponseEntrevista(
    long id,
    Date fecha,
    boolean asistida,
    String booking,
    Long aspirante,
    Long mentor_id
  ) {
    this.id = id;
    this.fecha = fecha;
    this.asistida = asistida;
    this.booking = booking;
    this.aspirante = aspirante;
    this.mentor_id = mentor_id;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getFecha() {
    return this.fecha;
  }

  public void setFecha(Date fecha) {
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

  public String getBooking() {
    return this.booking;
  }

  public void setBooking(String booking) {
    this.booking = booking;
  }

  public Long getAspirante() {
    return this.aspirante;
  }

  public void setAspirante(Long aspirante) {
    this.aspirante = aspirante;
  }

  public Long getMentor_id() {
    return this.mentor_id;
  }

  public void setMentor_id(Long mentor_id) {
    this.mentor_id = mentor_id;
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

  public ResponseEntrevista id(long id) {
    setId(id);
    return this;
  }

  public ResponseEntrevista fecha(Date fecha) {
    setFecha(fecha);
    return this;
  }

  public ResponseEntrevista asistida(boolean asistida) {
    setAsistida(asistida);
    return this;
  }

  public ResponseEntrevista booking(String booking) {
    setBooking(booking);
    return this;
  }

  public ResponseEntrevista aspirante(Long aspirante) {
    setAspirante(aspirante);
    return this;
  }

  public ResponseEntrevista mentor_id(Long mentor_id) {
    setMentor_id(mentor_id);
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

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof ResponseEntrevista)) {
      return false;
    }
    ResponseEntrevista responseEntrevista = (ResponseEntrevista) o;
    return (
      id == responseEntrevista.id &&
      Objects.equals(fecha, responseEntrevista.fecha) &&
      asistida == responseEntrevista.asistida &&
      Objects.equals(booking, responseEntrevista.booking) &&
      Objects.equals(aspirante, responseEntrevista.aspirante) &&
      Objects.equals(mentor_id, responseEntrevista.mentor_id) &&
      Objects.equals(comentario_id, responseEntrevista.comentario_id) &&
      Objects.equals(formulario_id, responseEntrevista.formulario_id)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id,
      fecha,
      asistida,
      booking,
      aspirante,
      mentor_id,
      comentario_id,
      formulario_id
    );
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", fecha='" +
      getFecha() +
      "'" +
      ", asistida='" +
      isAsistida() +
      "'" +
      ", booking='" +
      getBooking() +
      "'" +
      ", aspirante='" +
      getAspirante() +
      "'" +
      ", mentor_id='" +
      getMentor_id() +
      "'" +
      ", comentario_id='" +
      getComentario_id() +
      "'" +
      ", formulario_id='" +
      getFormulario_id() +
      "'" +
      "}"
    );
  }
}
