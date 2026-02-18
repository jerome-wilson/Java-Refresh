package com.java.basics.leetcode.removeduplicates;

import java.util.Scanner;

public class RemoveDuplicateMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        RemoveDuplicate rd = new RemoveDuplicate();
        int k = rd.removeDuplicates(nums);

        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
