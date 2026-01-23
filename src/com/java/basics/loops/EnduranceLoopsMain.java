package com.java.basics.loops;
import  java.util.Scanner;

public class EnduranceLoopsMain {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the upper limit value: ");
            int upperLimit = scanner.nextInt();
            EnduranceLoops enduranceLoops = new EnduranceLoops();
            enduranceLoops.selectiveNumberPrinting(upperLimit);
        }
    }
}
