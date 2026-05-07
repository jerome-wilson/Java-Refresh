package com.java.basics.dailypractice.day16;

public class BinarySearchMain {

    public static void main(String[] args) {

        BinarySearchLogic obj = new BinarySearchLogic();

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int result = obj.search(nums, target);

        System.out.println("Target Index: " + result);
    }
}
