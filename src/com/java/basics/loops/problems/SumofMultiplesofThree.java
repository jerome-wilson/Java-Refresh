package com.java.basics.loops.problems;

public class SumofMultiplesofThree {
    public void sumofMultiplesofThreeLogic(int limit) {
        int sum = 0;
        for (int index = 1; index <= limit; index++) {
            if (index%3 == 0) {
                sum += index;
            }
        }
        System.out.println(sum);
    }
}
