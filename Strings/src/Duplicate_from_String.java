//package com.tka;
//
//
//public class Duplicate_from_String {
// 
//	public static void main(String[] args) {
//    
//		String s = "Billionair Balasaheb Kadganchi";
//        
//		s = s.toLowerCase(); 
//        char[] ch = s.toCharArray(); 
//        
//        System.out.println("Duplicate characters in the string:");
//        
//        for (int i = 0; i < s.length(); i++) {
//        
//        	boolean duplicate = false;
//            
//            for (int j = i + 1; j < s.length(); j++) {
//            
//            	if (ch[i] == ch[j] && ch[i] != ' ') { 
//                    duplicate = true;
//                    break;
//                }
//            }            
//            if (duplicate) {
//            	System.out.println(ch[i]);
//            }
//        }
//    }
//}
   


                                  //OR




//package com.tka;
//
//import java.util.HashSet;
//
//public class Duplicate_from_String {
//
//    public static void main(String[] args) {
//        String s = "Billionair Balasaheb Kadganchi";
//
//        s = s.toLowerCase();
//        char[] ch = s.toCharArray();
//        
//        HashSet<Character> seen = new HashSet<>();
//        HashSet<Character> duplicates = new HashSet<>();
//
//        System.out.println("Duplicate characters in the string:");
//
//        for (char c : ch) {
//            if (c != ' ') { // Skip spaces
//                if (!seen.add(c)) {
//                    duplicates.add(c);
//                }
//            }
//        }
//
//        for (char duplicate : duplicates) {
//            System.out.println(duplicate);
//        }
//    }
//}





                                       //OR





//package com.arrays;
//
//import java.util.HashSet;
//
//public class Que {
//
//	public static void main(String[] args) {
//
//		  String s = "Billionair Balasaheb Kadganchi";
//		  
//		  HashSet<Character> hs = new HashSet<>();
//		  s=s.toLowerCase();
//		  char[] ch = s.toCharArray();
//		  
//		  int count;
//		  for(char i=0; i<ch.length; i++) {
//			  count=1;
//			  for(char j=(char) (i+1); j<ch.length; j++) {
//				  if(ch[i]==ch[j]) {
//					  count++;
//					  hs.add(ch[i]);
//				  }
//			  }
//		  }
//		  System.out.println(hs);
//	}
//}




                                             //OR



package com.tka;

public class Duplicate_from_String {
	public static void main(String[] args) {

		String s = "Billionair Balasaheb Kadganchi";
		char[] ch = s.toLowerCase().toCharArray();
		int count;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ' && ch[i] != 0) {
				count = 1;

				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						ch[j] = 0;
						break;
					}
				}
				if (count > 1) {
					System.out.print(ch[i]);
				}
			}
		}
	}
}