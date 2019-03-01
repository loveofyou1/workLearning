package com.main.learn.designModel.structuralModel.facadePattern.moden;

import com.main.learn.designModel.structuralModel.facadePattern.impl.LetterProcessImpl;
import com.main.learn.designModel.structuralModel.facadePattern.service.ILetterProcess;

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    public void sendLetter(String context, String address) {
        letterPolice.checkLetter(letterProcess);
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
