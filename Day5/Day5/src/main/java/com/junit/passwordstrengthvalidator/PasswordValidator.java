package com.junit.passwordstrengthvalidator;

public class PasswordValidator {

    // Method to check password strength
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must contain at least one digit.");
        }
        return true; // Password is valid
    }

    // Main method for manual testing
    public static void main(String[] args) {
        try {
            System.out.println(isValidPassword("StrongPass1")); // Expected: true
            System.out.println(isValidPassword("weakpass"));    // Expected: Exception (No uppercase, no digit)
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
