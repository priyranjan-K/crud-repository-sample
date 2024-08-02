package com.example.crud.sample.crud_repository_sample.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorMessage {

    private String message;
    private String errorCode;
}
