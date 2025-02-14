package com.exceptions.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50}; // Sample array

        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        try {
            // Outer try block for ArrayIndexOutOfBoundsException
            int element = arr[index]; // May cause an exception

            try {
                // Inner try block for ArithmeticException
                int result = element / divisor; // May cause an exception
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        scanner.close();
    }
}
