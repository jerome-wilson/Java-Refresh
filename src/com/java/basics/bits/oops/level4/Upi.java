package com.java.basics.bits.oops.level4;

public class Upi extends Payment {
    
    public Upi(String user, int amount) {
        super(user, amount);
    }

    public void processPayment() {
        System.out.print("Enter your UPI id: ");
        String upiId = scanner.next();
        System.out.println("Enter the amount to pay: ");
        amount = scanner.nextInt();
        
        if (amount <= 0) {
            System.out.println("Invalid amount entered. Amount must be positive.");
            paymentSuccessful = false;
        } else if (upiId.contains("@upi")) {
            System.out.println("Processing payment...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Time delay failed: " + e);
            }
            System.out.println("Payment successful... total payment of " + amount + " deducted from " + upiId);
            paymentSuccessful = true;
        } else {
            System.out.println("Invalid UPI ID entered. UPI ID must contain '@upi'");
            paymentSuccessful = false;
        }
    }

    public boolean paymentStatus() {
        return paymentSuccessful;
    }
}