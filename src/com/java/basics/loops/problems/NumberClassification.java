package com.java.basics.loops.problems;

public class NumberClassification {
    public void numberClassificationLogic(int limit) {
        for (int index = 1; index <= limit; index++) {
            System.out.println(index % 2 == 0 ? "EVEN" : "ODD");
        }
    }
    
}
