package com.java.basics.dailypractice.day10;

public class ContainerWithMostWaterMain {

    public static void main(String[] args) {

        ContainerWithMostWaterLogic obj = new ContainerWithMostWaterLogic();

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = obj.maxArea(height);

        System.out.println("Maximum Water Area: " + result);
    }
}
