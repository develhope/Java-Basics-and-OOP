package javabasics._8;

public class Solution {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";

        // Convert the string to an integer using Integer.parseInt()
        int ourNumberInt = Integer.parseInt(ourNumberStr);

        // Increase its value by 2
        ourNumberInt += 2;

        // Convert it back to a string using Integer.toString() and print it
        String result = Integer.toString(ourNumberInt);
        System.out.println(result);
    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar).toUpperCase(); // <--- Change this line
        // Notice below what happens, the `charAt()` method
        System.out.println(ourCharString.charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // Try changing this line to a different index (0 to 10) to see different characters
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "5"; // Corrected to a valid integer string
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = "true"; // Corrected to a valid boolean string
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "5.5"; // Corrected to a valid double string
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5";

        // 4.1: Convert 'startStr' to an int
        int numberInt = Integer.parseInt(startStr);

        // 4.2: Multiply the number by 2
        int multipliedNumber = numberInt * 2;

        // 4.3: Concatenate the number with itself as strings
        String concatenatedNumberStr = Integer.toString(multipliedNumber) + Integer.toString(multipliedNumber);

        // 4.4: Convert the concatenated string back to a double and divide by 3.5
        double dividedNumber = Double.parseDouble(concatenatedNumberStr) / 3.5;

        // 4.5: Use Math.floor to remove decimal places
        double finalResult = Math.floor(dividedNumber);

        System.out.println(finalResult);
    }
}
