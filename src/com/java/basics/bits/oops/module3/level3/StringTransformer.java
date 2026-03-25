package com.java.basics.bits.oops.module3.level3;

import java.util.Scanner;

public class StringTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String value = scanner.nextLine();

        int length = value.length();
        int mid = length / 2;

        // 🔹 Substring operations
        System.out.println("\n--- Extraction ---");
        if (length > 0) {
            String firstHalf = value.substring(0, mid);
            String secondHalf = value.substring(mid);

            System.out.println("First half: " + firstHalf);
            System.out.println("Second half: " + secondHalf);
        } else {
            System.out.println("Empty string entered");
        }

        // 🔹 Conversions
        System.out.println("\n--- Conversion ---");

        // String → int (only if numeric)
        if (value.matches("\\d+")) {
            int intValue = Integer.parseInt(value);
            System.out.println("String to int: " + intValue);

            // int → String
            String backToString = String.valueOf(intValue);
            System.out.println("Int back to String: " + backToString);
        } else {
            System.out.println("Input is not a numeric string");
        }

        // 🔹 String → char array
        char[] charArr = value.toCharArray();

        System.out.println("\n--- ASCII Values ---");
        for (int i = 0; i < charArr.length; i++) {
            int asciiVal = charArr[i];
            System.out.print(asciiVal + " ");
        }

        scanner.close();
    }
}