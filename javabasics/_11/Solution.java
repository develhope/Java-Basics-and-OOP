package javabasics._11;

public class Solution {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3Bonus();
    }

    /**
     * 1: Finish this switch statement to include:
     *    "cheeseburger" cost: 7.99 and calories 850
     *     "fries" cost: 3.99 and calories 250
     */
    public static void exercise1() {
        System.out.println("Exercise 1 - Fast Food Order:");
        String fastFoodOrder = "hamburger";
        double orderCost = 0;
        int orderCalories = 0;

        switch (fastFoodOrder) {
            case "hamburger":
                orderCalories = 700;
                orderCost = 5.99;
                break;
            case "milkshake":
                orderCalories = 600;
                orderCost = 2.50;
                break;
            case "cheeseburger":
                orderCalories = 850;
                orderCost = 7.99;
                break;
            case "fries":
                orderCalories = 250;
                orderCost = 3.99;
                break;
            default:
                System.out.println("Invalid item selected");
                return; // To stop further processing when an invalid item is selected
        }

        System.out.println("Order receipt:" +
                "\nOrder item=" + fastFoodOrder +
                "\nkCal=" + orderCalories +
                "\ncost=€" + orderCost
        );
    }

    /**
     * 2: Complete a switch statement to achieve the following
     *
     *    If the user enters a prime number between 0-20 (2, 3, 5, 7, 11, 13, 17, 19)
     *
     *    Print "This is the nth largest prime number under 20", i.e.
     *    19 -> "This the largest prime number under 20"
     *    11 -> "This is the 4th largest prime number under 20"
     *
     *    If the number is above 20, or not prime number print: "Invalid entry", use a 'default'
     *    statement for this
     */
    public static void exercise2() {
        System.out.println("\nExercise 2 - Prime numbers:");

        int inputNumber = 17;  // change this to see different output

        // Check if the inputNumber is a prime number between 0 and 20
        boolean isPrime = false;
        if (inputNumber >= 2 && inputNumber <= 19) {
            if (inputNumber == 2 || inputNumber == 3 || inputNumber == 5 || inputNumber == 7 ||
                    inputNumber == 11 || inputNumber == 13 || inputNumber == 17 || inputNumber == 19) {
                isPrime = true;
            }
        }

        // Switch statement to handle the different cases
        switch (inputNumber) {
            case 2:
                System.out.println("This is the 8th largest prime number under 20");
                break;
            case 3:
                System.out.println("This is the 7th largest prime number under 20");
                break;
            case 5:
                System.out.println("This is the 6th largest prime number under 20");
                break;
            case 7:
                System.out.println("This is the 5th largest prime number under 20");
                break;
            case 11:
                System.out.println("This is the 4th largest prime number under 20");
                break;
            case 13:
                System.out.println("This is the 3rd largest prime number under 20");
                break;
            case 17:
                System.out.println("This is the 2nd largest prime number under 20");
                break;
            case 19:
                System.out.println("This is the largest prime number under 20");
                break;
            default:
                if (!isPrime) {
                    System.out.println("Invalid entry");
                }
                break;
        }
    }


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------
     * Complete exercise 2 a switch statement with -> instead of :
     * i.e. case 19 -> System.out.print("Largest prime under 20");
     *
     */
    public static void exercise3Bonus() {
        System.out.println("\nExercise 3 - Prime numbers (Bonus)");

        int inputNumber = 17; // change this to see different output
        boolean isPrime = false;

        if (inputNumber >= 2 && inputNumber <= 19) {
            if (inputNumber == 2 || inputNumber == 3 || inputNumber == 5 || inputNumber == 7 ||
                    inputNumber == 11 || inputNumber == 13 || inputNumber == 17 || inputNumber == 19) {
                isPrime = true;
            }
        }

        // Switch statement using -> instead of :
        switch (inputNumber) {
            case 2 -> System.out.println("This is the 8th largest prime number under 20");
            case 3 -> System.out.println("This is the 7th largest prime number under 20");
            case 5 -> System.out.println("This is the 6th largest prime number under 20");
            case 7 -> System.out.println("This is the 5th largest prime number under 20");
            case 11 -> System.out.println("This is the 4th largest prime number under 20");
            case 13 -> System.out.println("This is the 3rd largest prime number under 20");
            case 17 -> System.out.println("This is the 2nd largest prime number under 20");
            case 19 -> System.out.println("This is the largest prime number under 20");
            default -> {
                if (!isPrime) {
                    System.out.println("Invalid entry");
                }
            }
        }
    }
}
