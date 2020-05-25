package com.main.learn.refactoring.chapter9;

/**
 * @Description EmployeeType
 * @Author sunlei19
 * @Date 2020/5/25 13:41
 * @Version 1.0
 */
public abstract class EmployeeType {

    public static final String ENGINEER = "ENGINEER";
    public static final String SALESMAN = "SALESMAN";
    public static final String MANAGER = "MANAGER";

    abstract int payAmount(Employee employee);

    abstract String getType();
}
