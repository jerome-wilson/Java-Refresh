package com.java.basics.arrays;
import java.util.Scanner;

public class ArrayLengthCountMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements you want to print: ");
            int lengthOfArray = scanner.nextInt();
            System.out.println("Enter the elements: ");
            if (lengthOfArray < 0) {
                throw new IllegalArgumentException("Array length must be non-negative");
            }

            int[] array = new int[lengthOfArray];
            for (int i = 0; i < lengthOfArray; i++) {
                array[i] = scanner.nextInt();
            }
            ArrayLengthCount arrayLengthCount = new ArrayLengthCount();
            arrayLengthCount.printElementsAndCount(array);
        }
    }
}
