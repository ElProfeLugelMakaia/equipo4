package com.makaia.grupo4.entrevista.models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import java.util.Objects;

@Table(name = "entrevista")
@Entity
public class Entrevista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime fecha;

    private boolean asistida;

    @Column
    private String meetLink;

    @OneToOne(optional = false)
    private Booking booking;

    @OneToOne(optional = true)
    private Formulario formulario;

    @OneToMany
    private List<Comentario> comentarios;

    public Entrevista() {
    }

    public Entrevista(LocalDateTime fecha, boolean asistida, String meetLink, Booking booking) {
        this.fecha = fecha;
        this.asistida = asistida;
        this.meetLink = meetLink;
        this.booking = booking;
    }

    public Entrevista(long id, LocalDateTime fecha, boolean asistida, String meetLink, Booking booking,
            Formulario formulario, List<Comentario> comentarios) {
        this.id = id;
        this.fecha = fecha;
        this.asistida = asistida;
        this.meetLink = meetLink;
        this.booking = booking;
        this.formulario = formulario;
        this.comentarios = comentarios;
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

    public String getMeetLink() {
        return this.meetLink;
    }

    public void setMeetLink(String meetLink) {
        this.meetLink = meetLink;
    }

    public Booking getBooking() {
        return this.booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Formulario getFormulario() {
        return this.formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public List<Comentario> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Entrevista id(long id) {
        setId(id);
        return this;
    }

    public Entrevista fecha(LocalDateTime fecha) {
        setFecha(fecha);
        return this;
    }

    public Entrevista asistida(boolean asistida) {
        setAsistida(asistida);
        return this;
    }

    public Entrevista meetLink(String meetLink) {
        setMeetLink(meetLink);
        return this;
    }

    public Entrevista booking(Booking booking) {
        setBooking(booking);
        return this;
    }

    public Entrevista formulario(Formulario formulario) {
        setFormulario(formulario);
        return this;
    }

    public Entrevista comentarios(List<Comentario> comentarios) {
        setComentarios(comentarios);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Entrevista)) {
            return false;
        }
        Entrevista entrevista = (Entrevista) o;
        return id == entrevista.id && Objects.equals(fecha, entrevista.fecha) && asistida == entrevista.asistida
                && Objects.equals(meetLink, entrevista.meetLink) && Objects.equals(booking, entrevista.booking)
                && Objects.equals(formulario, entrevista.formulario)
                && Objects.equals(comentarios, entrevista.comentarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, asistida, meetLink, booking, formulario, comentarios);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", asistida='" + isAsistida() + "'" +
                ", meetLink='" + getMeetLink() + "'" +
                ", booking='" + getBooking() + "'" +
                ", formulario='" + getFormulario() + "'" +
                ", comentarios='" + getComentarios() + "'" +
                "}";
    }

}
