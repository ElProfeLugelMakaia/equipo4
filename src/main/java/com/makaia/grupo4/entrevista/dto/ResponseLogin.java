package com.makaia.grupo4.entrevista.dto;

import java.util.Objects;

import org.springframework.http.HttpStatus;

public class ResponseLogin {

    private HttpStatus status;

    private String token;

    private ResponseMentor user;

    public ResponseLogin() {
    }

    public ResponseLogin(HttpStatus status, String token, ResponseMentor user) {
        this.status = status;
        this.token = token;
        this.user = user;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ResponseMentor getUser() {
        return this.user;
    }

    public void setUser(ResponseMentor user) {
        this.user = user;
    }

    public ResponseLogin status(HttpStatus status) {
        setStatus(status);
        return this;
    }

    public ResponseLogin token(String token) {
        setToken(token);
        return this;
    }

    public ResponseLogin user(ResponseMentor user) {
        setUser(user);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseLogin)) {
            return false;
        }
        ResponseLogin responseLogin = (ResponseLogin) o;
        return Objects.equals(status, responseLogin.status) && Objects.equals(token, responseLogin.token)
                && Objects.equals(user, responseLogin.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, token, user);
    }

    @Override
    public String toString() {
        return "{" +
                " status='" + getStatus() + "'" +
                ", token='" + getToken() + "'" +
                ", user='" + getUser() + "'" +
                "}";
    }

}
