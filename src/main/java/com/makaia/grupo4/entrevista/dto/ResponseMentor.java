package com.makaia.grupo4.entrevista.dto;

import java.util.Objects;

public class ResponseMentor {

    private Long id;

    private String correo;

    private boolean status;

    public ResponseMentor() {
    }

    public ResponseMentor(Long id, String correo, boolean status) {
        this.id = id;
        this.correo = correo;
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
                && status == responseMentor.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correo, status);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", correo='" + getCorreo() + "'" +
                ", status='" + isStatus() + "'" +
                "}";
    }

}
