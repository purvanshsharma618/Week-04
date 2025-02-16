package com.reflections.basiclevel;

import java.lang.reflect.*;

class Student {
    private String name;

    public Student() {
        this.name = "Raj Sharma";
    }

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        // Get Class object using Student.class instead of Class.forName()
        Class<?> studentClass = Student.class;

        // Create an instance dynamically using default constructor
        Object studentInstance = studentClass.getDeclaredConstructor().newInstance();

        // Invoke method
        Method displayMethod = studentClass.getMethod("display");
        displayMethod.invoke(studentInstance);
    }
}
