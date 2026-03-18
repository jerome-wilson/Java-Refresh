package com.java.basics.perfectsq;

import java.util.Scanner;

public class PerfectSquareBSMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PerfectSquareBS sol = new PerfectSquareBS();
        boolean result = sol.isPerfectSquare(num);

        if (result) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

        sc.close();
    }
}
