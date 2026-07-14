package com.java.basics.dailypractice.day47;

import java.util.List;

public class SubsetsMain {

    public static void main(String[] args) {

        SubsetsLogic obj = new SubsetsLogic();

        // Test case: [1,2,3]
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.subsets(nums);

        System.out.println("Subsets of [1,2,3]:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
        // Expected: [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]
    }
}
