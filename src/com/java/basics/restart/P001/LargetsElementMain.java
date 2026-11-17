package com.java.basics.restart.P001;
import java.util.Scanner;

public class LargetsElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		LargestElement largestElement = new LargestElement();
		System.out.println(largestElement.largestElementInArray(arr));
		scanner.close();
    }
}

