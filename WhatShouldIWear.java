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
        } else if (temperature <=15 && weather.equals ("raining")) {
            System.out.println("Wear a rain jacket");
        } else if (temperature <=20 && weather.equals ("cloudy")){
            System.out.println("Wear a jumper");
        } else if (temperature >= 21 && weather.equals ("sunny")){
            System.out.println("Wear some sunglasses!");
        }

    }
}

