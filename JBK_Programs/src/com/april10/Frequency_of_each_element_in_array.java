package com.tka;

public class Frequency_of_each_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11, 22, 11, 3, 5, 11, 3};
		
		int count;
		for(int i=0; i<a.length; i++) {
			count = 1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=0;
				}
			}
			if(a[i]!=0) {
				System.out.println(a[i]+" : "+count);
			}
		}
	}

}
