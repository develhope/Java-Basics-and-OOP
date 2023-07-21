package javabasics._7;

public class Solution {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     *
     *    print out your string in upper case, and in lower case
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        // Create a String variable to hold some text
        String myText = "Hello, World!"; // You can change this text to whatever you like

        // Print the text in upper case
        System.out.println("Uppercase: " + myText.toUpperCase());

        // Print the text in lower case
        System.out.println("Lowercase: " + myText.toLowerCase());

    }

    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Change these
        String firstName = "John"; // Replace with your first name
        String middleName = "William"; // Replace with your middle name or any middle name
        String lastName = "Smith"; // Replace with your last name

        // Convert first name to uppercase
        String firstNameUpper = firstName.toUpperCase();

        // Convert last name to uppercase
        String lastNameUpper = lastName.toUpperCase();

        // Convert middle name to lowercase
        String middleNameLower = middleName.toLowerCase();

        System.out.println(firstNameUpper + " " + middleNameLower + " " + lastNameUpper); // <--- Edit this line
    }


    /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     *
     * Use the '+' operator
     *
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     *
     * +
     *
     * Experiment with these different types, how do an int and a double behave when added?
     *
     * What about a boolean and an int?
     *
     * "" + 1.5
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // Example 1: Adding an int and a double
        int intValue = 10;
        double doubleValue = 3.14;
        String textFrom2Primitives1 = intValue + doubleValue + ""; // Convert the result to a string
        System.out.println("Adding an int and a double: " + textFrom2Primitives1);

        // Example 2: Adding a boolean and an int
        boolean boolValue = true;
        int anotherIntValue = 5;
        String textFrom2Primitives2 = boolValue + " " + anotherIntValue; // Convert the result to a string
        System.out.println("Adding a boolean and an int: " + textFrom2Primitives2);

        // Example 3: Adding a character and a double
        char charValue = 'A';
        double anotherDoubleValue = 2.5;
        String textFrom2Primitives3 = charValue + " " + anotherDoubleValue; // Convert the result to a string
        System.out.println("Adding a character and a double: " + textFrom2Primitives3);
    }


    /**
     * 4: Without editing the Strings below make the print statement print
     *
     *    1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     *
     *    You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        // Remove leading and trailing spaces from the strings and print them with the correct spacing
        System.out.println(earlyNumbers.trim() + " " + middleNumbers.trim() + " " + endNumbers.trim());
    }

}
