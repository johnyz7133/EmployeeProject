package com.revature.day03.abstractExample;

public class Wolf extends Canine{
	String food = "elk";
	String noise = "howls";
	@Override
	public void makeNoise() {
		System.out.println(noise);
		
	}

	@Override
	public void eat() {
		System.out.println("Eats " + food);
		
	}
	@Override
	public String toString() {
		return "Wolf";
	}

}
