package com.march18;

public class Person {
	private String name;
	private int age;
	private long phone;
    private static String nationality = "Indian";

    Person(){
	
    }

	Person(String n, int a, long p) {
		name = n;
		age = a;
		phone = p;
	}
	
	public String details(String name) {
		return name + " " + nationality;
	}
	
	public String details(int age, long phone) {
		return "Age: " +age + "\n" + "Phone: " + phone;
	}
	
	public String details(String name, long phone, int age) {
		return "Name: "+ name + "\n" + "Age: " + age + "\n" + "Phone: " + phone +"\n"+ "Nationality: " + nationality;
	}
	
	public void details() {
		
	}
}