package com.main.learn.refactoring.chapter7;

import java.util.Date;

public class MfDateSub extends Date {

    public MfDateSub(int year, int month, int date) {
        super(year, month, date);
    }

    public MfDateSub nextDay() {
        Date date = new Date();
        return new MfDateSub(date.getYear(), date.getMonth(), date.getDate() + 1);
    }

    public int dayOfYear() {
        Date date = new Date();
        return date.getDate();
    }
}
