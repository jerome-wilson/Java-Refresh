package com.java.basics.bits.oops.level2;

public class Student {
    private String name;
    private int age;
    private float marks;
    public static void main(String[] args) {
        Student s1 = new Student("Jerome", 22, 98.21f);
        Student s2 = new Student("Johann", 23);
        Student s3 = new Student("Maria");
        s1.display();
        s2.display();
        s3.display();
    }

    public Student (String name, int age, float marks) {
        this.name = name;
        if(age <= 0) {
            System.out.println("Invalid entry");
            this.age = 18;
        } else {
            this.age = age;
        }
        if(marks < 0 || marks > 100) {
            System.out.println("Invalid entry");
            this.marks = 0;
        } else {
            this.marks = marks;
        }
    }

    public Student (String name, int age) {
        this(name, age, 0.0f);
    }

    public Student(String name) {
        this(name, 18, 0.0f);
    }

    public void display() {
        System.out.println("Name: "+name+"\nAge: "+age+"\nMarks: "+marks+"\n");
    }
}
