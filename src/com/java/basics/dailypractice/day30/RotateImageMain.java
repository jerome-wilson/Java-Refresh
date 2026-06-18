package com.java.basics.dailypractice.day30;

import java.util.Arrays;

public class RotateImageMain {

    public static void main(String[] args) {

        RotateImageLogic obj = new RotateImageLogic();

        // Test case: 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Before rotation:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        obj.rotate(matrix);

        System.out.println("\nAfter rotation:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        // Expected: [[7,4,1],[8,5,2],[9,6,3]]
    }
}
