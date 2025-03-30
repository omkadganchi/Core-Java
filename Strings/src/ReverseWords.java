package com.tka;


//public class ReverseWords {
//	public static void main(String[] args) {
//		String s = "The Kiran Academy"; // (ehT nariK ymedacA)
//		String op = reverse(s);
//		System.out.println(op);
//	}
//
//	public static String reverse(String str) {
//		String[] w1 = str.split(" ");
//		StringBuilder s1 = new StringBuilder();
//
//		for (String w : w1) {
//			StringBuilder s2 = new StringBuilder(w);
//			s1.append(s2.reverse().toString()).append(" ");
//		}
//		return s1.toString().trim();
//	}

                          


                                //OR




public class ReverseWords{
	public static void main(String[] args) {
		
		String s = new String("The Kiran Academy");
		String[] w1 = s.split(" ");
		String rev = "";
		
		for (String w: w1) {
			StringBuilder s1 = new StringBuilder(w);
			StringBuilder s2 = s1.reverse();
			rev = rev.concat(s2+" ");
		}
		rev = rev.trim();
		System.out.println(rev);
	}
}