package com.tka;

public class Pattern_with_alphabets_on_left_diagonal {

	public static void main(String[] args) {

		
		                  //LOGIC NO 1
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print((char)(j+64)+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		                  //LOGIC NO 2
		
		
		for(char ch='A'; ch<='E'; ch++) {
			for(char cha='A'; cha<=ch; cha++) {
				System.out.print(cha+" ");
			}
			System.out.println();
		}
	}

}
