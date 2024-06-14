package com.march15;

public class TestEncapsulation {
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		// setting values of the variables
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
		// Displaying values of the variables
		System.out.println("name: " + obj.getName());
		System.out.println(" age: " + obj.getAge());
		System.out.println("roll: " + obj.getRoll());
		// Direct access of Roll is not possible
		// due to encapsulation
		// System.out.println("roll: " +
		// obj.Name);
	}
}
