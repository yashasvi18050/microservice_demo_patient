package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepo extends CrudRepository<patient_register, Integer>
{
}
