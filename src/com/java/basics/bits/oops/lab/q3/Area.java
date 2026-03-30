package com.java.basics.bits.oops.lab.q3;
import java.lang.Math;

public class Area {
    private double height = 20;
    private double length = 40;
    private double breadth = 25;
    private double base = 10;
    private double radius = 14;

    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public double getBase() {
        return base;
    }
    public double getRadius() {
        return radius;
    }

    public double getAreaOfRectange() {
        return breadth * length;
    }

    public double getAreaOfTriangle() {
        return 0.5 * base * height;
    }

    public double getAreaOfSquare() {
        return height * height;
    }

    public double getAreaOfCircle() {
        return 2 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Height :"+area.getHeight());
        System.out.println("Length :"+area.getLength());
        System.out.println("Breadth :"+area.getBreadth());
        System.out.println("Base :"+area.getBase());
        System.out.println("Radius :"+area.getRadius());
        System.out.println("Area of rectangle: "+area.getAreaOfRectange());
        System.out.println("Area of circle: "+area.getAreaOfCircle());
        System.out.println("Area of square: "+area.getAreaOfSquare());
        System.out.println("Area of triangle: "+area.getAreaOfTriangle());
    }
}
