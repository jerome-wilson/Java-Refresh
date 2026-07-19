package com.java.basics.dailypractice.day49;

import java.util.List;

public class SpiralMatrixMain {

    public static void main(String[] args) {

        SpiralMatrixLogic obj = new SpiralMatrixLogic();

        // Test case
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println("Spiral order: " + result);
        // Expected: [1,2,3,6,9,8,7,4,5]
    }
}
