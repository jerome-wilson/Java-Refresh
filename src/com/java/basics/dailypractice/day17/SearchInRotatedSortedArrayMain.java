package com.java.basics.dailypractice.day17;

public class SearchInRotatedSortedArrayMain {

    public static void main(String[] args) {

        SearchInRotatedSortedArrayLogic obj =
                new SearchInRotatedSortedArrayLogic();

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int result = obj.search(nums, target);

        System.out.println("Target Index: " + result);
    }
}
