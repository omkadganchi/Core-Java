package calculator;

public class addition implements Runnable {

	private double a, b;
	
	public addition(double a, double b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		double result = a+b;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Addition is: "+(a+b));
	}
}
