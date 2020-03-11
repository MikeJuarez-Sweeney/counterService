package com.counterService.controllers;

import com.counterService.service.CounterService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    @Autowired
    private CounterService counterService;

    @GetMapping(value = "/")
    @JsonProperty
    public String getId() {
        return counterService.generateId();
    }
}