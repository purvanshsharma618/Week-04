package com.junit.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Method to convert yyyy-MM-dd to dd-MM-yyyy format
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd.");
        }
    }

    // Main method to test date formatting manually
    public static void main(String[] args) {
        try {
            System.out.println(formatDate("2025-02-15")); // Expected: 15-02-2025
            System.out.println(formatDate("invalid-date")); // Expected: Exception
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
