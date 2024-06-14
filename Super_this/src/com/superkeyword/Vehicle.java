package com.superkeyword;

public class Vehicle {
	private String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
    }
}
