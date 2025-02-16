package com.reflections.advancedlevel;

import java.lang.reflect.Field;

class Employee {
    private String name = "Raj";
    private int id = 101;
}

public class JsonConverter {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\": ")
                    .append("\"").append(fields[i].get(obj)).append("\"");

            if (i < fields.length - 1) json.append(", ");
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Employee emp = new Employee();
        System.out.println(toJson(emp));
    }
}
