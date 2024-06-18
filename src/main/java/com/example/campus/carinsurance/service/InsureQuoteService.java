package com.example.campus.carinsurance.service;

import com.example.campus.carinsurance.entity.Quote;
import com.example.campus.carinsurance.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsureQuoteService {
    @Autowired
    private QuoteRepository quoteRepository;
    public String getQuote(String carModel)
    {
        Quote quote = new Quote();
        quote.setCarModel(carModel);
        quote.setQuote("5000 元");
        quoteRepository.save(quote);
        return "车型" + carModel + "的保险报价为" + quote.getQuote() + "。";
    }
}
