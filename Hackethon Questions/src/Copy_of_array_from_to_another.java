
public class Copy_of_array_from_to_another {

	public static void main(String[] args) {
		
		int [] a = {16,8,23,4,68,2};
		int [] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] =a[i];
		}
		System.out.println("Content of a[]:");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nContent of b[]:");
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
