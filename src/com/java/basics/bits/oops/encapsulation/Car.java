package com.java.basics.bits.oops.encapsulation;

public class Car {
    private String model;
    private String chassisNo;
    private int year;
    
    Car(String model, String chassisNo, int year) {
        this.model = model;
        this.chassisNo = chassisNo;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
