package com.java.basics.leetcode.runningsum;

public class RunningSumArrayMain {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        RunningSumArray runningSumArray = new RunningSumArray();
        int[] array = runningSumArray.runningSum(nums);
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("]");
    }
}
