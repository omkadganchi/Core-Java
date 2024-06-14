package com.amazon.electronics.laptop;
import com.amazon.electronics.mobiles.Samsung;

public class TestMacbook {
	public static void main(String args[]) {
		Macbook a1 = new Macbook();
		System.out.println("The model name is: " + a1.ModelName);
		System.out.println("The price is: " + a1.price);
		System.out.println();

		Asus a2 = new Asus();
		System.out.println("The model name is: " + a2.ModelName);
		System.out.println("The price is: " + a2.price);
		System.out.println();

		Samsung s1 = new Samsung();
		System.out.println("The price of Samsung S23 ultra is:"+s1.price);
	}

}
