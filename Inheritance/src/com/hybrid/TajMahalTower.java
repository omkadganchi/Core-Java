package com.hybrid;

public class TajMahalTower extends TajHotels{
	
	@Override
	void welcomeGuests() {
		System.out.println("Welcome to Taj Mahal Tower!");
	}

	void roomCategory() {
		System.out.println("Room Category:\n" + "Apollo Suite Room Sea View\n" + "Deluxe Room Sea View\n" + "Superior Room City View");
	}
}
