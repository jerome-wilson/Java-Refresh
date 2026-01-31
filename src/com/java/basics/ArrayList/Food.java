package com.java.basics.ArrayList;
import java.util.ArrayList;

public class Food {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Ketchup");
        food.add("sausages");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println();
        food.set(0, "sushi");
        for (int j = 0; j < food.size(); j++) {
            System.out.println(food.get(j));
        }
    }
}

/*
Other useful methods include:
food.remove(2); ----> removes the element in the specified index
food.clear(); ----> clears all values in the ArrayList
*/
