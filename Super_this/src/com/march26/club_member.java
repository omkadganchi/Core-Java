package com.march26;

public class club_member extends member {

	private String membershipNumber;

	public club_member(String name, int age, String membershipNumber) {
		super(name, age);
		this.membershipNumber = membershipNumber;
	}

	public void displayclubMembersDetails() {
		super.displayDetails();
		System.out.println("Membership Number: " + this.membershipNumber);
	}
}