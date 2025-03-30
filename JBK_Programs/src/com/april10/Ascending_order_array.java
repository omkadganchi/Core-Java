package com.tka;

import java.util.Arrays;

public class Ascending_order_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11, 7, 13, 8, 12, 9};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Ascending order array is: ");
		System.out.println(Arrays.toString(a));
	}

}
