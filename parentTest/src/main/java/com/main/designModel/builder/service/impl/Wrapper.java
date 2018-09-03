package com.main.designModel.builder.service.impl;

import com.main.designModel.builder.service.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
