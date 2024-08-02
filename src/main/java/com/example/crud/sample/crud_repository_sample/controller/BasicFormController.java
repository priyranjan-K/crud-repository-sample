package com.example.crud.sample.crud_repository_sample.controller;

import com.example.crud.sample.crud_repository_sample.exception.BasicFormException;
import com.example.crud.sample.crud_repository_sample.model.BasicFormDetails;
import com.example.crud.sample.crud_repository_sample.service.BasicFormServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
@Slf4j
public class BasicFormController {

    private final BasicFormServiceImpl basicFormServiceImpl;

    @Autowired
    public BasicFormController(BasicFormServiceImpl basicFormServiceImpl) {
        this.basicFormServiceImpl = basicFormServiceImpl;
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicFormDetails> saveDetails(@RequestBody BasicFormDetails basicFormDetails) {
        try {
            log.info("Request received with body =>> {}", basicFormDetails);
            BasicFormDetails response = basicFormServiceImpl.add(basicFormDetails);
            log.info("Successfully saved the form details");
            return ResponseEntity.ok(response);
        } catch (BasicFormException e) {
            throw e;
        } catch (Exception e) {
            log.error("Error Occurred =>> {}", e.getMessage());
            throw new BasicFormException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        try {
            log.info("Request received to delete the  record with id =>> {}", id);
            basicFormServiceImpl.deleteById(id);
            log.info("Successfully deleted the form details");
            return ResponseEntity.ok("Successfully Deleted");
        } catch (BasicFormException e) {
            throw e;
        } catch (Exception e) {
            log.error("Error Occurred for deleteById method=>> {}", e.getMessage());
            throw new BasicFormException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
