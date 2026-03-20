package com.java.basics.bits.oops.module1;

class Manager extends Employee {
    Manager (double baseSalary) {
        super(baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + (0.2 * baseSalary);
    }
}
