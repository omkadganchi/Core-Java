package practical28;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =20;
		int b =30;
		
		
System.out.println("Before Swapping A:"+a);
System.out.println("Before Swapping B:"+b);

a = a+b;
b = a-b;
a = a-b;
System.out.println();
System.out.println("After Swapping A:"+a);
System.out.println("After Swapping B:"+b);
	}

}
