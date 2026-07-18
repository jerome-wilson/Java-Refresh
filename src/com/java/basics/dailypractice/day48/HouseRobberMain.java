package com.java.basics.dailypractice.day48;

public class HouseRobberMain {

    public static void main(String[] args) {

        HouseRobberLogic obj = new HouseRobberLogic();

        // Test case 1: [1,2,3,1]
        // Rob house 1 (1) and house 3 (3) = 4
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("[1,2,3,1]: " + obj.rob(nums1)); // Expected: 4

        // Test case 2: [2,7,9,3,1]
        // Rob house 1 (2), house 3 (9), house 5 (1) = 12
        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println("[2,7,9,3,1]: " + obj.rob(nums2)); // Expected: 12
    }
}
