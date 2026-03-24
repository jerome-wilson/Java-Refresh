package com.java.basics.bits.oops.module1.level3;

public class Developer extends Employee {
    public Developer (String designation, int baseSalary, int extraHours) {
        super(designation, baseSalary);
        this.extraHours = extraHours;
    }
    private int extraHours;
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (extraHours * 500);
    }

    @Override
    public String getRole() {
        return getDesignation();
    }
    
}
