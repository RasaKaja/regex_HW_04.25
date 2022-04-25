package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Welcome to the text scanning app!!"); // welcome message

        Scanner scanner = new Scanner(System.in); //initialise scanner to receive input
        System.out.println("Please enter the text to scan: ");
        String message = scanner.nextLine(); // input from user

        if (message.contains("Java")) { // check if input contains Java
            System.out.println("Found Java");
        }

        if (message.startsWith("Java")){
            System.out.println("Starts with Java"); // check if input starts with Java
        }

        if (message.endsWith("Java")) {
            System.out.println("Ends with Java"); // check if input ends with Java
        }
        if (message.equals("Java")) {
            System.out.println("Equals Java"); // check if input equals Java
        }

        System.out.println(message.indexOf("Java")); // prints the index of the first occurance of Java
    }
}
