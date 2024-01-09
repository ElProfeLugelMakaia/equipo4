package com.makaia.grupo4.entrevista.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import java.util.Objects;

import com.makaia.grupo4.entrevista.enums.GENERO;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String nombres;

    @Column
    private String correo;

    @Column
    private String telefono;

    @Column
    private Date fechaNacimiento;

    @Column
    private GENERO genero;

    @Column
    private String nacionalidad;

    @Column
    private Byte estrato;


    public Persona() {
    }

    public Persona(Long id, String nombres, String correo, String telefono, Date fechaNacimiento, GENERO genero, String nacionalidad, Byte estrato) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.estrato = estrato;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public GENERO getGenero() {
        return this.genero;
    }

    public void setGenero(GENERO genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Byte getEstrato() {
        return this.estrato;
    }

    public void setEstrato(Byte estrato) {
        this.estrato = estrato;
    }

    public Persona id(Long id) {
        setId(id);
        return this;
    }

    public Persona nombres(String nombres) {
        setNombres(nombres);
        return this;
    }

    public Persona correo(String correo) {
        setCorreo(correo);
        return this;
    }

    public Persona telefono(String telefono) {
        setTelefono(telefono);
        return this;
    }

    public Persona fechaNacimiento(Date fechaNacimiento) {
        setFechaNacimiento(fechaNacimiento);
        return this;
    }

    public Persona genero(GENERO genero) {
        setGenero(genero);
        return this;
    }

    public Persona nacionalidad(String nacionalidad) {
        setNacionalidad(nacionalidad);
        return this;
    }

    public Persona estrato(Byte estrato) {
        setEstrato(estrato);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id) && Objects.equals(nombres, persona.nombres) && Objects.equals(correo, persona.correo) && Objects.equals(telefono, persona.telefono) && Objects.equals(fechaNacimiento, persona.fechaNacimiento) && Objects.equals(genero, persona.genero) && Objects.equals(nacionalidad, persona.nacionalidad) && Objects.equals(estrato, persona.estrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombres, correo, telefono, fechaNacimiento, genero, nacionalidad, estrato);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombres='" + getNombres() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            ", genero='" + getGenero() + "'" +
            ", nacionalidad='" + getNacionalidad() + "'" +
            ", estrato='" + getEstrato() + "'" +
            "}";
    }
    

}
