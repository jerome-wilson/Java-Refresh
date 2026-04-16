package com.java.basics.dailypractice.day8;

public class BinarySearchLogic {
// LeetCode #704, Difficulty: Easy
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;   // search right half
            }
            else {
                right = mid - 1;  // search left half
            }
        }

        return -1;
    }
}
