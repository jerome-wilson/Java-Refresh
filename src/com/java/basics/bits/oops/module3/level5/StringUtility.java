package com.java.basics.bits.oops.module3.level5;

import java.util.Scanner;

public class StringUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String value = scanner.nextLine();
            System.out.println("Trimming");
            String value1 = value.trim();
            System.out.println("The value entered without spaces: "+value1);

            System.out.println("\nReplacing space with '-'");
            String value2 = value.replace(" ", "-");
            System.out.println(value2);

            System.out.println("\nReplacing first space with space with '-'");
            String value3 = value.replaceFirst("\\s+", "-");
            System.out.println(value3);

            System.out.println("\nSplitting string");
            String[] splittedString = value.split("\\s+");
            for (String split: splittedString) {
                System.out.println(split);
            }

            System.out.println("\nJoining string");
            String joinedString = String.join("_", splittedString);
            System.out.println("String joined: "+joinedString);

            System.out.println("\nChecking");
            if(value.matches("\\d{10}")) {
                System.out.println("It is a phone number");
            } else {
                System.out.println("it is a regular string");
            }
        scanner.close();
    }
}
