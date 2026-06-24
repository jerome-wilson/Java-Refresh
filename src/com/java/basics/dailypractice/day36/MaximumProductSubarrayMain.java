package com.java.basics.dailypractice.day36;

public class MaximumProductSubarrayMain {

    public static void main(String[] args) {

        MaximumProductSubarrayLogic obj = new MaximumProductSubarrayLogic();

        // Test case 1: [2,3,-2,4]
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("[2,3,-2,4]: " + obj.maxProduct(nums1)); // Expected: 6

        // Test case 2: [-2,0,-1]
        int[] nums2 = {-2, 0, -1};
        System.out.println("[-2,0,-1]: " + obj.maxProduct(nums2)); // Expected: 0

        // Test case 3: [-2,3,-4]
        int[] nums3 = {-2, 3, -4};
        System.out.println("[-2,3,-4]: " + obj.maxProduct(nums3)); // Expected: 24
    }
}
