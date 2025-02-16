package com.reflections.basiclevel;

import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class PrivateFieldAccess {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            // Get the Field object for 'age'
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Bypass access control

            // Retrieve and print original value
            System.out.println("Original Age: " + ageField.get(person));

            // Modify the private field value
            ageField.set(person, 30);
            System.out.println("Modified Age: " + ageField.get(person));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
