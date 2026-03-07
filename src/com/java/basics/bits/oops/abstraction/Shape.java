package com.java.basics.bits.oops.abstraction;

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(6,2);
        Rectangle rectangle = new Rectangle(20, 13);
        circle.display();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
