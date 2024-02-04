package com.makaia.grupo4.entrevista.models;

import java.util.Date;
import java.util.List;

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

    private Date fecha;

    private boolean asistida;

    @OneToOne(optional = false)
    private Booking booking;

    @OneToOne(optional = false)
    private Formulario formulario;

    @OneToMany
    private List<Comentario> comentarios;

    public Entrevista() {
    }

    public Entrevista(Date fecha, boolean asistida, Booking booking, Formulario formulario) {
        this.fecha = fecha;
        this.asistida = asistida;
        this.booking = booking;
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

    public Entrevista booking(Booking booking) {
        setBooking(booking);
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
        return id == entrevista.id && Objects.equals(fecha, entrevista.fecha) && asistida == entrevista.asistida
                && Objects.equals(booking, entrevista.booking) && Objects.equals(formulario, entrevista.formulario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, asistida, booking, formulario);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", asistida='" + isAsistida() + "'" +
                ", booking='" + getBooking() + "'" +
                ", formulario='" + getFormulario() + "'" +
                "}";
    }

}
