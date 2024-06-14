package com.march18;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s1 = new Shape(6, 6.87666, 3.64563f);

System.out.println("Area of circle: "+s1.area(5.14, 3.14));
System.out.println("Area of triangle: "+s1.area());
System.out.println("Area of rectangle: "+s1.area(6.54335));
System.out.println("Area of square: "+s1.area(5));
	}

}
