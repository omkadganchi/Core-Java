package com.tka;

public class Sum_of_num_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AbcF7d15omdi9";
		
		char[] ch = s.toCharArray();
		
		int sum = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				sum += ch[i]-'0';//'0' convert char representing num into numeric val
			}
		}
		System.out.println(sum);
	}

}
