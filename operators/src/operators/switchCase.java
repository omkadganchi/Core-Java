package operators;

public class switchCase {

	public static void main(String[] args) {
	
		char operator = '@';
		int a = 10;
		int b = 20;

		switch(operator) {
		case '+':
			System.out.println("Addition is: "+(a+b));
			break;
		case '-':
			System.out.println("Subtraction is: "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication is: "+(a*b));
			break;
		case '/':
			System.out.println("Division is: "+(a/b));
			break;
		case '%':
				System.out.println("Modulo is: "+(a%b));
				break;
				default:
					System.out.println("INVALID OPERATOR");
		}
	}

}
