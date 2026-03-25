package com.java.basics.bits.oops.module3.level2;

import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String value = scanner.nextLine();
        int length = value.length();
        System.out.println("Length of the entered string: "+length);
        System.out.println("The enterd sting has first character as "+value.charAt(0)+" and last character as "+value.charAt(length - 1));
        System.out.println("The entered string in uppercase "+value.toUpperCase());
        System.out.println("The entered string in lowercase "+value.toLowerCase());
        String string1 = value + " Java";
        String string2 = value.concat(" Java");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));
        String a = "Hi";
        String b = new String("b");
        System.out.println(a==b);
        scanner.close();
    }
}
