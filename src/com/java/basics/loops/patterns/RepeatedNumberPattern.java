package com.java.basics.loops.patterns;

public class RepeatedNumberPattern {
    public void printingNumbersPatternsLogic(int limit) {
        for (int rows = 1; rows <= limit; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(rows);
            }
            System.out.println();
        }
    }
}
