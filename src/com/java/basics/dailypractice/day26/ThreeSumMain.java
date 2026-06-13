package com.java.basics.dailypractice.day26;

import java.util.List;

public class ThreeSumMain {

    public static void main(String[] args) {

        ThreeSumLogic obj = new ThreeSumLogic();

        // Test case: [-1,0,1,2,-1,-4]
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("3Sum result: " + result);
        // Expected: [[-1,-1,2],[-1,0,1]]
    }
}
