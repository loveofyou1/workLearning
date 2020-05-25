package com.main.learn.refactoring.chapter9;

/**
 * @Description Manager
 * @Author sunlei19
 * @Date 2020/5/25 13:48
 * @Version 1.0
 */
public class Manager extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }

    @Override
    String getType() {
        return "MANAGER";
    }
}
