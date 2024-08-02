package com.example.crud.sample.crud_repository_sample.repository;

import com.example.crud.sample.crud_repository_sample.model.BasicFormDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicFormRepository extends CrudRepository<BasicFormDetails, Integer> {
}
