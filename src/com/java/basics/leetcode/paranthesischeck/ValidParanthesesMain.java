package com.java.basics.leetcode.paranthesischeck;

import java.util.Scanner;

public class ValidParanthesesMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        ValidParantheses solution = new ValidParantheses();
        boolean result = solution.isValid(input);

        System.out.println(result);

        sc.close();
    } 
    
}
