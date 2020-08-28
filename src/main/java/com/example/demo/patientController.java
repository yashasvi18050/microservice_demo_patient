package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class patientController
{
    @Autowired
    private patientService ts;

    @GetMapping("/patients")
    public List<patient_register> getTopics()
    { return ts.getAllTopics();}

    @GetMapping("/patients/{id}")
    public Optional<patient_register> getTopic(@PathVariable Integer id)
    { return ts.getTopic(id);}

    @PostMapping("/patients")
    public void addTopic(@RequestBody patient_register tp)
    {  ts.addTopic(tp);}

    @PutMapping("/patients/{id}")
    public void updateTopic(@RequestBody patient_register tp,@PathVariable Integer id)
    {  ts.updateTopic(id,tp);}

    @DeleteMapping("/patients/{id}")
    public void deleteTopic(@PathVariable Integer id)
    {  ts.deleteTopic(id);}
}
