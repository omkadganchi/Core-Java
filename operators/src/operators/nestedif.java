//If a number is even, we also need to check whether the number is divisible by 6. otherwise number is odd 

package operators;

public class nestedif {
	public static void main(String[] args) {

		int num = 28;

		if (num % 2 == 0) {
			System.out.print("is EVEN number ");
			if (num % 6 == 0) {
				System.out.print("& divisible by 6 ");
			} else {
				System.out.print("& not divisible by 6");
			}
		} 
		else {
			System.out.print("is ODD number");
			if (num % 3 == 0) {
				System.out.print(" & is divisible by 3");
			} else {
				System.out.print(" & is not divisible by 3");
			}
		}
	}
}