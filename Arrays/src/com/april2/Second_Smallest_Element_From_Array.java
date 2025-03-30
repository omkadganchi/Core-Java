package com.april2;

public class Second_Smallest_Element_From_Array {

	public static void main(String[] args) {

		int[] a = {10, -16, 5, 58, -1, 60, 19};
		
		int min = a[0];
		int min2 = a[1];
		
		for (int i = 0; i<a.length; i++) {
			if(a[i]<min) {
				min2 = min;
				min = a[i];
			} else if(a[i]>min && a[i]<min2){
				min2 = a[i];
			}
		}
		System.out.println("Second Smallest Element is: "+min2);
	}

}
