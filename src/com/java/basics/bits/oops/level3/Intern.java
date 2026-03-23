package com.java.basics.bits.oops.level3;

public class Intern extends Employee{
    public Intern (String designation, int baseSalary) {
        super(designation, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public String getRole() {
        return getDesignation();
    }
}
