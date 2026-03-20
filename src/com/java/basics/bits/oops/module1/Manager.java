package com.java.basics.bits.oops.module1;

class Manager extends Employee {
    Manager (double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double calculateSalary() {
        return 0.2 * baseSalary;
    }
}
