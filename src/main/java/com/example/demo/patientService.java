package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class patientService
{
    @Autowired
    private patientRepo pr;

    public List<patient_register> getAllTopics()
    {
        List<patient_register> patients = new ArrayList<>();
        pr.findAll().forEach(patients::add);
        return patients;
    }

    public Optional<patient_register> getTopic(Integer id)
    {
        return pr.findById(id);
    }

    public void addTopic(patient_register tp)
    {
        pr.save(tp);
    }
    public void updateTopic(Integer id, patient_register tp)
    {
        pr.save(tp);
    }
    public void deleteTopic(Integer id)
    {
        pr.deleteById(id);
    }
}
