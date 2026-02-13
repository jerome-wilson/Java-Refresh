package com.java.basics.leetcode.maxwatercontainer;
import java.util.Scanner;

public class MaxWaterContainerMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        MaxWaterContainer solution = new MaxWaterContainer();
        int result = solution.maxArea(height);

        System.out.println(result);

        sc.close();
    }
}