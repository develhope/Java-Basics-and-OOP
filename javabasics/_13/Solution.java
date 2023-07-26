package javabasics._13;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Add 8 random integers to the array list
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        //Print the first integers to the array
        System.out.println("The first element is: " + numbers.get(0));

        //Remove the first 3 items
        numbers.subList(0,3).clear();

        //Print the new first integers to the array
        System.out.println("The new first element is: " + numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        // Create two ArrayLists
        List<String> menuItems = new ArrayList<>(); // A list of strings for menu items
        List<Double> menuPrices = new ArrayList<>(); // A list of Doubles for menu prices

        // Add menu items and their corresponding prices to the ArrayLists
        menuItems.add("Hamburger");
        menuPrices.add(9.99);

        menuItems.add("French Fries");
        menuPrices.add(3.49);

        menuItems.add("Pizza");
        menuPrices.add(12.99);

        menuItems.add("Salad");
        menuPrices.add(6.99);

        for (int i = 0; i < menuItems.size(); i++) {
            String menuItem = menuItems.get(i);
            double menuPrice = menuPrices.get(i);
            System.out.println(menuItem + " - $" + menuPrice);
        }

    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        // Find the total sum using the + operator
        int total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i];
        }

        // Print the total
        System.out.println("Total sum: " + total);    }
}
