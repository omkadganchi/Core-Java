package com.april12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1,"Jay");
 
		// without override toString method return location
		//		System.out.println(s1.toString());
       //	    System.out.println(s1);

		//using toString method returns name as we write return name
//		System.out.println(s1);
		   //OR
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		
		s1 = null;
		
		//gc method deletion process karaychya aagodr every time finalize method invoke hoto
		System.gc();
	}

}
