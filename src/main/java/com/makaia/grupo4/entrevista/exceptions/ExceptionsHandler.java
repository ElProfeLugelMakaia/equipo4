package com.makaia.grupo4.entrevista.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.makaia.grupo4.entrevista.dto.response.ResponseError;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(value = { EntrevistaApiException.class })
    public ResponseEntity<ResponseError> handleEntrevistaApiException(EntrevistaApiException e) {
        ResponseError error = new ResponseError(e.getMessage(), e.getCode().value());
        return new ResponseEntity<>(error, e.getCode());
    }

}