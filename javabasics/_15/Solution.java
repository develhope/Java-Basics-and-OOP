package javabasics._15;

public class Solution {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        // Exercise 1a
        while (currentInvestmentValueEuros < 100_000) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
            yearsPast++;
        }

        // Output after reaching €100,000
        System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast + " years" +
                ", interest this year €" + interestGainedThisYearEuros);
        System.out.println("\nReached €100,000 after " + yearsPast + " years\n");

        // Reset values for Exercise 1b
        currentInvestmentValueEuros = 10_000;
        yearsPast = 0;
        interestGainedThisYearEuros = 0;

        // Exercise 1b
        while (currentInvestmentValueEuros < 15_000 || yearsPast < 5) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
            yearsPast++;
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        while (remainingPoundsToSell > 0) {
            daysToSell++;
            if (poundToEuroExchangeRate > 1.15) {
                remainingPoundsToSell -= maxPoundsToSellPerDay;
            }
            poundToEuroExchangeRate = 1 + (Math.random() * 0.2); // Recalculate exchange rate for the next day
        }

        System.out.println("It took " + daysToSell + " days to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: We should use a do-while loop to handle the user's actions in the ATM.
     * This is because we want to ensure that the user's actions are executed at least once before checking the exit condition.
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2:We should use a for-each loop to send emails to the list of 1000 users.
     * The for-each loop simplifies iterating through the elements of the list without worrying about the index.
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3:We should use a fori loop to print out the first 80 customer names from our bank database.
     * The fori loop allows us to control the iteration with a specific index and limit the loop to the first 80 customers.
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4:We should use a while loop to read the file 100 lines at a time without loading the full file into our program.
     * The while loop can be used in combination with file reading operations to read and process the file in chunks of 100 lines until the end of the file is reached.
     */
}
