package com.vehicles; // Make sure this matches your package name

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Inheritance ---");
        // Create a Car object
        Car myCar = new Car("Honda", 2022, "Blue", 4);
        myCar.displayInfo(); // Inherited from Vehicle
        myCar.accelerate();  // Inherited from Vehicle
        myCar.honk();        // Car-specific method

        System.out.println("\n--- Demonstrating Inheritance ---");
        // Create a Motorcycle object
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2023, "Black", false);
        myMotorcycle.displayInfo(); // Inherited from Vehicle
        myMotorcycle.brake();       // Inherited from Vehicle
        myMotorcycle.wheelie();     // Motorcycle-specific method

        System.out.println("\n--- Demonstrating Polymorphism (Method Overriding) ---");
        // Calling startEngine() on specific objects
        myCar.startEngine();
        myMotorcycle.startEngine();

        System.out.println("\n--- Demonstrating Polymorphism (Using Superclass Reference) ---");
        // You can treat a Car or Motorcycle as a Vehicle
        Vehicle genericVehicle1 = new Car("Ford", 2020, "Red", 2);
        Vehicle genericVehicle2 = new Motorcycle("Kawasaki", 2021, "Green", true);

        genericVehicle1.startEngine(); // Calls Car's overridden method
        genericVehicle2.startEngine(); // Calls Motorcycle's overridden method

        // Example of a list holding different types of Vehicles (Polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", 2024, "White", 4));
        vehicles.add(new Motorcycle("Ducati", 2025, "Red", false));
        vehicles.add(new Vehicle("Bicycle", 2023, "Silver")); // Original Vehicle object

        System.out.println("\n--- Iterating through a List of Vehicles (Polymorphism in action) ---");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.startEngine(); // Each object calls its *own* overridden startEngine()
            System.out.println("---");
        }
    }
}