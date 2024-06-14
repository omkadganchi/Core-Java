import java.util.Scanner;

public class VowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			if (ch == 'a' || ch == 'A' ||
				ch == 'e' || ch == 'E' || 
				ch == 'i' || ch == 'I' || 
				ch == 'o' || ch == 'O' || 
				ch == 'u' || ch == 'U') {
				System.out.println(ch + " is a vowel");
			} else {
				System.out.println(ch + " is a consonent");
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
