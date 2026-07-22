package com.java.basics.dailypractice.day50;

import java.util.Arrays;

public class ProductOfArrayExceptSelfMain {

    public static void main(String[] args) {

        ProductOfArrayExceptSelfLogic obj = new ProductOfArrayExceptSelfLogic();

        // Test case 1: [1,2,3,4]
        // Expected: [24,12,8,6]
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("[1,2,3,4]: " + Arrays.toString(obj.productExceptSelf(nums1)));

        // Test case 2: [-1,1,0,-3,3]
        // Expected: [0,0,9,0,0]
        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println("[-1,1,0,-3,3]: " + Arrays.toString(obj.productExceptSelf(nums2)));
    }
}
