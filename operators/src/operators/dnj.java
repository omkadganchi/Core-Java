package operators;

public class dnj {

	public void display(int n) {

		if (n % 2 == 1) {
			System.out.println("weird");
		} else {
			if (n >= 2 && n <= 5) {
				System.out.println("not weird");
			} else if (n >= 6 && n <= 20) {
				System.out.println("weird");
			} else {
				System.out.println("not weird");
			}
		}
	}

}
