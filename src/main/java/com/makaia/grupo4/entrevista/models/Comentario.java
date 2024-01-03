package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Comentario {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;

    private String texto;


    public Comentario() {
    }

    public Comentario(Long id, Date fecha, String texto) {
        this.id = id;
        this.fecha = fecha;
        this.texto = texto;
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

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Comentario id(Long id) {
        setId(id);
        return this;
    }

    public Comentario fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public Comentario texto(String texto) {
        setTexto(texto);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Comentario)) {
            return false;
        }
        Comentario comentario = (Comentario) o;
        return Objects.equals(id, comentario.id) && Objects.equals(fecha, comentario.fecha) && Objects.equals(texto, comentario.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, texto);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", texto='" + getTexto() + "'" +
            "}";
    }
    
}
