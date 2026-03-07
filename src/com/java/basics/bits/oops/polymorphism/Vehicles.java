package com.java.basics.bits.oops.polymorphism;

public class Vehicles {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Interface[] vehicles = {car, bike, boat};
        for(Interface vehicle : vehicles) {
            vehicle.go();
        }
    }
}

