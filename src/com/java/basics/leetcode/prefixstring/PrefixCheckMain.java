package com.java.basics.leetcode.prefixstring;
import java.util.Scanner;

public class PrefixCheckMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        PrefixCheck pc = new PrefixCheck();
        System.out.println(pc.longestCommonPrefix(strs));

        sc.close();
    }
}


