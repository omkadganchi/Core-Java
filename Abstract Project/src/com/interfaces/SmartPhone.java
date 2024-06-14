package com.interfaces;

public class SmartPhone implements PowerOff, PowerOn, Resettable {
	
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone is resetting.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone is powering off.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone is powering on.");
	}
}
