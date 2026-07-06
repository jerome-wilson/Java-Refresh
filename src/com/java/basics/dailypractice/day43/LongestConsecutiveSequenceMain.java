package com.java.basics.dailypractice.day43;

public class LongestConsecutiveSequenceMain {

    public static void main(String[] args) {

        LongestConsecutiveSequenceLogic obj = new LongestConsecutiveSequenceLogic();

        // Test case 1: [100,4,200,1,3,2]
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("[100,4,200,1,3,2]: " + obj.longestConsecutive(nums1)); // Expected: 4 (1,2,3,4)

        // Test case 2: [0,3,7,2,5,8,4,6,0,1]
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("[0,3,7,2,5,8,4,6,0,1]: " + obj.longestConsecutive(nums2)); // Expected: 9
    }
}
