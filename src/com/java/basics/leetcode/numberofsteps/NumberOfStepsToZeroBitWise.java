package com.java.basics.leetcode.numberofsteps;

public class NumberOfStepsToZeroBitWise {
    public int numberOfStepsBitWise(int num) {
        int counterVariable = 0;
        while (num > 0) {
            if ((num & 1)==0) {
                num >>= 1;
            } else {
                num --;
            }
            counterVariable++;
        }
        return counterVariable;
    }
}
