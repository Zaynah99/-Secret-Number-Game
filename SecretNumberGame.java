package org.example;
import java.util.Scanner;
public class SecretNumberGame {
    public static void main(String[] args) {
        System.out.println("Pick a number from 1 - 10");
        Scanner reader = new Scanner(System.in);
        int yourNumber = reader.nextInt();

        if (yourNumber >= (8)) {
            System.out.println("Your number is too high!");
        } else if (yourNumber <= (6)) {
            System.out.println("Your number is too low!");
        } else if (yourNumber == (7)) {
            System.out.println("Yay! You got it right!");

        }

    }
}


