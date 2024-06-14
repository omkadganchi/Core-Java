package practical28;

public class Swap_without3rdVar {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		System.out.println("Before Swapping A:" + a);
		System.out.println("Before Swapping B:" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping A:" + a);
		System.out.println("After Swapping B:" + b);
	}
}
