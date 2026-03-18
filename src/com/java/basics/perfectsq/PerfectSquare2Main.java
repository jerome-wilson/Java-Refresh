package com.java.basics.perfectsq;

import java.util.Scanner;

public class PerfectSquare2Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PerfectSquare2 ps = new PerfectSquare2();
        boolean result = ps.isPerfectSquare(num);

        if (result) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

        sc.close();
    }
}
