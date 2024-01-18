package com.makaia.grupo4.entrevista.dto;

import java.util.Objects;

public class LoginDTO {

    private String correo;

    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDTO correo(String correo) {
        setCorreo(correo);
        return this;
    }

    public LoginDTO password(String password) {
        setPassword(password);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LoginDTO)) {
            return false;
        }
        LoginDTO loginDTO = (LoginDTO) o;
        return Objects.equals(correo, loginDTO.correo) && Objects.equals(password, loginDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo, password);
    }

    @Override
    public String toString() {
        return "{" +
                " correo='" + getCorreo() + "'" +
                ", password='" + getPassword() + "'" +
                "}";
    }

}
