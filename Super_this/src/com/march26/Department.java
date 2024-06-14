package com.march26;

public class Department {
	 String deptName;
	 int buildingNo;
	 String CollegeName;

Department(String deptName, int buildingNo){
	this.deptName = deptName;
	this.buildingNo = buildingNo;
}
	
	Department(String deptName, int buildingNo, String CollegeName){
		this(deptName, buildingNo);
		this.CollegeName = CollegeName;
	}

	public void displayDeptInfo() {
		System.out.println("Department: " + this.deptName);
		System.out.println("Building No:" + this.buildingNo);
		System.out.println("College Name: " + this.CollegeName);
	}
}
