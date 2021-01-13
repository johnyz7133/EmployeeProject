package com.revature.day03.abstractExample;

public class MainClass {
public static void main(String[] args) {
	Animal[] list = new Animal[5];
	list[0] = new Cat();
	list[1] = new Tiger();
	list[2] = new Dog();
	list[3] = new Wolf();
	list[4] = new Hippo();
	
	for(Animal a: list) {
		System.out.println(a.toString() + ":");
		a.makeNoise();
		a.eat();
		a.roam();
		System.out.println("");
	}

}
}
