package com.java.basics.dailypractice.day69;

import java.util.Arrays;

public class FindFirstAndLastPositionMain {

    public static void main(String[] args) {

        FindFirstAndLastPositionLogic obj = new FindFirstAndLastPositionLogic();

        // Test case 1: [5,7,7,8,8,10], target = 8
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        System.out.println("Find 8: " + Arrays.toString(obj.searchRange(nums1, 8))); // Expected: [3, 4]

        // Test case 2: [5,7,7,8,8,10], target = 6
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        System.out.println("Find 6: " + Arrays.toString(obj.searchRange(nums2, 6))); // Expected: [-1, -1]
    }
}
