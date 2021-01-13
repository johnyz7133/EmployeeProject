package com.revature.day03.abstractExample;

public class Tiger extends Feline{
	String food = "deer";
	String noise = "roars";
	@Override
	public void makeNoise() {
		System.out.println(noise);
		
	}

	@Override
	public void eat() {
		System.out.println("Eats " +food);
		
	}
	@Override
	public String toString() {
		return "Tiger";
	}

}
