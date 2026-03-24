package com.java.basics.bits.oops.module1.level4;

import java.util.Scanner;

public abstract class Payment {
    protected static final Scanner scanner = new Scanner(System.in);
    
    public abstract void processPayment();
    public abstract boolean paymentStatus();
    protected int amount;
    protected String user;
    protected boolean paymentSuccessful;

    Payment(String user, int amount) {
        this.user = user;
        this.amount = amount;
        this.paymentSuccessful = false;
    }

    public static void main(String[] args) {
        Payment p1 = new Upi("Arya", 9700);
        Payment p2 = new Card("Josh", 61821);
        Payment p3 = new Cash("Arya", 829);

        Payment[] payments = {p1, p2, p3};
        for (Payment p : payments) {
            p.processPayment();
            System.out.println("Payment Status: " + (p.paymentStatus() ? "Successful" : "Failed"));
            System.out.println("----------------------------");
        }
    }

    protected String getUser() {
        return user;
    }

    protected int getAmount() {
        return amount;
    }
}