package com.junit.performancetesting;
public class PerformanceTesting {

    // Method that simulates a long-running task
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a delay of 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }

    // Main method to run longRunningTask manually
    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        String result = longRunningTask();
        System.out.println("Result: " + result);
    }
}
