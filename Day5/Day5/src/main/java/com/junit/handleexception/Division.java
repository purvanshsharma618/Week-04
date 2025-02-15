package com.junit.handleexception;

import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number a: ");
        int a = sc.nextInt();

        System.out.print("Enter second number b: ");
        int b = sc.nextInt();

        int result = divide(a,b);
        System.out.println("a divided by b equals: " + result);

    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}