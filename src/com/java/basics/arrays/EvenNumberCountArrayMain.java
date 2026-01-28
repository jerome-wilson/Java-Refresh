package com.java.basics.arrays;
import java.util.Scanner;

public class EvenNumberCountArrayMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = scanner.nextInt();
            int[] nums = new int[numberOfElements];
            for (int index = 0; index < numberOfElements; index++) {
                nums[index] = scanner.nextInt();
            }

            EvenNumberCountArray evenNumberCountArray = new EvenNumberCountArray();
            evenNumberCountArray.evenNumberCountArrayLogic(nums);
        }
    }
    
}
