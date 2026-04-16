package com.java.basics.dailypractice.day8;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = BinarySearchLogic.search(nums, target);

        System.out.println("Target index: " + result);
    }
}
