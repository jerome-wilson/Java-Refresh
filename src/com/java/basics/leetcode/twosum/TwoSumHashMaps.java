package com.java.basics.leetcode.twosum;

import java.util.HashMap;

public class TwoSumHashMaps {
    public int[] twoSumHashMapslogic(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int currentNumber = nums[index];
            int numberNeeded = target - currentNumber;
            if (map.containsKey(numberNeeded)) {
                return new int[] {map.get(numberNeeded), index};
            }

            map.put(currentNumber,index);
        }
        return new int[] {};
    }    
}
