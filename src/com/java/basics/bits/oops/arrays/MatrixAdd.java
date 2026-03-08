package com.java.basics.bits.oops.arrays;

public class MatrixAdd {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        MatrixAdd adding = new MatrixAdd();
        System.out.println(adding.add(arr));
        int[] rowSums = adding.rowSum(arr);
        for(int i = 0; i < rowSums.length; i++) {
            System.out.println("Row "+(i+1)+" sum "+rowSums[i]);
        }
    
    }
// adding all elements in an array
    int add(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
// finding sum of each row in a 2D array
    int[] rowSum(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int rowValue = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowValue += array[i][j];
            }
            sums[i] = rowValue;
        }
        return sums;
    }
}

