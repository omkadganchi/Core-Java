package com.march14;

public class Test_MovieTickets {

	public static void main(String[] args) {

		MovieTickets m1 = new MovieTickets("Badrinath ki Dulhaniya", 180);
		MovieTickets m2 = new MovieTickets("Drishyam 2", 150);

		MovieTickets.displaytotalTicketsSold();
		System.out.println();
		m1.displayInfo();
		System.out.println();
		m2.displayInfo();
	}
}
