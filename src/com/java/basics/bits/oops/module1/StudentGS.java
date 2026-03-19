package com.java.basics.bits.oops.module1;

public class StudentGS {
    private String name;
    private int age;
    private double marks;
    public static void main(String[] args) {
        StudentGS student1 = new StudentGS();
        student1.setAge(22);
        student1.setName("Jerome");
        student1.setMarks(81.25);
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade " + student1.getGrade());
        System.out.println("Marks: "+student1.getMarks());
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        if(marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if(marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
