package com.junit.userregistration;

public class UserRegistration {

    // Method to register a user
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long.");
        }
        System.out.println("User registered successfully: " + username);
    }

    // Main method to test registration manually
    public static void main(String[] args) {
        try {
            registerUser("JohnDoe", "johndoe@example.com", "securePass");
            registerUser("", "invalidemail.com", "123");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
