package com.java.basics.arrays;

public class EvenNumberCountArray {
    public void evenNumberCountArrayLogic(int[] array) {
        int count = 0;
        System.out.println("Even Numbers: ");
            for(int index = 0; index < array.length; index++) {
                 if (array[index]%2 == 0) {
                    count++;
                    System.out.print(array[index]+" ");
                 }
            }
            System.out.println("\n Count of even numbers: " + count);
    }
}
