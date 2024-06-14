package com.abstractClass;

public abstract class AbsVehicle implements Vehicle{
 
	public abstract void displayrentalDetails();
	
	public void displayShopInfo() {
		System.out.println("Welcome to BBT..!");
	}
	
	public abstract void vehicleName();
}
