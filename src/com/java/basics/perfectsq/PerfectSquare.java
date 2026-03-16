package com.java.basics.perfectsq;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        double root = Math.sqrt(num);
        if (num % root != 0) {
            return false;
        }
        return true;
    }
}
