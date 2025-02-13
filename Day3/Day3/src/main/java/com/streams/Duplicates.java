package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);

        List <Integer> duplicates = findDuplicates(list);

        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(List<Integer> list) {
        List <Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer currentItem = list.get(i);
            if (!duplicates.contains(currentItem)) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (currentItem.equals(list.get(j))) {
                        duplicates.add(currentItem);

                    }
                }
            }

        }
        return duplicates;
    }
}