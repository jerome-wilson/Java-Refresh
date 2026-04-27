package com.java.basics.dailypractice.day12;

public class LongestSubstringWithoutRepeatingCharactersMain {

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharactersLogic obj =
                new LongestSubstringWithoutRepeatingCharactersLogic();

        String input = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(input);

        System.out.println("Longest Length: " + result);
    }
}
