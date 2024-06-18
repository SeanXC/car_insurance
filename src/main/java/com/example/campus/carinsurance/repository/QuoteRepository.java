package com.example.campus.carinsurance.repository;

import com.example.campus.carinsurance.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
