package com.java.basics.dailypractice.day38;

public class NumberOfIslandsMain {

    public static void main(String[] args) {

        NumberOfIslandsLogic obj = new NumberOfIslandsLogic();

        // Test case 1
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        System.out.println("Grid 1 islands: " + obj.numIslands(grid1)); // Expected: 1

        // Test case 2
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Grid 2 islands: " + obj.numIslands(grid2)); // Expected: 3
    }
}
