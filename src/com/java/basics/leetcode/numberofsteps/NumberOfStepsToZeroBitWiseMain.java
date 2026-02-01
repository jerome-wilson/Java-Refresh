package com.java.basics.leetcode.numberofsteps;
import java.util.Scanner;

public class NumberOfStepsToZeroBitWiseMain {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        NumberOfStepsToZeroBitWise solver = new NumberOfStepsToZeroBitWise();
        int result = solver.numberOfStepsBitWise(num);

        System.out.println("Number of steps to reduce " + num + " to zero: " + result);

        scanner.close();
    }
}
