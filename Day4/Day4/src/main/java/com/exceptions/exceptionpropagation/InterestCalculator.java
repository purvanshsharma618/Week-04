package com.exceptions.exceptionpropagation;

import java.util.*;

public class InterestCalculator {

    // Method to calculate interest with exception propagation
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            // Take amount as user input
            double amount = sc.nextDouble();

            // Take rate as user input
            double rate = sc.nextDouble();

            // Take year as user input
            int years = sc.nextInt();

            // Calculate and print interest
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        }
        catch (IllegalArgumentException e) {
            // Handle invalid input exception
            System.out.println(e.getMessage());
        }
    }
}

