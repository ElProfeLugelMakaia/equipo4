package com.makaia.grupo4.entrevista.dto.response;

import java.util.Objects;

public class ResponseDelete {

    private String message;
    private Long id;
    private String name;
    private String email;

    public ResponseDelete() {
    }

    public ResponseDelete(String message, Long id, String name, String email) {
        this.message = message;
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ResponseDelete message(String message) {
        setMessage(message);
        return this;
    }

    public ResponseDelete id(Long id) {
        setId(id);
        return this;
    }

    public ResponseDelete name(String name) {
        setName(name);
        return this;
    }

    public ResponseDelete email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseDelete)) {
            return false;
        }
        ResponseDelete responseDelete = (ResponseDelete) o;
        return Objects.equals(message, responseDelete.message) && Objects.equals(id, responseDelete.id)
                && Objects.equals(name, responseDelete.name) && Objects.equals(email, responseDelete.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, id, name, email);
    }

    @Override
    public String toString() {
        return "{" +
                " message='" + getMessage() + "'" +
                ", id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                "}";
    }

}
