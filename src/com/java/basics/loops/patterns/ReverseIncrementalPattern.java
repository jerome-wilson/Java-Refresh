package com.java.basics.loops.patterns;

public class ReverseIncrementalPattern {
    public void reducingPatternLogic(int limit) {
        for (int rows = limit; rows >= 1; rows--) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }
}
