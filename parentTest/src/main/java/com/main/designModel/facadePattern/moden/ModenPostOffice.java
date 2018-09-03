package com.main.designModel.facadePattern.moden;

import com.main.designModel.facadePattern.impl.LetterProcessImpl;
import com.main.designModel.facadePattern.service.ILetterProcess;

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
