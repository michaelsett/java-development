package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {
    public static <Employee> void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);



                Employee employee = new Employee(id, name, hoursWorked, payRate);


                System.out.printf("ID: %d, Name: %s, Gross pay: $%.2f%n", emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
            }
            bufferedReader.close();

        }
        catch (Exception e) {
            System.out.println("Something went wrong!: ");
        }
    }
}
