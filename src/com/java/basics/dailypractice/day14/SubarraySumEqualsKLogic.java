package com.java.basics.dailypractice.day14;

import java.util.HashMap;

public class SubarraySumEqualsKLogic {
// LeetCode #560, Difficulty: Medium
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important base case

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
