package com.main.learn.refactoring.chapter9;

/**
 * @Description Employee
 * @Author sunlei19
 * @Date 2020/5/25 13:40
 * @Version 1.0
 */
public class Employee {

    public Employee(String type, int monthlySalary, int commission, int bonus) {
        this.type = type;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    private String type;

    private int monthlySalary;

    private int commission;

    private int bonus;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
