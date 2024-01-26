package com.makaia.grupo4.entrevista.dto.response;

import java.util.Objects;

public class ResponseMentor {

    private Long id;

    private String correo;

    private String nombres;

    private boolean status;

    public ResponseMentor() {
    }

    public ResponseMentor(Long id, String correo, String nombres, boolean status) {
        this.id = id;
        this.correo = correo;
        this.nombres = nombres;
        this.status = status;
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

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ResponseMentor id(Long id) {
        setId(id);
        return this;
    }

    public ResponseMentor correo(String correo) {
        setCorreo(correo);
        return this;
    }

    public ResponseMentor nombres(String nombres) {
        setNombres(nombres);
        return this;
    }

    public ResponseMentor status(boolean status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseMentor)) {
            return false;
        }
        ResponseMentor responseMentor = (ResponseMentor) o;
        return Objects.equals(id, responseMentor.id) && Objects.equals(correo, responseMentor.correo)
                && Objects.equals(nombres, responseMentor.nombres) && status == responseMentor.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correo, nombres, status);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", correo='" + getCorreo() + "'" +
                ", nombres='" + getNombres() + "'" +
                ", status='" + isStatus() + "'" +
                "}";
    }

}
