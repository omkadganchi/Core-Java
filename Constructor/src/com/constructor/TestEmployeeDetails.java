package com.constructor;

public class TestEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1 = new EmployeeDetails("Amit", 25, "IT", "Software Tester",35000);
		e1.eM1();
        System.out.println();
        e1.eM2("Om", 22, "CSE", "Software Developer", 45000);
        System.out.println();
        e1.eM3("Yash", 24,41500);
        System.out.println();
        e1.eM4(45000,22, "Harsh");
       

	}

}
