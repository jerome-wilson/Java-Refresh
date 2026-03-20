package com.java.basics.bits.oops.module1;

public class Developer extends Employee {
    Developer(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    private int extraHours;
    @Override
    public double calculateSalary() {
        return baseSalary + 500 * extraHours;
    }
}
