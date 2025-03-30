package com.april2;

public class Missing_num_in_array {

	public static void main(String[] args) {
		
		int[] a = {16,17,19,20,21,22};     
		int sum =0;
		int x = a[0];
		int y = a[a.length-1];
		
		for(int i:a) {
			sum += i;
		}
	
		int exp = ((y*(y+1)/2) - (x*(x-1)/2));
		
		int missingNum = exp-sum;
		
		System.out.println(missingNum);
	}

}
