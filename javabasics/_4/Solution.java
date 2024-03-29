package javabasics._4;

public class Solution {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 28;
        System.out.println("My age is: " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char firstInitials = 'G';
        int age = 28;
        System.out.println("My age is: " + age + ",my initial=" + firstInitials);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");       // Print a new line and the text "Exercise 3:"
        boolean hasEatenLunch = false;      // Declare and initialize a boolean variable "hasEatenLunch" with the value "false"

        double lunchCost = 5.99;    // Declare and initialize a Double variable "lunchCost" with the value "5.99"

        System.out.println("Lunch cost=" + lunchCost);      // Print the text "Lunch cost=" followed by the value of the variable "lunchCost".
        System.out.println("Has Eaten lunch=" + hasEatenLunch);     // Print the text "Has Eaten lunch=" followed by the value of the variable "hasEatenLunch".
    }
}
