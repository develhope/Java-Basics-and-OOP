package javabasics._5;

public class Solution {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Create an int variable and initialize it with 5 (you can use any value)
        int number = 5;

        // Add 1 to the value and then print it
        number = number + 1;
        System.out.println("After adding 1: " + number);

        // Minus 1 from the same variable and print it
        number = number - 1;
        System.out.println("After subtracting 1: " + number);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Create an int variable and initialize it with 5 (you can use any value)
        double number1 = 5.5;

        // Multiplying by 2 and then print it
        number1 = number1 * 2;
        System.out.println("After multiplying by 2: " + number1);

        // Create another double variable and initialize it with the previous variable divided by 2
        double number2 = number1/2;

        // Print it
        System.out.println("After divided by 2: " + number2);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Create a double variable called celsius and initialize it with the temperature in Celsius
        double celsius = 10; // You can use any value for the temperature in Celsius

        // Create a new variable called fahrenheit and calculate its value
        double fahrenheit = (celsius*1.8) + 32;

        // Print out celsius and fahrenheit with 2 print statements
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Create an int variable called age and initialize it with the starting value of 10
        int age = 10;

        // Use the '++' operator to increase the value of age to 15
        // You can use the '++' operator as a shorthand for age = age + 1
        // Incrementing five times to reach the value 15
        age++; // 11
        age++; // 12
        age++; // 13
        age++; // 14
        age++; // 15

        // Print the final value of age
        System.out.println("Final age value: " + age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Using the '-=' operator to change the value of age from 50 to 0 in one line
        int age = 50;
        age -= 50;

        // Print the value of age
        System.out.println("Value of age after using '-=' operator: " + age);

        // Creating another int called secondAge and setting it to 50
        int secondAge = 50;

        // Changing the value of secondAge from 50 to 0 in three lines of code
        secondAge -= 20;
        secondAge -= 20;
        secondAge -= 10;

        // Print the value of secondAge
        System.out.println("Value of secondAge after using '-=' operator: " + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 5;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }
}
