package SimpleAbstraction;

public class AbstractTest1 extends AbstractClass1 {
	public void disp2() {
		System.out.println("Overriding abstract method");
	}

	public static void main(String[] args) {
		AbstractTest1 obj = new AbstractTest1();
		obj.disp1();
		obj.disp2();
	}
}
