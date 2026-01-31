package com.java.basics.leetcode.FizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {
    public ArrayList<String> fizzBuzzLogic(int[] array,ArrayList<String> arrayList) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]%3==0 && array[i]%5==0) {
                arrayList.add("Fizzbuzz");
            } else if (array[i]%3==0) {
                arrayList.add("Fizz");
            } else if (array[i]%5==0) {
                arrayList.add("Buzz");
            } else {
                arrayList.add(String.valueOf(array[i]));
            }
        }
        return arrayList;
    }
    
}
