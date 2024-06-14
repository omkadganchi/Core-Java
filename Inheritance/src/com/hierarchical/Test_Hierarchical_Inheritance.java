package com.hierarchical;

public class Test_Hierarchical_Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TajMahalTower tajMahalTower = new TajMahalTower();
	 TajUmaidBhavanPalace tajUmaidBhavan = new TajUmaidBhavanPalace();
     TajCorals tajCorals = new TajCorals();
     
     tajMahalTower.welcomeGuests();   
     tajMahalTower.policies();        
     tajMahalTower.brands();          
     tajMahalTower.roomCategory();  
     System.out.println();

     tajUmaidBhavan.welcomeGuests();        
     tajUmaidBhavan.policies();
     tajUmaidBhavan.brands();
     tajUmaidBhavan.palaceAmenities();
     System.out.println();

     tajCorals.welcomeGuests();   
     tajCorals.resortAmenities();     
     tajCorals.policies();
     tajCorals.brands();
}
}
