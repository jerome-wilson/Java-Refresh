package com.java.basics.controlflow;

public class NumberCheck {
    public String numberSignCheck(int a) {
        if (a < 0) {
            return a + " is negative";
        } else if(a > 0) {
            return a + " is positive";
        } else {
            return a + " is zero";
        }
    }
}
