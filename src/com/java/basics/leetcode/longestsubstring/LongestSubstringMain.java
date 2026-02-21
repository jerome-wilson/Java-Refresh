package com.java.basics.leetcode.longestsubstring;

import java.util.Scanner;

public class LongestSubstringMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        LongestSubstring solution = new LongestSubstring();
        int result = solution.lengthOfLongestSubstring(input);

        System.out.println(result);

        sc.close();
    }
}
