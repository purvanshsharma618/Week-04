package com.exceptions.uncheckedexception;

import java.util.*;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take user input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }

        catch (InputMismatchException e) {
            // Handle non-numeric input
            System.out.println("Error: Please enter valid numeric values.");
        }

        finally {
            // Close the scanner
            scanner.close();
        }
    }
}