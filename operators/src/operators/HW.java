package operators;

public class HW {
	public void display(int JAY, int VIRU, int GABBAR) {

		if (VIRU > GABBAR && VIRU > JAY) {
			System.out.println("VIRU is older");
		} else if (GABBAR > VIRU && GABBAR > JAY) {
			System.out.println("GABBAR is older");
		} else if (JAY > VIRU && JAY > GABBAR) {
			System.out.println("JAY is older");
		} else {
			System.out.println("All are of same age");
		}
	}
}
