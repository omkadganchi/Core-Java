package com.hybrid;

public class Test_Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TajSuites TajGroup = new TajSuites();
Vivanta VivantaHotels = new Vivanta();

TajGroup.welcomeGuests();
System.out.println();
TajGroup.suiteAmenities();
System.out.println();
TajGroup.policies();
System.out.println();
TajGroup.brands();
System.out.println();
TajGroup.roomCategory();
System.out.println();
System.out.println();


VivantaHotels.welcomeGuests();
System.out.println();
VivantaHotels.policies();
System.out.println();
VivantaHotels.brands();
System.out.println();
VivantaHotels.roomCategory();

	}

}
