package com.java.basics.dailypractice.day12;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharactersLogic {
// LeetCode #3, Difficulty: Medium
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
//1. stage 1
//2. stage 2

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
