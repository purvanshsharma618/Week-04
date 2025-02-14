package com.exceptions.exceptionpropagationinmethods;

public class ExceptionPropagation{
    static void method1() {
        // This will cause an ArithmeticException (division by zero)
        int result = 10 / 0;
    }

    static void method2() {
        method1(); // Calling method1(), exception propagates from here
    }

    public static void main(String[] args) {
        try {
            method2(); // Calling method2(), exception propagates further
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

