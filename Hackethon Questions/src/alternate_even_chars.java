import java.util.ArrayList;
import java.util.List;

public class alternate_even_chars {
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("MANCHESTER");
		al.add("UNITED");

		char[] ch1 = al.get(0).toCharArray();
		char[] ch2 = al.get(1).toCharArray();

		int max = Math.max(ch1.length, ch2.length);
		boolean flag = true;

		for (int i = 0; i < max; i++) {
			if (i < ch1.length && i % 2 == 0) {
				if (!flag) {
					System.out.print(", ");
				}
				System.out.print(ch1[i]);
				flag = false;
			}

			if (i < ch2.length && i % 2 == 0) {
				if (!flag) {
					System.out.print(", ");
				}
				System.out.print(ch2[i]);
				flag = false;
			}
		}
	}
}
