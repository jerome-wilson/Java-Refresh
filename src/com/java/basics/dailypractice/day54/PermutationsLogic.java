package com.java.basics.dailypractice.day54;

import java.util.ArrayList;
import java.util.List;

public class PermutationsLogic {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {

        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : nums) {
            if (tempList.contains(num)) {
                continue;
            }
            tempList.add(num);
            backtrack(result, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}
