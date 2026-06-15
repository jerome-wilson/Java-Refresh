package com.java.basics.dailypractice.day27;

public class SearchInRotatedSortedArrayIIMain {

    public static void main(String[] args) {

        SearchInRotatedSortedArrayIILogic obj = new SearchInRotatedSortedArrayIILogic();

        // Test case 1: [2,5,6,0,0,1,2], target = 0
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        System.out.println("Search 0: " + obj.search(nums1, 0)); // Expected: true

        // Test case 2: [2,5,6,0,0,1,2], target = 3
        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        System.out.println("Search 3: " + obj.search(nums2, 3)); // Expected: false
    }
}
