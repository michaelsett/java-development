package com.pluralsight;

public class Hotel {
    private String name;
    private int numbersOfSuites;
    private int numbersOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numbersOfSuites, int numbersOfRooms) {
        this.name = name;
        this.numbersOfSuites = numbersOfSuites;
        this.numbersOfRooms = numbersOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(int bookedSuites, int bookedBasicRooms) {
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;

    }

    public boolean bookRoom(int numbersOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= numbersOfRooms) {
                bookedSuites += numbersOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (getAvailableBasicRooms() >= numbersOfRooms) {
                bookedBasicRooms += numbersOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }
    public int getAvailableSuites() {
        return numbersOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms(){
        return numbersOfRooms - bookedBasicRooms;
    }
    public int getNumberOfRooms() {
        return numbersOfRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfSuites() {
        return numbersOfSuites;
    }

    public int getNumbersOfRooms() {
        return numbersOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}


