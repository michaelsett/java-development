package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        /*...*/
       Scanner input = new Scanner(System.in);

        // Your Name
       System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Hours worked
        System.out.print("Hours worked: ");
        double hoursWorked = input.nextDouble();

        // Pay rates
        System.out.print("Pay rates: ");
        double payRate = input.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println("Name: " + name);
        System.out.printf("Gross Pay: $%.2f/n", grossPay);










    }
}
