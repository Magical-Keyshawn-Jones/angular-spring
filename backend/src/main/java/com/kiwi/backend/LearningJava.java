package com.kiwi.backend;

import java.util.HashMap;
import java.util.Scanner;

public class LearningJava {
    // Static variable only work with static classes
    // This is global scope
    // Can be redefined inside of a class different class
    static int age = 16;

    //Main Data Types

    // Integer
    int number = 100;

    // Decimal
    double decima1 = 1.3928;

    // Boolean
    boolean truthy = true;

    // Characters
    String wordie = "maybe";

    // Operators
    // Same math operators as every other language

    
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        // System.out.println(number1 != number2);
        // System.out.println(number1 == number2);
        // System.out.println(number1 < number2);
        // System.out.println(number1 > number2);
        // System.out.println(number1 >= number2);
        // System.out.println(number1 <= number2);
        
        // User Input
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("What's your favorite color?");
        // String color = scanner.nextLine();
        // System.out.println(color + " is an awesome color!");

        // scanner.close();

        // Conditional Statements
        // Java has "If" and "Switch" statements

        // Arrays
        String stringArray [] = {"yes", "no", "maybe", "so"};
        int intArray [] = { 1, 2, 3, 4, 5};

        // Loops
        // Java has all of the javaScript loops

        // HashMaps
        // HashMaps are objects
        HashMap<String, Integer> reportCard = new HashMap<String, Integer>();

        reportCard.put("Math",  23);
        reportCard.put("English", 100);
        reportCard.put("History", 0);

    }
}
