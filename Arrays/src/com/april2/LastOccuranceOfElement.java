package com.april2;

public class LastOccuranceOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,6,5,3,5,4,5};
		int x = 5;
		int lastOcc = -1;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==x) {
				lastOcc = i;
			}
		}
		System.out.println("Last Index of "+x+" is: "+lastOcc);
	}

}
