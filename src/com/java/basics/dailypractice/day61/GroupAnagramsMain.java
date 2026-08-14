package com.java.basics.dailypractice.day61;

import java.util.List;

public class GroupAnagramsMain {

    public static void main(String[] args) {

        GroupAnagramsLogic obj = new GroupAnagramsLogic();

        // Test case
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println("Grouped anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
        // Expected groups: ["bat"], ["nat","tan"], ["ate","eat","tea"]
    }
}
