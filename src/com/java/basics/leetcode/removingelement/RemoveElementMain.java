package com.java.basics.leetcode.removingelement;

import java.util.Scanner;

public class RemoveElementMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int val = sc.nextInt();

        RemovingElement solution = new RemovingElement();
        int k = solution.removingVal(nums, val);

        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
