package com.makaia.grupo4.entrevista.dto;

import com.makaia.grupo4.entrevista.enums.ESTADO;
import com.makaia.grupo4.entrevista.enums.TIPO;
import java.util.Objects;

public class ResponseAspirante {

    private Long id;

    private String correo;

    private TIPO tipo;

    private ESTADO estado;

    public ResponseAspirante() {
    }

    public ResponseAspirante(
            Long id,
            String correo,
            TIPO tipo,
            ESTADO estado) {
        this.id = id;
        this.correo = correo;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public ResponseAspirante id(Long id) {
        setId(id);
        return this;
    }

    public ResponseAspirante correo(String correo) {
        setCorreo(correo);
        return this;
    }

    public ResponseAspirante tipo(TIPO tipo) {
        setTipo(tipo);
        return this;
    }

    public ResponseAspirante estado(ESTADO estado) {
        setEstado(estado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseAspirante)) {
            return false;
        }
        ResponseAspirante responseAspirante = (ResponseAspirante) o;
        return Objects.equals(id, responseAspirante.id) && Objects.equals(correo, responseAspirante.correo)
                && Objects.equals(tipo, responseAspirante.tipo) && Objects.equals(estado, responseAspirante.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correo, tipo, estado);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", correo='" + getCorreo() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", estado='" + getEstado() + "'" +
                "}";
    }

}
