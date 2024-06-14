package com.march15;

public class shop {
	private String productName;
	private static int price = 160;

	shop(String pn) {
		productName = pn;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String p1) {
		productName = p1;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int quantity) {
		price *= quantity;
	}
}
