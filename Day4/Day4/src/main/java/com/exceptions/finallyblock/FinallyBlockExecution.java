package com.exceptions.finallyblock;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            //Enter first number
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            //Enter second number
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            double div = division(num1,num2);

            System.out.println(div);
        } catch(ArithmeticException e){
            System.out.println("Division by zero is invalid.");
        } finally {
                System.out.println("Operation Completed");

        }

    }
    //Method to divide number1 by number2
    public static double division(int num1, int num2){
        return num1/num2;
    }
}
