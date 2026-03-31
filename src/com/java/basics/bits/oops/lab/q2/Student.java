package com.java.basics.bits.oops.lab.q2;
/*
question 2:
Define a class, write instance methods for setting and retrieving the values of instance variables.
Also write functions to process the values of instance variables.

#Instance variables:
Variables that belong to an object
example:
class Student {
    int age;
    String name;
}
each object gets its own copy:
Student s1 → age = 20  
Student s2 → age = 25

#Instance methods:
Methods that operate on object data
example:
public void display() {
    System.out.println(age);
}

#Local varibles:
A local variable is a variable declared inside a method (or block) and is only accessible within that method.
example:
public void display() {
    int x = 10;  ---> This is a local varaible
    System.out.println(x);
}
 */

public class Student {
    private String name;
    private int age;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        if(!(name.equals("Markus")) && (rollNumber == 24)) {
            return 0;
        } else {
            return 98;
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        // Setting values
        student.setName("Markus");
        student.setAge(17);
        student.setRollNumber(24);
        //Getting values
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Roll Number: "+student.getRollNumber());
        System.out.println("Marks of "+student.getName()+" is: "+student.getMarks());
    }
}
