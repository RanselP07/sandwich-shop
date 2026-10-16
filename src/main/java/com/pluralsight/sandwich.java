package com.pluralsight;

import java.util.Scanner;

public class sandwich {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        double price;

        String sandwichSize = """
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """;

        System.out.println(sandwichSize);
        System.out.print("Please choose a sandwich size: ");
        int size = Integer.parseInt(myScanner.nextLine());

        if (size == 1) {
            price = 5.45;
        } else {
            price = 8.95;
        }


        String userAge = """
                a. Student (17 years old or younger) – receive a 10% discount
                b. Seniors (65 years old or older) – receive a 20% discount
                c. Everyone else won't receive a discount""";

        System.out.println(userAge);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(myScanner.nextLine());

        if (age < 18) {
            double discount = (price * 10) / 100;
            double total = price - discount;

            System.out.printf("Total: %.2f", total);
        } else if (age > 64) {
            double discount = (price * 20) / 100;
            double total = price - discount;

            System.out.printf("Total: %.2f", total);
        } else {
            System.out.println("Total: " + price);
        }


    }

}
