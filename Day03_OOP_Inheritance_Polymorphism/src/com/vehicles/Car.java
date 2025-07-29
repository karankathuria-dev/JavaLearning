package com.vehicles;

public class Car extends Vehicle { // 'extends Vehicle' means Car inherits from Vehicle
    private int numberOfDoors; // Car-specific property

    // Constructor for Car
    public Car(String brand, int year, String color, int numberOfDoors) {
        super(brand, year, color); // Call the constructor of the parent (Vehicle) class
        this.numberOfDoors = numberOfDoors;
    }

    // Getter for Car-specific property
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Car-specific method
    public void honk() {
        System.out.println("Car honks: Beep beep!");
    }
    // In Car class (add this method)
    @Override // This annotation is good practice to indicate overriding
    public void startEngine() {
        System.out.println("Car engine starts quietly.");
    }
}