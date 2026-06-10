package com.java.basics.dailypractice.day24;

public class FindMinimumInRotatedSortedArrayMain {

    public static void main(String[] args) {

        FindMinimumInRotatedSortedArrayLogic obj = new FindMinimumInRotatedSortedArrayLogic();

        // Test case 1: [3,4,5,1,2]
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("[3,4,5,1,2]: " + obj.findMin(nums1)); // Expected: 1

        // Test case 2: [4,5,6,7,0,1,2]
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("[4,5,6,7,0,1,2]: " + obj.findMin(nums2)); // Expected: 0

        // Test case 3: [11,13,15,17]
        int[] nums3 = {11, 13, 15, 17};
        System.out.println("[11,13,15,17]: " + obj.findMin(nums3)); // Expected: 11
    }
}
