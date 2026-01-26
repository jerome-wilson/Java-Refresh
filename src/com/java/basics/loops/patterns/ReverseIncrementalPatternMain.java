package com.java.basics.loops.patterns;
import java.util.Scanner;

public class ReverseIncrementalPatternMain {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number or rows: ");
            int numberOfRows = scanner.nextInt();
            ReverseIncrementalPattern reducingPattern = new ReverseIncrementalPattern();
            reducingPattern.reducingPatternLogic(numberOfRows);
        }
    }
}
