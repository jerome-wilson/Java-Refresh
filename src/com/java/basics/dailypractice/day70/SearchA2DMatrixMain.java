package com.java.basics.dailypractice.day70;

public class SearchA2DMatrixMain {

    public static void main(String[] args) {

        SearchA2DMatrixLogic obj = new SearchA2DMatrixLogic();

        // Test case
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        System.out.println("Search 3: " + obj.searchMatrix(matrix, 3)); // Expected: true
        System.out.println("Search 13: " + obj.searchMatrix(matrix, 13)); // Expected: false
    }
}
