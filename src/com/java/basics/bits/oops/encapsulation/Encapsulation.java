package com.java.basics.bits.oops.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Car car = new Car("i320d", "#IX88791", 2021);
        System.out.println("Car model -----> "+car.getModel());
        car.setYear(2022);
        System.out.println("Built year -----> "+car.getYear());
        System.out.println("Chassis Number -----> "+car.getChassisNo());
    }
}
