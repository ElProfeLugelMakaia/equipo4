package com.makaia.grupo4.entrevista.models;

import com.makaia.grupo4.entrevista.enums.GENERO;
import com.makaia.grupo4.entrevista.enums.NivelEducativo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  @Column
  protected String nombres;

  @Column
  protected String correo;

  @Column
  protected String telefono;

  @Column
  protected String departamento;

  @Column
  protected String ciudad;

  @Column
  protected String direccion;

  @Column
  protected LocalDateTime fechaNacimiento;

  @Column
  @Enumerated(EnumType.STRING)
  protected GENERO genero;

  @Column
  protected String nacionalidad;

  @Column
  protected Byte estrato;

  @Column
  protected String tipoPoblacion;

  @Column
  @Enumerated(EnumType.STRING)
  protected NivelEducativo nivelEducativo;

  public Persona() {
  }

  public Persona(String nombres, String correo, String telefono, String departamento, String ciudad, String direccion,
      LocalDateTime fechaNacimiento, GENERO genero, String nacionalidad, Byte estrato, String tipoPoblacion,
      NivelEducativo nivelEducativo) {
    this.nombres = nombres;
    this.correo = correo;
    this.telefono = telefono;
    this.departamento = departamento;
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.fechaNacimiento = fechaNacimiento;
    this.genero = genero;
    this.nacionalidad = nacionalidad;
    this.estrato = estrato;
    this.tipoPoblacion = tipoPoblacion;
    this.nivelEducativo = nivelEducativo;
  }

  public Persona(Long id, String nombres, String correo, String telefono, String departamento, String ciudad,
      String direccion, LocalDateTime fechaNacimiento, GENERO genero, String nacionalidad, Byte estrato,
      String tipoPoblacion, NivelEducativo nivelEducativo) {
    this.id = id;
    this.nombres = nombres;
    this.correo = correo;
    this.telefono = telefono;
    this.departamento = departamento;
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.fechaNacimiento = fechaNacimiento;
    this.genero = genero;
    this.nacionalidad = nacionalidad;
    this.estrato = estrato;
    this.tipoPoblacion = tipoPoblacion;
    this.nivelEducativo = nivelEducativo;
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

  public String getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getCiudad() {
    return this.ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public LocalDateTime getFechaNacimiento() {
    return this.fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
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

  public String getTipoPoblacion() {
    return this.tipoPoblacion;
  }

  public void setTipoPoblacion(String tipoPoblacion) {
    this.tipoPoblacion = tipoPoblacion;
  }

  public NivelEducativo getNivelEducativo() {
    return this.nivelEducativo;
  }

  public void setNivelEducativo(NivelEducativo nivelEducativo) {
    this.nivelEducativo = nivelEducativo;
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

  public Persona departamento(String departamento) {
    setDepartamento(departamento);
    return this;
  }

  public Persona ciudad(String ciudad) {
    setCiudad(ciudad);
    return this;
  }

  public Persona direccion(String direccion) {
    setDireccion(direccion);
    return this;
  }

  public Persona fechaNacimiento(LocalDateTime fechaNacimiento) {
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

  public Persona tipoPoblacion(String tipoPoblacion) {
    setTipoPoblacion(tipoPoblacion);
    return this;
  }

  public Persona nivelEducativo(NivelEducativo nivelEducativo) {
    setNivelEducativo(nivelEducativo);
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
    return Objects.equals(id, persona.id) && Objects.equals(nombres, persona.nombres)
        && Objects.equals(correo, persona.correo) && Objects.equals(telefono, persona.telefono)
        && Objects.equals(departamento, persona.departamento) && Objects.equals(ciudad, persona.ciudad)
        && Objects.equals(direccion, persona.direccion) && Objects.equals(fechaNacimiento, persona.fechaNacimiento)
        && Objects.equals(genero, persona.genero) && Objects.equals(nacionalidad, persona.nacionalidad)
        && Objects.equals(estrato, persona.estrato) && Objects.equals(tipoPoblacion, persona.tipoPoblacion)
        && Objects.equals(nivelEducativo, persona.nivelEducativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombres, correo, telefono, departamento, ciudad, direccion, fechaNacimiento, genero,
        nacionalidad, estrato, tipoPoblacion, nivelEducativo);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", nombres='" + getNombres() + "'" +
        ", correo='" + getCorreo() + "'" +
        ", telefono='" + getTelefono() + "'" +
        ", departamento='" + getDepartamento() + "'" +
        ", ciudad='" + getCiudad() + "'" +
        ", direccion='" + getDireccion() + "'" +
        ", fechaNacimiento='" + getFechaNacimiento() + "'" +
        ", genero='" + getGenero() + "'" +
        ", nacionalidad='" + getNacionalidad() + "'" +
        ", estrato='" + getEstrato() + "'" +
        ", tipoPoblacion='" + getTipoPoblacion() + "'" +
        ", nivelEducativo='" + getNivelEducativo() + "'" +
        "}";
  }

}
