package qa_session;

import java.util.Arrays;

public class que3 {

	// METHOD 1

	static void checkAnagram(String s, String s1) {

		if (s.length() == s1.length()) {

			s = s.toLowerCase();
			s1 = s1.toLowerCase();

			// String kde sort method nahi..so tyala array mdhe convert karav lagla
			char[] ns = s.toCharArray();
			char[] ns1 = s1.toCharArray();

			System.out.println(ns);
			System.out.println(ns1);

			Arrays.sort(ns);
			Arrays.sort(ns1);

			System.out.println(ns);
			System.out.println(ns1);

			if (Arrays.equals(ns, ns1)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not anagram");
			}
		}
	}

	// METHOD 2

	static void checkAnagram2(String s, String s1) {
		if (s.length() == s1.length()) {

			s = s.toLowerCase();
			s1 = s1.toLowerCase();

			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(i));
				System.out.println(s1.charAt(i));
			}
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
