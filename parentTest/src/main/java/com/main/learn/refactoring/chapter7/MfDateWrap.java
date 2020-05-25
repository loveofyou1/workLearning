package com.main.learn.refactoring.chapter7;

import java.util.Date;

public class MfDateWrap {
    private Date _original;

    public MfDateWrap(String dateString) {
        _original = new Date(dateString);
    }

    public int getYear() {
        return _original.getYear();
    }
}
