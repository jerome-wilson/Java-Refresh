package com.java.basics.opcode;

public class SwitchOpCode {
    public void opCodeOperations(char opCode, double firstnumber, double secondnumber) {
        double result;
        switch (opCode) {
            case 'a':
                result = firstnumber + secondnumber;
                System.out.println("performing addition...");
                System.out.println(result);
                break;

            case 's':
                result = firstnumber - secondnumber;
                System.out.println("performing subtraction...");
                System.out.println(result);
                break;
            case 'm':
                result = firstnumber * secondnumber;
                System.out.println("performing multiplication...");
                System.out.println(result);
                break;
            case 'd':
                if (secondnumber != 0.0) {
                    result = firstnumber / secondnumber;
                    System.out.println("performing division...");
                    System.out.println(result);
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
            default:
                throw new IllegalArgumentException("Invalid OpCode: " + opCode);
        }
    }
}
