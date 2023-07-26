package javabasics._17;
import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000L;

        // Convert questionableFundsEuro to int to avoid data loss
        int convertedFundsEuro = (int) questionableFundsEuro;

        // Add the questionable funds to the bank balance
        myBankBalanceEuro += convertedFundsEuro;

        System.out.println("Updated bank balance: " + myBankBalanceEuro + " Euros");
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age - byte (ages typically fall within the range of -127 to 127)
     *    2b: The age of a baby in months - byte (same reason as 2a)
     *    2c: Money in a hedgefund in euros - long (large values)
     *    2d: Price of a good in euros on amazon.com - double (may have decimal places)
     *    2e: The exact weight of an apple measured by scientific equipment - double or float (depending on precision needed)
     *    2f: The number of kilometers from any 2 places in the world - int or long (depending on the range needed)
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");

        /// Get the current date
        LocalDate myDate = LocalDate.now();

        // Print out the current date
        System.out.println("Current date: " + myDate);

        // Get day of the month
        int dayOfMonth = myDate.getDayOfMonth();
        System.out.println("Day of the month: " + dayOfMonth);

        // Get day of the week
        String dayOfWeek = myDate.getDayOfWeek().toString();
        System.out.println("Day of the week: " + dayOfWeek);

        // Get day of the year
        int dayOfYear = myDate.getDayOfYear();
        System.out.println("Day of the year: " + dayOfYear);

        // Get the month
        String month = myDate.getMonth().toString();
        System.out.println("Month: " + month);

        // Get the month value (1-12)
        int monthValue = myDate.getMonthValue();
        System.out.println("Month value: " + monthValue);

        // Compare with other dates
        LocalDate otherDate = LocalDate.of(2023, 12, 31);
        if (myDate.isBefore(otherDate)) {
            System.out.println("The current date is before December 31, 2023.");
        } else if (myDate.isAfter(otherDate)) {
            System.out.println("The current date is after December 31, 2023.");
        } else {
            System.out.println("The current date is equal to December 31, 2023.");
        }
    }
}


