package com.junit.evennumber;

import java.sql.SQLOutput;
import java.util.*;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Is number even? " + isEven(number));
    }

    public static boolean isEven(int number){
        if(number%2 == 0) return true;
        return false;
    }
}
