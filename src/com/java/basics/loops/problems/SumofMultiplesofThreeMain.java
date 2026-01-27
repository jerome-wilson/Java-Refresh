package com.java.basics.loops.problems;
import java.util.Scanner;

public class SumofMultiplesofThreeMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int upperLimit = scanner.nextInt();
            SumofMultiplesofThree sumofMultiplesofThree = new SumofMultiplesofThree();
            sumofMultiplesofThree.sumofMultiplesofThreeLogic(upperLimit);
        }
    }
}
