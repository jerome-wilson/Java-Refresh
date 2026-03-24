package com.java.basics.bits.oops.module1.level3;

public abstract class Employee {
    public abstract double calculateSalary();
    public abstract String getRole();
    private int baseSalary;
    private String designation;

    public Employee(String designation, int baseSalary) {
        this.baseSalary = baseSalary;
        this.designation = designation;
    }

    protected int getBaseSalary() {
        return baseSalary;
    }

    protected String getDesignation() {
        return designation;
    }
    public static void main(String[] args) {
        Employee e1 = new Manager("Manager",2217900, 0.2f);
        Employee e2 = new Developer("Developer", 192717, 4);
        Employee e3 = new Intern("Intern", 900000);
        Employee[] employees = {e1, e2, e3};
        for (Employee e: employees) {
            System.out.println(e.calculateSalary());
        }
    }
}
