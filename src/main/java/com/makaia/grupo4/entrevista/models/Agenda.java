package com.makaia.grupo4.entrevista.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private Mentor mentora;

    public Agenda() {
    }

    public Agenda(Date fecha, boolean estado, Mentor mentora) {

        this.fecha = fecha;
        this.estado = estado;
        this.mentora = mentora;
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

    public Mentor getMentora() {
        return this.mentora;
    }

    public void setMentora(Mentor mentora) {
        this.mentora = mentora;
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

    public Agenda mentora(Mentor mentora) {
        setMentora(mentora);
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
                && Objects.equals(mentora, agenda.mentora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, estado, mentora);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", estado='" + isEstado() + "'" +
                ", mentora='" + getMentora() + "'" +
                "}";
    }

}
