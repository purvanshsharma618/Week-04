package com.exceptions.checkedexception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {

        //If we want to read the file, give the valid file path.
        // But if we want to show IOException(file not found),
        // then give the invalid file path.
        String fileName = "C:\\Users\\purva\\OneDrive\\Desktop\\Week 04\\Day4\\Day4\\src\\main\\java\\com\\exceptions\\checkedexception\\data.txt";

        //try block -> where we write the code that may give exception
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }

        //Catch block -> where we catch the exception catched in try block
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

