package com.example.campus.carinsurance.repository;

import com.example.campus.carinsurance.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
