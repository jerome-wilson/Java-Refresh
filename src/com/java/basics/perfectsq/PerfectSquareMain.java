package com.java.basics.perfectsq;

import java.util.Scanner;

public class PerfectSquareMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        PerfectSquare sol = new PerfectSquare();
        boolean result = sol.isPerfectSquare(num);
        System.out.println("Is Perfect Square: " + result);

        sc.close();
    }
}
