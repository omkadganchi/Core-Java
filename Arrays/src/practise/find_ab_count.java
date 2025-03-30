package practise;

import java.util.Arrays;

public class find_ab_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabaaabaaab";
		String[] s1 = s.split("aa");
		int count = 0;
		for (String string : s1) {
			if (string.contains("ab")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
