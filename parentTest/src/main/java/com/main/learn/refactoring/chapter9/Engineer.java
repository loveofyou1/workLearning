package com.main.learn.refactoring.chapter9;

/**
 * @Description Engineer
 * @Author sunlei19
 * @Date 2020/5/25 13:46
 * @Version 1.0
 */
public class Engineer extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }

    @Override
    String getType() {
        return "ENGINEER";
    }
}
