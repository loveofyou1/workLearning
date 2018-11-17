package com.main.lamda.chapter05;

import lombok.Data;

@Data
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
