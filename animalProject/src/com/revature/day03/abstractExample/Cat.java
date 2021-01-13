package com.revature.day03.abstractExample;

public class Cat extends Feline{
	String food = "small fish";
	String noise = "meows";
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
		return "Cat";
	}

}
