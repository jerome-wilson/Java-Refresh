package com.java.basics.bits.oops.module3.level4;

import java.util.Scanner;

public class CompareSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String value1 = scanner.nextLine();
        System.out.println("Enter another string: ");
        String value2 = scanner.nextLine();

        System.out.println("Comparison");
        System.out.println(value1.compareTo(value2));
        System.out.println(value1.compareToIgnoreCase(value2));

        System.out.println("\nChecking");
        if((value1.startsWith("www.")) && (value1.endsWith(".com"))){
            System.out.println("It is a URL it seems");
        } else {
            System.out.println("It is just a regular string");
        }
        System.out.println("\nChecking occurences");
        System.out.println("Enter the charcter to find the occurence of: ");
        String occurenceOf = scanner.next();
        if(value1.contains(occurenceOf)) {
            System.out.println("First occurence of "+occurenceOf+" is at "+value1.indexOf(occurenceOf) + " and last occurence of "+occurenceOf+" is at "+value1.lastIndexOf(occurenceOf));
        } else {
            System.out.println(occurenceOf + " is not present in the string one");
        }
        if(value2.contains(occurenceOf)) {
            System.out.println("First occurence of "+occurenceOf+" is at "+value2.indexOf(occurenceOf) + " and last occurence of "+occurenceOf+" is at "+value2.lastIndexOf(occurenceOf));
        } else {
            System.out.println(occurenceOf + " is not present in the string two");
        }
        String subString = value1.substring(0, 4);
        if(value1.contains(subString)) {
            System.out.println("the substring "+subString+" is in "+value1);
        }

        if(value2.contains(subString)) {
            System.out.println("the substring "+subString+" is in "+value2);
        } else {
            System.out.println("substring not found");
        }
        scanner.close();
    }
}
