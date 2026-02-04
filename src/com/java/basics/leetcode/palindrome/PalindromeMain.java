package com.java.basics.leetcode.palindrome;

import java.util.Scanner;

public class PalindromeMain {

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int lastNumber = 0;
        int original = x;

        if (x < 0) {
            return false;
        }

        while (x > 0) {
            lastNumber = x % 10;
            reverse = reverse * 10 + lastNumber;
            x /= 10;
        }

        return reverse == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isPalindrome(input));
        sc.close();
    }
}
