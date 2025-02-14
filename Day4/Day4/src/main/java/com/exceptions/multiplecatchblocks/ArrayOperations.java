package com.exceptions.multiplecatchblocks;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept array size
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            // Accept array elements
            System.out.println("Enter array elements: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Accept index
            System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();

            // Retrieve value
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}

