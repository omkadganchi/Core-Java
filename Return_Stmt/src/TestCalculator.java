
public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator S1 = new Calculator();
		double sum = S1.addition(562.54, 4521.14);
		System.out.println("Total Sum is: " + sum);
		double avg = S1.average(54.21, 65.87);
		System.out.println("Total Average is: " + avg);
		S1.discount(64.98, 78.65);
	}
}
