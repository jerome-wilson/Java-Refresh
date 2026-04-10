package com.java.basics.bits.oops.practicebeforeexam;

public class Propagate {
    static void m1() {
        try { m2(); }
        catch (Exception e) { System.out.print("m1-catch "); }
    }
    static void m2() {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try { m1(); }
        catch (Exception e) { System.out.print("main-catch"); }
    }
}
