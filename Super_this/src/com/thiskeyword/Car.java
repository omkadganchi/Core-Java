package com.thiskeyword;

public class Car {
	private String brand;
	private String model;
	private int year;

	// Constructor
	public Car(String brand, String model, int year) {
		this.brand = brand; // 'this' refers to the instance variable 'brand'
		this.model = model; // 'this' refers to the instance variable 'model'
		this.year = year; // 'this' refers to the instance variable 'year'
	}

	// Method to display car details
	public void displayDetails() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Year: " + this.year);
	}
}
