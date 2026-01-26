package com.java.basics.loops.patterns;

public class IncrementalNumberPattern {
    public void numberPattern(int limit) {
        for (int row = 1; row <= limit; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
