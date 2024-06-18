package com.example.campus.carinsurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CarInsuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarInsuranceApplication.class, args);

        System.out.println("=========================================");
    }

}
