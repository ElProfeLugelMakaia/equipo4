package com.makaia.grupo4.entrevista.dto.request;

import java.time.LocalDateTime;
import java.util.Date;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateBooking {

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fecha;

    private Long mentor_id;

    private Long aspirante_id;

    public CreateBooking() {
    }

    public CreateBooking(LocalDateTime fecha, Long mentor_id, Long aspirante_id) {
        this.fecha = fecha;
        this.mentor_id = mentor_id;
        this.aspirante_id = aspirante_id;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getMentor_id() {
        return this.mentor_id;
    }

    public void setMentor_id(Long mentor_id) {
        this.mentor_id = mentor_id;
    }

    public Long getAspirante_id() {
        return this.aspirante_id;
    }

    public void setAspirante_id(Long aspirante_id) {
        this.aspirante_id = aspirante_id;
    }

    public CreateBooking fecha(LocalDateTime fecha) {
        setFecha(fecha);
        return this;
    }

    public CreateBooking mentor_id(Long mentor_id) {
        setMentor_id(mentor_id);
        return this;
    }

    public CreateBooking aspirante_id(Long aspirante_id) {
        setAspirante_id(aspirante_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreateBooking)) {
            return false;
        }
        CreateBooking createBooking = (CreateBooking) o;
        return Objects.equals(fecha, createBooking.fecha) && Objects.equals(mentor_id, createBooking.mentor_id)
                && Objects.equals(aspirante_id, createBooking.aspirante_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, mentor_id, aspirante_id);
    }

    @Override
    public String toString() {
        return "{" +
                " fecha='" + getFecha() + "'" +
                ", mentor_id='" + getMentor_id() + "'" +
                ", aspirante_id='" + getAspirante_id() + "'" +
                "}";
    }

}
