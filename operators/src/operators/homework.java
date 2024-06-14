package operators;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int JAY = 23;
		int VIRU = 23;
		int GABBAR = 23;

		if (JAY > VIRU && JAY > GABBAR) {
			System.out.println("JAY is older");
		} else if (VIRU > JAY && VIRU > GABBAR) {
			System.out.println("VIRU is older");
		} else if (GABBAR > JAY && GABBAR > VIRU) {
			System.out.println("GABBAR is older");
		} else {
			System.out.println("All are of same age");
		}
	}

}
