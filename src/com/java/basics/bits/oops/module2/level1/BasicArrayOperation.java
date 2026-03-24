package com.java.basics.bits.oops.module2.level1;

import java.util.Scanner;

public class BasicArrayOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter into the array: ");
        int numberOfElements = sc.nextInt();
        int[] array = new int[numberOfElements];
        System.out.println("Enter the elements "+numberOfElements+" times: ");
        for(int i = 0; i < numberOfElements; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The array you entered: ");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(array[i]+" ");
        }
        double sum = sumOfArray(array);
        int max = maxInArray(array);
        double average = averageOfArray(array, sum);

        System.out.println("\nThe sum of the array is: "+sum);
        System.out.println("The maximum element in the array is: "+max);
        System.out.println("The average of all the elements in the array is: "+average);
        sc.close();
    }

    public static double sumOfArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int maxInArray(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double averageOfArray(int[] array, double sum) {
        double average = sum /array.length;
        return average;
    }
}
