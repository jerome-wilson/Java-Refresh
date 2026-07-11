package com.java.basics.dailypractice.day45;

import java.util.Arrays;

public class TopKFrequentElementsMain {

    public static void main(String[] args) {

        TopKFrequentElementsLogic obj = new TopKFrequentElementsLogic();

        // Test case 1: [1,1,1,2,2,3], k = 2
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        System.out.println("Top 2: " + Arrays.toString(obj.topKFrequent(nums1, 2))); // Expected: [1, 2]

        // Test case 2: [1], k = 1
        int[] nums2 = {1};
        System.out.println("Top 1: " + Arrays.toString(obj.topKFrequent(nums2, 1))); // Expected: [1]
    }
}
