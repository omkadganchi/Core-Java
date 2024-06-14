package com.abstractClass;

public class MiniCooper extends AbsVehicle {

	private int rentalRate;
	
	
	MiniCooper(int rentalRate){
		this.rentalRate = rentalRate;
	}
	
	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("Renting a Mini Cooper");
	}

	@Override
	public void vehicleName() {
		System.out.println("Vehicle Name: Mini Cooper");
	}
	
	@Override
	public int getRentalRate() {
		// TODO Auto-generated method stub
		return rentalRate;
	}

	@Override
	public void displayrentalDetails() {
		// TODO Auto-generated method stub
		System.out.println("Rental Rate per Day: $"+getRentalRate());
	}

}
