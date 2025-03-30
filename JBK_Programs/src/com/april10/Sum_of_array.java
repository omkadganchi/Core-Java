package com.tka;

public class Sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10, 4, 6,46, 70};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum of Array is: "+sum);
	}

}
