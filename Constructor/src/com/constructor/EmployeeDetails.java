package com.constructor;

public class EmployeeDetails {
	String name;
	int age;
	String department;
	String position;
	int salary;
	
	EmployeeDetails(String n, int a, String d, String p, int s){
		name = n;
		age = a;
		department = d;
		position = p;
		salary = s;
	}
	
	public void eM1() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + department);
		System.out.println("Position: " + position);
		System.out.println("Salary : "+ salary);
	}
	
	public void eM2(String name, int age, String department, String position, int salary) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department: " + department);
		System.out.println("Position: " + position);
		System.out.println("Salary : "+ salary);
	}
		
		public void eM3(String name, int age, int salary) {
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Salary : "+ salary);
	}
		
		public void eM4(int salary, int age, String name) {
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Salary : "+ salary);
	}
}