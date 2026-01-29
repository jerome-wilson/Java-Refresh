package com.java.basics.arrays;

public class ElementGreaterThan {
    public void countElementsGreaterThan(int[] array, int number) {
        int count = 0;
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] > number) {
                count++;
                System.out.print(array[idx]+" ");
            }
        }
        System.out.println();
        System.out.printf("The number of elements greater than %d is %d", number, count);
    }
}