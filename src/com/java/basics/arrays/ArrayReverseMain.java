package com.java.basics.arrays;
import java.util.Scanner;

public class ArrayReverseMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = scanner.nextInt();
            int[] array = new int[numberOfElements];
            System.out.print("Enter the elements: ");
            for (int index = 0; index < numberOfElements; index++) {
                array[index] = scanner.nextInt();
            }
            ArrayReverse arrayReverse = new ArrayReverse();
            arrayReverse.arrayReverseLogic(array);
        }
    }
}
