package com.java.basics.bits.dsa;

import java.util.ArrayList;

/**
 * A simple Stack implementation using ArrayList.
 * Follows LIFO (Last In, First Out) principle.
 */
public class Stack {
    private ArrayList<Integer> array;
    private int pointer;
    private int maxSize;

    /**
     * Creates a stack with default capacity of 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * Creates a stack with specified capacity.
     * @param maxSize Maximum number of elements the stack can hold
     */
    public Stack(int maxSize) {
        this.array = new ArrayList<>();
        this.pointer = -1;
        this.maxSize = maxSize;
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param element The element to push
     * @return true if push was successful, false if stack is full
     */
    public boolean push(int element) {
        if (isFull()) {
            return false;
        }
        array.add(element);
        pointer++;
        return true;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * @return The top element, or -1 if stack is empty
     */
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int element = array.remove(pointer);
        pointer--;
        return element;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * @return The top element, or -1 if stack is empty
     */
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return array.get(pointer);
    }

    /**
     * Checks if the stack is empty.
     * @return true if stack has no elements
     */
    public boolean isEmpty() {
        return pointer == -1;
    }

    /**
     * Checks if the stack is full.
     * @return true if stack has reached maximum capacity
     */
    public boolean isFull() {
        return pointer >= maxSize - 1;
    }

    /**
     * Returns the current number of elements in the stack.
     * @return Number of elements
     */
    public int size() {
        return pointer + 1;
    }

    /**
     * Returns the maximum capacity of the stack.
     * @return Maximum capacity
     */
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Returns a string representation of the stack (top to bottom).
     * @return Stack contents as string
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[Empty Stack]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (top to bottom):\n");
        for (int i = pointer; i >= 0; i--) {
            sb.append("  [").append(i).append("] ").append(array.get(i));
            if (i == pointer) {
                sb.append(" <- TOP");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}