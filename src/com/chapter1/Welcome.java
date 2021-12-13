package com.chapter1;

import java.util.Scanner;

/**
 * @author Whalewalker
 * @author Tina
 */

class Welcome {

    public static void main(String[] args) {
        // Method Call
        // methodName();
//        System.out.println("Welcome to java programming");
//        System.out.printf("%s %d %s %d", "My age is ", 25, "Nice one", 5);

//        System.out.printf("Welcome to  Java Programming! Am %d",  35);
//
//        System.out.println("Welcome");
//        System.out.println("to");
//        System.out.println("Java");
//        System.out.println("Programming!");

//        System.out.printf("%s%n%s%n%s", "Welcome to", "Java Programming!", "Java is fun");

//        System.out.println("""
//                Hello
//                                Hw far
//                Where you dey""" );

//        System.out.printf("%s", "Weoeoeo");
//
//        System.out.printf("Hello %s", "Wow");

        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int sum = 0;

        System.out.print("Enter your first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter your second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d", sum);

    }





}
