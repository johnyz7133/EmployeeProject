package com.revature.day03.abstractExample;

public class Dog extends Canine{
	String food = "small animals";
	String noise = "barks";
	@Override
	public void makeNoise() {
		System.out.println("Barks");
		
	}

	@Override
	public void eat() {
		System.out.println("Eats small animals");
		
	}
	@Override
	public String toString() {
		return "Dog";
	}

}
