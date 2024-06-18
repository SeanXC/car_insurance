package com.example.campus.carinsurance.repository;

import com.example.campus.carinsurance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
