package com.java.basics.bits.oops.practicebeforeexam;

interface Payable {
    void getPaymentAmount();
}

abstract class Employee implements Payable {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class SalariedEmployee extends Employee {
    float salary;
    SalariedEmployee(String name, float salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public void getPaymentAmount() {
        System.out.println("The total payment for "+name+" is "+salary);
    }
}

public class Test2 {
    public static void main(String[] args) {
        
        Payable employee = new SalariedEmployee("Jerome",210000);
        employee.getPaymentAmount();
    }
}