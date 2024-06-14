package com.march18;

public class Shape {
	private int side;
	private double height;
	private double breadth;
	private static double radius;
	
	Shape(int s, double h, float b){
		side = s;
		height = h;
		breadth = b;
	}
	
	//circle
	public double area(double radius, double pi) {	
		return (pi*radius*radius);
	}
	
	//triangle
	public double area() {
		return 0.5*breadth*height;
	}
	
	//rectangle
	public double area(double length) {
		return length*breadth;
	}
	
	//square
	public int area(int side) {
		return side*side;
	}
}
