package com.java.basics.bits.oops.module1.level3;

public class Manager extends Employee {
    private double bonus;
    public Manager (String designation, int baseSalary, double bonus) {
        super(designation, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getBaseSalary() * bonus);
    }
    @Override
    public String getRole() {
        return getDesignation();
    }
}
