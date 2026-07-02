package com.java.basics.dailypractice.day41;

public class ClimbingStairsMain {

    public static void main(String[] args) {

        ClimbingStairsLogic obj = new ClimbingStairsLogic();

        // Test case 1: n = 2
        // You can reach the top in 2 ways: (1+1) or (2)
        System.out.println("n=2: " + obj.climbStairs(2)); // Expected: 2

        // Test case 2: n = 3
        // You can reach the top in 3 ways: (1+1+1), (1+2), (2+1)
        System.out.println("n=3: " + obj.climbStairs(3)); // Expected: 3

        // Test case 3: n = 5
        System.out.println("n=5: " + obj.climbStairs(5)); // Expected: 8
    }
}
