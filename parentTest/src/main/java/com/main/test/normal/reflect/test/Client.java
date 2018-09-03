package com.main.test.normal.reflect.test;

import com.main.test.normal.reflect.SalaryInterface;
import com.main.test.normal.reflect.impl.Salary;
import com.main.test.normal.reflect.impl.TimeAdvice;
import com.main.test.normal.reflect.proxy.SimpleProxy;

public class Client {
    public static void main(String[] args) {
        SimpleProxy proxy = new SimpleProxy();
        SalaryInterface salaryInterface = (SalaryInterface) proxy.bind(new Salary(), new TimeAdvice());
        salaryInterface.salary();
    }
}
