package com.java.basics.arrays;

public class ArrayLengthCount {
    public void printElementsAndCount(int[] array) {
        System.out.print("The elements:");

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        System.out.println("Total count of the array:");
        System.out.println(array.length);
    }
}