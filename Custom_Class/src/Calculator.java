public class Calculator {
	String companyName = "ABC";
	int price = 499;

	void addition(int num1, int num2) {
		int totalSum = num1 + num2;
		System.out.println("Total Addition is: " + totalSum);
	}

	void subtraction(int num1, int num2) {
		int totalValue = num1 - num2;
		System.out.println("Subtraction is: " + totalValue);
	}
		
	void multiplication(int num1, int num2) {
		int totalCalculate = num1 * num2;
		System.out.println("Multiplication of 2nos. is: " + totalCalculate);
	}

	void divOfTwoNumber(int num1001) {
		int totalVal = num1001 / 2;
		System.out.println("Division of 2nos. is: "+totalVal);
	}
}