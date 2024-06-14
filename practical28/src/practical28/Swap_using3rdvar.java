package practical28;

public class Swap_using3rdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		int c;

		System.out.println("Before Swapping A:" + a);
		System.out.println("Before Swapping B:" + b);

		a = a + b;
		b = a - b;
		c = a - b;
		a = c;

		System.out.println("After Swapping A:" + a);
		System.out.println("After Swapping B:" + b);
	}

}
