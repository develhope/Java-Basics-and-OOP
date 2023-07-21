package javabasics._6;

public class Solution {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Create a double variable called value and assign any value to it
        double value = 64.0; // You can use any positive value

        // Create another double variable called valueSquareRoot
        double valueSquareRoot;

        // Use Math.sqrt() to find the square root of value and assign it to valueSquareRoot
        valueSquareRoot = Math.sqrt(value);

        // Print the original value and its square root
        System.out.println("Original value: " + value);
        System.out.println("Square root of the value: " + valueSquareRoot);
    }


    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Declare and initialize variables
        int valueA = 5;
        int valueB = 10;

        // Find the highest value using Math.max()
        int valueMax = Math.max(valueA,valueB);
        // Find the lowest value using Math.min()
        int valueMin = Math.min(valueA,valueB);

        // Print out the highest and lowest values
        System.out.println("Max=" + valueMax);
        System.out.println("Min=" + valueMin);


    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;

        int amount = totalMoney%costPerBurger;  // Calculate the remaining amount after buying as many burgers as possible

        System.out.println("Remainder=" + amount );
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Comment 1: Returns the smallest integer that is greater than or equal to the given value.
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));

        // Comment 2: Returns the largest integer that is less than or equal to the given value.
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));

        // Comment 3: Returns the closest long or int value to the given floating-point value.
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));

        // Comment 4: Returns the value of the first argument raised to the power of the second argument.
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));

        // Comment 5: Returns the value of the first argument raised to the power of the second argument.
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));

        // Comment 6: Generates a random double value between 0.0 (inclusive) and 1.0 (exclusive),
        // then multiplies it by the value of 'ourValue'.
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}
