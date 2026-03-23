package com.java.basics.bits.oops.level4;

import java.util.Scanner;

public class Cash extends Payment {

    public Cash(String user, int amount) {
        super(user, amount);
    }

    public void processPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user's name: ");
        user = scanner.next();
        System.out.println("Enter the amount: ");
        amount = scanner.nextInt();
        
        if (amount <= 0) {
            System.out.println("Invalid amount entered. Amount must be positive.");
            paymentSuccessful = false;
        } else {
            System.out.println("The user: " + user + " paid total amount of " + amount + " in cash");
            paymentSuccessful = true;
        }
        // Note: Not closing scanner as it wraps System.in
    }

    public boolean paymentStatus() {
        return paymentSuccessful;
    }
}