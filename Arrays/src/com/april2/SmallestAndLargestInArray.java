package com.april2;

import java.util.Arrays;

public class SmallestAndLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 6, 1, 5, 7, 4, 2 };

		int smallest = a[0];
		int largest = a[1];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			} else if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println(Arrays.asList(smallest, largest));			
	}

}
