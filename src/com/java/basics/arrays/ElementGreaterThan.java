package com.java.basics.arrays;

public class ElementGreaterThan {
    public void checkingElementisGreaterThan(int[] array, int number) {
        int count = 0;
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] > number) {
                count++;
                System.out.print(array[idx]+" ");
            }
        }
        System.out.printf("The number of elements grater than %d is %d", number, count);
    }
}