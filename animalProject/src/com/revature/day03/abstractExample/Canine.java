package com.revature.day03.abstractExample;

public abstract class Canine implements Animal{
	String food;
	String noise;
	@Override
	public void roam() {
		System.out.println("Roams during the day"); //assumes all canine roam during the day
	}
}
