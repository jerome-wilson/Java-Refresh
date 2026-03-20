package com.java.basics.perfectsq;

public class PerfectSquareBS {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while(low <= high) {
            int mid = (low+high)/2;
            if((long)mid*mid < num) {
                low = mid + 1;
            } else if((long)mid*mid > num) {
                low = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
