package com.java.basics.arrays;
import java.util.Scanner;

public class ElementGreaterThanMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = scanner.nextInt();
            int array[] = new int[numberOfElements];
            for (int index = 0; index < numberOfElements; index++) {
                array[index] = scanner.nextInt();
            }
            System.out.print("Enter the element you want to compare with: ");
            int pivotNumber = scanner.nextInt();
            ElementGreaterThan elementGreaterThanX = new ElementGreaterThan();
            elementGreaterThanX.checkingElementisGreaterThan(array, pivotNumber);
        }
    }
}
