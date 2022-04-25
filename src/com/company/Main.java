package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "A java course from scratch is the best way to learn Java";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(text);


        // checking if the word "Java" appears in the text- if so, it prints the message "Found Java" in the console
        if (matcher.find()) {
            System.out.println("Found Java");
        }
        matcher.reset();

        // checking if the text starts with the word "Java" - if so, it prints the message "Starts with Java" in the console
        if (matcher.start() == 0) {
             System.out.println("Starts with Java");
        }
        matcher.reset();

        // checking if the text ends with the word "Java" - if so, it prints the message "Ends with Java" in the console
        int lastLetter = 0;
        while (matcher.find()){
            lastLetter = matcher.end();
        }
        if (lastLetter == text.length()){
            System.out.println("Ends with Java");
        }
        matcher.reset();

        // checking if the text equals the word "Java" - if so, prints the message "Equals Java" in the console

        // prints the index of the first occurrence of the word "Java" in the text in the console
        if (matcher.find()) {
            System.out.println("The index of the first occurrence of Java is: " + matcher.start());
        }


    }
}

// Write a program that reads the text entered by the user, and then:
//checks if the text equals the word "Java" - if so, prints the message "Equals Java" in the console,

//and for the text "A java course from scratch is the best way to learn Java", the program should write in the console:
//Found Java
//Ends with Java
//52
//Get the data from the user in the console using the Scanner class.