package com.java.basics.leetcode.maxwatercontainer;

public class MaxWaterContainer {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[right], height[left]);
            int area = width * minHeight;

            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) {
                left ++;
            } else {
                right --; 
            }
        }
        return maxArea;
    }
}
