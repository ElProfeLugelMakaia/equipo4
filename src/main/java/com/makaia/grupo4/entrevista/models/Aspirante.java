package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Objects;

import com.makaia.grupo4.entrevista.enums.ESTADO;
import com.makaia.grupo4.entrevista.enums.TIPO;

@Entity
@Table
public class Aspirante extends Persona {
    
    @Column
    private String nivelEducativo;

    @Column
    private TIPO tipo;

    @Column
    private ESTADO estado;

    @OneToMany(mappedBy = "aspirante")
    private List<Entrevista> entrevistas;


    public Aspirante() {
    }

    public Aspirante(String nivelEducativo, TIPO tipo, ESTADO estado, List<Entrevista> entrevistas) {
        this.nivelEducativo = nivelEducativo;
        this.tipo = tipo;
        this.estado = estado;
        this.entrevistas = entrevistas;
    }

    public String getNivelEducativo() {
        return this.nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public TIPO getTipo() {
        return this.tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public ESTADO getEstado() {
        return this.estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }

    public List<Entrevista> getEntrevistas() {
        return this.entrevistas;
    }

    public void setEntrevistas(List<Entrevista> entrevistas) {
        this.entrevistas = entrevistas;
    }

    public Aspirante nivelEducativo(String nivelEducativo) {
        setNivelEducativo(nivelEducativo);
        return this;
    }

    public Aspirante tipo(TIPO tipo) {
        setTipo(tipo);
        return this;
    }

    public Aspirante estado(ESTADO estado) {
        setEstado(estado);
        return this;
    }

    public Aspirante entrevistas(List<Entrevista> entrevistas) {
        setEntrevistas(entrevistas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aspirante)) {
            return false;
        }
        Aspirante aspirante = (Aspirante) o;
        return Objects.equals(nivelEducativo, aspirante.nivelEducativo) && Objects.equals(tipo, aspirante.tipo) && Objects.equals(estado, aspirante.estado) && Objects.equals(entrevistas, aspirante.entrevistas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivelEducativo, tipo, estado, entrevistas);
    }

    @Override
    public String toString() {
        return "{" +
            " nivelEducativo='" + getNivelEducativo() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", estado='" + getEstado() + "'" +
            ", entrevistas='" + getEntrevistas() + "'" +
            "}";
    }
    

}
