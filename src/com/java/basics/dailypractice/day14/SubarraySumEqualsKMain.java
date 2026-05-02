package com.java.basics.dailypractice.day14;

public class SubarraySumEqualsKMain {

    public static void main(String[] args) {

        SubarraySumEqualsKLogic obj = new SubarraySumEqualsKLogic();

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = obj.subarraySum(nums, k);

        System.out.println("Number of Subarrays: " + result);
    }
}
