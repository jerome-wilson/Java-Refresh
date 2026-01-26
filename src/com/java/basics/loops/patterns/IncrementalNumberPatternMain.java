package com.java.basics.loops.patterns;

import java.util.Scanner;

public class IncrementalNumberPatternMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            IncrementalNumberPattern pattern = new IncrementalNumberPattern();
            pattern.numberPattern(number);
        }
    }
}
