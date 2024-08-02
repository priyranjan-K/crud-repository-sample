package com.example.crud.sample.crud_repository_sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class CrudRepositorySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudRepositorySampleApplication.class, args);
        log.info("<<-------Successfully started CrudRepositorySampleApplication------->>");
    }

}
