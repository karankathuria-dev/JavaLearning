package com.vehicles;

public class Vehicle {
    // Properties common to all vehicles
    private String brand;
    private int year;
    private String color;

    // Constructor for Vehicle
    public Vehicle(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Method common to all vehicles
    public void accelerate() {
        System.out.println("Vehicle is accelerating.");
    }

    public void brake() {
        System.out.println("Vehicle is braking.");
    }

    // Optional: Method to display basic info (will be used by child classes)
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Color: " + color);
    }
    // In Vehicle class
    public void startEngine() {
        System.out.println("Vehicle engine starting.");
    }
}