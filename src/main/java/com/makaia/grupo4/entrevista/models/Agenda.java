package com.makaia.grupo4.entrevista.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "fecha")
    private Date fecha;

    @Column
    private boolean estado;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Mentor mentor;

    public Agenda() {
    }

    public Agenda(Date fecha, boolean estado, Mentor mentor) {

        this.fecha = fecha;
        this.estado = estado;
        this.mentor = mentor;
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

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mentor getMentor() {
        return this.mentor;
    }

    public void setMentor(Mentor mentora) {
        this.mentor = mentora;
    }

    public Agenda id(Long id) {
        setId(id);
        return this;
    }

    public Agenda fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public Agenda estado(boolean estado) {
        setEstado(estado);
        return this;
    }

    public Agenda mentor(Mentor mentor) {
        setMentor(mentor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Agenda)) {
            return false;
        }
        Agenda agenda = (Agenda) o;
        return Objects.equals(id, agenda.id) && Objects.equals(fecha, agenda.fecha) && estado == agenda.estado
                && Objects.equals(mentor, agenda.mentor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, estado, mentor);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", estado='" + isEstado() + "'" +
                ", mentora='" + getMentor() + "'" +
                "}";
    }

}
