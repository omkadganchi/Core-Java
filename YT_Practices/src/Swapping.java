
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   //with using 3rd variable

//		int a = 10;
//		int b = 5;
//		int temp;
//		
//		System.out.println("Before Swapping A: "+a);
//		System.out.println("Before Swapping B: "+b);
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("\nAfter Swapping A: "+a);
//		System.out.println("After Swapping B: "+b);
		
		
		
		
		
		
		
		     //without using 3rd variable
		
		int a = 10;
		int b = 5;
		
		System.out.println("Before Swapping A: "+a);
		System.out.println("Before Swapping B: "+b);
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		 System.out.println("\nAfter Swapping A: "+a);
       	 System.out.println("After Swapping B: "+b);
	}

}
