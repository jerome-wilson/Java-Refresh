package com.java.basics.dailypractice.day2;

public class LongestSubstringMain {
    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = LongestSubstringLogic.lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring: " + result);
    }
}
