package com.main.learn.designModel.structuralModel.facadePattern.moden;

import com.main.learn.designModel.structuralModel.facadePattern.service.ILetterProcess;

public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查通过了");
    }
}
