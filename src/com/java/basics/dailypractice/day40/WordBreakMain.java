package com.java.basics.dailypractice.day40;

import java.util.Arrays;
import java.util.List;

public class WordBreakMain {

    public static void main(String[] args) {

        WordBreakLogic obj = new WordBreakLogic();

        // Test case 1: s = "leetcode", wordDict = ["leet","code"]
        List<String> dict1 = Arrays.asList("leet", "code");
        System.out.println("leetcode: " + obj.wordBreak("leetcode", dict1)); // Expected: true

        // Test case 2: s = "applepenapple", wordDict = ["apple","pen"]
        List<String> dict2 = Arrays.asList("apple", "pen");
        System.out.println("applepenapple: " + obj.wordBreak("applepenapple", dict2)); // Expected: true

        // Test case 3: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        List<String> dict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println("catsandog: " + obj.wordBreak("catsandog", dict3)); // Expected: false
    }
}
