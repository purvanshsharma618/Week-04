package com.junit.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileProcessor {

    // Method to write content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        Files.write(Path.of(filename), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // Method to read content from a file
    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }

    // Main method to test file writing and reading
    public static void main(String[] args) {
        String filename = "testfile.txt";
        String content = "Hello, this is a test file.";

        try {
            // Writing to file
            writeToFile(filename, content);
            System.out.println("File written successfully.");

            // Reading from file
            String readContent = readFromFile(filename);
            System.out.println("File content: " + readContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
