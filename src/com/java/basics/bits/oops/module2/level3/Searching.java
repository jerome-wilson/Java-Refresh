package com.java.basics.bits.oops.module2.level3;

import java.util.Scanner;
import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int numberOfElements = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println("Linear search: ");
        System.out.println(linearSearch(arr, target));
        System.out.println("Bubble sort array: ");
        int[] sortedArray = arr.clone();
        BubbleSort.bubbleSort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Binary search ");
        System.out.println((binarySearch(sortedArray, target)));
        sc.close();
    }
    public static String linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                return "element "+target+" found in "+(i+1)+" position";
            } 
        }
        return "element not found";
    }

    public static String binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(target < array[mid]) {
                high = mid - 1;
            } else if(target > array[mid]) {
                low = mid + 1;
            } else {
                return "target found at " + (mid+1) + " position";
            }
        }
        return "element not found";
    }
}
