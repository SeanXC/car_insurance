package com.example.campus.carinsurance.controller;

import com.example.campus.carinsurance.service.ClainService;
import com.example.campus.carinsurance.service.InsureQuoteService;
import com.example.campus.carinsurance.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarInsureController {
    private final UserService userService;
    private final InsureQuoteService insureQuoteService;
    private final ClainService clainService;

    public CarInsureController(UserService userService, InsureQuoteService insureQuoteService, ClainService clainService) {
        this.userService = userService;
        this.insureQuoteService = insureQuoteService;
        this.clainService = clainService;
    }

    @GetMapping("/register")
    public String register(@RequestParam String username) {
        return userService.register(username);
    }

    @GetMapping("/login")
    public String login(@RequestParam String username) {
        return userService.login(username);
    }

    @GetMapping("/quote")
    public String getQuote(@RequestParam String carModel) {
        return insureQuoteService.getQuote(carModel);
    }

    @GetMapping("/fileClaim")
    public String fileClaim(@RequestParam String username, @RequestParam String claimDetails) {
        return clainService.fileClaim(username, claimDetails);
    }

}
