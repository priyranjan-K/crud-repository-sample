package com.example.crud.sample.crud_repository_sample.service;

import com.example.crud.sample.crud_repository_sample.model.BasicFormDetails;


public interface BasicFormService {

    BasicFormDetails add(BasicFormDetails basicFormDetails);

    void deleteById(int id);

    BasicFormDetails findById(int id);
}
