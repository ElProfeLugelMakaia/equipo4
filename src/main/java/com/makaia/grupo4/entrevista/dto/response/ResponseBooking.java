package com.makaia.grupo4.entrevista.dto.response;

import java.util.Date;
import java.util.Objects;

public class ResponseBooking {

    private Long id;

    private Date fecha;

    private ResponseMentor mentor;

    private ResponseAspirante aspirante;

    public ResponseBooking() {
    }

    public ResponseBooking(Long id, Date fecha, ResponseMentor mentor, ResponseAspirante aspirante) {
        this.id = id;
        this.fecha = fecha;
        this.mentor = mentor;
        this.aspirante = aspirante;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ResponseMentor getMentor() {
        return this.mentor;
    }

    public void setMentor(ResponseMentor mentor) {
        this.mentor = mentor;
    }

    public ResponseAspirante getAspirante() {
        return this.aspirante;
    }

    public void setAspirante(ResponseAspirante aspirante) {
        this.aspirante = aspirante;
    }

    public ResponseBooking id(Long id) {
        setId(id);
        return this;
    }

    public ResponseBooking fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public ResponseBooking mentor(ResponseMentor mentor) {
        setMentor(mentor);
        return this;
    }

    public ResponseBooking aspirante(ResponseAspirante aspirante) {
        setAspirante(aspirante);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseBooking)) {
            return false;
        }
        ResponseBooking responseBooking = (ResponseBooking) o;
        return Objects.equals(id, responseBooking.id) && Objects.equals(fecha, responseBooking.fecha)
                && Objects.equals(mentor, responseBooking.mentor)
                && Objects.equals(aspirante, responseBooking.aspirante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, mentor, aspirante);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", mentor='" + getMentor() + "'" +
                ", aspirante='" + getAspirante() + "'" +
                "}";
    }

}
