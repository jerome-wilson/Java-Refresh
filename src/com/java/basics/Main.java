package com.java.basics;
import java.util.Scanner;

public class Main{
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
//        NumberCheck numberCheck = new NumberCheck();
//        System.out.println("Enter any number: ");
//        int input = sc.nextInt();
//        System.out.println(numberCheck.numberSignCheck(input));
//
//        CharacterU charU = new CharacterU();
//        PrefixPostfix prefixpostfix = new PrefixPostfix();

//        charU.printCharacters();
//        prefixpostfix.demonstratePrefixPostfix();
        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();
        System.out.println("Enter the opcode for doing the arithemetic operations:");
        System.out.println("NOTE: The OpCode for addition is 'a', for subtraction it is 's', for multiplication it is 'm' and for division it is 'd'");
        System.out.print("Enter the value: ");
        char opCode = sc.next().charAt(0);
        SwitchOpCode opCodeCalculator = new SwitchOpCode();
        opCodeCalculator.opCodeOperations(opCode, firstNumber, secondNumber);
        sc.close();
    }
}