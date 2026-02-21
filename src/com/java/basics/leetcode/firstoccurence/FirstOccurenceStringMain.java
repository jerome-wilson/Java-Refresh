package com.java.basics.leetcode.firstoccurence;
import java.util.Scanner;

public class FirstOccurenceStringMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        FirstOccurenceString solution = new FirstOccurenceString();
        int result = solution.findingFirstOccurence(haystack, needle);

        System.out.println(result);

        sc.close();
    }
}
