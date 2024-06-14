package com.hierarchical;

public class TajMahalTower extends TajHotels{
	
	@Override
	void welcomeGuests() {
		System.out.println("Welcome to Taj Mahal Tower!");
	}

	void roomCategory() {
		System.out.println("Room Category:\n" + "Apollo Suite Room Sea View," + " Deluxe Room Sea View,"
				+ " Superior Room City View");
	}
}
