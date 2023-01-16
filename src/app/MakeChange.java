package app;

import java.util.Scanner;

public class MakeChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the price of the item
        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        // Prompt the user for the amount tendered
        System.out.print("Enter the amount tendered: ");
        double tendered = scanner.nextDouble();

        // Calculate the change
        double change = Math.round((tendered - price) * 100.0) / 100.0;

        // Check if the customer provided too little money
        if (change < 0) {
            System.err.println("Not enough money paid.");
        } 
        else if (change == 0) {
            System.out.println("Exact amount provided. No change is needed.");
        } 
        else {
            System.out.println("Change: $" + change);
            int num;
            num = (int) (change / 20);
            if (num > 0) {
                System.out.println(num + " 20 dollar bill(s)");
                change = change % 20;
            }
            num = (int) (change / 10);
            if (num > 0) {
                System.out.println(num + " 10 dollar bill(s)");
                change = change % 10;
            }
            num = (int) (change / 5);
            if (num > 0) {
                System.out.println(num + " 5 dollar bill(s)");
                change = change % 5;
            }
            num = (int) (change / 1);
            if (num > 0) {
                System.out.println(num + " one dollar bill(s)");
                change = change % 1;
            }
            num = (int) (change / 0.25);
            if (num > 0) {
                System.out.println(num + " quarter(s)");
                change = change % 0.25;
            }
            num = (int) (change / 0.1);
            if (num > 0) {
                System.out.println(num + " dime(s)");
                change = change % 0.1;
            }
            num = (int) (change / 0.05);
            if (num > 0) {
                System.out.println(num + " nickel(s)");
                change = change % 0.05;
            }
            num = (int) ((change + .005) / 0.01);
            if (num > 0) {
            	System.out.println(num + " pennies");
                change = change % 0.01;
            }
        }
        scanner.close();
    }
}
