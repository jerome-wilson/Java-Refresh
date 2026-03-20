package com.java.basics.bits.oops.module1;

public class Intern extends Employee {
    Intern(double baseSalary) {
        super(baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
