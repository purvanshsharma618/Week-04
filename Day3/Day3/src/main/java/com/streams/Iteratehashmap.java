package com.streams;

import java.util.HashMap;
import java.util.Map;

public class Iteratehashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Raj", 21);
        hashmap.put("Ram", 22);
        hashmap.put("Om", 23);


        for (String key : hashmap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashmap.get(key));
        }

        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        int arr[] = {1, 3, 2, 4, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }


            }
        }
    }
}
