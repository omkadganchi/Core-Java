package com.april4;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JBK";// String literals
		System.out.println(s);
		System.out.println(s.hashCode());// to get memory location
		System.out.println();

		
		
		
		String s1 = "JBK";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s == s1); // == operator always return in true/false, pointing to same memory(String
										// Constant Pool)
		System.out.println(s.equals(s1));
        System.out.println();
        
        
        
        
		String s2 = new String("JBK");// String object
		System.out.println(s2);
		System.out.println(s1 == s2);// due to different memory locations(s1 points SCP & s2 points HEAP MEMORY)
		System.out.println(s2.equals(s1));
		System.out.println();

		
		

		StringBuffer s3 = new StringBuffer("JAVA BY KIRAN");
		System.out.println(s3.substring(0,s3.length()));

		int count =0;

		for(int i=0; i<s3.length(); i++) {
			if(s3.charAt(i)=='A' || s3.charAt(i)=='E' || s3.charAt(i)=='I' || s3.charAt(i)=='O' || s3.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println(count);
	
		
		System.out.println(s3);
		System.out.println(s3.hashCode());
		s3.append('.');
		System.out.println(s3);
		System.out.println(s3.hashCode());
		System.out.println(s3.length());
		System.out.println();
		
		//to reverse string
		StringBuffer s4 = new StringBuffer("THE KIRAN ACADEMY");
		System.out.println(s4.reverse());
		        //OR
		for(int i=s4.length()-1; i>=0; i--) {
			System.out.print(s4.charAt(i));
		}
		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < s4.length(); i++) {
			System.out.print(s4.charAt(i));
		}
		
		
		

		System.out.println();
		System.out.println();
		StringBuffer s5 = new StringBuffer("SHRI GANESH TRADERS");		
		int count1 = 0;
		for (int i = 0; i < s5.length(); i++) {
			if (s5.charAt(i) == 'A') {
				count1++;
			}
		}
		System.out.println("Frequency of char A: " + count1);
	}
}
