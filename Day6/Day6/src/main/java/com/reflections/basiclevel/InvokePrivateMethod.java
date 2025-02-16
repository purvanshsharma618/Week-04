package com.reflections.basiclevel;

import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        // Get the private method
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true); // Make it accessible

        // Invoke the method
        int result = (int) multiplyMethod.invoke(calculator, 5, 3);

        // Print result
        System.out.println("Multiplication Result: " + result);
    }
}
