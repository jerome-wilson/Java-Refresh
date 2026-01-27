package com.java.basics.loops.problems;

public class CountingEvenNumbers {
    public void countingEvenNumbersLogic(int limit) {
        int count = 0;
        for (int index = 1; index <= limit; index++) {
            if (index%2==0) {
                System.out.print(index + " ");
                count ++;
            }
        }
        System.out.println();
        System.out.printf("Total number of even numberd between 1 and %d is %d", limit, count);
    }
}
