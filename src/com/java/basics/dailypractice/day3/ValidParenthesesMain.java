package com.java.basics.dailypractice.day3;

public class ValidParenthesesMain {
     public static void main(String[] args) {

        String s = "{[()]}";

        boolean result = ValidParenthesesLogic.isValid(s);

        System.out.println("Is valid: " + result);
    }
}
