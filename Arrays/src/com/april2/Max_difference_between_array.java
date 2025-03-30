package com.april2;

public class Max_difference_between_array {

	public static void main(String[] args) {

		int[] a = {7, 1, 5, 3, 6, 4};
		
		int n = a.length;
		int maxDiff = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[j] > a[i]) {
					int temp = a[j] - a[i];
					maxDiff = Math.max(maxDiff, temp);
				}
			}
		}
		System.out.println("Maximum difference between array: "+maxDiff);
	}

}
