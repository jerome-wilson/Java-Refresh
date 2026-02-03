package com.java.basics.leetcode.ransomnote;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. Create a frequency map of the available letters in the magazine
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }

        // 2. Check if we have enough letters to build the ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false; // Ran out of this letter!
            }

            magazineLetters.put(r, currentCount - 1); // Use one letter up
        }

        return true; // We successfully built the whole note
    }
}

public class RansomNoteMain {
    public static void main(String[] args) {
        Solution solver = new Solution();

        String note = "aa";
        String magazine = "aab";

        boolean result = solver.canConstruct(note, magazine);

        if (result) {
            System.out.println("Success! You can write the note.");
        } else {
            System.out.println("Fail! Not enough letters.");
        }
    }
}