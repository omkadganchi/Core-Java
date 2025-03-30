package com.tka;

import java.util.Arrays;

public class Array_in_reverse_order {

	public static void main(String[] args) {

		
		
		                            // LOGIC NO 1

		
		int[] a = {10, 4, 8, 34, 75};
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			
			b[i]=a[a.length-1-i];
		}
		System.out.println("Original Array is: "+Arrays.toString(a));
		System.out.println("\nReverse Array is: "+Arrays.toString(b));

		
		
		
		
		                           // LOGIC NO 2

		
//		int[] a = { 10, 4, 8, 34, 75 };
//
//		for (int i = a.length - 1; i >= 0; i--) {
//			System.out.print(a[i] + " ");
//		}
	}

}
