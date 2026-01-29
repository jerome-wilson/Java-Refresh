package com.java.basics.arrays;
import java.util.Scanner;

public class MinimumElementInArrayMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = scanner.nextInt();
            int[] smallestElementsArray = new int[numberOfElements];
            System.out.print("Enter the elements: ");
            for (int index = 0; index < numberOfElements; index++) {
                smallestElementsArray[index] = scanner.nextInt();
            }
            MinimumElementInArray minimumElementInArray = new MinimumElementInArray();
            minimumElementInArray.findingMinimumElement(smallestElementsArray);
        }
    }
}
