package com.java.basics.loops.patterns;
import java.util.Scanner;

public class NumberPatternSumMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int numberOfRows = scanner.nextInt();
            NumberPatternSum numberPatternSum = new NumberPatternSum();
            numberPatternSum.printingNumberPattern(numberOfRows);
        }
    }
}
