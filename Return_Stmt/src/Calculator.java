
public class Calculator {
	double addition(double a, double b) {
		double sum = a + b;
		return sum;
	}

	double average(double c, double d) {
		Calculator c1 = new Calculator();
		double result = c1.addition(c, d);
		double avg = result / 2.00;
		return avg;
	}

	void discount(double e, double f) {
		Calculator c1 = new Calculator();
		double avg = c1.average(e, f);
		double disc = avg * 20.00 / 100.00;
		System.out.println("Total discount is: " + disc);
	}
}
