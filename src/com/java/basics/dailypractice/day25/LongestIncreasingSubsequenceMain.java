package com.java.basics.dailypractice.day25;

public class LongestIncreasingSubsequenceMain {

    public static void main(String[] args) {

        LongestIncreasingSubsequenceLogic obj = new LongestIncreasingSubsequenceLogic();

        // Test case 1: [10,9,2,5,3,7,101,18]
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LIS length: " + obj.lengthOfLIS(nums1)); // Expected: 4 (2,3,7,101)

        // Test case 2: [0,1,0,3,2,3]
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println("LIS length: " + obj.lengthOfLIS(nums2)); // Expected: 4

        // Test case 3: [7,7,7,7,7,7,7]
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println("LIS length: " + obj.lengthOfLIS(nums3)); // Expected: 1
    }
}
