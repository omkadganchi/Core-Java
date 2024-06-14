package com.amazon.electronics.tablets;

import com.amazon.electronics.mobiles.Samsung;

public class TestTablet {
	public static void main(String[] args) {
		OnePlus t1 = new OnePlus();
		System.out.println("The Name of Model is: "+t1.NameOfModel);
		System.out.println("The Price of Model is: "+t1.price);
		System.out.println();
		
		Samsung o2 = new Samsung();
		System.out.println("The price of Samsung S23 is: "+o2.price);
		
	}
}