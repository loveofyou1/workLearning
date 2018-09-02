package com.main.test.normal.reflect.impl;

import com.main.test.normal.reflect.SalaryInterface;
import org.junit.Test;

public class SalaryTest {

    @Test
    public void sayHello() {
        SalaryInterface salaryInterface = new Salary();
        salaryInterface.salary();
    }

}