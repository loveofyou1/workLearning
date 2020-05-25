package com.main.learn.refactoring.chapter9;

/**
 * @Description EmployeeClient
 * @Author sunlei19
 * @Date 2020/5/25 14:03
 * @Version 1.0
 */
public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee(EmployeeType.ENGINEER, 100, 200, 300);

        if (employee.getType().equals(EmployeeType.ENGINEER)) {
            EmployeeType employeeType = new Engineer();
            System.out.println(employeeType.payAmount(employee));
        }
    }
}
