package com.java.basics.loops.problems;
import java.util.Scanner;

public class CountingEvenNumbersMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int upperLimit = scanner.nextInt();
            CountingEvenNumbers countingEvenNumbers = new CountingEvenNumbers();
            countingEvenNumbers.countingEvenNumbersLogic(upperLimit);
        }
    }
}
