package com.java.basics.dailypractice.day15;

public class ValidParenthesesMain {

    public static void main(String[] args) {

        ValidParenthesesLogic obj = new ValidParenthesesLogic();

        String input = "()[]{}";

        boolean result = obj.isValid(input);

        System.out.println("Is Valid: " + result);
    }
}
