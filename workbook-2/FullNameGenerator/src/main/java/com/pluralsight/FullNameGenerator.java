package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;



public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()){
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full Name: " + fullName);
        scanner.close();



    }
}
