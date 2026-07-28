package com.java.basics.dailypractice.day54;

import java.util.List;

public class PermutationsMain {

    public static void main(String[] args) {

        PermutationsLogic obj = new PermutationsLogic();

        // Test case: [1,2,3]
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.permute(nums);

        System.out.println("Permutations of [1,2,3]:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
        // Expected: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    }
}
