package com.pluralsight;

public class Room {

    private int numbersOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numbersOfBeds, double price ) {
        this.numbersOfBeds = numbersOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable(){
        return isOccupied && isDirty;


    }
}
