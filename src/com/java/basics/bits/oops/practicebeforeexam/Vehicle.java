package com.java.basics.bits.oops.practicebeforeexam;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.getBuildDetails(2011);
        car.getBuildDetails(2021, "mahindra");

        vehicle.chassisNumber("80XDGHBW678");
        car.chassisNumber("79SHD43KK");
    }
    public void getBuildDetails(int buildYear) {
        System.out.println("The vehicle was built on "+buildYear);
    }
    public void chassisNumber(String chassisNo) {
        System.out.println("The chassis number for vehicle is "+chassisNo);
    }
} 

class Car extends Vehicle {
    public void getBuildDetails(int buildYear, String manufacturer) {
        System.out.println("The car was built on "+buildYear+" by "+manufacturer);
    }
    @Override
    public void chassisNumber(String chassisNo) {
        System.out.println("The chassis number for car is "+chassisNo);
    }
}
