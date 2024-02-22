package com.makaia.grupo4.entrevista.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.makaia.grupo4.entrevista.dto.response.ResponseError;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(EntrevistaApiException.class)
    public ResponseEntity<ResponseError> handleEntrevistaApiException(EntrevistaApiException e) {
        ResponseError error = new ResponseError(e.getMessage(), e.getCode().value());
        return new ResponseEntity<>(error, e.getCode());
    }

    @ExceptionHandler(value = { HttpMessageNotReadableException.class })
    public ResponseEntity<ResponseError> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().body(new ResponseError(ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> handleGenericException(Exception ex) {
        // Manejar otras excepciones aquí si es necesario
        ResponseError error = new ResponseError(ex.getMessage(), 500);
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

}