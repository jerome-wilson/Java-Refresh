package com.java.basics.dsabits;
import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
    int pointer = -1;
    int maxSize = 10;
    public void stackOperations() {
        int element = sc.nextInt();
        push(element);
        //pop();
        peek();
        show();
    }

    public void push(int element) {
        if(pointer >= maxSize - 1) {
            System.out.println("stack overflow...");
            return;
        }
        array.add(element);
        pointer ++;
    }

    public void pop() {
        if(pointer == -1) {
            System.out.println("Stack underflow...");
            return;
        }
        array.remove(pointer);
        pointer --;
    }

    public int peek() {
        if(pointer == -1) {
            System.out.println("stack is empty");
            return 0;
        }
        return array.get(pointer);
    }

    public void show() {
        if(pointer == -1) {
            System.out.println("stack is empty");
            return;
        }
        for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}