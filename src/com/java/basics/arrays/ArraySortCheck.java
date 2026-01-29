package com.java.basics.arrays;

public class ArraySortCheck {
    public void isSorted(int[] array) {
        boolean sorted = true;
        for (int index = 0; index < array.length-1; index++) {
            if (array[index] > array[index+1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
