package com.main.test.normal.reflect.impl;

import com.main.test.normal.reflect.SalaryInterface;

public class Salary implements SalaryInterface {
    @Override
    public void salary() {
        System.out.println("发工资");
    }
}
