package com.java.basics.arrays;

public class MinimumElementInArray {
    public void findingMinimumElement(int[] array) {
        int smallestNumber = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < smallestNumber) {
                smallestNumber = array[idx];
            }
        }
        System.out.printf("Smallest number in array is %d", smallestNumber);
    }
}
