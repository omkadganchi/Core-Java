package shop;

public class Shop_Info {
	void Shop_Details() {
		System.out.println("Shree Ganesh Traders");
		System.out.println("3704, Mallappa Dhanshetty Road, Barshi");
		Shop_Info sh1 = new Shop_Info();
		sh1.Distributors();
	}

	void Distributors() {
		System.out.println("Authorised distributors: Agarbatti, Dhoop, Dt.Soaps");
		System.out.println();
		Shop_Info sh1 = new Shop_Info();
		sh1.Shop_Details();
	}
}
