package com.java.basics.bits.oops.module1;

public class Employee {
    protected String name;
    protected double baseSalary;

    Employee (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(98600.17);
        Employee e2 = new Manager(254000.77);
        Employee e3 = new Developer(162562.22);
        Employee e4 = new Intern(98600.17);

        for (Employee e: employees) {
            System.out.println(e.calculateSalary());
        }
    }
}

