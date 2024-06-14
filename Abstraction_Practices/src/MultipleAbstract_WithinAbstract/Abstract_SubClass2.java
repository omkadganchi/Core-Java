package MultipleAbstract_WithinAbstract;

public class Abstract_SubClass2 extends AbstractClass2{
	int x, y, z;

	void get(int a, int b) {
		x = a;
		y = b;
	}

	void add() {
		z = x + y;
	}

	void display() {
		System.out.println("The Addition is: " + z);
	}
}
