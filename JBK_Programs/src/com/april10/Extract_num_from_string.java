package com.tka;

public class Extract_num_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AbcF7d15omdi9";
		char[] ch = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			if(ch[i]>=48 && ch[i]<=57) {   //using ASCII value
				System.out.print(ch[i]+" ");
			}
		}
	}

}
