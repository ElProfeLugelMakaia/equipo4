package com.makaia.grupo4.entrevista.exceptions;

import org.springframework.http.HttpStatusCode;

public class EntrevistaApiException extends RuntimeException {
    
    private HttpStatusCode code;

    public EntrevistaApiException(String message) {
        super(message);
    }

    public EntrevistaApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntrevistaApiException(String message, Throwable cause, HttpStatusCode code) {
        super(message, cause);
        this.code = code;
    }

    public EntrevistaApiException(HttpStatusCode code, String message) {
        super(message);
        this.code = code;
    }

    public HttpStatusCode getCode() {
        return code;
    }

}
