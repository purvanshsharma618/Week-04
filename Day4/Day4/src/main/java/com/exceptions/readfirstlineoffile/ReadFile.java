
package com.exceptions.readfirstlineoffile;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        // Define the file name to be read
        String fileName = "info.txt";

        // Try-with-resources to automatically close BufferedReader after use
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Read and print the first line of the file
            String firstLine = reader.readLine();

            // Check if the file has content
            if (firstLine != null) {
                System.out.println(firstLine); // Print the first line
            } else {
                System.out.println("File is empty"); // Handle empty file scenario
            }
        } catch (IOException e) {
            // Handle exceptions related to file reading
            System.out.println("Error reading file");
        }
    }
}
