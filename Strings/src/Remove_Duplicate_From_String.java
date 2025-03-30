package com.tka;

public class Remove_Duplicate_From_String {
    public static void main(String[] args) {
        String s = "Om Balasaheb Kadganchi";
        
        StringBuilder result = new StringBuilder();
        
        s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			String ch = "" + s.charAt(i);
			if (result.indexOf(ch) == -1) {
				result.append(ch);
            }
        }
        
        System.out.println(result.toString());
    }
}
 