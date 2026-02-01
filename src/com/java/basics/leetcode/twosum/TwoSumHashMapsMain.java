package com.java.basics.leetcode.twosum;
import java.util.Scanner;

import java.util.Arrays;

public class TwoSumHashMapsMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the number of elements you want in the array: ");
        int numberOfElements = sc.nextInt();
        System.out.println();
        int[] nums = new int[numberOfElements];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        System.out.println();
        TwoSumHashMaps twoSumHashMaps = new TwoSumHashMaps();
        int[] result = twoSumHashMaps.twoSumHashMapslogic(nums, target);

        System.out.println("Indices found: " + Arrays.toString(result));
    }
        
    }
}
