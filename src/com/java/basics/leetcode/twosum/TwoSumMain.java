package com.java.basics.leetcode.twosum;
import java.util.Scanner;

public class TwoSumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        int[] array = new int[limit];
        System.out.print("Enter the elements: ");
        for (int j = 0; j < limit; j++) {
            array[j] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumLogic(array, target);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
