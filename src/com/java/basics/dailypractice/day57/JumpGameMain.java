package com.java.basics.dailypractice.day57;

public class JumpGameMain {

    public static void main(String[] args) {

        JumpGameLogic obj = new JumpGameLogic();

        // Test case 1: [2,3,1,1,4]
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("[2,3,1,1,4]: " + obj.canJump(nums1)); // Expected: true

        // Test case 2: [3,2,1,0,4]
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("[3,2,1,0,4]: " + obj.canJump(nums2)); // Expected: false
    }
}
