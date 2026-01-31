package com.java.basics.leetcode.FizzBuzz;
import java.util.Scanner;
import java.util.ArrayList;

public class FizzBuzzMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> arrayList = new ArrayList<>();
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            FizzBuzz fizzBuzz = new FizzBuzz();
            ArrayList<String> result = fizzBuzz.fizzBuzzLogic(numbers, arrayList);
            for (int j = 0; j < n; j++) {
                System.out.print(result.get(j) + " ");
            }
        }
    }
}
