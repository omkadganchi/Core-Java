package com.april2;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student("Kabir",22, 88);
		student s2 = new student("Naina",38, 94);
		student s3 = new student("Aditi",30, 72);
		student s4 = new student("Avi",18, 82);
		
		
		student[]db = new student[4];
		db[0] = s1;
		db[1] = s2;
		db[2] = s3;
		db[3] = s4;
		
		for(student s:db) {
			System.out.println("Name: "+s.getName());
			System.out.println("Roll: "+s.getRollNo());
			System.out.println("Marks: "+s.getMarks());
			System.out.println("Degree: "+s.getDegree());
			student.setDegree("B.E");
			System.out.println();
		}
	}

}
