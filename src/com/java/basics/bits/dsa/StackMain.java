package com.java.basics.bits.dsa;

import java.util.Scanner;

/**
 * Interactive menu-driven program to test Stack operations.
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create stack with default size or custom size
        System.out.print("Enter stack size (or press Enter for default size 10): ");
        String input = sc.nextLine().trim();
        
        Stack stack;
        if (input.isEmpty()) {
            stack = new Stack();
            System.out.println("Created stack with default size: 10");
        } else {
            int size = Integer.parseInt(input);
            stack = new Stack(size);
            System.out.println("Created stack with size: " + size);
        }
        
        int choice;
        
        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Get Size");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: // Push
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    if (stack.push(element)) {
                        System.out.println("Pushed " + element + " successfully!");
                    } else {
                        System.out.println("Stack Overflow! Cannot push " + element);
                    }
                    break;
                    
                case 2: // Pop
                    if (stack.isEmpty()) {
                        System.out.println("Stack Underflow! Stack is empty.");
                    } else {
                        int popped = stack.pop();
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                    
                case 3: // Peek
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty! Nothing to peek.");
                    } else {
                        System.out.println("Top element: " + stack.peek());
                    }
                    break;
                    
                case 4: // Display
                    System.out.println(stack.toString());
                    break;
                    
                case 5: // isEmpty
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                    
                case 6: // isFull
                    System.out.println("Is stack full? " + stack.isFull());
                    break;
                    
                case 7: // Size
                    System.out.println("Current size: " + stack.size() + "/" + stack.getMaxSize());
                    break;
                    
                case 8: // Exit
                    System.out.println("Exiting... Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1-8.");
            }
        } while (choice != 8);
        
        sc.close();
    }
}