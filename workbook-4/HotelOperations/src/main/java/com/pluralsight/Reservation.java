package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numbersOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numbersOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numbersOfNights = numbersOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equalsIgnoreCase("king")){
            this.price = 139.000
        }
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumbersOfNights() {
        return numbersOfNights;
    }

    public void setNumbersOfNights(int numbersOfNights) {
        this.numbersOfNights = numbersOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}

