package practical28;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
int b =20;
int c;

System.out.println("Before Swapping A:"+a);
System.out.println("Before Swapping B:"+b);

a = a+b; //30 20
b = a-b; //30 10
c = a-b; //30 10 20
a = c;   

System.out.println();
System.out.println("After Swapping A:"+a);
System.out.println("After Swapping B:"+b);




	}

}
