package com.revature.day03.abstractExample;

public class Hippo implements Animal{
	String food = "grass";
	String noise = "grunts";
	@Override
	public void makeNoise() {
		System.out.println(noise);
		
	}

	@Override
	public void eat() {
		System.out.println("Eats " +food);
		
	}

	@Override
	public void roam() {
		System.out.println("Roams in water");
		
	}

	@Override
	public String toString() {
		return "Hippo";
	}

}
