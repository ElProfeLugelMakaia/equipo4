package com.makaia.grupo4.entrevista.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name= "mentor")
public class Mentor extends Persona {
    
    @Column
    private boolean disponibilidad;

    @OneToMany(mappedBy = "aspirante")
    private List<Entrevista> entrevistas;


    public Mentor() {
    }

    public Mentor(boolean disponibilidad, List<Entrevista> entrevistas) {
        this.disponibilidad = disponibilidad;
        this.entrevistas = entrevistas;
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

    public List<Entrevista> getEntrevistas() {
        return this.entrevistas;
    }

    public void setEntrevistas(List<Entrevista> entrevistas) {
        this.entrevistas = entrevistas;
    }

    public Mentor disponibilidad(boolean disponibilidad) {
        setDisponibilidad(disponibilidad);
        return this;
    }

    public Mentor entrevistas(List<Entrevista> entrevistas) {
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
