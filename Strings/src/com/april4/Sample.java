package com.april4;

import java.nio.file.spi.FileSystemProvider;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Instagram";
		String s1 = " ";
		String s2 = " By Meta";

		System.out.println(s.charAt(6));
		System.out.println(s.substring(2));
		System.out.println(s.subSequence(1, 5));
		System.out.println(s.substring(1, 5));
		System.out.println(s.length());
		System.out.println(s.contains("ram"));
		System.out.println();

		byte[] data = s.getBytes();
		System.out.println(data);

		System.out.println(s.concat(s2));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s.replace('I', 'Z'));
		System.out.println();

		String s3 = new String("Java by kiran");
		System.out.println(s3);
		String[] data1 = s3.split(" ");

		StringBuffer rev = new StringBuffer();

		for (String As : data1) {
			for (int i = 0; i < As.length(); i++) {
//				System.out.println(As.charAt(As.length() - 1 - i));
				
				//to reverse alphabets within words 
				rev.append(As.charAt(As.length() - 1-i));
			}
			rev.append(" ");
		}
		System.out.println(rev);
		System.out.println(rev.reverse());
	}
}