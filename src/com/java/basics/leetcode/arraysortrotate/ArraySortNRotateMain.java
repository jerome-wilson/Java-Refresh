package com.java.basics.leetcode.arraysortrotate;

import java.util.Scanner;

public class ArraySortNRotateMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create Solution object and call method
        ArraySortNRotate solution = new ArraySortNRotate();
        boolean result = solution.check(nums);

        // Print result
        System.out.println(result);

        sc.close();
    }
}
