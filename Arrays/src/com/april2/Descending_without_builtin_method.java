package com.april2;

import java.util.Arrays;

public class Descending_without_builtin_method {

	public static void main(String...args) {
		int a[] = { 5, 1, 7, 3, 9, 2 };
		System.out.println("Original array: " + Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("desc: "+Arrays.toString(a));
	}
}
