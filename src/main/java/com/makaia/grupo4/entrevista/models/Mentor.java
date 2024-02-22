package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.*;

import com.makaia.grupo4.entrevista.enums.GENERO;
import com.makaia.grupo4.entrevista.enums.NivelEducativo;

@Entity
@Table(name = "mentor")
public class Mentor extends Persona {

    @Column
    private boolean estado;

    @Column
    private String password;

    @OneToMany
    private List<Booking> bookings;

    @OneToMany
    private List<Agenda> agenda;

    public Mentor() {
    }

    public Mentor(// Persona
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
            NivelEducativo nivelEducativo, String password, boolean estado) {
        super(
                nombres, correo, telefono, departamento, ciudad, direccion, fechaNacimiento, genero, nacionalidad,
                estrato, tipoPoblacion, nivelEducativo);
        this.estado = estado;
        this.password = password;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Agenda> getAgenda() {
        return this.agenda;
    }

    public void setAgenda(List<Agenda> agenda) {
        this.agenda = agenda;
    }

    public Mentor estado(boolean estado) {
        setEstado(estado);
        return this;
    }

    public Mentor password(String password) {
        setPassword(password);
        return this;
    }

    public Mentor bookings(List<Booking> bookings) {
        setBookings(bookings);
        return this;
    }

    public Mentor agenda(List<Agenda> agenda) {
        setAgenda(agenda);
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
        return estado == mentor.estado && Objects.equals(password, mentor.password)
                && Objects.equals(bookings, mentor.bookings) && Objects.equals(agenda, mentor.agenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, password, bookings, agenda);
    }

    // @Override
    // public String toString() {
    // return "{" +
    // " estado='" + isEstado() + "'" +
    // ", password='" + getPassword() + "'" +
    // ", bookings='" + getBookings() + "'" +
    // ", agenda='" + getAgenda() + "'" +
    // "}";
    // }

}
