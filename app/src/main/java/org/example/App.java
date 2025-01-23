package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ounce Conversion Program!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many ounces do you have? ");
        int ounces = scanner.nextInt();

        System.out.println("Thank you! Converting ounces to pounds.");

        Converter converter = new Converter();
        System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
        System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".");

        System.out.println("Thank you for using the OCP!");
        scanner.close();
    }
}