package com.java.basics.dailypractice.day31;

public class UniquePathsMain {

    public static void main(String[] args) {

        UniquePathsLogic obj = new UniquePathsLogic();

        // Test case 1: m = 3, n = 7
        System.out.println("3x7 grid: " + obj.uniquePaths(3, 7)); // Expected: 28

        // Test case 2: m = 3, n = 2
        System.out.println("3x2 grid: " + obj.uniquePaths(3, 2)); // Expected: 3

        // Test case 3: m = 7, n = 3
        System.out.println("7x3 grid: " + obj.uniquePaths(7, 3)); // Expected: 28
    }
}
