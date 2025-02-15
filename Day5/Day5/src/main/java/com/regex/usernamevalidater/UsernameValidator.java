package com.regex.usernamevalidater;

import java.util.Scanner;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        // Regex pattern: Starts with a letter, followed by letters, digits, or underscores
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{2,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username!");
        }

        scanner.close();
    }
}

