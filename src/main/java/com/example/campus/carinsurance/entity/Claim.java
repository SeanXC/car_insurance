package com.example.campus.carinsurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String username;
    private String claimDetails;

    // getters and setters
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setClaimDetails(String claimDetails) {
        this.claimDetails = claimDetails;
    }
    public String getClaimDetails() {
        return claimDetails;
    }
}
