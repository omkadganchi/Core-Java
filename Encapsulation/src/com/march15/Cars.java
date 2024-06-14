package com.march15;

public class Cars {
	private static String mName = "BMW X3 xDrive20d xLine";
	private int mfgYear;
	private int price;

	Cars(int mfg, int p) {
		mfgYear = mfg;
		price = p;
	}

	public static String getmName() {
		return mName;
	}

	public static void setmName(String modelName) {
		Cars.mName = modelName;
	}

	public int getMfgYear() {
		return mfgYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		price = p;
	}

	public void setMfgYear(int year) {
		if (year >= 2018 && year <= 2024) {
			System.out.println(year + " New Model");
		} else {
			System.out.println("Old Model");
		}
	}
}
