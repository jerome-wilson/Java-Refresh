package com.java.basics.bits.oops.abstraction;

public abstract class Abstraction {
    abstract double area();
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Abstraction {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Abstraction {
    double height, base;
    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }

}

class Rectangle extends Abstraction {
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area() {
        return length * breadth;
    }

}

