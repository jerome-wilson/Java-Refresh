package com.java.basics;

public class Main{
    public static void main( String[] args) {
        CharacterU charU = new CharacterU();
        PrefixPostfix prefixpostfix = new PrefixPostfix();
        NumberCheck numberCheck = new NumberCheck();
        //charU.printCharacters();
        //prefixpostfix.demonstratePrefixPostfix();
        System.out.println(numberCheck.numberSignCheck());
    }
}