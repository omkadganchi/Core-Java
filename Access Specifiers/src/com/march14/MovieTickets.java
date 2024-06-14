package com.march14;

public class MovieTickets {
	private String movieName;
	private int ticketPrice;
	private static int totalTicketsSold = 0;

	MovieTickets(String mn, int tp) {
		movieName = mn;
		ticketPrice = tp;
		totalTicketsSold++;
	}
	
	public static void displaytotalTicketsSold() {
		System.out.println("Total Tickets Sold: "+totalTicketsSold);
	}
	
	public void displayInfo() {
		System.out.println("Movie: "+movieName);
		System.out.println("Ticket Price: "+ticketPrice);
	}
}
