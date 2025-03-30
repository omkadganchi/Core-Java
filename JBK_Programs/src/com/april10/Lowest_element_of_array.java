package com.tka;

public class Lowest_element_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 3, 7, 2, 6, 5, 22};
		int lowestDigit = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<lowestDigit) {
				lowestDigit = a[i];
			}
		}
		System.out.println("Lowest Digit from Array is: "+lowestDigit);
	}

}
