package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date fecha;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Mentor mentor;

    @OneToOne
    @JoinColumn(nullable = false)
    private Aspirante aspirante;

    @OneToOne
    private Entrevista entrevista;

    public Booking() {
    }

    public Booking(Date fecha, Mentor mentor, Aspirante aspirante) {
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

    public Mentor getMentor() {
        return this.mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Aspirante getAspirante() {
        return this.aspirante;
    }

    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }

    public Entrevista getEntrevista() {
        return this.entrevista;
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Booking id(Long id) {
        setId(id);
        return this;
    }

    public Booking fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public Booking mentor(Mentor mentor) {
        setMentor(mentor);
        return this;
    }

    public Booking aspirante(Aspirante aspirante) {
        setAspirante(aspirante);
        return this;
    }

    public Booking entrevista(Entrevista entrevista) {
        setEntrevista(entrevista);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Booking)) {
            return false;
        }
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id) && Objects.equals(fecha, booking.fecha)
                && Objects.equals(mentor, booking.mentor) && Objects.equals(aspirante, booking.aspirante)
                && Objects.equals(entrevista, booking.entrevista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, mentor, aspirante, entrevista);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", mentor='" + getMentor() + "'" +
                ", aspirante='" + getAspirante() + "'" +
                ", entrevista='" + getEntrevista() + "'" +
                "}";
    }

}
