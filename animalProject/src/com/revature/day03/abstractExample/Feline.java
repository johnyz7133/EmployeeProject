package com.revature.day03.abstractExample;

public abstract class Feline implements Animal{
	String food;
	String noise;
	@Override
	public void roam() {
		System.out.println("Roams at night"); //Assumes all feline roam at night
	}
}
