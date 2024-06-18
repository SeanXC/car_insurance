package com.example.campus.carinsurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String carModel;
    private String quote;

    //Getters and Setters
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

}
