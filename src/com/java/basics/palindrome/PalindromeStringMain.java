package com.java.basics.palindrome;

public class PalindromeStringMain {
    public static void main(String[] args) {
        PalindromeString checker = new PalindromeString();
        
        // Test cases
        System.out.println("Testing palindrome checker:");
        System.out.println();
        
        // Basic palindromes
        System.out.println("'madam' -> " + checker.isPalindrome("madam"));           // true
        System.out.println("'racecar' -> " + checker.isPalindrome("racecar"));       // true
        System.out.println("'hello' -> " + checker.isPalindrome("hello"));           // false
        System.out.println();
        
        // Case-insensitive tests (previously failed)
        System.out.println("Case-insensitive tests:");
        System.out.println("'Racecar' -> " + checker.isPalindrome("Racecar"));       // true (was false)
        System.out.println("'MadAm' -> " + checker.isPalindrome("MadAm"));           // true (was false)
        System.out.println();
        
        // Special characters tests (previously failed)
        System.out.println("Special characters tests:");
        System.out.println("'A man a plan a canal Panama' -> " + checker.isPalindrome("A man a plan a canal Panama")); // true
        System.out.println("'Was it a car or a cat I saw?' -> " + checker.isPalindrome("Was it a car or a cat I saw?")); // true
        System.out.println("'race a car' -> " + checker.isPalindrome("race a car")); // false
        System.out.println();
        
        // Edge cases
        System.out.println("Edge cases:");
        System.out.println("'' (empty) -> " + checker.isPalindrome(""));             // true
        System.out.println("'a' -> " + checker.isPalindrome("a"));                   // true
        System.out.println("' ' (space) -> " + checker.isPalindrome(" "));           // true
    }
}