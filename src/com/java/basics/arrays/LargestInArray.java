package com.java.basics.arrays;


public class LargestInArray {
    public void findingLargestinArray(int[] elements) {
        int largest = elements[0];
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] > largest) {
                largest = elements[index];
            }
        }
        System.out.println(largest);
    }
}
