package com.java.basics.arrays;
import java.util.Scanner;

public class ArraySortCheckMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int number = scanner.nextInt();
            int[] array = new int[number];
            System.out.print("Enter the elements");
            for (int index = 0; index < number; index++) {
                array[index] = scanner.nextInt();
            }

            ArraySortCheck arraySortCheck = new ArraySortCheck();
            arraySortCheck.isSorted(array);
        }
    }
}
