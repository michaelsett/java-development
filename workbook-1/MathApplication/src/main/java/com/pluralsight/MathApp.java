package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        int bobSalary = 60000;
         int garySalary = 70000;

       int highestSalary = Math.max(bobSalary, garySalary);
         System.out.println("The highest salary is " + highestSalary);
        //Question 2

       int carPrice;
        carPrice = 45000;

        int truckPrice;
        truckPrice = 60000;

      int smallestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lower price is " + smallestPrice);
        //Question 3

        double radius = 7.25;

       double area= Math.PI * Math.pow(radius,2);

     System.out.println("The are of the cricle is: " + area);
        //Question 4

        double num = 5.0;
   double squareRoot = Math.sqrt(num);
               System.out.println("The square root of " + num + " is " + squareRoot);
        // Question 5

        // Point A
        int x1 = 5;
        int y1 = 0;

        // Point B
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distances between the points is " + distance);
        // Question 6
        double number = -3.8;

        double absoluteValue = Math.abs(number);

        System.out.println("The absolute value is " + absoluteValue);
        //Question 7

        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);









    }
}
