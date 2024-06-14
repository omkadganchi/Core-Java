package com.superkeyword;

public class Car extends Vehicle{
	 private String model;

	    // Constructor
	    public Car(String brand, String model) {
	        super(brand); // Calling base class constructor using 'super'
	        this.model = model;
	    }

	    // Method to display car details
	    public void displayCarDetails() {
	        super.displayDetails(); // Calling base class method using 'super'
	        System.out.println("Model: " + model);
	    }
}
