package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(name = "mentor")
public class Mentor extends Persona {

    @Column
    private boolean disponibilidad;

    @OneToOne(mappedBy = "mentor")
    private Entrevista entrevistas;

    @OneToMany(mappedBy = "mentor")
    private List<Agenda> agenda;

    public Mentor() {
    }

    public Mentor(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Entrevista getEntrevistas() {
        return this.entrevistas;
    }

    public void setEntrevistas(Entrevista entrevistas) {
        this.entrevistas = entrevistas;
    }

    public Mentor disponibilidad(boolean disponibilidad) {
        setDisponibilidad(disponibilidad);
        return this;
    }

    public Mentor entrevistas(Entrevista entrevistas) {
        setEntrevistas(entrevistas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mentor)) {
            return false;
        }
        Mentor mentor = (Mentor) o;
        return disponibilidad == mentor.disponibilidad && Objects.equals(entrevistas, mentor.entrevistas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disponibilidad, entrevistas);
    }

    @Override
    public String toString() {
        return "{" +
                " disponibilidad='" + isDisponibilidad() + "'" +
                ", entrevistas='" + getEntrevistas() + "'" +
                "}";
    }

}
