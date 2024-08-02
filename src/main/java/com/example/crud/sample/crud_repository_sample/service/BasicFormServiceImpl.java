package com.example.crud.sample.crud_repository_sample.service;

import com.example.crud.sample.crud_repository_sample.exception.BasicFormException;
import com.example.crud.sample.crud_repository_sample.model.BasicFormDetails;
import com.example.crud.sample.crud_repository_sample.repository.BasicFormRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BasicFormServiceImpl implements BasicFormService {

    private final BasicFormRepository repository;

    @Autowired
    public BasicFormServiceImpl(BasicFormRepository repository) {
        this.repository = repository;
    }

    @Override
    public BasicFormDetails add(BasicFormDetails basicFormDetails) {
        log.info("About to save form details");
        return repository.save(basicFormDetails);
    }

    @Override
    public void deleteById(int id) {
        log.info("About to delete form details");
        if (findById(id) != null)
            repository.deleteById(id);
        else {
            log.warn("No record available to delete.");
            throw new BasicFormException("No record found", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public BasicFormDetails findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
