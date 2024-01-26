package com.makaia.grupo4.entrevista.dto.response;

public class ResponseError {

    private String message;

    private int code;

    public ResponseError(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
