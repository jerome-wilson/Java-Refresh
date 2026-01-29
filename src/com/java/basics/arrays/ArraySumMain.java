package com.java.basics.arrays;
import java.util.Scanner;

public class ArraySumMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int lengthOfArray = scanner.nextInt();
            System.out.println("Enter the elements: ");
            int[] elements = new int[lengthOfArray];
            for (int index = 0; index < lengthOfArray; index++) {
                elements[index] = scanner.nextInt();
            }

            ArraySum arraySum = new ArraySum();
            arraySum.addingElements(elements);
        }
    }
}
