package com.java.basics.bits.oops.practicebeforeexam;

class InvalidAgeException extends Exception {
    InvalidAgeException (String message) {
        super(message);
    }
}


class AgeCheck {
    void checkAge(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("underage");
        } else {
            System.out.println("fine");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        AgeCheck checksAge = new AgeCheck();
        try {
            checksAge.checkAge(12);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}
