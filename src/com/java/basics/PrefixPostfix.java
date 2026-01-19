package com.java.basics;

public class PrefixPostfix {
    public void demonstratePrefixPostfix() {
        int someValue = 5;
        int otherValue = 5;
        System.out.println(
                "Prefix\n"+
                        ++someValue + "\n" +
                        someValue + "\n" +
                "Postfix\n"+
                        otherValue++ + "\n" +
                        otherValue
        );
    }
}
