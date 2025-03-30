package com.april2;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int size = 5;
//		int[] marks = new int[size];
		// or
		int[] marks = new int[5];
		marks[0] = 77;
		marks[1] = 88;
		marks[2] = 66;
		marks[3] = 55;
		marks[4] = 144;

		System.out.println(marks[3] + marks[1]);
System.out.println();
		     // for memory location
		System.out.println(marks);
System.out.println();
        		// to iterate array

		       // to print even no index
		for (int i = 0; i < marks.length; i++) {
			if (i % 2 == 0) 
				System.out.println(i + " ------> " + marks[i]);
//			
		}
//		
		System.out.println();
//
		     // to print even marks
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 2 == 0)
				System.out.println(i + " ------> " + marks[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.binarySearch(marks, 66));
		System.out.println();
		    //for-each loop / enhance for loop
		
		for(int m:marks) {
			System.out.println(m);
		}
	}
}