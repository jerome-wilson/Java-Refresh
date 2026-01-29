package com.java.basics.arrays;

public class ArraySum {
    public void addingElements(int[] elements) {
        int sum = 0;
        for (int index = 0; index < elements.length; index++) {
            sum += elements[index];
        }
        System.out.println(sum);
    }
}
