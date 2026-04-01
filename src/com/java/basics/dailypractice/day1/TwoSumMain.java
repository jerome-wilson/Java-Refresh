package com.java.basics.dailypractice.day1;
//problem 1 - easy
public class TwoSumMain {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSumLogic.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
