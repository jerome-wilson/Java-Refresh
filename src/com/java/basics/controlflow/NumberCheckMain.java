package com.java.basics.controlflow;
import java.util.Scanner;

public class NumberCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberCheck numberCheck = new NumberCheck();
        System.out.println("Enter any number: ");
        int input = sc.nextInt();
        System.out.println(numberCheck.numberSignCheck(input));
        sc.close();
    }
}