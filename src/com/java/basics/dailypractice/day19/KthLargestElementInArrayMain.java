package com.java.basics.dailypractice.day19;

public class KthLargestElementInArrayMain {

    public static void main(String[] args) {

        KthLargestElementInArrayLogic obj =
                new KthLargestElementInArrayLogic();

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        int result = obj.findKthLargest(nums, k);

        System.out.println("Kth Largest Element: " + result);
    }
}
