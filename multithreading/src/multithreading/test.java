package multithreading;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		example obj = new example();
		
		obj.start();
		
		for(int i=0; i<15; i++) {
			System.out.println("JBK");
		}
	}

}
