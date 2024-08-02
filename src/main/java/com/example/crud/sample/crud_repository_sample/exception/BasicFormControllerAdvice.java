package com.example.crud.sample.crud_repository_sample.exception;

import com.example.crud.sample.crud_repository_sample.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BasicFormControllerAdvice {

    @ExceptionHandler(BasicFormException.class)
    public ResponseEntity<ErrorMessage> basicFormException(BasicFormException basicFormException) {
        ErrorMessage errorCode = ErrorMessage.builder().message(basicFormException.getMessage()).errorCode("CC-400").build();
        return new ResponseEntity<>(errorCode, basicFormException.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> basicFormException(Exception exception) {
        ErrorMessage errorCode = ErrorMessage.builder().message(exception.getMessage()).errorCode("CC-500").build();
        return new ResponseEntity<>(errorCode, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
