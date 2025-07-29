package com.vehicles;

public class Motorcycle extends Vehicle { // 'extends Vehicle' means Motorcycle inherits from Vehicle
    private boolean hasSideCar; // Motorcycle-specific property

    // Constructor for Motorcycle
    public Motorcycle(String brand, int year, String color, boolean hasSideCar) {
        super(brand, year, color); // Call the constructor of the parent (Vehicle) class
        this.hasSideCar = hasSideCar;
    }

    // Getter for Motorcycle-specific property
    public boolean hasSideCar() {
        return hasSideCar;
    }

    // Motorcycle-specific method
    public void wheelie() {
        System.out.println("Motorcycle performs a wheelie!");
    }
    // In Motorcycle class (add this method)
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine roars to life!");
    }
}