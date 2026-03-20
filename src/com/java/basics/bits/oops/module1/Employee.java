package com.java.basics.bits.oops.module1;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    Employee (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public static void main(String[] args) {
        Employee e2 = new Manager(254000.77);
        Employee e3 = new Developer(162562.22, 5);
        Employee e4 = new Intern(98600.17);

        Employee[] employees = {e2, e3, e4};
        for (Employee e: employees) {
            System.out.println(e.calculateSalary());
        }
    }
}

