package com.datatypes;

public class Premitive_And_NoPremitive_DataTypes {
	byte byteVal;
	short shortVal;
	int intVal;
	long longVal;
	float floatVal;
	double doubleVal;
	char charVal;
	String stringVal;
	boolean boolVal;

	public static void main(String[] args) {
		Premitive_And_NoPremitive_DataTypes DT = new Premitive_And_NoPremitive_DataTypes();
		System.out.println("Default values are: ");
		System.out.println("byte: " + DT.byteVal);
		System.out.println("short: " + DT.shortVal);
		System.out.println("int: " + DT.intVal);
		System.out.println("long: " + DT.longVal);
		System.out.println("float: " + DT.floatVal);
		System.out.println("double: " + DT.doubleVal);
		System.out.println("char: " + DT.charVal);
		System.out.println("String: " + DT.stringVal);
		System.out.println("boolean: " + DT.boolVal);
	}
}
