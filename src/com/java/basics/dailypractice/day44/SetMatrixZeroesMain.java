package com.java.basics.dailypractice.day44;

import java.util.Arrays;

public class SetMatrixZeroesMain {

    public static void main(String[] args) {

        SetMatrixZeroesLogic obj = new SetMatrixZeroesLogic();

        // Test case
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Before:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        obj.setZeroes(matrix);

        System.out.println("\nAfter:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        // Expected: [[1,0,1],[0,0,0],[1,0,1]]
    }
}
