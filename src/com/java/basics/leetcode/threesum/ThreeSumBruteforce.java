package com.java.basics.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteforce {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(nums[j] + nums[k] == -nums[i]) {
                       List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                       Collections.sort(triplet);
                       set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

/*  This is wrong 
Time Limit exceeded error
Complexity - O(n³)
*/
