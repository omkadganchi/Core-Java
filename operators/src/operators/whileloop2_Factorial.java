package operators;
import java.util.Scanner;

public class whileloop2_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + n + " is: " + fact);

	}
}