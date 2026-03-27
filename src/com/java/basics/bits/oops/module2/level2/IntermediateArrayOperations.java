package com.java.basics.bits.oops.module2.level2;

import java.util.Scanner;

public class IntermediateArrayOperations {
    static int[] staticArray = {32,44,231,12,32,434};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter into the array: ");
        int numberOfElements = sc.nextInt();
        int[] a = new int[numberOfElements];
        System.out.println("Enter the elements "+numberOfElements+" times: ");
        for(int i = 0; i < numberOfElements; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("copied using reference");
        int[] b = a;
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(b[i]+" ");
        }
        if(b.length > 2) {
            b[2] = 99;
        }
        System.out.print("\nOriginal array a after modifying b: ");
            for (int i = 0; i < numberOfElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nThe raw copied array new one: ");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(b[i]+" ");
        }
        int[] d = a.clone();
        System.out.print("\nThe copied array using clone() method: ");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(d[i]+" ");
        }
        System.out.println("\nThe static array: ");
        for (int i = 0; i < staticArray.length; i++) {
            System.out.print(IntermediateArrayOperations.staticArray[i]+" ");
        }
        final int[] finalArray = {32, 12, 32, 42, 675};
        finalArray[3] = 98;
        System.out.println("\nThe final array: ");
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i]+" ");
        }
        // finalArray = new int[10]; throws error
        sc.close(); //closed Scanner to prevent resource leak
    }
}

//Inference

/**
Reference Copy:
Both variables point to the same memory location, so changes in one affect the other.

Clone Copy:
Creates a new array in a different memory location. Changes do not affect the original array.

Static Array:
Belongs to the class and is shared across all objects.

Final Array:
Reference cannot be changed, but elements can be modified.

*/