package com.makaia.grupo4.entrevista.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import java.util.Objects;

@Table(name = "entrevista")
@Entity
public class Entrevista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;

    private Date fecha;
    
    private boolean asistida;

    private String booking;

    @ManyToOne(optional = false)
    private Aspirante aspirante;

    @ManyToOne(optional = false)
    private Mentor mentor;

    @ManyToOne(optional = false)
    private Comentario comentario;

    @ManyToOne(optional = false)
    private Formulario formulario;



    public Entrevista() {
    }

    public Entrevista(long id, Date fecha, boolean asistida, String booking, Aspirante aspirante, Mentor mentor, Comentario comentario, Formulario formulario) {
        this.id = id;
        this.fecha = fecha;
        this.asistida = asistida;
        this.booking = booking;
        this.aspirante = aspirante;
        this.mentor = mentor;
        this.comentario = comentario;
        this.formulario = formulario;
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

    public Aspirante getAspirante() {
        return this.aspirante;
    }

    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }

    public Mentor getMentor() {
        return this.mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Comentario getComentario() {
        return this.comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Formulario getFormulario() {
        return this.formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Entrevista id(long id) {
        setId(id);
        return this;
    }

    public Entrevista fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public Entrevista asistida(boolean asistida) {
        setAsistida(asistida);
        return this;
    }

    public Entrevista booking(String booking) {
        setBooking(booking);
        return this;
    }

    public Entrevista aspirante(Aspirante aspirante) {
        setAspirante(aspirante);
        return this;
    }

    public Entrevista mentor(Mentor mentor) {
        setMentor(mentor);
        return this;
    }

    public Entrevista comentario(Comentario comentario) {
        setComentario(comentario);
        return this;
    }

    public Entrevista formulario(Formulario formulario) {
        setFormulario(formulario);
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
        return id == entrevista.id && Objects.equals(fecha, entrevista.fecha) && asistida == entrevista.asistida && Objects.equals(booking, entrevista.booking) && Objects.equals(aspirante, entrevista.aspirante) && Objects.equals(mentor, entrevista.mentor) && Objects.equals(comentario, entrevista.comentario) && Objects.equals(formulario, entrevista.formulario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, asistida, booking, aspirante, mentor, comentario, formulario);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", asistida='" + isAsistida() + "'" +
            ", booking='" + getBooking() + "'" +
            ", aspirante='" + getAspirante() + "'" +
            ", mentor='" + getMentor() + "'" +
            ", comentario='" + getComentario() + "'" +
            ", formulario='" + getFormulario() + "'" +
            "}";
    }

}
