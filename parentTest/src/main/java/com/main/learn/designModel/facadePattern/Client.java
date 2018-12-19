package com.main.learn.designModel.facadePattern;

import com.main.learn.designModel.facadePattern.impl.LetterProcessImpl;
import com.main.learn.designModel.facadePattern.moden.ModenPostOffice;
import com.main.learn.designModel.facadePattern.service.ILetterProcess;

public class Client {
    public static void main(String[] args) {
        System.out.println("亲自邮寄信件：");
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("i love you");
        letterProcess.fillEnvelope("beijing");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();

        System.out.println("\n");
        System.out.println("邮局包装后邮寄：");
        ModenPostOffice moden = new ModenPostOffice();
        moden.sendLetter("I love U", "shanghai");
    }
}
