package com.tka;


//this is lazy loading singleton pattern
public class Singleton_pattern {

	private static Singleton_pattern singleton;

	private Singleton_pattern() {

	}

	public static Singleton_pattern getSingleton() {
		if (singleton == null) {
			synchronized (Singleton_pattern.class) {
				if (singleton == null) {
					singleton = new Singleton_pattern();
				}
			}
		}
		return singleton;
	}

	public static void main(String[] args) {
		Singleton_pattern s1 = Singleton_pattern.getSingleton();
		System.out.println("HashCode of s1: " + s1.hashCode());

		Singleton_pattern s2 = Singleton_pattern.getSingleton();
		System.out.println("HashCode of s2: " + s2.hashCode());
	}
}
