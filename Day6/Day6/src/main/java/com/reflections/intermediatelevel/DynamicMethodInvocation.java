package com.reflections.intermediatelevel;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Get user input for method name
        System.out.println("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();

        // Get user input for parameters
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        scanner.close();

        // Get Class object
        Class<?> mathClass = MathOperations.class;

        // Create an instance
        Object instance = mathClass.getDeclaredConstructor().newInstance();

        // Get method dynamically
        Method method = mathClass.getMethod(methodName, int.class, int.class);

        // Invoke method
        int result = (int) method.invoke(instance, num1, num2);

        // Print result
        System.out.println("Result: " + result);
    }
}
