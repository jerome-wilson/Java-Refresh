package com.java.basics.loops.patterns;

public class NumberPatternSum {
    public void printingNumberPattern(int limit) {
        for (int rows = 1; rows <= limit; rows++) {
            int sum = 0;
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns);
                sum +=  columns;
            }
            System.out.println(" = " + sum);
        }
    }
}
