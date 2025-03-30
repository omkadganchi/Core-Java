package com.april2;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Order_Sorting {
	
	public static void main(String[] args) {
		Integer[] a = { 5, 1, 7, 3, 9, 2 };

		System.out.println("Original array: " + Arrays.toString(a));

		Arrays.sort(a);

		Collections.reverse(Arrays.asList(a));   //Arrays.asList ha primitive types la support karat nhi tyamule wrapper class cha use kela

		System.out.println("Sorted array in descending order: " + Arrays.toString(a));
		
		
		
		
		
		
		                        //OR
		
		
		
//int[] a = { 5, 1, 7, 3, 9, 2 };
//		
//		Arrays.toString(a);
//		
//		Arrays.sort(a);
//		
//		int left = 0;
//		int right = a.length-1;
//		
//		while(left<right) {
//			int temp = a[left];
//			a[left] = a[right];
//			a[right] = temp;
//			left++;
//			right--;
//		}
//		System.out.println(Arrays.toString(a));
	}
}
