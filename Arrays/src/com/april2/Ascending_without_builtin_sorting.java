package com.april2;

import java.util.Arrays;

public class Ascending_without_builtin_sorting {

//	public static void main(String[] args) {
//		int[] a = { 7, 8, 3, 5, 6 };
//
//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = 0; j < a.length - 1 - i; j++) {
//				if (a[j] > a[j + 1]) {
//					int temp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = temp;
//				}
//			}
//		}
//
//		System.out.println("Sorted array in ascending order:");
//		for (int t : a) {
//			System.out.println(t);
//		}
//	}
//}

	
	
	
	public static void main(String...args) {
		int[]a = {78, 5, -4, 6, 32, 16};
		
		System.out.println("Originl Array: "+Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Sorted Array: "+Arrays.toString(a));
	}
}