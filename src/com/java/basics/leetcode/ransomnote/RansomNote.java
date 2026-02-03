package com.java.basics.leetcode.ransomnote;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> magazineLetter = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            
            int currentCount = magazineLetter.getOrDefault(m, 0);
            magazineLetter.put(m, currentCount + 1);

        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int currentCount = magazineLetter.getOrDefault(r, 0);
            if( currentCount == 0) {
                return false;
            }
            magazineLetter.put(r, currentCount - 1); 
        }
        return true;
    }
}
