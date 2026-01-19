package com.java.basics;
import java.util.Scanner;

public class NumberCheck {
    Scanner sc = new Scanner(System.in);

    public String numberSignCheck() {
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        if (a < 0) {
            return a + " is negative";
        } else if(a > 0) {
            return a + " is positive";
        } else {
            return a + " is 0";
        }
    }
}
