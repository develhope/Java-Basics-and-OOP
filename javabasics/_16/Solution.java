package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static String celsiusToFahrenheit(double celsius){
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = ((celsius * 9) / 5) + 32;

        // Create a string that describes the conversion result
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";

        // Return the conversion result
        return conversionDescription;
    }
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Celsius temperature to be converted
        double celsius = 30;

        // Call the function to convert Celsius to Fahrenheit
        String conversionResult = celsiusToFahrenheit(celsius);

        // Print the conversion result
        System.out.println(conversionResult);
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */

    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            processAndPrintNames(name);
        }
    }

    private static void processAndPrintNames(String name) {
        // Step 1: Convert the name to uppercase
        String formattedName = name.toUpperCase();

        // Step 2: Remove spaces at the start and the end of the name
        formattedName = formattedName.trim();

        // Step 3: Check if the name contains any numbers
        if (formattedName.matches(".*\\d+.*")) {
            // If the name contains numbers, print "Invalid"
            System.out.println("Invalid");
        } else {
            // If the name does not contain numbers, print the formatted name
            System.out.println(formattedName);
        }
    }
    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        printVariables(myLunchPrice, lunchType, description, weightInGrams);
    }

    private static void printVariables(double myLunchPrice, String lunchType, String description, int weightInGrams) {
        System.out.println("myLunchPrice = " + myLunchPrice);
        System.out.println("lunchType = " + lunchType);
        System.out.println("description = " + description);
        System.out.println("weightInGrams = " + weightInGrams);
    }
}
