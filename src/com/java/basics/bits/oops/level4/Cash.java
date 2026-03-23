package com.java.basics.bits.oops.level4;

public class Cash extends Payment {

    public Cash(String user, int amount) {
        super(user, amount);
    }

    public void processPayment() {
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
    }

    public boolean paymentStatus() {
        return paymentSuccessful;
    }
}