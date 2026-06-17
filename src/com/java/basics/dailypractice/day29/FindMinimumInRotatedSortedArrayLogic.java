package com.java.basics.dailypractice.day29;

public class FindMinimumInRotatedSortedArrayLogic {
// LeetCode #153, Difficulty: Medium

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
