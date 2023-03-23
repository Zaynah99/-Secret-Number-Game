package org.example;
import java.util.Scanner;
public class WhatShouldIWear {
    public static void main(String[] args) {
        System.out.println("What is the temperature? ");
        Scanner reader = new Scanner (System.in);
        int temperature = reader.nextInt();

        System.out.println("What is the weather like today?");
        Scanner reader2 = new Scanner (System.in);
        String weather = reader2.nextLine();

        if (temperature <=8 || weather.equals("snowing")){
            System.out.println("Wear a big coat!");
        }else

    }
}



//Create a program that makes suggestions on what to wear based on information it gathers about the weather. The purpose of this exercise is to give you some practise with logical and conditional operators.
//
//Allow your program to collect some descriptive user input about the weather ("rainy", "sunny", "cloudy", "snow", etc) and the average temperature for the day (8, 18, 28, etc).
//
//Let your program output clothing suggestions depending on a combination of weather conditions and temperature.
//
//e.g. if it is both "rainy" and less than 12 degrees, output "wear a waterproof winter coat"