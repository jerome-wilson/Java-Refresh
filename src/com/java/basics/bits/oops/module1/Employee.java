package com.java.basics.bits.oops.module1;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    Employee (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public static void main(String[] args) {
        Employee manager = new Manager(254000.77);
        Employee developer = new Developer(162562.22, 5);
        Employee intern = new Intern(98600.17);

        Employee[] employees = {manager, developer, intern};
        
        System.out.println("=== Employee Salary Report ===\n");
        
        for (Employee e : employees) {
            System.out.println("Employee Type: " + e.getClass().getSimpleName());
            System.out.println("Base Salary: $" + e.baseSalary);
            System.out.println("Calculated Salary: $" + e.calculateSalary());
            System.out.println("-----------------------------");
        }
    }
}

