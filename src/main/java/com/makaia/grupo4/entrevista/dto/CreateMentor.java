package com.makaia.grupo4.entrevista.dto;

import com.makaia.grupo4.entrevista.enums.GENERO;
import com.makaia.grupo4.entrevista.enums.NivelEducativo;
import java.sql.Date;
import java.util.Objects;

public class CreateMentor {

  private String nombres;

  private String correo;

  private String telefono;

  private String departamento;

  private String ciudad;

  private String direccion;

  private Date fechaNacimiento;

  private GENERO genero;

  private String nacionalidad;

  private Byte estrato;

  private String tipoPoblacion;

  private NivelEducativo nivelEducativo;

  private boolean estado;

  private String password;

  public CreateMentor() {
  }

  public CreateMentor(String nombres, String correo, String telefono, String departamento, String ciudad,
      String direccion, Date fechaNacimiento, GENERO genero, String nacionalidad, Byte estrato, String tipoPoblacion,
      NivelEducativo nivelEducativo, boolean estado, String password) {
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
    this.estado = estado;
    this.password = password;
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

  public CreateMentor nombres(String nombres) {
    setNombres(nombres);
    return this;
  }

  public CreateMentor correo(String correo) {
    setCorreo(correo);
    return this;
  }

  public CreateMentor telefono(String telefono) {
    setTelefono(telefono);
    return this;
  }

  public CreateMentor departamento(String departamento) {
    setDepartamento(departamento);
    return this;
  }

  public CreateMentor ciudad(String ciudad) {
    setCiudad(ciudad);
    return this;
  }

  public CreateMentor direccion(String direccion) {
    setDireccion(direccion);
    return this;
  }

  public CreateMentor fechaNacimiento(Date fechaNacimiento) {
    setFechaNacimiento(fechaNacimiento);
    return this;
  }

  public CreateMentor genero(GENERO genero) {
    setGenero(genero);
    return this;
  }

  public CreateMentor nacionalidad(String nacionalidad) {
    setNacionalidad(nacionalidad);
    return this;
  }

  public CreateMentor estrato(Byte estrato) {
    setEstrato(estrato);
    return this;
  }

  public CreateMentor tipoPoblacion(String tipoPoblacion) {
    setTipoPoblacion(tipoPoblacion);
    return this;
  }

  public CreateMentor nivelEducativo(NivelEducativo nivelEducativo) {
    setNivelEducativo(nivelEducativo);
    return this;
  }

  public CreateMentor estado(boolean estado) {
    setEstado(estado);
    return this;
  }

  public CreateMentor password(String password) {
    setPassword(password);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof CreateMentor)) {
      return false;
    }
    CreateMentor createMentor = (CreateMentor) o;
    return Objects.equals(nombres, createMentor.nombres) && Objects.equals(correo, createMentor.correo)
        && Objects.equals(telefono, createMentor.telefono) && Objects.equals(departamento, createMentor.departamento)
        && Objects.equals(ciudad, createMentor.ciudad) && Objects.equals(direccion, createMentor.direccion)
        && Objects.equals(fechaNacimiento, createMentor.fechaNacimiento) && Objects.equals(genero, createMentor.genero)
        && Objects.equals(nacionalidad, createMentor.nacionalidad) && Objects.equals(estrato, createMentor.estrato)
        && Objects.equals(tipoPoblacion, createMentor.tipoPoblacion)
        && Objects.equals(nivelEducativo, createMentor.nivelEducativo) && estado == createMentor.estado
        && Objects.equals(password, createMentor.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombres, correo, telefono, departamento, ciudad, direccion, fechaNacimiento, genero,
        nacionalidad, estrato, tipoPoblacion, nivelEducativo, estado, password);
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
        ", estado='" + isEstado() + "'" +
        ", password='" + getPassword() + "'" +
        "}";
  }

}
