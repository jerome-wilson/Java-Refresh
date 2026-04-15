package com.java.basics.dailypractice.day7;

public class MaximumSubarrayMain {
//LeetCode #53, Difficulty: Medium
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = MaximumSubarrayLogic.maxSubArray(nums);

        System.out.println("Maximum subarray sum: " + result);
    }
}
