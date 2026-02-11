package com.java.basics.leetcode.longestsubstring;

import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String string) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < string.length(); right++) {
            while(set.contains(string.charAt(right))) {
                set.remove(string.charAt(left));
                left ++;
            }
            set.add(string.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

//Time complexity - O(n)
//Space complexity - O(n)
