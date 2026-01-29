package com.java.basics.arrays;

public class ArrayReverse {
    public void arrayReverseLogic(int[] nums) {
        int left, right, temp;
        left = 0;
        right = nums.length - 1;
        while(left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index]+" ");
        }
    }
    
}
