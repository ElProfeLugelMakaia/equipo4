package com.makaia.grupo4.entrevista.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.makaia.grupo4.entrevista.enums.ESTADO;
import com.makaia.grupo4.entrevista.enums.GENERO;
import com.makaia.grupo4.entrevista.enums.NivelEducativo;
import com.makaia.grupo4.entrevista.enums.TIPO;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

public class CreateAspirante {

  private String nombres;

  private String correo;

  private String telefono;

  private String departamento;

  private String ciudad;

  private String direccion;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime fechaNacimiento;

  private GENERO genero;

  private String nacionalidad;

  private Byte estrato;

  private String tipoPoblacion;

  private NivelEducativo nivelEducativo;

  private TIPO tipo;

  private ESTADO estado;

  public CreateAspirante() {
  }

  public CreateAspirante(String nombres, String correo, String telefono, String departamento, String ciudad,
      String direccion, LocalDateTime fechaNacimiento, GENERO genero, String nacionalidad, Byte estrato,
      String tipoPoblacion,
      NivelEducativo nivelEducativo, TIPO tipo, ESTADO estado) {
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
    this.tipo = tipo;
    this.estado = estado;
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

  public CreateAspirante nombres(String nombres) {
    setNombres(nombres);
    return this;
  }

  public CreateAspirante correo(String correo) {
    setCorreo(correo);
    return this;
  }

  public CreateAspirante telefono(String telefono) {
    setTelefono(telefono);
    return this;
  }

  public CreateAspirante departamento(String departamento) {
    setDepartamento(departamento);
    return this;
  }

  public CreateAspirante ciudad(String ciudad) {
    setCiudad(ciudad);
    return this;
  }

  public CreateAspirante direccion(String direccion) {
    setDireccion(direccion);
    return this;
  }

  public CreateAspirante fechaNacimiento(LocalDateTime fechaNacimiento) {
    setFechaNacimiento(fechaNacimiento);
    return this;
  }

  public CreateAspirante genero(GENERO genero) {
    setGenero(genero);
    return this;
  }

  public CreateAspirante nacionalidad(String nacionalidad) {
    setNacionalidad(nacionalidad);
    return this;
  }

  public CreateAspirante estrato(Byte estrato) {
    setEstrato(estrato);
    return this;
  }

  public CreateAspirante tipoPoblacion(String tipoPoblacion) {
    setTipoPoblacion(tipoPoblacion);
    return this;
  }

  public CreateAspirante nivelEducativo(NivelEducativo nivelEducativo) {
    setNivelEducativo(nivelEducativo);
    return this;
  }

  public CreateAspirante tipo(TIPO tipo) {
    setTipo(tipo);
    return this;
  }

  public CreateAspirante estado(ESTADO estado) {
    setEstado(estado);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof CreateAspirante)) {
      return false;
    }
    CreateAspirante createAspirante = (CreateAspirante) o;
    return Objects.equals(nombres, createAspirante.nombres) && Objects.equals(correo, createAspirante.correo)
        && Objects.equals(telefono, createAspirante.telefono)
        && Objects.equals(departamento, createAspirante.departamento) && Objects.equals(ciudad, createAspirante.ciudad)
        && Objects.equals(direccion, createAspirante.direccion)
        && Objects.equals(fechaNacimiento, createAspirante.fechaNacimiento)
        && Objects.equals(genero, createAspirante.genero) && Objects.equals(nacionalidad, createAspirante.nacionalidad)
        && Objects.equals(estrato, createAspirante.estrato)
        && Objects.equals(tipoPoblacion, createAspirante.tipoPoblacion)
        && Objects.equals(nivelEducativo, createAspirante.nivelEducativo) && Objects.equals(tipo, createAspirante.tipo)
        && Objects.equals(estado, createAspirante.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombres, correo, telefono, departamento, ciudad, direccion, fechaNacimiento, genero,
        nacionalidad, estrato, tipoPoblacion, nivelEducativo, tipo, estado);
  }

  @Override
  public String toString() {
    return "{" +
        " nombres='" + getNombres() + "'" +
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
        ", tipo='" + getTipo() + "'" +
        ", estado='" + getEstado() + "'" +
        "}";
  }

}
