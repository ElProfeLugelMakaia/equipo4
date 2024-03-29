package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

import com.makaia.grupo4.entrevista.enums.ESTADO;
import com.makaia.grupo4.entrevista.enums.GENERO;
import com.makaia.grupo4.entrevista.enums.NivelEducativo;
import com.makaia.grupo4.entrevista.enums.TIPO;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "aspirante")
public class Aspirante extends Persona {

    @Column
    @Enumerated(EnumType.STRING)
    private TIPO tipo;

    @Column
    @Enumerated(EnumType.STRING)
    private ESTADO estado;

    @OneToOne
    private Booking booking;

    public Aspirante() {
    }

    public Aspirante(
            // Persona
            String nombres,
            String correo,
            String telefono,
            String departamento,
            String ciudad,
            String direccion,
            LocalDateTime fechaNacimiento,
            GENERO genero,
            String nacionalidad,
            Byte estrato,
            String tipoPoblacion,
            NivelEducativo nivelEducativo,
            // Aspirante
            TIPO tipo,
            ESTADO estado) {
        super(
                nombres, correo, telefono, departamento, ciudad, direccion, fechaNacimiento, genero, nacionalidad,
                estrato, tipoPoblacion, nivelEducativo);
        this.tipo = tipo;
        this.estado = estado;
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

    public Booking getBooking() {
        return this.booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Aspirante tipo(TIPO tipo) {
        setTipo(tipo);
        return this;
    }

    public Aspirante estado(ESTADO estado) {
        setEstado(estado);
        return this;
    }

    public Aspirante booking(Booking booking) {
        setBooking(booking);
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
        return Objects.equals(tipo, aspirante.tipo) && Objects.equals(estado, aspirante.estado)
                && Objects.equals(booking, aspirante.booking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, estado, booking);
    }

    @Override
    public String toString() {
        return "{" +
                " tipo='" + getTipo() + "'" +
                ", estado='" + getEstado() + "'" +
                ", booking='" + getBooking() + "'" +
                "}";
    }

}
