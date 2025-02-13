package com.streams.bytearraystream;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String inputImage = "C:\\Users\\purva\\OneDrive\\Desktop\\Week 04\\Day3\\Day3\\src\\main\\java\\com\\streams\\bytearraystream\\inputimage.jpeg";
        String outputImage = "C:\\Users\\purva\\OneDrive\\Desktop\\Week 04\\Day3\\Day3\\src\\main\\java\\com\\streams\\bytearraystream\\outputimage.jpeg";

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImage);
            System.out.println("Image successfully converted to byte array. Size: " + imageBytes.length + " bytes");

            // Write byte array back to an image file
            writeByteArrayToImage(imageBytes, outputImage);
            System.out.println("Image successfully written back to file: " + outputImage);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Convert an image file to a byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Write byte array back to an image file
    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            fos.write(imageBytes);
        }
    }
}
/*
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class HashMapIterationExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("Diana", 28);

        // 1. Using for-each loop with entrySet()
        System.out.println("Using for-each loop with entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 2. Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 3. Using forEach method (Java 8 and above)
        System.out.println("\nUsing forEach method:");
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // 4. Using keySet() to iterate over keys
        System.out.println("\nUsing keySet():");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 5. Using values() to iterate over values
        System.out.println("\nUsing values():");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}*/