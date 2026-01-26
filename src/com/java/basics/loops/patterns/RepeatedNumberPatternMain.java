package com.java.basics.loops.patterns;

import java.util.Scanner;

public class RepeatedNumberPatternMain {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int numberOfRows = scanner.nextInt();
            RepeatedNumberPattern printingSameNumbers = new RepeatedNumberPattern();
            printingSameNumbers.printingNumbersPatternsLogic(numberOfRows);
        }
    }
}
