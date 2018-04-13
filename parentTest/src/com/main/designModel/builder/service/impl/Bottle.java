package com.main.designModel.builder.service.impl;

import com.main.designModel.builder.service.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
