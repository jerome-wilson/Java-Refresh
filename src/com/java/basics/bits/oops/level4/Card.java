package com.java.basics.bits.oops.level4;

public class Card extends Payment {

    public Card(String user, int amount) {
        super(user, amount);
    }

    public void processPayment() {
        boolean isValid = true;
        
        System.out.println("Enter the amount to pay: ");
        amount = scanner.nextInt();
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be positive.");
            paymentSuccessful = false;
            return;
        }
        
        System.out.println("Enter card holder name: ");
        user = scanner.next();
        
        System.out.println("Enter card number (16 digits): ");
        String cardNumber = scanner.next();
        if (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            System.out.println("❌ Invalid card number. Must be 16 digits.");
            isValid = false;
        } else {
            System.out.println("✅ Card number validated");
        }
        
        System.out.println("Enter card expiry date in MM/YY format: ");
        String cardExpiry = scanner.next();
        if (cardExpiry.length() != 5 || !cardExpiry.matches("\\d{2}/\\d{2}")) {
            System.out.println("❌ Invalid expiry date format. Use MM/YY.");
            isValid = false;
        } else {
            System.out.println("✅ Expiry date validated");
        }
        
        System.out.println("Enter CVV (3 digits): ");
        String cvv = scanner.next();
        if (cvv.length() != 3 || !cvv.matches("\\d+")) {
            System.out.println("❌ Invalid CVV. Must be 3 digits.");
            isValid = false;
        } else {
            System.out.println("✅ CVV validated");
        }
        
        if (!isValid) {
            System.out.println("Payment failed due to invalid card details.");
            paymentSuccessful = false;
            return;
        }
        
        System.out.println("Processing payment...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Time delay failed: " + e);
        }
        System.out.println("Payment successful... total payment of " + amount + " deducted from the user " + user);
        paymentSuccessful = true;
    }

    public boolean paymentStatus() {
        return paymentSuccessful;
    }
}