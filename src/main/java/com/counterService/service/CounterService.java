package com.counterService.service;

import com.counterService.model.Counter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CounterService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private RestTemplate template = new RestTemplate();

    @Autowired
    private Counter counter;

    public int generateId() {

        return counter.createId();
    }
}