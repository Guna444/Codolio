package com.arrays;

import java.util.Scanner;

public class TaxPayer {
    private int panNumber;
    private String name;
    private float income;
    private float tax;

    // Method to input the data
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PAN Number: ");
        panNumber = sc.nextInt();

        System.out.print("Enter Name: ");
        sc.nextLine(); // Consume the newline
        name = sc.nextLine();

        System.out.print("Enter Income: ");
        income = sc.nextFloat();
    }

    // Method to calculate tax based on income
    public void calculateTax() {
        if (income <= 100000) {
            tax = 0;
        } else if (income > 100000 && income <= 2000000) {
            tax = income * 0.10f; // 10%
        } else if (income > 2000000 && income <= 5000000) {
            tax = income * 0.20f; // 20%
        } else if (income > 5000000) {
            tax = income * 0.30f; // 30%
        }
    }

    // Method to display the data
    public void display() {
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Name: " + name);
        System.out.println("Income: " + income);
        System.out.println("Calculated Tax: " + tax);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        TaxPayer t1 = new TaxPayer();

        t1.input(); // Input data
        t1.calculateTax(); // Calculate tax
        t1.display(); // Display details
    }
}
