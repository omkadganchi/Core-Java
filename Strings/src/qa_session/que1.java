//WAP to count of students whose names are starting with "V".
//display those names. and also print total no. of char
//in those words.

package qa_session;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "Jay", "Viru", "Kiran", " Basanti", "Rahul", "Vijay", "PAvan" };

		int count = 0;

		for (String n : name) {
			if (n.startsWith("V")) {
				count++;
				System.out.println(n);
				System.out.println("Total no. of letters= " + n.length());
			}
		}
		System.out.println("Total count is: " + count);

	}
}
