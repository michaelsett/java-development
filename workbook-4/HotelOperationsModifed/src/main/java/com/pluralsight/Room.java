package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
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

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Guest checked in.");
        } else {
            System.out.println("Room not available for check-in.");
        }
    }

    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isDirty = true;
            System.out.println("Guest checked out. Room needs cleaning.");
        } else {
            System.out.println("Room is not currently occupied.");
        }
    }

    public void cleanRoom() {
        if (isDirty && isOccupied) {
            isDirty = false;
            System.out.println("Room has been cleaned.");
        } else if (isOccupied) {
            System.out.println("Cannot clean an occupied room.");
        } else {
            System.out.println("Room is already clean.");

        }
    }
}
