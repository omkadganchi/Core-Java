package com.march26;

public class students extends Department {

	private String studName;
	private float marks;

	public students(String studName, float marks, String deptName, int buildingNo, String CollegeName) {
		super(deptName, buildingNo, CollegeName);
		this.studName = studName;
		this.marks = marks;
	}

	public void displayStudInfo() {
		System.out.println("Student Name: " + this.studName);
		System.out.println("Total Marks:" + this.marks);
		super.displayDeptInfo();
	}
}
