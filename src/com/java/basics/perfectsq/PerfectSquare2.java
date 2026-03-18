package com.java.basics.perfectsq;

public class PerfectSquare2 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num==0;
    }
}
