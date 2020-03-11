package com.counterService.service;

import com.counterService.model.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    @Autowired
    private Counter counter;

    public String generateId() {

        return String.valueOf(counter.createId());
    }
}