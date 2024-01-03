package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table
public class Resultado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean aprobado;


    public Resultado() {
    }

    public Resultado(Long id, boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAprobado() {
        return this.aprobado;
    }

    public boolean getAprobado() {
        return this.aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Resultado id(Long id) {
        setId(id);
        return this;
    }

    public Resultado aprobado(boolean aprobado) {
        setAprobado(aprobado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Resultado)) {
            return false;
        }
        Resultado resultado = (Resultado) o;
        return Objects.equals(id, resultado.id) && aprobado == resultado.aprobado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aprobado);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", aprobado='" + isAprobado() + "'" +
            "}";
    }
    
}
