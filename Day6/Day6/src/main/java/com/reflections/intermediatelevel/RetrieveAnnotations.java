package com.reflections.intermediatelevel;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Apply the annotation
@Author(name = "Purvansh Sharma")
class Book {
    void display() {
        System.out.println("This is a Book class.");
    }
}

public class RetrieveAnnotations {
    public static void main(String[] args) {
        // Get Class object
        Class<?> bookClass = Book.class;

        // Check if annotation is present
        if (bookClass.isAnnotationPresent(Author.class)) {
            // Retrieve annotation
            Author authorAnnotation = bookClass.getAnnotation(Author.class);
            System.out.println("Author: " + authorAnnotation.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}
