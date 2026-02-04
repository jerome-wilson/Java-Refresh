package com.java.basics.leetcode.palindrome;

public class Palindrome {
    public boolean isPalindromeCheck(int x){
        int reverse = 0;
        int lastNumber = 0;
        int original = x;

        if(x < 0) {
            return false;
        }

        while (x > 0) {
            lastNumber = x % 10;
            reverse = reverse * 10 + lastNumber;
            x /=10;
        }
        return reverse == original;
    }
}
