package com.amazon.electronics.mobiles;
import com.amazon.electronics.laptop.*;


public class TestSamsung {
	public static void main(String args[]) {
		Samsung s1 = new Samsung();
		System.out.println("The model name is: " + s1.CName);
		System.out.println("The price is: " + s1.price);
		System.out.println();

		Macbook m1 = new Macbook();
		System.out.println("The model name is: " + m1.ModelName);
		System.out.println("The price is: " + m1.price);
		System.out.println();
	
		Asus a1 = new Asus();
		System.out.println("The price of Asus is: " + m1.price);
	}
}