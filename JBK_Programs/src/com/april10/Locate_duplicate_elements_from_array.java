package com.tka;

import java.util.HashSet;

public class Locate_duplicate_elements_from_array {

	public static void main(String[] args) {

		
		
		                         //LOGIC NO 1                         
		
		
		int[] a = {10, 3, 4, 9, 3, 44, 10, 65};
		HashSet<Integer> duplicates = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					duplicates.add(a[j]);
				}
			}
		}
		if(duplicates.isEmpty())
			System.out.println("No duplicate elements found.");
		else
			System.out.println("Duplicate elements are: "+duplicates);
		
		
		
		
		
		
		                       //LOGIC NO 2               
		                       
		

//		int[] a = {10, 3, 4, 9, 3, 44, 10, 65};
//		
//		System.out.println("Duplicates elements from array are: ");
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[j]);
//				}
//			}
//		}
		
		
		
	}

}
