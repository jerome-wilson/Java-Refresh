package com.java.basics.leetcode.runningsum;

public class RunningSumArray {
    public int[] runningSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
            //array[i] += array[i - 1];
        }
        return array;
    }
}

//Time complexity - O(n)
//Space complexity = O(1)


// public class RunningSumArray {
//     public int[] runningSum(int[] array) {
//         int[]results = new int[array.length];
//         results[0] = array[0];
//         for (int i = 1;i < array.length; i++) {
//             results [i] = array[i] + results[i - 1];
//         }
//         return results;

//     }
// }

//Time complexity - O(n)
//Space complexity = O(n)
