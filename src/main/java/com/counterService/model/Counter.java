package com.counterService.model;

import org.springframework.stereotype.Component;

@Component
public class Counter {

    private int id = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int createId() {
        int personId = id;
        id++;
        return personId;
    }
}