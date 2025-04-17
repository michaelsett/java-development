package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = scanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        System.out.println("Please enter the date you will be attending (MM/dd/yyyy");
        String dateStr = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        System.out.print("How many tickets would you need? ");
        int numTickets = scanner.nextInt();

        String ticketString = numTickets == 1 ? " ticket" : " tickets";
        String confirmationMessage = numTickets + ticketString + " reserved for " + date + " under " + lastName + ", " + firstName;
        System.out.println(confirmationMessage);
;    }
}
