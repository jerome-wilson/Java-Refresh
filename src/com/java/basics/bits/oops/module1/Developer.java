package com.java.basics.bits.oops.module1;

public class Developer extends Employee {
    private int extraHours;
    Developer(double baseSalary, int extraHours) {
        super(baseSalary);
        this.extraHours = extraHours;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + 500 * extraHours;
    }
}
