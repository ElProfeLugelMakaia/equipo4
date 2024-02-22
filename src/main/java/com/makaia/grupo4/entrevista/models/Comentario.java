package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;

    private String texto;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Entrevista entrevista;

    public Comentario() {
    }

    public Comentario(LocalDateTime fecha, String texto, Entrevista entrevista) {
        this.fecha = fecha;
        this.texto = texto;
        this.entrevista = entrevista;
    }

    public Comentario(Long id, LocalDateTime fecha, String texto, Entrevista entrevista) {
        this.id = id;
        this.fecha = fecha;
        this.texto = texto;
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

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Entrevista getEntrevista() {
        return this.entrevista;
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Comentario id(Long id) {
        setId(id);
        return this;
    }

    public Comentario fecha(LocalDateTime fecha) {
        setFecha(fecha);
        return this;
    }

    public Comentario texto(String texto) {
        setTexto(texto);
        return this;
    }

    public Comentario entrevista(Entrevista entrevista) {
        setEntrevista(entrevista);
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
        return Objects.equals(id, comentario.id) && Objects.equals(fecha, comentario.fecha)
                && Objects.equals(texto, comentario.texto) && Objects.equals(entrevista, comentario.entrevista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, texto, entrevista);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", texto='" + getTexto() + "'" +
                ", entrevista='" + getEntrevista() + "'" +
                "}";
    }

}
