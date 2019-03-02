package com.main.learn.designModel.structuralModel.facadePattern.impl;

import com.main.learn.designModel.structuralModel.facadePattern.service.ILetterProcess;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("写信的内容:" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("信的封面地址:" + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("将信放到信封里面");
    }

    @Override
    public void sendLetter() {
        System.out.println("将信发出去");
    }
}
