package com.java.basics.bits.oops.level1;

public class BankAccount {
    private int balance;
    private String name;
    private long accountNumber;

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Harrold", 251836182616718L, 453600);
        System.out.println("Name: "+ bankAccount.getName());
        System.out.println("Account Number: "+ bankAccount.getAccountNumber());
        System.out.println("Balance: "+bankAccount.getBalance());
        bankAccount.deposit(187009);
        bankAccount.withdraw(2000);
    }
    public BankAccount(String name, long accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        if(balance < 0) {
            System.out.println("Invalid amount entered");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public void deposit(int depositedAmount) {
        if (depositedAmount <= 0) {
            System.out.println("Invalid amount entered");
        } else {
            balance += depositedAmount;
            System.out.println("Total deposit of "+depositedAmount+" credited to your account "+accountNumber + ". Available balance "+balance);
        }
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= 0 || withdrawAmount > balance) {
            System.out.println("Invalid amount entered");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawn "+withdrawAmount+" from account "+accountNumber+". Available balance: "+balance);
        }
    }


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}

