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

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime fecha;

    @Column
    private Boolean active = true;

    @Column(nullable = false)
    private String code;

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

    public Booking(LocalDateTime fecha, Mentor mentor, String code, Aspirante aspirante) {
        this.fecha = fecha;
        this.mentor = mentor;
        this.code = code;
        this.aspirante = aspirante;
    }

    public Booking(Long id, LocalDateTime fecha, Boolean active, String code, Mentor mentor, Aspirante aspirante,
            Entrevista entrevista) {
        this.id = id;
        this.fecha = fecha;
        this.active = active;
        this.code = code;
        this.mentor = mentor;
        this.aspirante = aspirante;
        this.entrevista = entrevista;
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

    public Boolean isActive() {
        return this.active;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Booking fecha(LocalDateTime fecha) {
        setFecha(fecha);
        return this;
    }

    public Booking active(Boolean active) {
        setActive(active);
        return this;
    }

    public Booking code(String code) {
        setCode(code);
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
                && Objects.equals(active, booking.active) && Objects.equals(code, booking.code)
                && Objects.equals(mentor, booking.mentor) && Objects.equals(aspirante, booking.aspirante)
                && Objects.equals(entrevista, booking.entrevista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, active, code, mentor, aspirante, entrevista);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", active='" + isActive() + "'" +
                ", code='" + getCode() + "'" +
                ", mentor='" + getMentor() + "'" +
                ", aspirante='" + getAspirante() + "'" +
                ", entrevista='" + getEntrevista() + "'" +
                "}";
    }

}
