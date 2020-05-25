package com.main.learn.refactoring.chapter9;

/**
 * @Description Salesman
 * @Author sunlei19
 * @Date 2020/5/25 13:47
 * @Version 1.0
 */
public class Salesman extends EmployeeType {


    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getCommission();
    }

    @Override
    String getType() {
        return "SALESMAN";
    }
}
