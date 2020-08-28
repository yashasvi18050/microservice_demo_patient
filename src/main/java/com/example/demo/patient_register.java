package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class patient_register
{
    public patient_register() {
    }
    public patient_register(String name, String adharid) {
        this.name = name;
        this.adharid = adharid;
    }


    public patient_register(Integer id,String name, String adharid) {
        this.id = id;
        this.name = name;
        this.adharid = adharid;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
    private String adharid;



    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdharid(String adharid) {
        this.adharid = adharid;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdharid() {
        return adharid;
    }
}
