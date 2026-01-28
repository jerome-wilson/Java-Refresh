package com.java.basics.loops.problems;
import java.util.Scanner;

public class NumberClassificationMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int upperLimit = scanner.nextInt();
            NumberClassification numberClassification = new NumberClassification();
            numberClassification.numberClassificationLogic(upperLimit);
        }
    }
    
}
