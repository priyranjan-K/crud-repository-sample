package com.example.crud.sample.crud_repository_sample.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class BasicFormException extends RuntimeException {

    private String message;
    private HttpStatus httpStatus;


    public BasicFormException(String message) {
        super(message);
        this.message = message;
    }

    public BasicFormException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
