package calculator;

public class division implements Runnable {

	private double a, b;

	public division(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		if (b != 0) {
			double result = a / b;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Division is: " + (a / b));
		} else {
			System.out.println("Can't divide by zero");
			return;
		}
	}
}
